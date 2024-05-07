package hostel;
import java.util.List;


public class Alojamento {
    private String nome;
    private String tipo;
    private int capacidade;
    private String descricao;
    private Boolean lotado;
    private List<Acomodacao> acomodacoes;


    public Alojamento(String nome, String tipo, int capacidade, String descricao, List<Acomodacao> acomodacoes) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.acomodacoes = acomodacoes;
    }

    public void verificarLotacao() {
        if (capacidade == acomodacoes.size()) {
            lotado = true;
        } else {
            lotado = false;
        }
    }
}
