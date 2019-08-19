package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MasukModel extends Additional implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String emailKaryawan;
    private String passwordKaryawan;
    @OneToOne
    private
    MemberModel memberModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        MasukModel.serialVersionUID = serialVersionUID;
    }



    public String getEmailKaryawan() {
        return emailKaryawan;
    }

    public void setEmailKaryawan(String emailKaryawan) {
        this.emailKaryawan = emailKaryawan;
    }

    public String getPasswordKaryawan() {
        return passwordKaryawan;
    }

    public void setPasswordKaryawan(String passwordKaryawan) {
        this.passwordKaryawan = passwordKaryawan;
    }

    public MemberModel getMemberModel() {
        return memberModel;
    }

    public void setMemberModel(MemberModel memberModel) {
        this.memberModel = memberModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}