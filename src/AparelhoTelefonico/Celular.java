package AparelhoTelefonico;

public class Celular implements AparelhoTelefonico {


    @Override
    public void ligar() {
        System.out.println("Discando número");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Ouvindo mensagem");
    }
}
