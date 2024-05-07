package hostel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Hostel {
    private int capacidade;
    private List<Alojamento> alojamentos;
    private List<Reserva> reservas;
    private List<Hospede> hospedes;

    public void acionarLimpeza(Alojamento alojamento){
        System.out.println("Acionando limpeza do alojamento");
    };

    public void reservarAcomodacao(int codigoAcomodacao, long cpfHospede, String dataStringCheckIn, String dataSaidaCheckOut){
        Alojamento alojamento = new Alojamento();
        Acomodacao acomodacao = alojamento.getAcomodacao(codigoAcomodacao);
        
        Hospede hospede = new Hospede();
        Hospede titular = hospede.getHospede(cpfHospede);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date checkIn = formato.parse(dataStringCheckIn);
        Date checkOut = formato.parse(dataStringCheckIn);
        
        Reserva reserva = new Reserva(titular, acomodacao, checkIn, checkOut, 0.0);
        reservas.add(reserva);
    };

    public void cadastrarHospede(String nome, long cpf, String email, String telefone){
        Hospede hospede = new Hospede(nome, cpf, email, telefone);
        hospedes.add(hospede);
    };

}
