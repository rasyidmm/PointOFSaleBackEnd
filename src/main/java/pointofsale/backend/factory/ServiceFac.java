package pointofsale.backend.factory;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pointofsale.backend.security.service.JwtMasukDetailService;
import pointofsale.backend.service.*;

@Component
public class ServiceFac {
    @Autowired
    JwtMasukDetailService jwtMasukDetailService;
    @Autowired
    BarangService barangService;
    @Autowired
    DiskonService diskonService;
    @Autowired
    KategoryBarangService kategoryBarangService;
    @Autowired
    KeuanganService keuanganService;
    @Autowired
    MasukService masukService;
    @Autowired
    MemberService memberService;
    @Autowired
    MenuService menuService;
    @Autowired
    PenjualanService penjualanService;
    @Autowired
    ProdusenBarangService produsenBarangService;
    @Autowired
    RoleService roleService;

    public BarangService getbarangService(){
        return barangService;
    }
    public DiskonService getdiskonService(){
        return diskonService;
    }
    public KategoryBarangService getkategoryBarangService(){
        return kategoryBarangService;
    }
    public KeuanganService getkeuanganService(){
        return keuanganService;
    }
    public MasukService getmasukService(){
        return masukService;
    }
    public MemberService getmemberService(){
        return memberService;
    }
    public MenuService getmenuService(){
        return menuService;
    }
    public PenjualanService getpenjualanService(){
        return penjualanService;
    }
    public ProdusenBarangService getprodusenBarangService(){
        return produsenBarangService;
    }
    public RoleService getroleService(){
        return roleService;
    }
    public   JwtMasukDetailService getJwtMasukDetailService(){
        return jwtMasukDetailService;
    }
}
