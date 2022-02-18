package spring.boot.backend.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Periodo")
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_periodo", unique = true)
    Integer id_periodo;

    @Column(name = "actividades")
    private String actividades;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_activiti")
    private Date fecha_activiti;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_inicio")
    private Date fecha_inicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @Column(name = "costo_mensualidad")
    private Double costo_mensualidad;

    @Column(name = "costo_matricula")
    private Double costo_matricula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_malla")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Malla id_malla;

    public Periodo() {
    }

    public Periodo(Integer id_periodo, String actividades, Date fecha_activiti, Date fecha_creacion, Date fecha_inicio, Date fecha_fin, Double costo_mensualidad, Double costo_matricula, Malla id_malla) {
        this.id_periodo = id_periodo;
        this.actividades = actividades;
        this.fecha_activiti = fecha_activiti;
        this.fecha_creacion = fecha_creacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo_mensualidad = costo_mensualidad;
        this.costo_matricula = costo_matricula;
        this.id_malla = id_malla;
    }

    public Integer getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Integer id_periodo) {
        this.id_periodo = id_periodo;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public Date getFecha_activiti() {
        return fecha_activiti;
    }

    public void setFecha_activiti(Date fecha_activiti) {
        this.fecha_activiti = fecha_activiti;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Double getCosto_mensualidad() {
        return costo_mensualidad;
    }

    public void setCosto_mensualidad(Double costo_mensualidad) {
        this.costo_mensualidad = costo_mensualidad;
    }

    public Double getCosto_matricula() {
        return costo_matricula;
    }

    public void setCosto_matricula(Double costo_matricula) {
        this.costo_matricula = costo_matricula;
    }

    public Malla getId_malla() {
        return id_malla;
    }

    public void setId_malla(Malla id_malla) {
        this.id_malla = id_malla;
    }

    @Override
    public String toString() {
        return "Periodo{" + "id_periodo=" + id_periodo + ", actividades=" + actividades + ", fecha_activiti=" + fecha_activiti + ", fecha_creacion=" + fecha_creacion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", costo_mensualidad=" + costo_mensualidad + ", costo_matricula=" + costo_matricula + ", id_malla=" + id_malla + '}';
    }

}//fin()
