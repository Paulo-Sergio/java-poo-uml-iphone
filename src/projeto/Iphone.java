package projeto;

import projeto.interfaces.IAparelhoTelefonico;
import projeto.interfaces.INavegadorInternet;
import projeto.interfaces.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("projeto.Iphone: ligar");
    }

    @Override
    public void atender() {
        System.out.println("projeto.Iphone: atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("projeto.Iphone: iniciarCorreioVoz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("projeto.Iphone: exibirPagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("projeto.Iphone: adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("projeto.Iphone: atualizarPagina");
    }

    @Override
    public void tocar() {
        System.out.println("projeto.Iphone: tocar");
    }

    @Override
    public void pausar() {
        System.out.println("projeto.Iphone: pausar");
    }

    @Override
    public void selecionarMusica(Integer id) {
        System.out.println("projeto.Iphone: selecionarMusica");
    }
}
