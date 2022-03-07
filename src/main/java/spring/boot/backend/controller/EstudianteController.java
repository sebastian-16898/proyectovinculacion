package spring.boot.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.backend.modelo.Estudiante;
import spring.boot.backend.service.EstudianteService;

@RestController
@RequestMapping(path = "/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService es;

    @PostMapping("/add")
    public boolean add(@RequestBody Estudiante e) {
        return es.addEstudiante(e);
    }

    @GetMapping("/views")
    public List<Estudiante> views() {
        return es.list();
    }

    @GetMapping("/views/{val}")
    public Estudiante views(@PathVariable int val) {
        return es.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Estudiante e) {
        return es.addEstudiante(e);
    }

    @DeleteMapping("/delete/{id_estudiante}")
    public boolean delete(@PathVariable("id_estudiante") int e) {
        return es.deleteById(e);
    }

}//fin()
