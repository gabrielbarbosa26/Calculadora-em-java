import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo à Calculadora em Java!");

            double num1, num2;
            char operador;

            
            System.out.print("Digite o primeiro número: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida! Por favor, digite um número: ");
                scanner.next();
            }
            num1 = scanner.nextDouble();

           
            System.out.print("Digite o operador (+, -, *, /): ");
            operador = scanner.next().charAt(0);

            
            if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
                System.out.println("Operador inválido!");
                continue; 
            }

            
            System.out.print("Digite o segundo número: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida! Por favor, digite um número: ");
                scanner.next(); 
            }
            num2 = scanner.nextDouble();

            
            double resultado = 0;
            boolean erro = false;
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
                        System.out.println("Erro! Divisão por zero não é permitida.");
                        erro = true;
                    }
                    break;
            }

            
            if (!erro) {
                System.out.println("Resultado: " + resultado);
            }

            
            System.out.print("Deseja fazer outra operação? (S/N): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 'S' && continuar != 's') {
                break; 
            }
        }

        System.out.println("Obrigado por usar a Calculadora!");
    }
}
