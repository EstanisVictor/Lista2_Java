import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex6{
    public static void imprimirTriploNum(int n1, int n2, int n3){
        System.out.println((n1*3)+"\n"+(n2*3)+"\n"+(n3*3));
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int n1 = teclado.nextInt(), n2 = teclado.nextInt(), n3 = teclado.nextInt();
        imprimirTriploNum(n1, n2, n3);
    }
}
