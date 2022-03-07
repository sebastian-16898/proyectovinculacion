package spring.boot.backend.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", unique = true)
    int id_curso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo_curso")
    private String tipo_curso;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Calendar fecha_creacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Rol_Usuario id_rol_usuario;

    public Curso() {
        super();
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_curso() {
        return tipo_curso;
    }

    public void setTipo_curso(String tipo_curso) {
        this.tipo_curso = tipo_curso;
    }

    public Calendar getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Calendar fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Rol_Usuario getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(Rol_Usuario id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

}//fin()
