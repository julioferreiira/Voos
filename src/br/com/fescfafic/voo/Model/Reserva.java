package br.com.fescfafic.voo.Model;

public class Reserva {

    public Passageiro passageiro;
    public Voo voo;
    public int assentosReservados;

    public Reserva(Passageiro passageiro, Voo voo, int assentosReservados) {
        this.passageiro = passageiro;
        this.voo = voo;
        this.assentosReservados = assentosReservados;
    }
    public void exibirInfo() {
        System.out.println("Passageiro: " + passageiro.nome);
        System.out.println("Voo: " + voo.numeroDoVoo);
        System.out.println("Assentos reservados: " + assentosReservados);
    }
}