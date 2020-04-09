package leilaoonline;


public class pagamento {
    
       private int qtdeParcelas;
    
    private  Integer AVISTA = 1;
    private  Integer APRAZO = 2;
    private  calendar dataPagamento;    
    private  Double valorPagamento;
            
    public Pagamento(int qtdeParcelas, String data, String descricao, double valor) {
        super(data, descricao, valor);
        this.qtdeParcelas = qtdeParcelas;
    }

   
    public Pagamento(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public int getQtdeParcelas() {
        return qtdeParcelas;
    }

  
    public void setQtdeParcelas(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

  
    public String toString() {
        return "Compra{" + data + ", " + descricao + ", " + valor + "(D), " + qtdeParcelas +"  }";
    }
    
    
    
    
}        

