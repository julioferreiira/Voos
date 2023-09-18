package br.com.fescfafic.voo.Model;

public class Voo {
    public int numeroDoVoo;
    public String origem;
    public String destino;
    public String dataHoraPartida;
    public String dataHoraChegada;
    public int capacidadePassageiros;
    public int assentosReservados;

    public Voo(int numeroDoVoo, String origem, String destino, String dataHoraPartida, String dataHoraChegada, int capacidadePassageiros , int assentosReservados) {
        this.numeroDoVoo = numeroDoVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        this.capacidadePassageiros = capacidadePassageiros;
        this.assentosReservados = 0;
    }

    public void exibirInfo() {
        System.out.println("Número do Voo: " + numeroDoVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data e Hora de Partida: " + dataHoraPartida);
        System.out.println("Data e Hora de Chegada: " + dataHoraChegada);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Assentos Reservados: " + assentosReservados);
    }
}