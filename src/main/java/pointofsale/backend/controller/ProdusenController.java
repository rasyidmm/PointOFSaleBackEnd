package pointofsale.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pointofsale.backend.dto.TambahProdusenDTO;
import pointofsale.backend.factory.ServiceFac;
import pointofsale.backend.model.ProdusenBarangModel;

@RestController
public class ProdusenController {
    @Autowired
    ServiceFac serviceFac;
    @RequestMapping(value = "/api/tambahprodusen",method = RequestMethod.POST)
    public ResponseEntity<?>tambahprodusen(@RequestBody TambahProdusenDTO tambahProdusenDTO)throws Exception{
        ProdusenBarangModel produsenBarangModel = new ProdusenBarangModel();
        produsenBarangModel.setNamaProdusen(tambahProdusenDTO.getNamaProdusen());
        serviceFac.getprodusenBarangService().SaveOrUpdateProdusenBarang(produsenBarangModel);
        return ResponseEntity.ok("");
    }
}
