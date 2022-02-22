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
import spring.boot.backend.modelo.Asignatura;
import spring.boot.backend.service.AsignaturaService;

@RestController
@RequestMapping(path = "/asignatura")
public class AsignaturaController {

    @Autowired
    private AsignaturaService as;

    @PostMapping("/add")
    public boolean add(@RequestBody Asignatura a) {
        return as.addAsignaturas(a);
    }

    @GetMapping("/views")
    public List<Asignatura> views() {
        return as.list();
    }

    @GetMapping("/views/{val}")
    public Asignatura views(@PathVariable int val) {
        return as.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Asignatura a) {
        return as.addAsignaturas(a);
    }

    @DeleteMapping("/delete/{id_asignatura}")
    public boolean delete(@PathVariable("id_asignatura") int a) {
        return as.deleteById(a);
    }

}//fin()
