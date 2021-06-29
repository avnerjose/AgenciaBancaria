package conexao.DAO;

import classes.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO extends connectionDAO {

    boolean sucesso = false;

    public boolean inserirCliente(Cliente cliente) {
        connectToDB();
        String sql = "INSERT INTO Cliente (nome, email, cpf) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.setString(3, cliente.getCpf());
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

    public boolean atualizarCliente(String cpf, Cliente cliente) {
        connectToDB();
        String sql = "UPDATE Cliente SET nome=?, email=? where cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.setString(3, cpf);
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

    public boolean deletarCliente(String cpf) {
        connectToDB();
        String sql = "DELETE FROM Cliente where cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
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

    public ArrayList<Cliente> buscarClienteSemFiltro() {
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();

        connectToDB();

        String sql = "SELECT * FROM Cliente";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Cliente clienteAux = new Cliente();
                clienteAux.setCpf(rs.getString("cpf"));
                clienteAux.setEmail(rs.getString("email"));
                clienteAux.setNome(rs.getString("nome"));
                listaDeClientes.add(clienteAux);
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
        return listaDeClientes;
    }

    public Cliente buscarClientePorCpf(String cpf) {
        Cliente clienteAux = null;

        connectToDB();

        String sql = "SELECT * FROM Cliente WHERE cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();

            while (rs.next()) {
                String aux = rs.getString("nome");
                if (aux.isEmpty()) {
                    return clienteAux;
                } else {
                    clienteAux = new Cliente();
                    clienteAux.setCpf(rs.getString("cpf"));
                    clienteAux.setEmail(rs.getString("email"));
                    clienteAux.setNome(rs.getString("nome"));
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

        return clienteAux;
    }

}
