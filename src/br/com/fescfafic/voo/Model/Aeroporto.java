package br.com.fescfafic.voo.Model;
import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    public String nome;
    public String localizacao;
    public List<Voo> voos;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void exibirInfo() {
        System.out.println("Nome do Aeroporto: " + nome);
        System.out.println("Localização: " + localizacao);
        for (Voo voo : voos) {
            System.out.println("Número do Voo: " + voo.numeroDoVoo);
            System.out.println("Origem: " + voo.origem);
            System.out.println("Destino: " + voo.destino);
            System.out.println("Data e Hora de Partida: " + voo.dataHoraPartida);
            System.out.println("Data e Hora de Chegada: " + voo.dataHoraChegada);
            System.out.println("Capacidade de Passageiros: " + voo.capacidadePassageiros);
            System.out.println("Assentos Reservados: " + voo.assentosReservados);
            System.out.println("------------------------------");
        }
    }
}