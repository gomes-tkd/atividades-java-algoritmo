import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        popularVetor(vetor);
        imprimeVetor(vetor);

        int maiorNumero = encontraMaiorNumero(vetor);
        int segundoMaiorNumero = encontraSegundoMaiorNumero(vetor);
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Segundo número: " + segundoMaiorNumero);
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void popularVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int random = new Random().nextInt(100);
            vetor[i] = random;
        }
    }

    public static int encontraMaiorNumero(int[] vetor) {
        int maiorNumero = -999999999;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
            }
        }

        return maiorNumero;
    }

    public static int encontraSegundoMaiorNumero(int[] vetor) {
        int maiorNumero = encontraMaiorNumero(vetor);
        int segundoMaiorNumero = -999999999;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > segundoMaiorNumero && maiorNumero != vetor[i]) {
                segundoMaiorNumero = vetor[i];
            }
        }

        return segundoMaiorNumero;
    }
}
