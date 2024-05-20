package hostel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Hostel {
    private int capacidade;
    private List<Alojamento> alojamentos;
    private List<Reserva> reservas;
    private List<Hospede> hospedes;

    public Hostel(){
        capacidade = 2;
        alojamentos = new ArrayList<Alojamento>();
        reservas = new ArrayList<Reserva>();
        hospedes = new ArrayList<Hospede>();
    }

    public void reservarAcomodacao(int codigoAcomodacao, String cpfHospede, String nomeHospede, String checkIn, String checkOut) throws ParseException{
        Acomodacao acomodacao = getAcomodacao(codigoAcomodacao);
        Hospede titular = cadastrarHospede(nomeHospede, cpfHospede);
        Reserva reserva = new Reserva(titular, acomodacao, checkIn, checkOut);
        reservas.add(reserva);
    };

    public Hospede cadastrarHospede(String nome, String cpf){
        Hospede hospede = new Hospede(nome, cpf);
        hospedes.add(hospede);
        return hospede;
    };

    public List<Reserva> getReservas(){
        return reservas;
    };

    public List<Alojamento> getAlojamentos() {
        return alojamentos;
    }

    public void addAlojamento(Alojamento alojamento) {
        alojamentos.add(alojamento);
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public Acomodacao getAcomodacao(int codigoAcomodacao) {
        for (Alojamento alojamento : alojamentos) {

            if (alojamento.getAcomodacao(codigoAcomodacao) != null) {
                return alojamento.getAcomodacao(codigoAcomodacao);
            }
        }
        return null;
    }

    public Boolean verificarLotacao(){
        for(Alojamento alojamento : alojamentos){
            if (!alojamento.verificarLotacao()) {
                return false;
            }
        }
        return true;
    }
}
