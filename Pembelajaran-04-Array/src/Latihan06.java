import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog("Matrix A [" + i + "][" + j + "]:");
                matrixA[i][j] = Integer.parseInt(val);
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog("Matrix B [" + i + "][" + j + "]:");
                matrixB[i][j] = Integer.parseInt(val);
            }
        }
        
        String output = "Matrix A:\n" + formatMatrix(matrixA) + "\n\nMatrix B:\n" + formatMatrix(matrixB);
        JOptionPane.showMessageDialog(null, output, "Input Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static String formatMatrix(int[][] m) {
        return m[0][0] + " " + m[0][1] + "\n" + m[1][0] + " " + m[1][1];
    }
}