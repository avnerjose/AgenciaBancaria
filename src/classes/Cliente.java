package classes;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;
    private static String cpfGlobal;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static String getCpfGlobal() {
        return cpfGlobal;
    }

    public static void setCpfGlobal(String cpfGlobal) {
        Cliente.cpfGlobal = cpfGlobal;
    }

}
