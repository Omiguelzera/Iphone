package ReprodutorMusical;

public class AppleMusic implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada ");
    }

    @Override
    public void escolhendoMusica() {
        System.out.println("Escolhendo musica");
    }
}
