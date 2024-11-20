import Escalonadores.EscalonadorFIFO;
import Escalonadores.EscalonadorPrioridade;
import Escalonadores.EscalonadorSJF;
import Escalonadores.Processo;

public class Main {
    public static void main(String[] args) {
        /*
        EscalonadorFIFO escalonadorFIFO = new EscalonadorFIFO();

        escalonadorFIFO.adicionarProcesso(new Processo("P1", 4, 0, 3, 2)); // Processo P1 com 4 unidades de tempo e chegada em 0
        escalonadorFIFO.adicionarProcesso(new Processo("P2", 3, 5, 1, 1)); // Processo P2 com 3 unidades de tempo e chegada em 5
        escalonadorFIFO.adicionarProcesso(new Processo("P3", 2, 7, 2, 2)); // Processo P3 com 2 unidades de tempo e chegada em 7

        escalonadorFIFO.escalonar();


        EscalonadorSJF escalonadorSJF = new EscalonadorSJF();

        // Adicionar processos ao escalonador (nome, tempo de execução, tempo de chegada, prioridade, fatia de tempo)
        escalonadorSJF.adicionarProcesso(new Processo("P1", 5, 0, 1, 2));
        escalonadorSJF.adicionarProcesso(new Processo("P2", 2, 2, 3, 2));
        escalonadorSJF.adicionarProcesso(new Processo("P3", 3, 4, 2, 2));
        escalonadorSJF.adicionarProcesso(new Processo("P4", 1, 6, 4, 2));
        escalonadorSJF.adicionarProcesso(new Processo("P5", 4, 5, 1, 2));

        // Executar o escalonador
        escalonadorSJF.escalonar();

        */
        EscalonadorPrioridade escalonadorPrioridade = new EscalonadorPrioridade();

        // Criando processos
        Processo p1 = new Processo("P1", 4, 0, 3, 0);
        Processo p2 = new Processo("P2", 3, 2, 1, 0);
        Processo p3 = new Processo("P3", 2, 1, 2, 0);
        Processo p4 = new Processo("P4", 5, 4, 1, 0);

        escalonadorPrioridade.adicionarProcesso(p1);
        escalonadorPrioridade.adicionarProcesso(p2);
        escalonadorPrioridade.adicionarProcesso(p3);
        escalonadorPrioridade.adicionarProcesso(p4);

        escalonadorPrioridade.escalonar();

    }
}
