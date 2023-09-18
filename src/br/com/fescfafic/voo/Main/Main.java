package br.com.fescfafic.voo.Main;
import br.com.fescfafic.voo.Model.Aeroporto;
import br.com.fescfafic.voo.Model.Passageiro;
import br.com.fescfafic.voo.Model.Reserva;
import br.com.fescfafic.voo.Model.Voo;


public class Main {
    public static void main(String[] args) {

        Passageiro meuPassageiro = new Passageiro("Júlio", 324, "julioferreiracavalcanti@gmail.com");
        Voo meuVoo = new Voo(10, "CZ", "SJP", "Cinco horas", "Nove horas", 55,3);
        Reserva minhaReserva = new Reserva(meuPassageiro, meuVoo, 3);
        Aeroporto aero1 = new Aeroporto("Congonhas","Santos");




        meuVoo.exibirInfo();
        System.out.println("--------------------------------------------------------------------");
        meuPassageiro.exibirInfo();
        System.out.println("--------------------------------------------------------------------");
        minhaReserva.exibirInfo();
        System.out.println("--------------------------------------------------------------------");
        aero1.exibirInfo();
    }
}