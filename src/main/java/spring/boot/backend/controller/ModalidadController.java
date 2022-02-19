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
import spring.boot.backend.interfaces.ModalidadRepository;
import spring.boot.backend.modelo.Modalidad;

@RestController
@RequestMapping(path = "/modalidad")
public class ModalidadController {

    @Autowired
    private ModalidadRepository repo;

    @PostMapping("/add")
    public Modalidad add(@RequestBody Modalidad m) {
        return repo.save(m);
    }

    @GetMapping("/views")
    public List<Modalidad> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Modalidad> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Modalidad views(@RequestBody Modalidad m) {
        return repo.save(m);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer m) {
        repo.deleteById(m);
        return "Id : " + m + " delete";
    }

}//fin()
