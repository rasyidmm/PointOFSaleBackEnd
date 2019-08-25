package pointofsale.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pointofsale.backend.dto.TambahBarangDTO;
import pointofsale.backend.dto.TambahKategoryDTO;
import pointofsale.backend.factory.ServiceFac;
import pointofsale.backend.model.KategoryBarangModel;

@RestController
public class KategoryController {
    @Autowired
    ServiceFac serviceFac;

    @RequestMapping(value = "/api/tambahkategory",method = RequestMethod.POST)
    public ResponseEntity<?>tambahKategory(@RequestBody TambahKategoryDTO tambahKategoryDTO) throws Exception{
        KategoryBarangModel kategoryBarangModel = new KategoryBarangModel();
        kategoryBarangModel.setNamaKatagory(tambahKategoryDTO.getNamaKatagory());
        serviceFac.getkategoryBarangService().SaveOrUpdateKategoryBarang(kategoryBarangModel);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
