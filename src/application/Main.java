package application;

import ui.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean firstTime = true;
        boolean running = true;

        while (running) {
            try {
                if (firstTime) {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("|           Bem vindo a casa de adoção de pets!            |");
                    System.out.println("------------------------------------------------------------");

                    firstTime = false;
                }

                System.out.println();
                System.out.println("Escolha uma das opções abaixo: ");
                Menu.showOptions();

                System.out.println();
                System.out.print("OPÇÃO ESCOLHIDA: ");

                int option = scanner.nextInt();
                scanner.nextLine();

                System.out.println();

                switch (option) {
                    case 1: {
                        System.out.println("Cadastrar pet");
                        continue;
                    }
                    case 2: {
                        System.out.println("Alterar os dados do pet cadastrado");
                        continue;
                    }
                    case 3: {
                        System.out.println("Deletar um pet cadastrado");
                        continue;
                    }
                    case 4: {
                        System.out.println("Listar todos os pets cadastrados");
                        continue;
                    }
                    case 5: {
                        System.out.println("Listar pets por algum critério (idade, nome, raça)");
                        continue;
                    }
                    case 6: {
                        System.out.println("Obrigado por visitar a casa de adoção de pets!");
                        running = false;
                    }

                    default:
                        throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException ile) {
                System.out.println();
                System.out.println("Digite uma opção válido.");
                System.out.println();
            } catch (InputMismatchException ime) {
                System.out.println();
                System.out.println("Digite apenas números.");
                scanner.nextLine();
                System.out.println();
            }
        }

    }
}