public class Iphone {
    public static void main(String[] args) {

        ReprodutorMusical rm = new ReprodutorMusical();
        FuncoesBasicas fb = new FuncoesBasicas();
        NavegadorInternet ni = new NavegadorInternet();

        rm.tocar();
        rm.pausar();
        rm.selecionarMusica();

        fb.ligar();
        fb.desligar();
        fb.atender();
        fb.desligar();
        fb.iniciarCorreioDeVoz();

        ni.exibirPagina();
        ni.atualizarPagina();
        ni.adicionarAba();

    }
}