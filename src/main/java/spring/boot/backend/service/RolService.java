package spring.boot.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.RolRepository;
import spring.boot.backend.modelo.Rol;

@Service
public class RolService {

    @Autowired
    private RolRepository rr;

    public boolean addRol(Rol rol) {
        try {
            Rol r = rol;
            rr.save(r);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Rol> list() {
        return rr.findAll();
    }

    public Rol findById(int val) {
        return rr.FindById(val);
    }

    public boolean deleteById(int r) {
        Rol rol = rr.FindById(r);
        if (rol.getId_rol() > 0) {
            rr.delete(rol);
            return true;
        } else {
            return false;
        }
    }

}//fin()
