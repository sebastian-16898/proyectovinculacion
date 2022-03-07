package spring.boot.backend.service;

import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.HorarioRepository;
import spring.boot.backend.modelo.Horario;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository hr;

    public boolean addHorario(Horario horario) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            Horario h = horario;
            h.setFecha_creacion(gc);
            hr.save(h);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Horario> list() {
        return hr.findAll();
    }

    public Horario findById(int val) {
        return hr.FindById(val);
    }

    public boolean deleteById(int h) {
        Horario horario = hr.FindById(h);
        if (horario.getId_horario() > 0) {
            hr.delete(horario);
            return true;
        } else {
            return false;
        }
    }

}//fin()
