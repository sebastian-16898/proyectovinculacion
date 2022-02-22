package spring.boot.backend.service;

import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.AsignaturaRepository;
import spring.boot.backend.modelo.Asignatura;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository ar;

    public boolean addAsignaturas(Asignatura asignatura) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            Asignatura a2 = asignatura;
            a2.setFecha_creacion(gc);
            ar.save(a2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Asignatura> list() {
        return ar.findAll();
    }

    public Asignatura findById(int val) {
        return ar.FindById(val);
    }

    public boolean deleteById(int a) {
        Asignatura asignatura = ar.FindById(a);
        if (asignatura.getId_asignatura() > 0) {
            ar.delete(asignatura);
            return true;
        } else {
            return false;
        }
    }

}//fin()
