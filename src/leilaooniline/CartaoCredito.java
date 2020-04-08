package leilaooniline;
import java.util.Date;
//Paulo César

public class CartaoCredito {
    
private Integer NumeroCartao;
private Date  DataValidade;
private Integer CodSeguraca;
private Integer BandeiraCartao;

//Buscar número cartão
    public Integer getNumeroCartao()throws Exception{
    if(NumeroCartao.toString().isEmpty())
        throw new Exception("Insira um número para o cartão");
    
    if(NumeroCartao.toString().length() != 16 )
        throw new Exception("Insira um número válido");
    
        return NumeroCartao;
    }

    
    public Date getDataValidade()throws Exception {
    if(DataValidade.toString().isEmpty())
        throw new Exception("Insira um número válido");
    
        return DataValidade;
    }

    
    public Integer getCodSeguraca()throws Exception {
    if(CodSeguraca.toString().isEmpty())
    throw new Exception("Insira um número válido");
        return CodSeguraca;
    }

    
    public Integer getBandeiraCartao()throws Exception {
    if(BandeiraCartao.toString().isEmpty())
    throw new Exception("Insira um valor válido");  
    
        return BandeiraCartao;
    }

    /**
     * @param NumeroCartao the NumeroCartao to set
     */
    public void setNumeroCartao(Integer NumeroCartao) {
        
        this.NumeroCartao = NumeroCartao;
    }

    /**
     * @param DataValidade the DataValidade to set
     */
    public void setDataValidade(Date DataValidade) {      
        this.DataValidade = DataValidade;
    }

    /**
     * @param CodSeguraca the CodSeguraca to set
     */
    public void setCodSeguraca(Integer CodSeguraca) {
        this.CodSeguraca = CodSeguraca;
    }

    /**
     * @param BandeiraCartao the BandeiraCartao to set
     */
    public void setBandeiraCartao(Integer BandeiraCartao) {
        this.BandeiraCartao = BandeiraCartao;
    }
}
