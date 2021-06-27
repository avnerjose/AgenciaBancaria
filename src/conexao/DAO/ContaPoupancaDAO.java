package conexao.DAO;

import classes.Conta;
import classes.ContaPoupanca;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContaPoupancaDAO extends connectionDAO {

    boolean sucesso = false;

    public boolean inserirContaMovimento(ContaPoupanca conta) {
        connectToDB();
        String sql = "INSERT INTO Conta_Poupanca (numero, saldo, rendimento, Agencia_numero) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conta.getNumero());
            pst.setFloat(2, conta.getSaldo());
            pst.setFloat(3, conta.getRendimento());
            pst.setString(4, "101");
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    public boolean atualizarFilme(int numero, ContaPoupanca conta) {
        connectToDB();
        String sql = "UPDATE Conta_Movimento SET saldo=?, rendimento=? where numero=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, conta.getSaldo());
            pst.setFloat(2, conta.getRendimento());
            pst.setFloat(3, numero);
            pst.execute();
            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarFilme(int numero) {
        connectToDB();
        String sql = "DELETE FROM Conta_Poupanca where numero=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, numero);
            pst.execute();
            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public ArrayList<Conta> buscarContasMovimento() {
        ArrayList<Conta> listaDeContasMovimento = new ArrayList<>();

        connectToDB();

        String sql = "SELECT * FROM Conta_Movimento";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de filmes");
            while (rs.next()) {
                ContaPoupanca contaAux = new ContaPoupanca();

                contaAux.setNumero(rs.getInt("numero"));
                contaAux.setSaldo(rs.getFloat("saldo"));
                contaAux.setRendimento(rs.getFloat("rendimento"));

                listaDeContasMovimento.add(contaAux);
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return listaDeContasMovimento;
    }

}
