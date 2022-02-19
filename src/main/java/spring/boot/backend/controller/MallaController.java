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
import spring.boot.backend.interfaces.MallaRepository;
import spring.boot.backend.modelo.Malla;

@RestController
@RequestMapping(path = "/malla")
public class MallaController {

    @Autowired
    private MallaRepository repo;

    @PostMapping("/add")
    public Malla add(@RequestBody Malla m) {
        return repo.save(m);
    }

    @GetMapping("/views")
    public List<Malla> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Malla> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Malla views(@RequestBody Malla m) {
        return repo.save(m);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer m) {
        repo.deleteById(m);
        return "Id : " + m + " delete";
    }

}//fin()

