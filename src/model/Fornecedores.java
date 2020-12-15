/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author wender
 */
public class Fornecedores {

    private String CEP;
    private String Cidade;
    private String Endereco;
    private String FAX;
    private int    IDFornecedor;
    private String NomeCompanhia;
    private String NomeContato;
    private String Pais;
    private String Regiao;
    private String Telefone;
    private String TituloContato;  
    private String Website;
    
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getFAX() {
        return FAX;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

    public int getIDFornecedor() {
        return IDFornecedor;
    }

    public void setIDFornecedor(int IDFornecedor) {
        this.IDFornecedor = IDFornecedor;
    }

    public String getNomeCompanhia() {
        return NomeCompanhia;
    }

    public void setNomeCompanhia(String NomeCompanhia) {
        this.NomeCompanhia = NomeCompanhia;
    }

    public String getNomeContato() {
        return NomeContato;
    }

    public void setNomeContato(String NomeContato) {
        this.NomeContato = NomeContato;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String Regiao) {
        this.Regiao = Regiao;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTituloContato() {
        return TituloContato;
    }

    public void setTituloContato(String TituloContato) {
        this.TituloContato = TituloContato;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public Fornecedores() { }

    public Fornecedores(String CEP, String Cidade, String Endereco, String FAX, int IDFornecedor, String NomeCompanhia, String NomeContato, String Pais, String Regiao, String Telefone, String TituloContato, String Website) {
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.Endereco = Endereco;
        this.FAX = FAX;
        this.IDFornecedor = IDFornecedor;
        this.NomeCompanhia = NomeCompanhia;
        this.NomeContato = NomeContato;
        this.Pais = Pais;
        this.Regiao = Regiao;
        this.Telefone = Telefone;
        this.TituloContato = TituloContato;
        this.Website = Website;
    }
    
    
}
