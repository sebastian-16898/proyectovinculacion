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
import spring.boot.backend.interfaces.RolRepository;
import spring.boot.backend.modelo.Rol;

@RestController
@RequestMapping(path = "/rol")
public class RolController {

    @Autowired
    private RolRepository repo;

    @PostMapping("/add")
    public Rol add(@RequestBody Rol r) {
        return repo.save(r);
    }

    @GetMapping("/views")
    public List<Rol> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Rol> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Rol views(@RequestBody Rol r) {
        return repo.save(r);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer r) {
        repo.deleteById(r);
        return "Id : " + r + " delete";
    }

}//fin()
