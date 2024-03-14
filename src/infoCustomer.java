import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class infoCustomer {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite seu nome para iniciar sua conta");
        String name = reading.nextLine();
        System.out.println("Digite que tipo de serviço você deseja");
        String accountType = reading.nextLine();
        System.out.println("Adicionar contribuição adicional");
        double value = reading.nextDouble();
        int numberListener = 0;

        String clientData = """
                ----------------------------------------------
                Nome:                %s
                TIpo conta:          %s
                Saldo inicial:       %.2f
                ----------------------------------------------
                
                """;
        System.out.println(String.format(clientData, name, accountType, value));

        String strin = """
                Operações:
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a operação desejada
                """;

        while (numberListener != 4) {
            System.out.println(strin);
            numberListener = reading.nextInt();

            switch (numberListener) {
                case 1:
                    System.out.println("O seu saldo atual é de " + value);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar");
                    double sumNewValue = reading.nextDouble();
                    value += sumNewValue;
                    System.out.println("Valor atualizado para " + value);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja Transferir");
                    double minusNewValue = reading.nextDouble();
                    if (value >= minusNewValue) {
                        value -= minusNewValue;
                        System.out.println("Valor atualizado para " + value);
                    } else {
                        System.out.println("Saldo insuficiente para realizar a transação");
                    }
                    break;

                case 4:
                    System.out.println("Logout realizado com sucesso");
                    break;
            }
        }
    }
}
