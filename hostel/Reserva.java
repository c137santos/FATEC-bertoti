package hostel;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reserva {
    private Acomodacao acomodacao;
    private Hospede titular;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double valorTotal;

    public Reserva(Hospede titular, Acomodacao acomodacao, String checkIn, String checkOut) throws ParseException {
        this.titular = titular;
        this.acomodacao = acomodacao;
        this.checkIn = convertStringToDate(checkIn);
        this.checkOut = convertStringToDate(checkOut);
        this.valorTotal = calcularValorTotalReserva();
    }
    public double calcularValorTotalReserva() {
        Date checkInDate = java.sql.Date.valueOf(checkIn);
        Date checkOutDate = java.sql.Date.valueOf(checkOut);
        int dias = (int) ((checkOutDate.getTime() - checkInDate.getTime()) / (1000 * 60 * 60 * 24));
        Double diaria = acomodacao.getValorDiaria();
        valorTotal = dias * diaria;
        return valorTotal;
    }

    public LocalDate convertStringToDate(String strDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(strDate, formatter);
        return date;
    }
    public Hospede getTitular() {
        return titular;
    }

    public String getCheckIn() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return checkIn.format(formatter);
    }

    public String getCheckOut() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return checkOut.format(formatter);
    }

    public Double getValorTotal() {
        return valorTotal;
    }

}
