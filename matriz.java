import java.util.Scanner;

class Matriz { 
    public static double[][] leMatriz(int num_lin, int num_col, Scanner sc) {
        double[][] M = new double[num_lin][num_col];
        for(int i=0; i<num_lin; i++){
            for(int j=0; j<num_col; j++){
                double valor = sc.nextDouble();
                M[i][j] = valor;
            }
        }
        return M;

    }

    public static void exibeMatriz(double[][] M) {
        int num_lin = M.length;
        int num_col = M[0].length;

        for(int i=0; i<num_lin; i++){
            for(int j=0; j<num_col; j++){
                System.out.println(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] matMult(double[][] A, double[][] B) {
        int num_lin = A.length;
        int num_col = B[0].length;
        double [][] C = new double[num_lin][num_col];
        for(int i=0; i<num_lin; i++){
            for(int j=0; j<num_col; j++){
                for(int k = 0; k<B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Use java matriz.java num_lin_A num_col_A num_lin_B num_col_B");
            return;
        }

        int num_lin_A = Integer.parseInt(args[0]);
        int num_col_A = Integer.parseInt(args[1]);
        int num_lin_B = Integer.parseInt(args[2]);
        int num_col_B = Integer.parseInt(args[3]);

        Scanner sc = new Scanner(System.in);

        double[][] A = leMatriz(num_lin_A, num_col_A, sc);
        exibeMatriz(A);
        double[][] B = leMatriz(num_lin_B, num_col_B, sc);
        exibeMatriz(B);

        System.out.println("C: ");
        exibeMatriz(matMult(A, B));
    }

}