package spring.boot.backend.service;

import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.CursoRepository;
import spring.boot.backend.modelo.Curso;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cr;

    public boolean addCurso(Curso curso) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            Curso c = curso;
            c.setFecha_creacion(gc);
            cr.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Curso> list() {
        return cr.findAll();
    }

    public Curso findById(int val) {
        return cr.FindById(val);
    }

    public boolean deleteById(int c) {
        Curso curso = cr.FindById(c);
        if (curso.getId_curso() > 0) {
            cr.delete(curso);
            return true;
        } else {
            return false;
        }
    }

}//fin()
