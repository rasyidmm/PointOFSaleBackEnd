package pointofsale.backend.model;

public class LoginSession {
    private String token;
    private MasukModel masukModel;

    public LoginSession(String token, MasukModel masukModel) {
        this.setToken(token);
        this.setMasukModel(masukModel);
    }

    public MasukModel getMasukModel() {
        return masukModel;
    }

    public void setMasukModel(MasukModel masukModel) {
        this.masukModel = masukModel;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

   }
