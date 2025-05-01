import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moedas moedas= new Moedas();

        String menu =
        "**************************************" +
        "\nSejam bem-vindo/a ao Conversor de Moedas\n" +
        "\n1) Dólar =>> Peso Argentino\n" +
        "2) Peso Argentino =>> Dólar\n" +
        "3) Dólar =>> Real Brasileiro\n" +
        "4) Real Brasileiro =>> Dólar\n" +
        "5) Dólar =>> Peso Colombiano\n" +
        "6) Peso Colombiano =>> Dólar\n" +
        "7) Sair\n" +
        "Escolha um opção válida: ";

        int n = 0;
        while (n != 7){
            System.out.print(menu);
            n = sc.nextInt();
            if (n == 7){
                break;
            }
            System.out.println("**************************************\n");
            System.out.print("Digite o valor: ");
            double m = sc.nextDouble();
            System.out.println();
            System.out.println(moedas.calculaMoeda(n, m));

        }
        System.out.println("Finalizando Programa!");
    }
}
