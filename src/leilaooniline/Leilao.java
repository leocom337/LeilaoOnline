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

    public void setIdLeilao(int idLeilao) {
        this.idLeilao = idLeilao;
    }

    public Double getUltimoLance() {
        return ultimoLance;
    }

    public void setUltimoLance(Double ultimoLance, Integer idUltimoLance) {
        this.ultimoLance = ultimoLance;
        this.idUltimoLance= idUltimoLance;
    }
    
    public void pesquisar(){
        
    }
    public void finalizarCompra(){
                                  
    }
    
}