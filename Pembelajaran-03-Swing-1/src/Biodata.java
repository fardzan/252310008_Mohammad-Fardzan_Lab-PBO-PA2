public class Biodata {
    private String fullname;
    private int usia;
    private String alamat;

    public void setData(String fullname, int usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getInfo() {
        return "Nama: " + fullname + "\n" +
               "Usia: " + usia + " tahun\n" +
               "Alamat: " + alamat;
    }
}