package hostel;
import java.sql.Date;
import java.util.List;

public class Reserva {
    private List<Acomodacao> acomodacoes;
    private Hospede titular;
    private Date checkIn;
    private Date checkOut;
    private double valorTotal;

    public double calcularValorTotalReserva(int codigoAcomodacao) {
        int dias = (int) ((checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24));
        Acomodacao acomodacao = getAcomodacao(codigoAcomodacao);
        if (acomodacao == null) {
            return 0.0;
        }
        Double diaria = acomodacao.getValorDiaria(codigoAcomodacao);
        valorTotal = dias * diaria;
        return valorTotal;
    }

    public Acomodacao getAcomodacao(int codigoAcomodacao) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getCodigo() == codigoAcomodacao) {
                return acomodacao;
            }
        }
        return null;
    }
}
