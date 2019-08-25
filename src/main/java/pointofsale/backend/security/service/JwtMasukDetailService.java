package pointofsale.backend.security.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pointofsale.backend.factory.ServiceFac;
import pointofsale.backend.model.MasukModel;

import java.util.ArrayList;

@Service
public class JwtMasukDetailService implements UserDetailsService {

    @Autowired
    private ServiceFac serviceFac;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        MasukModel member = serviceFac.getmasukService().findByEmail(email);
        if (member == null) {
            throw new UsernameNotFoundException("User Kagak Ketemu CAY :" + member);
        }
        return new org.springframework.security.core.userdetails.User(member.getEmail(), member.getPassword(), new ArrayList<>());
    }
}