package poo.aula07;

public abstract class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(){

    }

    public Endereco(String rua, int numero, String cidade, String estado, String cep){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua(){
        return rua;
    }

    public int getNumero(){
        return numero;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public String getCep(){
        return cep;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void mostrarEndereco(){
        System.out.println("Endereço: " + rua + ", " + numero + ", " + cidade + ", " + estado + ", " + cep);
    }
}
