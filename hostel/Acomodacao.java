package hostel;

public class Acomodacao {
    private int codigo;
    private String tipo;
    private Boolean ocupado;
    private double precoDiaria;

    public Acomodacao(int codigo, String tipo, Boolean ocupado, double precoDiaria) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.precoDiaria = precoDiaria;
    }

    public void changePrecoDiaria(double novoPreco) {
        this.precoDiaria = novoPreco;
    }
    public int getCodigo() {
        return codigo;
    }

    public double getValorDiaria() {
        return precoDiaria;
    }
}
