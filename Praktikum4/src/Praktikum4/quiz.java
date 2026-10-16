package Praktikum4;

import javax.swing.JOptionPane;

public class quiz {
	    public static void main(String[] args) {

	        double[] nilai = new double[5];
	        double total = 0;
	        
	        for (int i = 0; i < 5; i++) {
	            String input = JOptionPane.showInputDialog(
	                null,
	                "Masukkan nilai ke-" + (i + 1) + ":",
	                "Input Nilai",
	                JOptionPane.QUESTION_MESSAGE
	            );
	            
	            try {
	                nilai[i] = Double.parseDouble(input);
	                total += nilai[i];
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(
	                    null,
	                    "Input harus berupa angka!",
	                    "Error",
	                    JOptionPane.ERROR_MESSAGE
	                );
	                System.exit(0);
	            }
	        }
	        
	        double rataRata = total / 5;
	        
	        String hasil = "=== HASIL PERHITUNGAN ===\n\n";
	        for (int i = 0; i < 5; i++) {
	            hasil += "Nilai ke-" + (i + 1) + ": " + nilai[i] + "\n";
	        }
	        hasil += "\nTotal: " + total + "\n";
	        hasil += "Rata-rata: " + String.format("%.2f", rataRata);
	        
	        JOptionPane.showMessageDialog(
	            null,
	            hasil,
	            "Hasil Perhitungan",
	            JOptionPane.INFORMATION_MESSAGE
	        );
	        
	        System.exit(0);
	    }
	}