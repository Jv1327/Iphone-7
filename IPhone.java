// Interface para o Reprodutor Musical
// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String pagina);
    void adicionarNovaAba(String pagina);
    void atualizarPagina();
}

// Classe que representa o iPhone, implementando as interfaces correspondentes aos seus papéis
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        // Lógica para iniciar a reprodução de música
    }

    @Override
    public void pausar() {
        // Lógica para pausar a reprodução de música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música específica para reprodução
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        // Lógica para realizar uma ligação telefônica
    }

    @Override
    public void atender() {
        // Lógica para atender uma chamada telefônica
    }

    @Override
    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String pagina) {
        // Lógica para exibir uma página na internet
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        // Lógica para adicionar uma nova aba ao navegador
    }

    @Override
    public void atualizarPagina() {
        // Lógica para atualizar a página atual no navegador
    }
}