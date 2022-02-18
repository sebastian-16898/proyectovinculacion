package spring.boot.backend.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Malla")
public class Malla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_malla", unique = true)
    Integer id_malla;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "descripcion")
    private String descripcion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    public Malla() {
    }

    public Malla(Integer id_malla, Boolean estado, String descripcion, Date fecha_creacion) {
        this.id_malla = id_malla;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
    }

    public Integer getId_malla() {
        return id_malla;
    }

    public void setId_malla(Integer id_malla) {
        this.id_malla = id_malla;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Malla{" + "id_malla=" + id_malla + ", estado=" + estado + ", descripcion=" + descripcion + ", fecha_creacion=" + fecha_creacion + '}';
    }

}//fin()
