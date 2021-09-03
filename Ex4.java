import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex4 {
    public static String validarNumeroPrimo(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return "-";
            }
        }
        return ".";
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num = teclado.nextInt();
        String verificacao = validarNumeroPrimo(num);
        if(verificacao.contains(".") && num!=1){
            System.out.println("primo");
        }
        if (verificacao.contains("-") || !(verificacao.contains(".") && num!=1)) {
            System.out.println("nao e primo");
        }
        teclado.close();
    }
}
