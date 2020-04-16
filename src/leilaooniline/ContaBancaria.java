package leilaooniline;
//Paulo César

import java.util.Objects;


public class ContaBancaria {   

private String NomeBanco; 
private Integer Conta;
private String Agencia;

    public ContaBancaria(String NomeBanco, Integer Conta, String Agencia) {
        this.NomeBanco = NomeBanco;
        this.Conta = Conta;
        this.Agencia = Agencia;
    }

    
    public String getNomeBanco()throws Exception {
    if(NomeBanco.isEmpty())
    throw new Exception("Insira um nome"); 
    
        return NomeBanco;
    }

    
    public Integer getConta()throws Exception {
    if(Conta.toString().isEmpty())
    throw new Exception("Insira um número válido");
    
        return Conta;
    }

    
    public String getAgencia()throws Exception {
    if(Agencia.isEmpty())
    throw new Exception("Insira um número válido");
    
        return Agencia;
    }
    
     /**
     * @param NomeBanco the NomeBanco to set
     */
    public void setNomeBanco(String NomeBanco) {
        this.NomeBanco = NomeBanco;
    }

    /**
     * @param Conta the Conta to set
     */
    public void setConta(Integer Conta) {
        this.Conta = Conta;
    }

    /**
     * @param Agencia the Agencia to set
     */
    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;                      
        
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "NomeBanco=" + NomeBanco + ", Conta=" + Conta + ", Agencia=" + Agencia + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ContaBancaria other = (ContaBancaria) obj;
        if (!Objects.equals(this.NomeBanco, other.NomeBanco)) {
            return false;
        }
        if (!Objects.equals(this.Agencia, other.Agencia)) {
            return false;
        }
        if (!Objects.equals(this.Conta, other.Conta)) {
            return false;
        }
        return true;
    }

}

