package telefone;

public class IPhoneTelefone implements Telefone {

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + " no iPhone");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada no iPhone");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada no iPhone");
    }

    @Override
    public void rejeitarChamada() {
        System.out.println("Rejeitando chamada no iPhone");
    }
}
