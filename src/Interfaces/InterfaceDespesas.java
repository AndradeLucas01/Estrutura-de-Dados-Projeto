package Interfaces;

import Entidades.Transactions.Despesa;

public interface InterfaceDespesas {
    boolean adicionarDespesa(Despesa despesa);
    Despesa removerDespesa();
    Despesa consultarUltimaDespesa();
    int totalDespesas();
}
