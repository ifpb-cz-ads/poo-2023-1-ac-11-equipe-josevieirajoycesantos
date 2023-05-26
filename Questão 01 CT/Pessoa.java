public class Pessoa {
    private String nome, endereco;

    // public Pessoa (String nome){
    //     this.setNome (nome);
    // }
    Pessoa (String nome){
        this.nome = nome;
    }

    public String getEndereço () {
        return endereco;
    }

    public void setEndereco (String endereco){
        this.endereco = endereco;
    } 

    public String getNome () {
        return nome;
    }

    public void setNome (String endereco){
        this.nome = nome;
    }
}
