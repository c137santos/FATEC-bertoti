import java.util.List;
import java.util.LinkedList;

public class Resultado {
    
    private List<Dado> dadoSet = new LinkedList<Dado>();

    public void cadastrarValor(Dado dado, double valor) {
        dado.setValor(valor);
    }

    public void cadastrarDadoNoRelatorio(Dado dado) {
        dadoSet.add(dado);
    }

    public List<Dado> getFilterDados(String nome) {
        List<Dado> dadosEncontrados = new LinkedList<Dado>();
        for(Dado dado: dadoSet){
            if(dado.getNome().equals(nome)) dadosEncontrados.add(dado);
        }
        return dadosEncontrados;
    }

    public List<Dado> getDadoSet() {
        return dadoSet;
    }

    public boolean validarDados() {
        for(Dado dado: dadoSet){
            if(dado.getNome() != null && dado.getValor() != 0){
                return true;
            }
        }
        return false;
    }

}