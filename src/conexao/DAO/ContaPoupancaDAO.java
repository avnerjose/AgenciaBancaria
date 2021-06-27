package conexao.DAO;

import classes.Conta;
import classes.ContaPoupanca;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContaPoupancaDAO extends connectionDAO {

    boolean sucesso = false;

    public boolean inserirContaPoupanca(ContaPoupanca conta) {
        connectToDB();
        String sql = "INSERT INTO Conta_Poupanca (numero, saldo, rendimento, Agencia_numero) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conta.getNumero());
            pst.setFloat(2, conta.getSaldo());
            pst.setFloat(3, conta.getRendimento());
            pst.setString(4, "8922");
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

    public boolean atualizarContaPoupanca(int numero, ContaPoupanca conta) {
        connectToDB();
        String sql = "UPDATE Conta_Poupanca SET saldo=?, rendimento=?, Cliente_cpf=? where numero=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, conta.getSaldo());
            pst.setFloat(2, conta.getRendimento());
            pst.setString(3, conta.getCliente_cpf());
            pst.setFloat(4, numero);
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

    public boolean deletarContaPoupanca(int numero) {
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

    public ArrayList<Conta> buscarContasPoupanca() {
        ArrayList<Conta> listaDeContasPoupanca = new ArrayList<>();

        connectToDB();

        String sql = "SELECT * FROM Conta_Poupanca";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ContaPoupanca contaAux = new ContaPoupanca();

                contaAux.setNumero(rs.getInt("numero"));
                contaAux.setSaldo(rs.getFloat("saldo"));
                contaAux.setRendimento(rs.getFloat("rendimento"));
                contaAux.setCliente_cpf(rs.getString("Cliente_cpf"));

                listaDeContasPoupanca.add(contaAux);
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

        return listaDeContasPoupanca;
    }

    public ContaPoupanca buscarContaPoupancaPorNumero(int numero) {
        ContaPoupanca contaAux = null;

        connectToDB();

        String sql = "SELECT * FROM Conta_Poupanca WHERE numero=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, numero);
            rs = pst.executeQuery();

            while (rs.next()) {
                String aux = rs.getString("numero");
                if (aux.isEmpty()) {
                    return contaAux;
                } else {
                    contaAux = new ContaPoupanca();
                    contaAux.setNumero(rs.getInt("numero"));
                    contaAux.setSaldo(rs.getFloat("saldo"));
                    contaAux.setRendimento(rs.getFloat("rendimento"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return contaAux;
    }

}
