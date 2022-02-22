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
import spring.boot.backend.modelo.Usuario;
import spring.boot.backend.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService us;

    @PostMapping("/add")
    public boolean add(@RequestBody Usuario u) {
        return us.addUsuario(u);
    }

    @GetMapping("/views")
    public List<Usuario> views() {
        return us.list();
    }

    @GetMapping("/views/{val}")
    public Usuario views(@PathVariable int val) {
        return us.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Usuario u) {
        return us.addUsuario(u);
    }

    @DeleteMapping("/delete/{id_usuario}")
    public boolean delete(@PathVariable("id_usuario") int u) {
        return us.deleteById(u);
    }

}//fin()
