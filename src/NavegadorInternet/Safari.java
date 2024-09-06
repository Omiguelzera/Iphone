package NavegadorInternet;

public class Safari implements NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova pagina Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando nova pagina Safari");
    }
}
