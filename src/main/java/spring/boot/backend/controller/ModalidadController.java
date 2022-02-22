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
import spring.boot.backend.modelo.Modalidad;
import spring.boot.backend.service.ModalidadService;

@RestController
@RequestMapping(path = "/modalidad")
public class ModalidadController {

    @Autowired
    private ModalidadService ms;

    @PostMapping("/add")
    public boolean add(@RequestBody Modalidad m) {
        return ms.addModalidad(m);
    }

    @GetMapping("/views")
    public List<Modalidad> views() {
        return ms.list();
    }

    @GetMapping("/views/{val}")
    public Modalidad views(@PathVariable int val) {
        return ms.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Modalidad m) {
        return ms.addModalidad(m);
    }

    @DeleteMapping("/delete/{id_modalidad}")
    public boolean delete(@PathVariable("id_modalidad") int m) {
        return ms.deleteById(m);
    }

}//fin()
