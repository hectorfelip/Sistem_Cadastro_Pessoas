package programacao.sistema_Cadastro_Pessoas;

public class Pessoa {
    private  int id;
    private  String nome;
    private  String cpf;
    private  String email;
    private  String telefone;

    public  Pessoa(){}

    public Pessoa( String nome, String cpf, String email, String telefone){
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }


    public Pessoa(int id, String nome, String cpf, String email, String telefone){
        this.telefone = telefone;
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    private boolean verificarCpf(String cpf){
        int a,b;
        a = cpf.charAt(9) - '0';
        b = cpf.charAt(10) - '0';

        int sum = 0;
        int d1,d2;
        int[] cpfNum = new int[9];
        int[] num = {10,9,8,7,6,5,4,3,2};
        // calculo dv
        // coleta os numeros do cpf um por um e separa cada um em uma lista.
        for (int i = 0; i <= cpf.length()-2; i++) {
            char k = cpf.charAt(i);
            cpfNum[i] = k - '0';
        }
        // calculo bruto!
        for(int i = 0; i <= cpfNum.length; i++){
            sum += cpfNum[i] * num[i];
        }

        int resto = sum%11;
        d1 = 11 - resto;
        sum = 0;

        //calculo segundo dv
        // coleta os numeros do cpf um por um e separa cada um em uma lista.
        for (int i = 0; i <= cpf.length()-2; i++) {
            if(cpf.length() == 7){
                cpfNum[i] = cpfNum[i+1];
            }else{
                cpfNum[8] = d1;
            }
        }
        // calculo bruto!
        for(int i = 0; i <= cpfNum.length; i++){
            sum += cpfNum[i] * num[i];
        }

        int resto2 = sum%11;
        d2 = 11 - resto2;

        if(a != d1 || b != d2){
            // System.out.println("O cpf é invalido!");
            return false;
        }else{
            // System.out.println("O cpf é válido");
            return true;
        }

        
        
    }    

    // getters e setters
    public void setCpf(String cpf) {
        if(cpf.trim().isEmpty()){
            System.out.println("O cpf não pode estar vazio!");
        }else if(cpf.matches("[\\d{3}].[\\d{3}].[\\d{3}]-[\\d{2}] || [\\d{1,11}]")){
            System.out.println("O cpf não segue o modelo correto!");
        }else if(!verificarCpf(cpf)){
            System.out.println("CPF invalido!");
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
