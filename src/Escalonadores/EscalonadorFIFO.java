package Escalonadores;

import java.util.ArrayList;
import java.util.List;

public class EscalonadorFIFO {
    private Processo processo;
    private List<Processo> listaDeProcessos = new ArrayList<>();

    public void adicionarProcesso(Processo processo){
        listaDeProcessos.add(processo);
    }

    public void escalonar(){
        int tempoAtual = 0;

        listaDeProcessos.sort((p1, p2) -> Integer.compare(p1.getTempoDeChegada(), p2.getTempoDeChegada()));

        System.out.println("Escalonador FIFO:");

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
