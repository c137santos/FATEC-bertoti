package hostel;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteHostel {
    private Hostel hostel;
    
    @Before
    public void setUp() {
        hostel = new Hostel();
        Alojamento alojamento = new Alojamento("Alojamento 1", "coletivo", 1, null);
        alojamento.criarAcomodacao(1212, "coletivo", true, 100.0, "beliche");
        hostel.addAlojamento(alojamento);
    }
    
    @Test
    public void testRealizarReserva() throws ParseException {
        
        hostel.reservarAcomodacao(1212, "12345678901", "Fulano", "01-01-2020", "02-01-2020");

        assertEquals(1, hostel.getReservas().size());
        assertEquals(1212, hostel.getAlojamentos().get(0).getAcomodacoes().get(0).getCodigo());
        assertEquals("12345678901", hostel.getHospedes().get(0).getCpf());
        assertEquals("Fulano", hostel.getReservas().get(0).getTitular().getNome());
        assertEquals("01-01-2020", hostel.getReservas().get(0).getCheckIn());
        assertEquals("02-01-2020", hostel.getReservas().get(0).getCheckOut());
    }   

    @Test
    public void testVerificarPrecoReserva() throws ParseException {
        hostel.reservarAcomodacao(1212, "12345678901", "Fulano", "01-01-2020", "03-01-2020");
        assertEquals(200.0, hostel.getReservas().get(0).getValorTotal(), 0.01);
    }

    @Test
    public void testVerificaLotacao() {
        Alojamento alojamento = new Alojamento("Alojamento 2", "coletivo", 1, null);
        alojamento.criarAcomodacao(2424, "coletivo", true, 100.0, "beliche");
        hostel.addAlojamento(alojamento);
        assertEquals(true, hostel.verificarLotacaoAlojamentos());
    }
}
