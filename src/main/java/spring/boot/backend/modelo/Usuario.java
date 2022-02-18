package spring.boot.backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", unique = true)
    Integer id_usuario;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "est_usuario")
    private String est_usuario;

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String usuario, String contrasena, String est_usuario) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.est_usuario = est_usuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEst_usuario() {
        return est_usuario;
    }

    public void setEst_usuario(String est_usuario) {
        this.est_usuario = est_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", usuario=" + usuario + ", contrasena=" + contrasena + ", est_usuario=" + est_usuario + '}';
    }

}//fin()
