package web;

public class IPhoneNavegadorWeb implements NavegadorWeb {

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página " + url + " no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
    }

    @Override
    public void adicionarFavorito(String url) {
        System.out.println("Adicionando página " + url + " aos favoritos no iPhone");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando página no iPhone");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando página no iPhone");
    }
}
