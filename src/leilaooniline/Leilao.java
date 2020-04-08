package leilaooniline;
// lucas pereira dos santos ra: 12104543

import java.util.Calendar;
import java.util.Objects;


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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idLeilao);
        hash = 29 * hash + Objects.hashCode(this.ultimoLance);
        hash = 29 * hash + Objects.hashCode(this.idUltimoLance);
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
        final Leilao other = (Leilao) obj;
        if (!Objects.equals(this.idLeilao, other.idLeilao)) {
            return false;
        }
        if (!Objects.equals(this.ultimoLance, other.ultimoLance)) {
            return false;
        }
        if (!Objects.equals(this.idUltimoLance, other.idUltimoLance)) {
            return false;
        }
        return true;
    }
    
}