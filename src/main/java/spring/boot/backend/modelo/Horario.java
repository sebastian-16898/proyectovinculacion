package spring.boot.backend.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Calendar;
import java.util.Date;
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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Horario")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario", unique = true)
    private int id_horario;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "tiempo_inicio")
    private Date tiempo_inicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "tiempo_fin")
    private Date tiempo_fin;

    @Column(name = "dia")
    private int dia;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Calendar fecha_creacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_asignatura")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Asignatura id_asignatura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Rol_Usuario id_rol_usuario;

    public Horario() {
        super();
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getTiempo_inicio() {
        return tiempo_inicio;
    }

    public void setTiempo_inicio(Date tiempo_inicio) {
        this.tiempo_inicio = tiempo_inicio;
    }

    public Date getTiempo_fin() {
        return tiempo_fin;
    }

    public void setTiempo_fin(Date tiempo_fin) {
        this.tiempo_fin = tiempo_fin;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Calendar getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Calendar fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Asignatura getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(Asignatura id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public Rol_Usuario getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(Rol_Usuario id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

}//fin()
