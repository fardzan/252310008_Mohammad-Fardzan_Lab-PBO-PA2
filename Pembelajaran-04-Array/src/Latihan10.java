import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan10 {
    public static void main(String[] args) {
        ArrayList<String> fields = new ArrayList<>();
        fields.add("Nama Lengkap");
        fields.add("Alamat");
        fields.add("No Telp");
        
        ArrayList<String> data = new ArrayList<>();
        
        for (String field : fields) {
            String val = JOptionPane.showInputDialog("Masukkan " + field + ":");
            data.add(val);
        }
        
        String output = "=== DATA DIRI (ArrayList) ===\n";
        for (int i = 0; i < fields.size(); i++) {
            output += fields.get(i) + ": " + data.get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, output, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
}