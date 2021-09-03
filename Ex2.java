import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double mat[][] = new double[3][2], soma=0.0;
        int linha;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = teclado.nextDouble();
            }
        }
        linha = teclado.nextInt();
	teclado.close();
        for (int i = 0; i < 2; i++) {
            soma+=mat[linha][i];
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Soma dos elementos da linha "+linha+":\n"+soma);
    }
}
