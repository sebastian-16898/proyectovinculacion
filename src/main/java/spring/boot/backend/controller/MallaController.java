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
import spring.boot.backend.modelo.Malla;
import spring.boot.backend.service.MallaService;

@RestController
@RequestMapping(path = "/malla")
public class MallaController {

    @Autowired
    private MallaService ms;

    @PostMapping("/add")
    public boolean add(@RequestBody Malla m) {
        return ms.addMalla(m);
    }

    @GetMapping("/views")
    public List<Malla> views() {
        return ms.list();
    }

    @GetMapping("/views/{val}")
    public Malla views(@PathVariable int val) {
        return ms.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Malla m) {
        return ms.addMalla(m);
    }

    @DeleteMapping("/delete/{id_malla}")
    public boolean delete(@PathVariable("id_malla") int m) {
        return ms.deleteById(m);
    }

}//fin()

