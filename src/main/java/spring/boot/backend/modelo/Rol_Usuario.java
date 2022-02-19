package spring.boot.backend.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rol_Usuario")
public class Rol_Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_RolUsuario", unique = true)
    Integer id_RolUsuario;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario id_usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Rol id_rol;

    public Rol_Usuario() {
    }

    public Rol_Usuario(Integer id_RolUsuario, Boolean estado, Usuario id_usuario, Rol id_rol) {
        this.id_RolUsuario = id_RolUsuario;
        this.estado = estado;
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
    }

    public Integer getId_RolUsuario() {
        return id_RolUsuario;
    }

    public void setId_RolUsuario(Integer id_RolUsuario) {
        this.id_RolUsuario = id_RolUsuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    @Override
    public String toString() {
        return "Rol_Usuario{" + "id_RolUsuario=" + id_RolUsuario + ", estado=" + estado + ", id_usuario=" + id_usuario + ", id_rol=" + id_rol + '}';
    }

}//fin()
