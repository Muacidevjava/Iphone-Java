package web;

public interface NavegadorWeb {
    void abrirPagina(String url);
    void atualizarPagina();
    void adicionarFavorito(String url);
    void voltar();
    void avancar();
}
