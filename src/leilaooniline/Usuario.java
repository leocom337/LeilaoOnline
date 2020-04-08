/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaooniline;

import java.util.Date;
import java.util.Objects;

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
    private Leilao leilao;
    
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
    
    public void mandar_lance(Double valor, Integer id_leilao){
        leilao.setUltimoLance(valor, this.id_usario,id_leilao);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id_usario);
        hash = 19 * hash + Objects.hashCode(this.login);
        hash = 19 * hash + Objects.hashCode(this.senha);
        hash = 19 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.id_usario, other.id_usario)) {
            return false;
        }
        return true;
    }
    
    
    
   
}
