package spring.boot.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.ModalidadRepository;
import spring.boot.backend.modelo.Modalidad;

@Service
public class ModalidadService {

    @Autowired
    private ModalidadRepository mr;

    public boolean addModalidad(Modalidad modalidad) {
        try {
            Modalidad m = modalidad;
            mr.save(m);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Modalidad> list() {
        return mr.findAll();
    }

    public Modalidad findById(int val) {
        return mr.FindById(val);
    }

    public boolean deleteById(int m) {
        Modalidad malla = mr.FindById(m);
        if (malla.getId_modalidad() > 0) {
            mr.delete(malla);
            return true;
        } else {
            return false;
        }
    }

}//fin()
