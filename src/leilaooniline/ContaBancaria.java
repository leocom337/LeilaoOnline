package leilaooniline;

public class ContaBancaria {

private String NomeBanco; 
private String Conta;
private String Agencia;
    
    public String getNomeBanco()throws Exception {
    if(NomeBanco.isEmpty())
    throw new Exception("Insira um nome"); 
    
        return NomeBanco;
    }

    
    public String getConta()throws Exception {
    if(Conta.isEmpty())
    throw new Exception("Insira um número válido");
    
        return Conta;
    }

    
    public String getAgencia()throws Exception {
    if(Agencia.isEmpty())
    throw new Exception("Insira um número válido");
    
        return Agencia;
    }   

}

