package conexao.DAO;

import classes.Conta;
import classes.ContaMovimento;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContaMovimentoDAO extends connectionDAO {

    boolean sucesso = false;

    public boolean inserirContaMovimento(ContaMovimento conta) {
        connectToDB();
        String sql = "INSERT INTO Conta_Movimento (numero, saldo, limite, Agencia_numero) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conta.getNumero());
            pst.setFloat(2, conta.getSaldo());
            pst.setFloat(3, conta.getLimite());
            pst.setString(4,"101");
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

    public boolean atualizarFilme(int numero, ContaMovimento conta) {
        connectToDB();
        String sql = "UPDATE Conta_Movimento SET saldo=?, limite=? where numero=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, conta.getSaldo());
            pst.setFloat(2, conta.getLimite());
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
        String sql = "DELETE FROM Conta_Movimento where numero=?";

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
                ContaMovimento contaAux = new ContaMovimento();

                contaAux.setNumero(rs.getInt("numero"));
                contaAux.setSaldo(rs.getFloat("saldo"));
                contaAux.setLimite(rs.getFloat("limite"));

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
