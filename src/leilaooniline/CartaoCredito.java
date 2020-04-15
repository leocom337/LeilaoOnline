package leilaooniline;
import java.util.Date;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "CartaoCredito{" + "NumeroCartao=" + NumeroCartao + ", DataValidade=" + DataValidade + ", CodSeguraca=" + CodSeguraca + ", BandeiraCartao=" + BandeiraCartao + '}';
    }    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.NumeroCartao);
        hash = 19 * hash + Objects.hashCode(this.DataValidade);
        hash = 19 * hash + Objects.hashCode(this.CodSeguraca);
        hash = 19 * hash + Objects.hashCode(this.BandeiraCartao);
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
        final CartaoCredito other = (CartaoCredito) obj;
        if (!Objects.equals(this.NumeroCartao, other.NumeroCartao)) {
            return false;
        }
        if (!Objects.equals(this.DataValidade, other.DataValidade)) {
            return false;
        }
        if (!Objects.equals(this.CodSeguraca, other.CodSeguraca)) {
            return false;
        }
        if (!Objects.equals(this.BandeiraCartao, other.BandeiraCartao)) {
            return false;
        }
        return true;
    }
    
}
