import java.util.Scanner;

public class Matriz {
    double[][] matriz;
    int numLin;
    int numCol;
    static Scanner sc = new Scanner(System.in);

    public Matriz(int num_lin, int num_col) {
        numLin = num_lin;
        numCol = num_col;
        matriz = new double[numLin][numCol];
    }

    public void leMatriz(Scanner sc) {
        for (int i = 0; i < numLin; i++) {
            for (int j = 0; j < numCol; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    public void exibeMatriz() {
        for (int i = 0; i < numLin; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.println(matriz[i][j] + " ");
            }       
        }
        System.out.println();
    }

    public static Matriz matMult(Matriz A, Matriz B) {
        if (A.numCol != B.numLin) {
            System.out.println("O numero de colunas de A deve ser igual ao numero de linhas de B");
        }

        Matriz C = new Matriz(A.numLin, B.numCol); 
        for (int i = 0; i < A.numLin; i++) {
            for (int j = 0; j < B.numCol; j++) {
                for (int k = 0; k < A.numCol; k++) {
                    C.matriz[i][j] += A.matriz[i][k] * B.matriz[k][j]; 
                }
            }
        }
        return C; 
    }


}
