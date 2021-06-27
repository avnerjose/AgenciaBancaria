/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.DAO;

import classes.Endereco;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class EnderecoDAO extends connectionDAO{
    boolean sucesso = false;
    
    public boolean inserirEndereco(Endereco endereco) {
        connectToDB();
        String sql = "INSERT INTO Endereco (cidade, bairro, rua, numero, cep, Cliente_cpf) values(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, endereco.getCidade());
            pst.setString(2, endereco.getBairro());
            pst.setString(3, endereco.getRua());
            pst.setInt(4, endereco.getNumero());
            pst.setString(5, endereco.getCep());
            pst.setString(6, endereco.getCpf());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        
        return sucesso;
        
    }
    
    public boolean atualizarEndereco(int idEndereco, Endereco endereco) {
      connectToDB();
        String sql = "UPDATE Endereco SET cidade=?, bairro=?, rua=?, numero=?, cep=?, Cliente_cpf=? where idEndereco=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, endereco.getCidade());
            pst.setString(2, endereco.getBairro());
            pst.setString(3, endereco.getRua());
            pst.setInt(4, endereco.getNumero());
            pst.setString(5, endereco.getCep());
            pst.setString(5, endereco.getCpf());
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;  
    }
    
    public boolean deletarEndereco(int idEndereco) {
        connectToDB();
        String sql = "DELETE FROM Endereco where idEndereco=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idEndereco);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public ArrayList<Endereco> buscarEnderecoSemFiltro() {
        ArrayList<Endereco> listaDeEnderecos = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Endereco";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Enderecos dentro do metodo de busca: ");
            while (rs.next()) {
                Endereco enderecoAux = new Endereco();
                enderecoAux.setCidade(rs.getString("cidade"));
                enderecoAux.setBairro(rs.getString("bairro"));
                enderecoAux.setRua(rs.getString("rua"));
                enderecoAux.setNumero(rs.getInt("numero"));
                enderecoAux.setCep(rs.getString("cep"));
                enderecoAux.setCpf(rs.getString("Cliente_Cpf"));
                listaDeEnderecos.add(enderecoAux);
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeEnderecos;
    }
}
