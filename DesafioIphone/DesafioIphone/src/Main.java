public class Main {
    public static void main(String[] args) {

        iPhone meuIphone = new iPhone();


        System.out.println("Testando reprodutor musical:");
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.alterarVolume(80);


        System.out.println("\nTestando aparelho telefônico:");
        meuIphone.fazerChamada("123456789");
        meuIphone.encerrarChamada();


        System.out.println("\nTestando navegador de internet:");
        meuIphone.abrirURL("https://www.example.com");
        meuIphone.recarregarPagina();
        meuIphone.fecharNavegador();
    }
}
