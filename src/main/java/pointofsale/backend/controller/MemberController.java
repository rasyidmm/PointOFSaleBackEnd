package pointofsale.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pointofsale.backend.dto.TambahKaryawanDTO;
import pointofsale.backend.execption.RestResponseEntityExceptionHandler;
import pointofsale.backend.factory.ServiceFac;
import pointofsale.backend.model.MasukModel;
import pointofsale.backend.model.MemberModel;
import pointofsale.backend.service.MasukService;
import pointofsale.backend.service.MemberService;
import pointofsale.backend.util.response.RestResponse;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class MemberController {
    @Autowired
    PasswordEncoder bcryptEncoder;
    @Autowired
    ServiceFac serviceFac;

    @RequestMapping(value = "/api/registerkaryawan",method = RequestMethod.POST)
    public ResponseEntity<?>registerkaryawan(@RequestBody TambahKaryawanDTO tambahKaryawanDTO) throws Exception{
        if (serviceFac.getmasukService().findByEmail(tambahKaryawanDTO.getEmail())==null){
            MemberModel memberModel =  new MemberModel();
            memberModel.setNamaKaryawan(tambahKaryawanDTO.getNamaKaryawan());
            memberModel.setAlamatKaryawan(tambahKaryawanDTO.getAlamatKaryawan());
            memberModel.setNoHandphone(tambahKaryawanDTO.getNoHandphone());
            memberModel.setFotoKaryawan(tambahKaryawanDTO.getFotoKaryawan());
            serviceFac.getmemberService().SaveOrUpdateMember(memberModel);
            MasukModel masukModel = new MasukModel();
            masukModel.setMemberModel(serviceFac.getmemberService().getMemberById(memberModel.getId()));
            masukModel.setEmail(tambahKaryawanDTO.getEmail());
            masukModel.setPassword(bcryptEncoder.encode(tambahKaryawanDTO.getPassword()));
            serviceFac.getmasukService().SaveOrUpdateMasuk(masukModel);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @RequestMapping(value = "/api/getallkaryawan",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<MemberModel>>>getAllKaryawanb(){
        RestResponse<List<MemberModel>>result =  new RestResponse<>();

        MemberService memberService = serviceFac.getmemberService();
        result.setMessage("");
        result.setSuccess(true);
        result.setDatas(memberService.getAllMember());
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity(result, httpStatus);
    }

    @RequestMapping(value = "/api/getkaryawan/{id}",method = RequestMethod.GET)
    ResponseEntity<RestResponse<MemberModel>>getbykaryawan(@PathVariable("id")long id){
        RestResponse result = new RestResponse();
        MemberService memberService = serviceFac.getmemberService();
        result.setMessage("");
        result.setSuccess(true);
        result.setDatas(memberService.getMemberById(id));
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity(result,httpStatus);
    }
}
