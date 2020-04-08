/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaooniline;

import java.util.Date;

/**
 *
 * @author leoms
 */
public class Usuario {
    private Integer id_usario;
    private String nome;
    private String endereco;
    private Date dataN;
    private String login;
    private String senha;
    private String cpf;
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public Integer getId_usario(String login, String senha) {
        if(!this.login.equals(login)&&!this.senha.equals(senha)){}
        return id_usario;
    }


    public String getNome() {
        return nome;
    }

    public Date getDataN() {
        return dataN;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void mandar_lance(Double valor){
        //receber_lance(valor);
    }
    
    
   
}
