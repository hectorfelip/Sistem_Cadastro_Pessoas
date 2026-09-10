import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>(10);
        do{
            try {
                Pessoa pessoa1 = new Pessoa();
                listaPessoas.add(pessoa1);
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar Pessoa com construtor default!");
                e.printStackTrace();
                        }
            try {
                Pessoa pessoa2 = new Pessoa("Peter","52998224725","Teste@email.com","62912341234");
                listaPessoas.add(pessoa2);
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar Pessoa com construtor parametrizado!");
                e.printStackTrace();
            }

            try {
                Pessoa tst = new Pessoa();
                System.out.println(tst.verificarCpf("52998224725"));
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar cpf valido!");
                e.printStackTrace();
            }
            try {
                Pessoa tst = new Pessoa();
                System.out.println(tst.verificarCpf("52998224725"));
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar cpf valido!");
                e.printStackTrace();
            }
            try {
                Pessoa pessoa3 = new Pessoa();
                pessoa3.setNome(null);
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao tentar cadastrar nome vazio!");
                e.printStackTrace();
            }

            try {
                Pessoa pessoa4 = new Pessoa();
                pessoa4.setEmail("email#com.br");
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao tentar cadastrar email invalido!");
                e.printStackTrace();
            }

            try {
                Pessoa a = new Pessoa("null", "52998224725", "null@text.com", "62912341234");
                a.showdata();
                a.setCpfvalido(a.getCpf());
                a.showdata(a.getCpfValido());
                System.out.println("ok");
            } catch (Exception e) {
                System.out.println("Erro ao tentar usar metodo de mostrar dados!");
                e.printStackTrace();
            }
        }while(1+1 ==3);
    }
}
