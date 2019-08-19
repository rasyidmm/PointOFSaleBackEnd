package pointofsale.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pointofsale.backend.dto.TambahBarangDTO;
import pointofsale.backend.factory.ServiceFac;
import pointofsale.backend.model.BarangModel;

@RestController
public class BarangController {
    @Autowired
    ServiceFac serviceFac;

    @RequestMapping(value = "/api/tambahbarang",method = RequestMethod.POST)
    public ResponseEntity<?>tambahBarang(@RequestBody TambahBarangDTO tambahBarangDTO)throws  Exception{
        BarangModel barangModel = new BarangModel();
        barangModel.setNamaBarang(tambahBarangDTO.getNamaBarang());
        barangModel.setSKU(tambahBarangDTO.getSKU());
        barangModel.setHargaBarang(tambahBarangDTO.getHargaBarang());
        barangModel.setBiayaBarang(tambahBarangDTO.getBiayaBarang());
        barangModel.setKategoryBarangModel(serviceFac.getkategoryBarangService().getKategoryBarangById(tambahBarangDTO.getKategoryBarangModel()));
        barangModel.setProdusenBarangModel(serviceFac.getprodusenBarangService().getProdusenBarangById(tambahBarangDTO.getProdusenBarangModel()));
        serviceFac.getbarangService().SaveOrUpdateBarang(barangModel);
        return ResponseEntity.ok("200");
    }
}
