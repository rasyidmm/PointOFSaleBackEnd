package pointofsale.backend.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pointofsale.backend.dao.KategoryBarangDao;
import pointofsale.backend.repository.*;

@Component
public class RepositoryFac {
    @Autowired
    BarangRepository barangRepository;
    @Autowired
    DiskonRepository diskonRepository;
    @Autowired
    KategoryBarangRepository kategoryBarangRepository;
    @Autowired
    KeuanganRepository keuanganRepository;
    @Autowired
    MasukRepository masukRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MenuRepository menuRepository;
    @Autowired
    PenjualanRepository penjualanRepository;
    @Autowired
    ProdusenBarangRepository produsenBarangRepository;
    @Autowired
    RoleRepository roleRepository;

    public BarangRepository getBarangRepository(){
        return barangRepository;
    }
    public  DiskonRepository getDiskonRepository(){
        return diskonRepository;
    }
    public  KategoryBarangRepository getKategoryBarangRepository(){
        return kategoryBarangRepository;
    }
    public KeuanganRepository getKeuanganRepository(){
        return keuanganRepository;
    }
    public  MasukRepository getMasukRepository(){
        return masukRepository;
    }

    public  MemberRepository getMemberRepository(){
        return memberRepository;
    }

    public MenuRepository getMenuRepository() {
        return menuRepository;
    }public PenjualanRepository getPenjualanRepository(){
        return penjualanRepository;
    }
    public ProdusenBarangRepository getProdusenBarangRepository(){
        return produsenBarangRepository;
    }
    public RoleRepository getRoleRepository(){
        return roleRepository;
    }
}
