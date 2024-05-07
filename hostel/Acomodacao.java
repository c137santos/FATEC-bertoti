package hostel;

public class Acomodacao {
    private int codigo;
    private String tipo;
    private Boolean ocupado;
    private double precoDiaria;
    private String descricao;

    public Acomodacao(int codigo, String tipo, Boolean ocupado, double precoDiaria, String descricao) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.precoDiaria = precoDiaria;
        this.descricao = descricao;
    }

    public void changePrecoDiaria(double novoPreco) {
        this.precoDiaria = novoPreco;
    }
}
