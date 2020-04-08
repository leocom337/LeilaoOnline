package leilaooniline;
//Paulo César

public class ContaBancaria {   

private String NomeBanco; 
private Integer Conta;
private String Agencia;
    
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

}

