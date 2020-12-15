/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Clientes;

/**
 *
 * @author wender
 */
public interface ClientesDao {
    public void addClientes(Clientes cliente);
    public void deleteClientes (int IDCliente);
    public void updateClientes (Clientes cliente);
    public List<Clientes> getAllClientes();
    public Clientes getClienteById(int IDCliente);
    public int getLastID();
}
