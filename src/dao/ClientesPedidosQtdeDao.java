package dao;

import java.util.List;
import model.ClientesPedidosQtde;

/**
 * @brief Nome da Classe: ClientesPedidosQtdeDao
 * @package Nome do Pacote: dao
 * @project Nome do Projeto: Northwind
 * @author Autor: Marcelo do Nascimento <marcelo.nascimento@alunos.sc.senac.br>
 * @date Data: 15/12/2020
 */
public interface ClientesPedidosQtdeDao {

    public List<ClientesPedidosQtde> getAllClientes();
    public ClientesPedidosQtde getClienteById(int idOrdem);
    public List<ClientesPedidosQtde> getClienteByNomeContato(String nomecontato);
}
