package Servicos;

import Entidades.Transactions.Despesa;
import Interfaces.InterfaceDespesas;
import java.util.Scanner;

public class DespesasService {
    private final InterfaceDespesas repository;

    public DespesasService(InterfaceDespesas repository) {
        this.repository = repository;
    }

    public void adicionarDespesa(Scanner scanner) {
        System.out.print("Data: ");
        String data = scanner.nextLine();
        System.out.print("Categoria (Essencial/Supérfluo): ");
        String categoria = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        Despesa despesa = new Despesa(data, valor, categoria, descricao);
        if (!repository.adicionarDespesa(despesa)) {
            System.out.println("Pilha cheia, não é possível adicionar mais despesas.");
        }
    }

    public void removerDespesa() {
        Despesa despesa = repository.removerDespesa();
        if (despesa != null) {
            System.out.println("Despesa removida: " + despesa.getDescricao());
        } else {
            System.out.println("Nenhuma despesa para remover.");
        }
    }

    public void consultarUltimaDespesa() {
        Despesa despesa = repository.consultarUltimaDespesa();
        if (despesa != null) {
            System.out.println("Última Despesa: " + despesa.getDescricao());
        } else {
            System.out.println("Nenhuma despesa registrada.");
        }
    }

    public void totalDespesas() {
        System.out.println("Total de despesas: " + repository.totalDespesas());
    }
}
