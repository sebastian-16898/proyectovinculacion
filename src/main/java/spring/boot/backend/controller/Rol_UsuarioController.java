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
import spring.boot.backend.interfaces.Rol_UsuarioRepository;
import spring.boot.backend.modelo.Rol_Usuario;

@RestController
@RequestMapping(path = "/rolusuario")
public class Rol_UsuarioController {

    @Autowired
    private Rol_UsuarioRepository repo;

    @PostMapping("/add")
    public Rol_Usuario add(@RequestBody Rol_Usuario ru) {
        return repo.save(ru);
    }

    @GetMapping("/views")
    public List<Rol_Usuario> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Rol_Usuario> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Rol_Usuario views(@RequestBody Rol_Usuario ru) {
        return repo.save(ru);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer ru) {
        repo.deleteById(ru);
        return "Id : " + ru + " delete";
    }

}//fin()

