import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        // Data: [Nama, Alamat, No Telp]
        String[][] dataMahasiswa = new String[3][3]; 
        
        String[] labels = {"Nama Lengkap", "Alamat", "No Telp"};
        
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Isi data mahasiswa ke-" + (i+1));
            for (int j = 0; j < 3; j++) {
                dataMahasiswa[i][j] = JOptionPane.showInputDialog(labels[j] + ":");
            }
        }
        
        String output = "=== DATA MAHASISWA ===\n";
        for (int i = 0; i < 3; i++) {
            output += "Mahasiswa " + (i+1) + ":\n";
            for (int j = 0; j < 3; j++) {
                output += labels[j] + ": " + dataMahasiswa[i][j] + "\n";
            }
            output += "------------------\n";
        }
        
        JOptionPane.showMessageDialog(null, output, "Data Lengkap", JOptionPane.INFORMATION_MESSAGE);
    }
}