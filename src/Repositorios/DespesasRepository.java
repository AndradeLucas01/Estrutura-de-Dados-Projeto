package Repositorios;

import Entidades.Transactions.Despesa;
import Interfaces.InterfaceDespesas;

public class DespesasRepository implements InterfaceDespesas {
    private final Despesa[] pilha;
    private int topo;
    private final int capacidade;

    public DespesasRepository(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new Despesa[capacidade];
        this.topo = -1;
    }

    @Override
    public boolean adicionarDespesa(Despesa despesa) {
        if (topo < capacidade - 1) {
            pilha[++topo] = despesa;
            return true;
        }
        return false;
    }

    @Override
    public Despesa removerDespesa() {
        if (topo >= 0) {
            return pilha[topo--];
        }
        return null;
    }

    @Override
    public Despesa consultarUltimaDespesa() {
        return topo >= 0 ? pilha[topo] : null;
    }

    @Override
    public int totalDespesas() {
        return topo + 1;
    }
}
