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
        if(cpf.trim().isEmpty()){
            System.out.println("O cpf não pode estar vazio!");
        }else if(cpf.matches("[\\d{3}].[\\d{3}].[\\d{3}]-[\\d{2}]")){
            System.out.println("O cpf não segue o modelo correto!");
        }else{
            this.cpf = cpf;
        }
    }
    public void setEmail(String email) {
        if(email.trim().isEmpty()){
            System.out.println("Email não pode ser vazio!");
        }else  if(!email.matches("^[\\w.]+@[\\w.].[\\w{2,}]&")){
            System.out.println("Email fora de formato compativel!");
        }else{
            this.email = email;
        }
    }
    public void setId(int id) {
        if(id <= 0){
            System.out.println("Id impossivel!");
        }else{
            this.id = id;
        }
    }
    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            System.out.println("Nome vazio!");
        }else if(nome.matches("(\\d+) && (\\W+) && (\\S+)")){
            System.out.println("O nome não deve conter números ou caracteres especiais!");
        }else{
            this.nome = nome;
        }
    }
    public void setTelefone(String telefone) {
        if(telefone.trim().isEmpty()){
            System.out.println("O numero de telefone não pode estar vazio!");
        }else if(!telefone.matches("\\d{2}9\\d{8}")){
            System.out.println("Estrutura inadequada para numeros!");
        }else{
            this.telefone = telefone;
        }
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
