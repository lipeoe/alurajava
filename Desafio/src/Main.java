import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double balance = 1599.00;
        String user = "Felipe Santos";
        int password = 1234;
        String typeAcc = "Current";
        System.out.println("Type your username: ");
        String usertype = read.nextLine();
        System.out.println("Type your password: ");
        int passwordtype = read.nextInt();
        System.out.println("*********************************");
        System.out.println(String.format("User:      %s\n\nAccount Type:      %s\n\nBalance:      %.2f",user, typeAcc, balance));
        System.out.println("*********************************");

        int opcao = 0;

        String loop = """
                ** Choose your option **
                1 - Check balance
                2 - Transfer money
                3 - Receive transfer
                4 - Exit
                """;

        while (opcao != 4) {


            System.out.println(loop);
            opcao = read.nextInt();

            if(opcao == 1){
                System.out.println("current balance: "+ balance);

            } else if(opcao == 2){
                System.out.println("How much do you want to transfer money?: ");
                double amount = read.nextDouble();
                if(amount > balance){
                    System.out.println("Insufficient balance.");
                }else {
                    balance -= amount;
                    System.out.println("Transfer successful. New balance: "+balance);
                }
            }else if(opcao == 3){
                System.out.println("How much do you want to receive money?: ");
                double amount = read.nextDouble();
                balance += amount;
                System.out.println("Transfer successful. New balance: "+balance);
            }else if(opcao != 4){
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}