package Questões.ReservaHotel;
import java.util.LinkedList;
import java.util.List;
public class Hotel {
    private int qtdQuartos;
    private List<Quarto> Quartos;
    private Endereco endereco;

    public Hotel() {
        this.Quartos = new LinkedList<>();
    }

    public Hotel(int qtdQuartos, Endereco endereco) {
        this.qtdQuartos = qtdQuartos;
        this.endereco = endereco;
        this.Quartos = new LinkedList<>();
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }
    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }
    public List getQuarto() {
        return Quartos;
    }
    public void setQuarto(List quartos) {
        Quartos = quartos;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
