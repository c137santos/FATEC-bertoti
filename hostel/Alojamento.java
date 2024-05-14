package hostel;
import java.util.ArrayList;
import java.util.List;


public class Alojamento {
    private String nome;
    private String tipo;
    private int capacidade;
    private Boolean lotado;
    private List<Acomodacao> acomodacoes;


    public Alojamento(String nome, String tipo, int capacidade, List<Acomodacao> acomodacoes) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.lotado = false;
        this.acomodacoes = new ArrayList<Acomodacao>();
    }

    public Boolean verificarLotacao() {
        if (capacidade == acomodacoes.size()) {
            lotado = true;
        } else {
            lotado = false;
        }
        return lotado;
    }

    public Acomodacao criarAcomodacao(int codigo, String tipo, Boolean ocupado, double precoDiaria) {
        Acomodacao acomodacao = new Acomodacao(codigo, tipo, ocupado, precoDiaria);
        acomodacoes.add(acomodacao);
        return acomodacao;
    }

    public List<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public Acomodacao getAcomodacao(int codigo) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getCodigo() == codigo) {
                return acomodacao;
            }
        }
        return null;
    }
}
