/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ClientesPedidosQtdeDaoImpl;
import java.util.List;
import model.ClientesPedidosQtde;
import org.junit.Test;

/**
 *
 * @author Marcelo do Nascimento <marcelo.nascimento@alunos.sc.senac.br>
 */
public class ClientesPedidosQtdeViewTest {

    private ClientesPedidosQtde clientesPedidosQtde;
    private ClientesPedidosQtdeDaoImpl clientesPedidosQtdeDaoImpl;

    public ClientesPedidosQtdeViewTest() {
        clientesPedidosQtdeDaoImpl = new ClientesPedidosQtdeDaoImpl();
    }

//    @Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisar Por Id");
        clientesPedidosQtde = clientesPedidosQtdeDaoImpl.getClienteById(11011);
        System.out.println("Nome Contato: " + clientesPedidosQtde.getNomeContato());
        System.out.println("Endereço: " + clientesPedidosQtde.getEndereco());
        System.out.println("Cidade: " + clientesPedidosQtde.getCidade());
        System.out.println("Id Ordem: " + clientesPedidosQtde.getIdOrdem());
        System.out.println("Quantidade" + clientesPedidosQtde.getQtde());
        System.out.println("Data Ordem: " + clientesPedidosQtde.getDataOrdem());
    }

//    @Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("pesquisar Por Nome");
        List<ClientesPedidosQtde> clientesPedidosQtdes = clientesPedidosQtdeDaoImpl.getClienteByNomeContato("Maria");
        for (ClientesPedidosQtde cli : clientesPedidosQtdes) {
            System.out.println("Nome Contato: " + cli.getNomeContato());
            System.out.println("Endereço: " + cli.getEndereco());
            System.out.println("Cidade: " + cli.getCidade());
            System.out.println("Id Ordem: " + cli.getIdOrdem());
            System.out.println("Quantidade" + cli.getQtde());
            System.out.println("Data Ordem: " + cli.getDataOrdem());
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
        }
    }

    @Test
    public void testTodosRegistros() throws Exception {
        System.out.println("Todos os Registros");
        List<ClientesPedidosQtde> clientesPedidosQtdes = clientesPedidosQtdeDaoImpl.getAllClientes();
        for (ClientesPedidosQtde cli : clientesPedidosQtdes) {
            System.out.println("Nome Contato: " + cli.getNomeContato());
            System.out.println("Endereço: " + cli.getEndereco());
            System.out.println("Cidade: " + cli.getCidade());
            System.out.println("Id Ordem: " + cli.getIdOrdem());
            System.out.println("Quantidade" + cli.getQtde());
            System.out.println("Data Ordem: " + cli.getDataOrdem());
            System.out.println("");
            System.out.println("----------------------//------------------------");
            System.out.println("");
        }
    }
}
