/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciadortarefas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author citap
 */
public class GerenciadorTarefas {

    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void editarTarefa(Tarefa tarefa) {
        int index = tarefas.indexOf(tarefa);
        if (index != -1) {
            // Update existing task
            tarefas.set(index, tarefa);
            System.out.println("Tarefa editada com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void removerTarefa(Scanner scanner) {
        System.out.print("Informe o ID da tarefa a ser removida: ");
        int id = scanner.nextInt();
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
        System.out.println("Tarefa removida com sucesso.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Editar tarefa");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Exibir tarefas");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner);
                    break;
                case 2:
                    editarTarefa(scanner);
                    break;
                case 3:
                    removerTarefa(scanner);
                    break;
                case 4:
                    exibirTarefa(scanner);
                    break;
            
                     
    }
    
}
