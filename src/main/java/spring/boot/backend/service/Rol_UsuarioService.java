package spring.boot.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.Rol_UsuarioRepository;
import spring.boot.backend.modelo.Rol_Usuario;

@Service
public class Rol_UsuarioService {

    @Autowired
    private Rol_UsuarioRepository rur;

    public boolean addRol_Usuario(Rol_Usuario rol_Usuario) {
        try {
            Rol_Usuario ru = rol_Usuario;
            rur.save(ru);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Rol_Usuario> list() {
        return rur.findAll();
    }

    public Rol_Usuario findById(int val) {
        return rur.FindById(val);
    }

    public boolean deleteById(int ru) {
        Rol_Usuario rol_Usuario = rur.FindById(ru);
        if (rol_Usuario.getId_rol_usuario() > 0) {
            rur.delete(rol_Usuario);
            return true;
        } else {
            return false;
        }
    }

}//fin()
