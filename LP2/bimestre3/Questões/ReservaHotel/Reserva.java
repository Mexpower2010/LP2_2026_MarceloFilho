package Questões.ReservaHotel;
import java.time.LocalDate;
public class Reserva {

    private int qtdPessoas;
    private int qtdQuartos;
    private LocalDate checkIn;
    private LocalDate checkOut;
    public Reserva(int qtdPessoas, int qtdQuartos, LocalDate checkIn, LocalDate checkOut) {
        this.qtdPessoas = qtdPessoas;
        this.qtdQuartos = qtdQuartos;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Reserva() {
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    public int getQtdQuartos() {
        return qtdQuartos;
    }
    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }
    public LocalDate getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
}