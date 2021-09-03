import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int vet[] = new int[5];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
        }
	teclado.close();
        System.out.print("Vetor inicial:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
        }
        System.out.print("\n\n");
        for (int i = 0; i < vet.length; i++) {
            if(i%2==0){
                vet[i] += (vet[i]*0.02);
            }else{
                vet[i] += (vet[i]*0.05);
            }
        }
        System.out.print("Vetor resultante:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
        }
    }
}
