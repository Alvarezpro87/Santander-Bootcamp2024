public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void alterarVolume(int volume) {
        System.out.println("Volume ajustado para: " + volume);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void recarregarPagina() {
        System.out.println("Página recarregada.");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Navegador fechado.");
    }
}

