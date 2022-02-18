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
import spring.boot.backend.interfaces.UsuarioRepository;
import spring.boot.backend.modelo.Usuario;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repo;

    @PostMapping("/add")
    public Usuario add(@RequestBody Usuario u) {
        return repo.save(u);
    }

    @GetMapping("/views")
    public List<Usuario> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Usuario> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Usuario views(@RequestBody Usuario u) {
        return repo.save(u);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer u) {
        repo.deleteById(u);
        return "Id : " + u + " delete";
    }

}//fin()
