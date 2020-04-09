package leilaoonline;
//Michaellacerda 12105392

import java.util.Calendar;
import java.util.Objects;

public class pagamento {
    
       private Integer qtdeParcelas;
    
    private  Integer AVISTA = 1;
    private  Integer APRAZO = 2;
    private  calendar dataPagamento;    
    private  Double valorPagamento;

    public pagamento(Integer qtdeParcelas, calendar dataPagamento, Double valorPagamento) {
        this.qtdeParcelas = qtdeParcelas;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }
            
   
    }

   
    public Pagamento(Integer qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public int getQtdeParcelas() {
        return qtdeParcelas;
    }

  
    public void setQtdeParcelas(Integer qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    @Override
    public String toString() {
        return "pagamento{" + "qtdeParcelas=" + qtdeParcelas + ", AVISTA=" + AVISTA + ", APRAZO=" + APRAZO + ", dataPagamento=" + dataPagamento + ", valorPagamento=" + valorPagamento + '}';
    }

  
    
    
    
    
}        

