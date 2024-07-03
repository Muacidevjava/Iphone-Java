package musica;

public class IPhoneReprodutorMusical implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone");
    }

    @Override
    public void parar() {
        System.out.println("Parando música no iPhone");
    }

    @Override
    public void proximaFaixa() {
        System.out.println("Próxima faixa no iPhone");
    }

    @Override
    public void faixaAnterior() {
        System.out.println("Faixa anterior no iPhone");
    }
}
