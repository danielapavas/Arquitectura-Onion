package apitiendavideo_onion.apitiendavideo.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    // Estrategia de autogenerado del id incremental para postgreSQL
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")

    @Column(name = " id")
    private long id;

    @Column(name = "pais", unique = true)
    private String pais;

    @Column(name = "codigoAlfa2", unique = true)
    private String codigoAlfa2;

    @Column(name = "codigoAlfa3", unique = true)
    private String codigoAlfa3;

    // Constructor
    public Pais() {
    }

    // geters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoAlfa2() {
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2) {
        this.codigoAlfa2 = codigoAlfa2;
    }

    public String getCodigoAlfa3() {
        return codigoAlfa3;
    }

    public void setCodigoAlfa3(String codigoAlfa3) {
        this.codigoAlfa3 = codigoAlfa3;
    }

}