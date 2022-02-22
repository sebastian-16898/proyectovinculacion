package spring.boot.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.UsuarioRepository;
import spring.boot.backend.modelo.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository ur;

    public boolean addUsuario(Usuario usuario) {
        try {
            Usuario u = usuario;
            ur.save(u);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Usuario> list() {
        return ur.findAll();
    }

    public Usuario findById(int val) {
        return ur.FindById(val);
    }

    public boolean deleteById(int u) {
        Usuario usuario = ur.FindById(u);
        if (usuario.getId_usuario() > 0) {
            ur.delete(usuario);
            return true;
        } else {
            return false;
        }
    }

}//fin()
