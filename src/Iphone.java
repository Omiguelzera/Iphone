import AparelhoTelefonico.Celular;
import NavegadorInternet.Chrome;
import NavegadorInternet.Safari;
import ReprodutorMusical.AppleMusic;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args){
        /* funções cel = celular / nav = Navegador / mus = Musica */
        String function = "mus";

        if(function.equals("cel")){
            Celular celular = new Celular();
            celular.atender();
            celular.ligar();
            celular.iniciarCorreiodeVoz();
        }
        else if(function.equals("nav")){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha uma opção:");
            System.out.println("1. Chrome");
            System.out.println("2. Safari");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Chrome chrome = new Chrome();
                    chrome.exibirPagina();
                    chrome.adicionarNovaAba();
                    chrome.atualizarPagina();
                    break;
                case 2:
                    Safari safari = new Safari();
                    safari.exibirPagina();
                    safari.adicionarNovaAba();
                    safari.atualizarPagina();
                    break;
                default:
                    System.out.println("Navegador não encontrado!");
                    break;
            }

            scanner.close();
        }
        else if(function.equals("mus")){
            AppleMusic appleMusic = new AppleMusic();
            appleMusic.tocar();
            appleMusic.pausar();
            appleMusic.escolhendoMusica();

        }
    }
}
