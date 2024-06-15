import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vect = new int[15];

        preencheVetor(vect);

        System.out.println("Vetor:");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();

        int totalOcorrencia = contaOcorrencia(vect);
        System.out.println("Total de números 1: " + totalOcorrencia);
    }

    public static int contaOcorrencia(int[] vetor) {
        Random randomNumber = new Random();
        int randoNumber = randomNumber.nextInt(10);
        int count = 0;

        System.out.println("Número aleatório: " + randoNumber);

        for (int i = 0; i < vetor.length; i++) {
            if (randoNumber == vetor[i]) {
                count++;
            }
        }

        return count;
    }

    public static void preencheVetor(int[] vetor) {
        Random randomNumber = new Random();

        for (int i = 0; i < vetor.length; i++) {
            int randoNumber = randomNumber.nextInt(10);
            vetor[i] = randoNumber;
        }
    }
}
