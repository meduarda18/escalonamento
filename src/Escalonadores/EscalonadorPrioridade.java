package Escalonadores;

import java.util.ArrayList;
import java.util.List;

public class EscalonadorPrioridade {
    private Processo processo;
    private List<Processo> listaDeProcessos = new ArrayList<>();

    public void adicionarProcesso(Processo processo){
        listaDeProcessos.add(processo);
    }

    public void escalonar(){
        int tempoAtual = 0;

        listaDeProcessos.sort((p1, p2) -> {
            // Primeiro, comparar pela prioridade (menor prioridade vem primeiro)
            int prioridadeComparison = Integer.compare(p1.getPrioridade(), p2.getPrioridade());
            if (prioridadeComparison == 0) {
                // Se as prioridades forem iguais, comparar pelo tempo de chegada
                return Integer.compare(p1.getTempoDeChegada(), p2.getTempoDeChegada());
            }
            return prioridadeComparison;
        });

        System.out.println("Escalonador Prioridade:");

        for (Processo p : listaDeProcessos) {
            // Ajustar o tempo atual se necessário
            if (tempoAtual < p.getTempoDeChegada()) {
                tempoAtual = p.getTempoDeChegada();
            }

            int tempoDeEspera = tempoAtual - p.getTempoDeChegada();
            tempoAtual += p.getTempoDeExecucao();
            int tempoDeRetorno = tempoAtual - p.getTempoDeChegada();

            System.out.println("Processo: " + p.getNome() +
                    ", Tempo de Espera: " + tempoDeEspera +
                    ", Tempo de Retorno: " + tempoDeRetorno);
        }
    }
}
