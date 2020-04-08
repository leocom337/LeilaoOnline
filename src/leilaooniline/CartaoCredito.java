package leilaooniline;
import java.util.Date;
//Paulo César

public class CartaoCredito {
    
private Integer NumeroCartao;
private Date  DataValidade;
private String CodSeguraca;
private String BandeiraCartao;

//Buscar número cartão
    public Integer getNumeroCartao()throws Exception{
    if(NumeroCartao.toString().isEmpty())
        throw new Exception("Insira um número para o cartão");
    
    if(NumeroCartao.toString().length() > 16)
        throw new Exception("Insira um número válido");
    
        return NumeroCartao;
    }

    
    public Date getDataValidade()throws Exception {
    if(DataValidade.toString().isEmpty())
        throw new Exception("Insira um número válido");
    
        return DataValidade;
    }

    
    public String getCodSeguraca()throws Exception {
    if(CodSeguraca.isEmpty())
    throw new Exception("Insira um número válido");
        return CodSeguraca;
    }

    
    public String getBandeiraCartao()throws Exception {
    if(BandeiraCartao.isEmpty())
    throw new Exception("Insira um valor válido");  
    
        return BandeiraCartao;
    }
}
