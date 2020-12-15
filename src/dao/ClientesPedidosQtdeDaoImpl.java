package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ClientesPedidosQtde;
import util.ConnectionFactory;

/**
 * @brief Nome da Classe: ClientesPedidosQtdeDaoImpl
 * @package Nome do Pacote: dao
 * @project Nome do Projeto: Northwind
 * @author Autor: Marcelo do Nascimento <marcelo.nascimento@alunos.sc.senac.br>
 * @date Data: 15/12/2020
 */
public class ClientesPedidosQtdeDaoImpl implements ClientesPedidosQtdeDao {

    @Override
    public List<ClientesPedidosQtde> getAllClientes() {
        String sql = "SELECT * FROM vw_clientespedidosqte";
        List<ClientesPedidosQtde> clientesPedidosQtdes = new ArrayList<ClientesPedidosQtde>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                ClientesPedidosQtde cli = new ClientesPedidosQtde();
                cli.setNomeContato(rset.getString("nomecontato"));
                cli.setEndereco(rset.getString("endereco"));
                cli.setCidade(rset.getString("cidade"));
                cli.setIdOrdem(rset.getInt("idordem"));
                cli.setQtde(rset.getInt("qtde"));
                cli.setDataOrdem(rset.getDate("dataordem"));

                clientesPedidosQtdes.add(cli);
            }
            return clientesPedidosQtdes;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (rset != null) {
                    rset.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public ClientesPedidosQtde getClienteById(int idOrdem) {
        String sql = "SELECT * FROM vw_clientespedidosqte WHERE idordem = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idOrdem);

            rset = pstm.executeQuery();

            while (rset.next()) {
                ClientesPedidosQtde cli = new ClientesPedidosQtde();
                cli.setNomeContato(rset.getString("nomecontato"));
                cli.setEndereco(rset.getString("endereco"));
                cli.setCidade(rset.getString("cidade"));
                cli.setIdOrdem(rset.getInt("idordem"));
                cli.setQtde(rset.getInt("qtde"));
                cli.setDataOrdem(rset.getDate("dataordem"));
                return cli;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (rset != null) {
                    rset.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public List<ClientesPedidosQtde> getClienteByNomeContato(String nomecontato) {
        String sql = "SELECT * FROM vw_clientespedidosqte WHERE nomecontato LIKE ?";
        
        ClientesPedidosQtde clientesPedidosQtde;
        List<ClientesPedidosQtde> clientesPedidosQtdes = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + nomecontato + "%");
            rset = pstm.executeQuery();

            while (rset.next()) {
                clientesPedidosQtde = new ClientesPedidosQtde();
                clientesPedidosQtde.setNomeContato(rset.getString("nomecontato"));
                clientesPedidosQtde.setEndereco(rset.getString("endereco"));
                clientesPedidosQtde.setCidade(rset.getString("cidade"));
                clientesPedidosQtde.setIdOrdem(rset.getInt("idordem"));
                clientesPedidosQtde.setQtde(rset.getInt("qtde"));
                clientesPedidosQtde.setDataOrdem(rset.getDate("dataordem"));
                clientesPedidosQtdes.add(clientesPedidosQtde);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (rset != null) {
                    rset.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return clientesPedidosQtdes;
    }

}
