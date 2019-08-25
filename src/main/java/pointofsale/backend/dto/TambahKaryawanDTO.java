package pointofsale.backend.dto;

public class TambahKaryawanDTO {
    private String namaKaryawan;
    private String alamatKaryawan;
    private String noHandphone;
    private String fotoKaryawan;
    private String email;
    private String password;

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public String getNoHandphone() {
        return noHandphone;
    }

    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    public String getFotoKaryawan() {
        return fotoKaryawan;
    }

    public void setFotoKaryawan(String fotoKaryawan) {
        this.fotoKaryawan = fotoKaryawan;
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
