import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        String[] field = {"Nama Lengkap", "Alamat", "No Telp"};
        String[] data = new String[3];
        
        for (int i = 0; i < field.length; i++) {
            data[i] = JOptionPane.showInputDialog("Masukkan " + field[i] + ":");
        }
        
        String output = "=== DATA DIRI ===\n";
        for (int i = 0; i < field.length; i++) {
            output += field[i] + ": " + data[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, output, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
}