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
import spring.boot.backend.modelo.Rol_Usuario;
import spring.boot.backend.service.Rol_UsuarioService;

@RestController
@RequestMapping(path = "/rolusuario")
public class Rol_UsuarioController {

    @Autowired
    private Rol_UsuarioService rus;

    @PostMapping("/add")
    public boolean add(@RequestBody Rol_Usuario ru) {
        return rus.addRol_Usuario(ru);
    }

    @GetMapping("/views")
    public List<Rol_Usuario> views() {
        return rus.list();
    }

    @GetMapping("/views/{val}")
    public Rol_Usuario views(@PathVariable int val) {
        return rus.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Rol_Usuario ru) {
        return rus.addRol_Usuario(ru);
    }

    @DeleteMapping("/delete/{id_RolUsuario}")
    public boolean delete(@PathVariable("id_RolUsuario") int ru) {
        return rus.deleteById(ru);
    }

}//fin()

