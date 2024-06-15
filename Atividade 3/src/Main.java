import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a palavra 1: ");
        String palavra1 = sc.nextLine();
        System.out.print("Entre com a palavra 2: ");
        String palavra2 = sc.nextLine();

        boolean ehPalindrome = false;

        // está imprimindo os ifs por algum motivo
        if (palavra1.length() > palavra2.length()) {
            System.out.println("Palavra 1 é maior que a palavra 2");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("Palavra 2 é maior que a palavra 1");
        } else {
            ehPalindrome = verificaPalindrome(palavra1, palavra2);
        }

        if(ehPalindrome) {
            System.out.println("É palíndrome!");
        } else {
            System.out.println("Não é palíndrome!");
        }
    }

    public static String palavraContrario(String palavra) {
        StringBuilder palavraAoContrario = new StringBuilder();
        for (int i = (palavra.length() - 1); i >= 0; i--) {
            palavraAoContrario.append(palavra.charAt(i));
        }

        return palavraAoContrario.toString();
    }

    public static boolean verificaPalindrome(String palavra1, String palavra2) {
        boolean ehPalindrome = false;
        String palavraReversa = palavraContrario(palavra1);

        for (int i = 0; i < palavra1.length(); i++) {
            if (palavra2.charAt(i) == palavraReversa.charAt(i)) {
                ehPalindrome = true;
            }
        }

        return ehPalindrome;
    }
}
