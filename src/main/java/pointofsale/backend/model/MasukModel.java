package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MasukModel extends Additional implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    @OneToOne
    private
    MemberModel memberModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        MasukModel.serialVersionUID = serialVersionUID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}