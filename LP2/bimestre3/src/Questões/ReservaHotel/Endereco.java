package Questões.ReservaHotel;

public class Endereco {
    private String cidade;
    private String rua;
    private int num;
    private int cep;
    private String estado;

    public Endereco() {
    }

    public Endereco(String cidade, String rua, int num, int cep, String estado) {
        this.cidade = cidade;
        this.rua = rua;
        this.num = num;
        this.cep = cep;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
