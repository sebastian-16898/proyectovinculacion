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
import spring.boot.backend.modelo.Rol;
import spring.boot.backend.service.RolService;

@RestController
@RequestMapping(path = "/rol")
public class RolController {

    @Autowired
    private RolService rs;

    @PostMapping("/add")
    public boolean add(@RequestBody Rol r) {
        return rs.addRol(r);
    }

    @GetMapping("/views")
    public List<Rol> views() {
        return rs.list();
    }

    @GetMapping("/views/{val}")
    public Rol views(@PathVariable int val) {
        return rs.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Rol r) {
        return rs.addRol(r);
    }

    @DeleteMapping("/delete/{id_rol}")
    public boolean delete(@PathVariable("id_rol") int r) {
        return rs.deleteById(r);
    }

}//fin()
