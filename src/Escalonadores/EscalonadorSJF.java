package Escalonadores;

import java.util.ArrayList;
import java.util.List;

public class EscalonadorSJF {
    private List<Processo> listaDeProcessos = new ArrayList<>();

    public void adicionarProcesso(Processo processo) {
        listaDeProcessos.add(processo);
    }

    public void escalonar() {
        int tempoAtual = 0;
        int tempoOcioso = 0;

        // Ordenando inicialmente pelo tempo de chegada
        listaDeProcessos.sort((p1, p2) -> Integer.compare(p1.getTempoDeChegada(), p2.getTempoDeChegada()));

        List<Processo> listaDeProntos = new ArrayList<>();

        System.out.println("Escalonador SJF:");

        while (!listaDeProcessos.isEmpty() || !listaDeProntos.isEmpty()) {
            // Adicionar processos prontos à lista de prontos
            for (int i = 0; i < listaDeProcessos.size(); i++) {
                Processo p = listaDeProcessos.get(i);
                if (p.getTempoDeChegada() <= tempoAtual) {
                    listaDeProntos.add(p);
                    listaDeProcessos.remove(i);
                    i--; // Ajustar índice após remoção
                }
            }

            // Ordenar a lista de prontos pelo tempo de execução
            listaDeProntos.sort((p1, p2) -> Integer.compare(p1.getTempoDeExecucao(), p2.getTempoDeExecucao()));

            if (!listaDeProntos.isEmpty()) {
                // Executar o primeiro processo da fila
                Processo processoAtual = listaDeProntos.remove(0);

                int tempoDeEspera = tempoAtual - processoAtual.getTempoDeChegada();
                tempoAtual += processoAtual.getTempoDeExecucao();
                int tempoDeRetorno = tempoAtual - processoAtual.getTempoDeChegada();

                System.out.println("Processo " + processoAtual.getNome() +
                        ": Chegada = " + processoAtual.getTempoDeChegada() +
                        ", Execução = " + processoAtual.getTempoDeExecucao() +
                        ", Espera = " + tempoDeEspera +
                        ", Retorno = " + tempoDeRetorno);
            } else {
                // Incrementar o tempo ocioso e o tempo atual se não houver processos prontos
                tempoOcioso++;
                tempoAtual++;
            }
        }

        System.out.println("Tempo ocioso total do processador: " + tempoOcioso);
    }
}
