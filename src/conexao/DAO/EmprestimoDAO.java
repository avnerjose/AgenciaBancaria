/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.DAO;

import classes.Emprestimo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class EmprestimoDAO extends connectionDAO {

    boolean sucesso = false;

    public boolean inserirEmprestimo(Emprestimo emprestimo) {
        connectToDB();
        String sql = "INSERT INTO Emprestimo (valor, Agencia_numero) values(?,8922)";
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, emprestimo.getValor());
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

    public boolean atualizarEmprestimo(int numero, Emprestimo emprestimo) {
        connectToDB();
        String sql = "UPDATE Emprestimo SET valor=?, Agencia_numero=8922 where numero=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, emprestimo.getValor());
            pst.setInt(2, numero);
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

    public boolean deletarEmprestimo(int numero) {
        connectToDB();
        String sql = "DELETE FROM Emprestimo where numero=?";

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

    public ArrayList<Emprestimo> buscarEmprestimoSemFiltro() {
        ArrayList<Emprestimo> listaDeEmprestimos = new ArrayList<>();

        connectToDB();

        String sql = "SELECT * FROM Emprestimo";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Emprestimo emprestimoAux = new Emprestimo();
                emprestimoAux.setNumero(rs.getInt("numero"));
                emprestimoAux.setValor(rs.getFloat("valor"));
                listaDeEmprestimos.add(emprestimoAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeEmprestimos;
    }

    public boolean emprestimoHasCliente(int empNumero, String cpf) {

        connectToDB();
        String sql = "INSERT INTO Cliente_has_Emprestimo (Emprestimo_numero, Cliente_cpf) values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, empNumero);
            pst.setString(2, cpf);
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
}
