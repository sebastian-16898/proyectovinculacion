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
@Table(name = "Modalidad")
public class Modalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modalidad", unique = true)
    Integer id_modalidad;

    @Column(name = "descripcion")
    private String descripcion;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "hora_inicio")
    private Date hora_inicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "hora_fin")
    private Date hora_fin;

    public Modalidad() {
    }

    public Modalidad(Integer id_modalidad, String descripcion, Date hora_inicio, Date hora_fin) {
        this.id_modalidad = id_modalidad;
        this.descripcion = descripcion;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public Integer getId_modalidad() {
        return id_modalidad;
    }

    public void setId_modalidad(Integer id_modalidad) {
        this.id_modalidad = id_modalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }

    @Override
    public String toString() {
        return "Modalidad{" + "id_modalidad=" + id_modalidad + ", descripcion=" + descripcion + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + '}';
    }

}//fin()
