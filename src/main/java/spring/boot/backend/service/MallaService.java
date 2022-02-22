package spring.boot.backend.service;

import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.MallaRepository;
import spring.boot.backend.modelo.Malla;

@Service
public class MallaService {

    @Autowired
    private MallaRepository mr;

    public boolean addMalla(Malla malla) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            Malla m = malla;
            m.setFecha_creacion(gc);
            mr.save(m);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Malla> list() {
        return mr.findAll();
    }

    public Malla findById(int val) {
        return mr.FindById(val);
    }

    public boolean deleteById(int m) {
        Malla malla = mr.FindById(m);
        if (malla.getId_malla() > 0) {
            mr.delete(malla);
            return true;
        } else {
            return false;
        }
    }

}//fin()
