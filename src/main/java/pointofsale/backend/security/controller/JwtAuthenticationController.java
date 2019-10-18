package pointofsale.backend.security.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pointofsale.backend.model.LoginSession;
import pointofsale.backend.model.MasukModel;
import pointofsale.backend.model.MemberModel;
import pointofsale.backend.security.JwtRequest;
import pointofsale.backend.security.JwtResponse;
import pointofsale.backend.security.JwtTokenUtil;
import pointofsale.backend.security.service.JwtMasukDetailService;
import pointofsale.backend.service.MasukService;
import pointofsale.backend.service.MemberService;

import javax.servlet.http.HttpSession;


@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtMasukDetailService userDetailsService;
    @Autowired
    MasukService masukService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest, HttpSession session) throws Exception {
        authenticate(authenticationRequest.getEmail(), authenticationRequest.getPassword());
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getEmail());
        final String token = jwtTokenUtil.generateToken(userDetails);
        MasukModel masukModel =  masukService.findByLogin(userDetails.getUsername(),userDetails.getPassword());
        LoginSession loginSession =  new LoginSession(token,masukModel);
        return ResponseEntity.ok(loginSession);

    }

    private void authenticate(String username, String password) throws Exception {

        try {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        } catch (DisabledException e) {

            throw new Exception("USER_DISABLED", e);

        } catch (BadCredentialsException e) {

            throw new Exception("INVALID_CREDENTIALS", e);

        }

    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
//        return ResponseEntity.ok(userDetailsService.save(user));
//    }

}