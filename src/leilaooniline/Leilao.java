package leilaooniline;
// lucas pereira dos santos ra: 12104543

import java.util.Calendar;


public class Leilao {
  private  Integer idLeilao;
  private  Calendar dataLeilao;
  private Double ultimoLance;
  private Integer idUltimoLance;

    public int getIdLeilao() {  
        return idLeilao;
    }

    public Leilao(Integer idLeilao, Calendar dataLeilao, Double ultimoLance) {
        this.idLeilao = idLeilao;
        this.dataLeilao = dataLeilao;
        this.ultimoLance = ultimoLance;
       
    }

  

    public Double getUltimoLance() {
        return ultimoLance;
    }

    public void setUltimoLance(Double ultimoLance, Integer idUltimoLance, Integer id) {
        if ( this.idLeilao== id ){
        this.ultimoLance = ultimoLance;
        this.idUltimoLance= idUltimoLance;
        }
                            
    }
    
    public void pesquisar(){
        
    }
    public void finalizarCompra(){
                                  
    }
    
}