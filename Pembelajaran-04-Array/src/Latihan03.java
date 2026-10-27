import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        String inputJumlah = JOptionPane.showInputDialog("Masukkan jumlah elemen array:");
        int jumlah = Integer.parseInt(inputJumlah);
        
        int[] nilai = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            String inputVal = JOptionPane.showInputDialog("Masukkan nilai array index ke-" + i + ":");
            nilai[i] = Integer.parseInt(inputVal);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hasil Nilai Array:\n");
        for (int i = 0; i < jumlah; i++) {
            sb.append("nilai[").append(i).append("] = ").append(nilai[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Hasil Array", JOptionPane.INFORMATION_MESSAGE);
    }
}