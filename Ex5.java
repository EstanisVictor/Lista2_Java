import java.io.BufferedInputStream;
import java.util.Scanner;
class Ex5 {
    public static boolean verificaPalindromo_Capicua(int vet[]){
        int indiceFinal=(vet.length-1);
        boolean retorno=true;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != vet[indiceFinal]) {
                retorno = false;
            }else{
                indiceFinal--;
            }
        }
        return retorno;
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int quantDigito = teclado.nextInt();
        int vet[] = new int[quantDigito];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
        }
        System.out.println(verificaPalindromo_Capicua(vet));
        teclado.close();
    }
}
