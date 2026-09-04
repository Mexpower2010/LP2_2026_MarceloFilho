package Questões.ReservaHotel;
import java.util.List;
import java.util.ArrayList;
public class Quarto {
    private int numQuarto;
    private char tipoQuarto;//s standard, l luxo
    private boolean ocupado;
    public Quarto(){

    }

    public Quarto(int numQuarto, char tipoQuarto){
        this.numQuarto = numQuarto;
        this.tipoQuarto = tipoQuarto;
        this.ocupado = false;
    }

    public int getNumQuarto() {
        return numQuarto;
    }
    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
    public char getTipoQuarto() {
        return tipoQuarto;
    }
    public void setTipoQuarto(char tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
