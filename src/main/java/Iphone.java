import Interface.Internet;
import Interface.Ipod;
import Interface.Phone;

public class Iphone implements Ipod, Phone, Internet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar uma Nova Aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");

    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica!");

    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusicas() {
        System.out.println("Selecionar música");

    }


    @Override
    public void ligar() {
        System.out.println("Ligando ");

    }

    @Override
    public void atender() {
        System.out.println("Telefone atendido ");

    }

    @Override
    public void correioVoz() {
        System.out.println("Há uma chamada de voz. ");

    }
}
