import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha um operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                scanner.close();
                return;
        }

        System.out.println("O resultado de " + num1 + " " + operador + " " + num2 + " é " + resultado);

        scanner.close();
    }
}
// Este código é uma calculadora simples que permite ao usuário realizar operações básicas de adição, subtração, multiplicação e divisão. O usuário insere dois números e um operador, e o programa calcula e exibe o resultado. Se o usuário tentar dividir por zero, uma mensagem de erro é exibida.

