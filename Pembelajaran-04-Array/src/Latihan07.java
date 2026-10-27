import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] matrixC = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan nilai Matrix A [" + i + "][" + j + "]:", 
                    "Input Matrix A", 
                    JOptionPane.QUESTION_MESSAGE
                );
                if (val == null) return; 
                matrixA[i][j] = Integer.parseInt(val);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan nilai Matrix B [" + i + "][" + j + "]:", 
                    "Input Matrix B", 
                    JOptionPane.QUESTION_MESSAGE
                );
                if (val == null) return;
                matrixB[i][j] = Integer.parseInt(val);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        String output = String.format(
            "Matrix A:\n%10s %10s\n%10s %10s\n\n" +
            "Matrix B:\n%10s %10s\n%10s %10s\n\n" +
            "Matrix C (A - B):\n%10s %10s\n%10s %10s",
            
            matrixA[0][0], matrixA[0][1], matrixA[1][0], matrixA[1][1],
            matrixB[0][0], matrixB[0][1], matrixB[1][0], matrixB[1][1],
            matrixC[0][0], matrixC[0][1], matrixC[1][0], matrixC[1][1]
        );

        JOptionPane.showMessageDialog(
            null, 
            output, 
            "Hasil Operasi Matrix", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}