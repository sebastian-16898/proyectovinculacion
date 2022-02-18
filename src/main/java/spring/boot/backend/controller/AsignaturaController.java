package spring.boot.backend.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.backend.interfaces.AsignaturaRepository;
import spring.boot.backend.modelo.Asignatura;

@RestController
@RequestMapping(path = "/asignatura")
public class AsignaturaController {

    @Autowired
    private AsignaturaRepository repo;

    @PostMapping("/add")
    public Asignatura add(@RequestBody Asignatura a) {
        return repo.save(a);
    }

    @GetMapping("/views")
    public List<Asignatura> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Asignatura> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Asignatura views(@RequestBody Asignatura a) {
        return repo.save(a);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer a) {
        repo.deleteById(a);
        return "Id : " + a + " delete";
    }

}//fin()
