import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int indice = teclado.nextInt();
        int vet[] = new int[indice], temporario;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
        }
        teclado.close();
        System.out.print("Numeros informados: ");     
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");
        }
        Arrays.sort(vet);
        System.out.println("\n");
        System.out.print("Numeros em ordem crescente: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");
        }
    }
}
