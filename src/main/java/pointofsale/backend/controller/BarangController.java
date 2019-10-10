package pointofsale.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pointofsale.backend.dto.TambahBarangDTO;
import pointofsale.backend.factory.ServiceFac;
import pointofsale.backend.model.BarangModel;
import pointofsale.backend.service.BarangService;
import pointofsale.backend.util.response.RestResponse;

import javax.xml.ws.Response;
import java.util.List;

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
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @RequestMapping(value = "/api/allbarang",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<BarangModel>>>getAllBarang(){
        RestResponse <List<BarangModel>> result = new RestResponse<>();
        BarangService barangService = serviceFac.getbarangService();
        result.setMessage("");
        result.setSuccess(true);
        result.setDatas(barangService.getAllBarang());
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
    @RequestMapping(value = "/api/barangbyid/{id}",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<BarangModel>>getBarangById(@PathVariable("id")long id){
       RestResponse<BarangModel> result = new RestResponse<>();
       BarangService barangService = serviceFac.getbarangService();
       result.setMessage("");
       result.setSuccess(true);
       result.setDatas(barangService.getBarangById(id));
       return new ResponseEntity<>(result,HttpStatus.OK);
    }
    @RequestMapping(value = "/api/hapusbarangbyid/{id}",method = RequestMethod.POST)
    public ResponseEntity<?>hapusBarangById(@PathVariable("id")long id){
        RestResponse<BarangModel> result = new RestResponse<>();
        BarangService barangService = serviceFac.getbarangService();
        result.setMessage("Berhasi dihapus");
        result.setSuccess(true);
        result.setDatas(barangService.getBarangById(id));
        serviceFac.getbarangService().deleteBarangById(id);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
    @RequestMapping(value = "/api/getbarangbystat/{status}",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<BarangModel>>>getBarangByStatus(@PathVariable("status")String status){
        RestResponse<List<BarangModel>> result = new RestResponse<>();
        BarangService barangService = serviceFac.getbarangService();
        result.setMessage("");
        result.setSuccess(true);
        result.setDatas(barangService.getBarangByStatus(status));
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
    @RequestMapping(value = "/api/getbarangbyprod/{id}",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<BarangModel>>>getbarangbyprodusen(@PathVariable("id")Long id){
        RestResponse<List<BarangModel>> result = new RestResponse<>();
        BarangService barangService = serviceFac.getbarangService();
        result.setMessage("");
        result.setSuccess(true);
        result.setDatas(barangService.getBarangByProdusen(id));
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    @RequestMapping(value = "/api/getbarangbykatg/{id}",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<BarangModel>>>getbarangbykategory(@PathVariable("id")Long id){
        RestResponse<List<BarangModel>> result = new RestResponse<>();
        BarangService barangService = serviceFac.getbarangService();
        result.setMessage("");
        result.setSuccess(true);
        result.setDatas(barangService.getBarangByKategory(id));
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

}
