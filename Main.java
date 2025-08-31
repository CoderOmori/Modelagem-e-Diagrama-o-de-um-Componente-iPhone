package POO;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("Paradise - Coldplay");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();

        System.out.println("--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("9999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}