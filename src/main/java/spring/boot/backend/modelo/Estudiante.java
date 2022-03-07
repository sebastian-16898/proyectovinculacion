package spring.boot.backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante", unique = true)
    private int id_estudiante;

    @Column(name = "estado_estudiante")
    private Boolean estado_estudiante;

    @Column(name = "correo")
    private String correo;

    public Estudiante() {
        super();
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public Boolean getEstado_estudiante() {
        return estado_estudiante;
    }

    public void setEstado_estudiante(Boolean estado_estudiante) {
        this.estado_estudiante = estado_estudiante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}//fin()
