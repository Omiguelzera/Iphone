package NavegadorInternet;

public class Chrome implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova pagina Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando nova pagina Chrome");
    }
}
