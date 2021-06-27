package classes;

public class Cliente {
    private String nome;
    private String email;
    private static String cpf;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }
    
    
    
    
    
    
}
