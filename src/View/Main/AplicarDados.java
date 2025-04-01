package View.Main;

import java.util.Scanner;
import Interfaces.InterfaceDespesas;
import Repositorios.DespesasRepository;
import Servicos.DespesasService;

public class AplicarDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfaceDespesas repository = new DespesasRepository(10);
        DespesasService service = new DespesasService(repository);

        while (true) {
            System.out.println("1 - Adicionar Despesa");
            System.out.println("2 - Remover Despesa");
            System.out.println("3 - Consultar Última Despesa");
            System.out.println("4 - Total de Despesas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> service.adicionarDespesa(scanner);
                case 2 -> service.removerDespesa();
                case 3 -> service.consultarUltimaDespesa();
                case 4 -> service.totalDespesas();
                case 5 -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
