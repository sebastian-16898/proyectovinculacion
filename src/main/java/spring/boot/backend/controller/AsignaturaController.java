package spring.boot.backend.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AsignaturaController {

    @Autowired
    private AsignaturaService as;

    @PostMapping(path = {"/addAsig"}, consumes = "application/json", produces = "application/json")
    public boolean add(@Validated @RequestBody Asignatura a) {
        return as.addAsignaturas(a);
    }

    @GetMapping("/views")
    public List<Asignatura> views() {
        return as.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Asignatura> views(@PathVariable Integer val) {
        return as.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Asignatura a) {
        return as.addAsignaturas(a);
    }

    @DeleteMapping("/delete/{val}")
    public boolean delete(@PathVariable Integer a) {
        return as.deleteById(a);
    }

}//fin()
