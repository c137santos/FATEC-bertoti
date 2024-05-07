package hostel;

public class Hospede {
    private String nome;
    private String tipoDocumento;
    private String identificavaoDocumento;
    private int idade;

    public getHospedeInfo(){
        return "Nome: " + this.nome + " - Tipo Documento: " + this.tipoDocumento + " - Identificação Documento: " + this.identificavaoDocumento + " - Idade: " + this.idade;
    }
    
}
