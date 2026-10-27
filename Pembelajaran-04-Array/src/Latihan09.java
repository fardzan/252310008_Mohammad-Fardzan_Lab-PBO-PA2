import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan09 {
    public static void main(String[] args) {
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah elemen ArrayList:");
        int jumlah = Integer.parseInt(inputJumlah);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < jumlah; i++) {
            String val = JOptionPane.showInputDialog("Masukkan nilai ke-" + (i+1) + ":");
            list.add(Integer.parseInt(val));
        }
        
        int max = list.get(0);
        int min = list.get(0);
        
        for (int num : list) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        String result = "Nilai Terbesar: " + max + "\nNilai Terkecil: " + min;
        JOptionPane.showMessageDialog(null, result, "ArrayList Max/Min", JOptionPane.INFORMATION_MESSAGE);
    }
}