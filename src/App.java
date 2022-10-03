import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double f, c, fc, cf, opcao;
        System.out.println("Digite 1 para transformar de Fahrenheit para celsius ou 2 de celsius para Fahrenheit: ");
        opcao = input.nextDouble();
        if (opcao == 1) {
            System.out.println("Digite o valor de Fahrenheit: ");
            f = input.nextDouble();
            fc = 5 * ((f - 32) / 9);
            System.out.println("A temperatura em celsius é :" + fc);
        } else if (opcao == 2) {
            System.out.println("Digite o valor de Celsius: ");
            c = input.nextDouble();
            cf = (c * 1.8) + 32;
            System.out.println("A temperatura em Fahrenheit é :" + cf);
        }
        input.close();
    }
}
