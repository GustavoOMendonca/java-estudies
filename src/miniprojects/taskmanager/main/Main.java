package miniprojects.taskmanager.main;

import miniprojects.taskmanager.service.TaskService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskService service = new TaskService();

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();
                    service.addTask(desc);
                    break;

                case 2:
                    service.listTasks();
                    break;

                case 3:
                    System.out.print("Índice: ");
                    int completeIndex = Integer.parseInt(scanner.nextLine());
                    service.completeTask(completeIndex);
                    break;

                case 4:
                    System.out.print("Índice: ");
                    int removeIndex = Integer.parseInt(scanner.nextLine());
                    service.removeTask(removeIndex);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}