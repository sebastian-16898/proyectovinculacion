package spring.boot.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.EstudianteRepository;
import spring.boot.backend.modelo.Estudiante;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository er;

    public boolean addEstudiante(Estudiante estudiante) {
        try {
            Estudiante e = estudiante;
            er.save(e);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Estudiante> list() {
        return er.findAll();
    }

    public Estudiante findById(int val) {
        return er.FindById(val);
    }

    public boolean deleteById(int e) {
        Estudiante estudiante = er.FindById(e);
        if (estudiante.getId_estudiante() > 0) {
            er.delete(estudiante);
            return true;
        } else {
            return false;
        }
    }

}//fin()
