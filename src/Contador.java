import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite outro número inteiro: ");
            int num2 = scanner.nextInt();

            try {
                contar(num1, num2);
            } catch (Exception e) {
                System.out.println("O segundo parâmentro deve ser maior que o primeiro");
            }
        } catch (Exception e) {
            System.out.println("Digite um número inteiro.");
        }

    }

    static void contar(int parm1, int parm2) throws ParametrosInvalidosException {
        if (parm1 > parm2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parm2 - parm1;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }

        }

    }
}
