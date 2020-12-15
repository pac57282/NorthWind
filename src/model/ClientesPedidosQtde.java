/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Timestamp;
import java.util.Date;

/**
 * @brief   Nome da Classe:   ClientesPedidosQtde
 * @package Nome do Pacote:   model
 * @project Nome do Projeto:  Northwind 
 * @author  Autor:            Marcelo do Nascimento <marcelo.nascimento@alunos.sc.senac.br>
 * @date    Data:             15/12/2020
 */
public class ClientesPedidosQtde {

    private String nomeContato;
    private String endereco;
    private String cidade;
    private int idOrdem;
    private int qtde;
    private Date dataOrdem;

    public ClientesPedidosQtde() {
    }

    public ClientesPedidosQtde(String nomeContato, String endereco, String cidade, int idOrdem, int qtde, Date dataOrdem) {
        this.nomeContato = nomeContato;
        this.endereco = endereco;
        this.cidade = cidade;
        this.idOrdem = idOrdem;
        this.qtde = qtde;
        this.dataOrdem = dataOrdem;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public Date getDataOrdem() {
        return dataOrdem;
    }

    public void setDataOrdem(Date dataOrdem) {
        this.dataOrdem = dataOrdem;
    }

   
}
