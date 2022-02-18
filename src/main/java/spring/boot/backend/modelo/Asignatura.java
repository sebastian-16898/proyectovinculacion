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
@Table(name = "Asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura", unique = true)
    Integer id_asignatura;

    @Column(name = "descripcion")
    private String descripcion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    public Asignatura() {
    }

    public Asignatura(Integer id_asignatura, String descripcion, Date fecha_creacion) {
        this.id_asignatura = id_asignatura;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
    }

    public Integer getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(Integer id_asignatura) {
        this.id_asignatura = id_asignatura;
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
        return "Asignatura{" + "id_asignatura=" + id_asignatura + ", descripcion=" + descripcion + ", fecha_creacion=" + fecha_creacion + '}';
    }

}//fin()
