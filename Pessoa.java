package programacao.sistema_Cadastro_Pessoas;

public class Pessoa {
    private  int id;
    private  String nome;
    private  String cpf;
    private  String email;
    private  String telefone;

    public Pessoa(int id, String nome, String cpf, String email, String telefone){
        this.telefone = telefone;
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }


    // getters e setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    
}
