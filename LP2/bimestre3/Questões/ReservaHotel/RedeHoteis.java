package Questões.ReservaHotel;
import java.util.ArrayList;
import java.util.List;
public class RedeHoteis {
    private List<Hotel> Hoteis;
    private String nomeHotel;
    private int cnpj;
    public RedeHoteis( String nomeHotel, int cnpj) {
        Hoteis = new ArrayList<Hotel>();
        this.nomeHotel = nomeHotel;
        this.cnpj = cnpj;
    }
    public RedeHoteis() {
    }
    public List<Hotel> getHoteis() {
        return Hoteis;
    }
    public void setHoteis(List<Hotel> hoteis) {
        Hoteis = hoteis;
    }
    public String getNomeHotel() {
        return nomeHotel;
    }
    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
