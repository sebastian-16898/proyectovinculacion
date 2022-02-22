package spring.boot.backend.service;

import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.PeriodoRepository;
import spring.boot.backend.modelo.Periodo;

@Service
public class PeriodoService {

    @Autowired
    private PeriodoRepository pr;

    public boolean addPeriodo(Periodo periodo) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            Periodo p = periodo;
            p.setFecha_creacion(gc);
            pr.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Periodo> list() {
        return pr.findAll();
    }

    public Periodo findById(int val) {
        return pr.FindById(val);
    }

    public boolean deleteById(int p) {
        Periodo periodo = pr.FindById(p);
        if (periodo.getId_periodo() > 0) {
            pr.delete(periodo);
            return true;
        } else {
            return false;
        }
    }

}//fin()
