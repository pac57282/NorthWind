/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import model.Clientes;
import util.ConnectionFactory;

/**
 *
 * @author wende
 */
public class ClientesDaoImpl implements ClientesDao {

    @Override
    public void addClientes(Clientes cliente) {
        
        String sql = "INSERT INTO `clientes`(`IDCliente`, `NomeCompanhia`," +
                "`NomeContato`, `TituloContato`, `Endereco`, `Cidade`, `Regiao`," +
                "`CEP`, `Pais`, `Telefone`, `Fax`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, getLastID());
            pstm.setString(2, cliente.getNomeCompanhia());  
            pstm.setString(3, cliente.getNomeContato());  
            pstm.setString(4, cliente.getTituloContato());  
            pstm.setString(5, cliente.getEndereco());  
            pstm.setString(6, cliente.getCidade());  
            pstm.setString(7, cliente.getRegiao());  
            pstm.setString(8, cliente.getCEP());  
            pstm.setString(9, cliente.getPais());  
            pstm.setString(10, cliente.getTelefone());  
            pstm.setString(11, cliente.getFAX());            
            pstm.execute();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public void deleteClientes(int IDCliente) {
        String sql = "DELETE CLIENTES WHERE IDCLIENTE = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            
            
            pstm.setInt(1,IDCliente);
            pstm.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }    
           
    }

    @Override
    public void updateClientes(Clientes cliente) {
        String sql = "UPDATE `clientes` SET"
                + "`NomeCompanhia`=?,`NomeContato`=?,"
                + "`TituloContato`=?,`Endereco`=?,"
                + "`Cidade`=?,`Regiao`=?,`CEP`=?,`Pais`=?,"
                + "`Telefone`=?,`Fax`=? WHERE IDCLIENTE = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, cliente.getNomeCompanhia());  
            pstm.setString(2, cliente.getNomeContato());  
            pstm.setString(3, cliente.getTituloContato());  
            pstm.setString(4, cliente.getEndereco());  
            pstm.setString(5, cliente.getCidade());  
            pstm.setString(6, cliente.getRegiao());  
            pstm.setString(7, cliente.getCEP());  
            pstm.setString(8, cliente.getPais());  
            pstm.setString(9, cliente.getTelefone());  
            pstm.setString(10, cliente.getFAX());  
            pstm.setInt(11,cliente.getIDCliente());
            pstm.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }   
    }

    @Override
    public List<Clientes> getAllClientes() {
        String sql = "SELECT * FROM CLIENTES";
        List<Clientes> clientes = new ArrayList<Clientes>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Clientes cli = new Clientes();
                cli.setCEP(rset.getString("CEP"));
                cli.setCidade(rset.getString("Cidade"));
                cli.setEndereco(rset.getString("Endereco"));
                cli.setFAX(rset.getString("FAX"));
                cli.setIDCliente(rset.getInt("IDCliente"));
                cli.setNomeCompanhia(rset.getString("NomeCompanhia"));
                cli.setNomeContato(rset.getString("NomeContato"));
                cli.setPais(rset.getString("Pais"));
                cli.setTelefone(rset.getString("Telefone"));
                cli.setRegiao(rset.getString("Regiao"));
                cli.setTituloContato(rset.getString("TituloContat"));
                
                clientes.add(cli);
            }
            return clientes;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
                if (rset != null){
                    rset.close();
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }  
        
        return null;
    }

    @Override
    public Clientes getClienteById(int IDCliente) {
        String sql = "SELECT * FROM CLIENTES WHERE IDCLIENTE = ?";        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,IDCliente);
            
            rset = pstm.executeQuery();
            
            while(rset.next()){
                Clientes cli = new Clientes();
                cli.setCEP(rset.getString("CEP"));
                cli.setCidade(rset.getString("Cidade"));
                cli.setEndereco(rset.getString("Endereco"));
                cli.setFAX(rset.getString("FAX"));
                cli.setIDCliente(rset.getInt("IDCliente"));
                cli.setNomeCompanhia(rset.getString("NomeCompanhia"));
                cli.setNomeContato(rset.getString("NomeContato"));
                cli.setPais(rset.getString("Pais"));
                cli.setTelefone(rset.getString("Telefone"));
                cli.setRegiao(rset.getString("Regiao"));
                cli.setTituloContato(rset.getString("TituloContat"));                
                return cli;
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
                if (rset != null){
                    rset.close();
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }  
        
        return null;
    }
    
  
    @Override
    public int getLastID(){
         String sql = "SELECT MAX(IDCLIENTE) AS ULTIMO FROM CLIENTES";        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while(rset.next()){                              
                return rset.getInt("ULTIMO");
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
                if (rset != null){
                    rset.close();
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }  
        
        return -1;
    }
}
