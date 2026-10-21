import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata mhs = new Biodata();
        
        String nama = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");
        String usiaStr = JOptionPane.showInputDialog("Masukkan Usia:");
        String almt = JOptionPane.showInputDialog("Masukkan Alamat:");
        
        int usia = Integer.parseInt(usiaStr);
        
        mhs.setData(nama, usia, almt);
        
        JOptionPane.showMessageDialog(null, 
            "=== DATA BERHASIL DISIMPAN ===\n" + mhs.getInfo(), 
            "Informasi Mahasiswa", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}