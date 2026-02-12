package ui;

import services.PetFormsFileManager;
import services.PetQuestion;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void start() {
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
                        System.out.println("Cadastrar pet.");
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
                        break;
                    }

                    default:
                        throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException ile) {
                System.out.println();
                System.out.println("Digite uma opção válida.");
                System.out.println();
            } catch (InputMismatchException ime) {
                System.out.println();
                System.out.println("Digite apenas números.");
                scanner.nextLine();
                System.out.println();
            }
        }
    }

    public static void showOptions() {
        System.out.println("[ 1 ] Cadastrar um novo pet");
        System.out.println("[ 2 ] Alterar os dados do pet cadastrado");
        System.out.println("[ 3 ] Deletar um pet cadastrado");
        System.out.println("[ 4 ] Listar todos os pets cadastrados");
        System.out.println("[ 5 ] Listar pets por algum critério (idade, nome, raça)");
        System.out.println("[ 6 ] Sair");
    }
}
