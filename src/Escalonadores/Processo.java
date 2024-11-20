package Escalonadores;

public class Processo {
    private final String nome;
    private int tempoDeExecucao;
    private int tempoDeChegada;
    private int prioridade;
    private int fatiaDeTempo;

    public Processo(String nome, int tempoDeExecucao, int tempoDeChegada, int prioridade, int fatiaDeTempo) {
        this.nome = nome;
        this.tempoDeExecucao = tempoDeExecucao;
        this.tempoDeChegada = tempoDeChegada;
        this.prioridade = prioridade;
        this.fatiaDeTempo = fatiaDeTempo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoDeExecucao() {
        return tempoDeExecucao;
    }

    public void setTempoDeExecucao(int tempoDeExecucao) {
        this.tempoDeExecucao = tempoDeExecucao;
    }

    public int getTempoDeChegada() {
        return tempoDeChegada;
    }

    public void setTempoDeChegada(int tempoDeChegada) {
        this.tempoDeChegada = tempoDeChegada;
    }

    public int getPrioridade() { return prioridade; }

    public void setPrioridade(int prioridade) { this.prioridade = prioridade; }

    public int getFatiaDeTempo() { return fatiaDeTempo; }

    public void setFatiaDeTempo(int fatiaDeTempo) { this.fatiaDeTempo = fatiaDeTempo; }

    @Override
    public String toString() {
        return "Processo{" +
                "nome='" + nome + '\'' +
                ", tempoDeExecucao=" + tempoDeExecucao +
                ", tempoDeChegada=" + tempoDeChegada +
                ", prioridade=" + prioridade +
                ", fatiaDeTempo=" + fatiaDeTempo +
                '}';
    }
}
