import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        boolean selesai = false;

        while (!selesai) {
            String nama = getInputWithCancelCheck("Masukkan Nama Lengkap:", "Nama");
            if (nama == null) continue;

            String usiaStr = getInputWithCancelCheck("Masukkan Usia:", "Usia");
            if (usiaStr == null) continue;

            String almt = getInputWithCancelCheck("Masukkan Alamat:", "Alamat");
            if (almt == null) continue;

            if (nama.trim().isEmpty() || usiaStr.trim().isEmpty() || almt.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua field wajib diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int usia;
            try {
                usia = Integer.parseInt(usiaStr.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (almt.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            JOptionPane.showMessageDialog(null, 
                "=== VALIDASI BERHASIL ===\n" +
                "Nama: " + nama + "\nUsia: " + usia + "\nAlamat: " + almt, 
                "Info Data", JOptionPane.INFORMATION_MESSAGE);

            int confirm = JOptionPane.showConfirmDialog(null, 
                "Apakah anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION) {
                selesai = true;
            }
        }
    }

    private static String getInputWithCancelCheck(String message, String fieldName) {
        String input = JOptionPane.showInputDialog(message);
        
        if (input == null) { 
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Apakah anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            return null;
        }
        return input;
    }
}