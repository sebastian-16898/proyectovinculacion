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
import spring.boot.backend.modelo.Horario;
import spring.boot.backend.service.HorarioService;

@RestController
@RequestMapping(path = "/horario")
public class HorarioController {

    @Autowired
    private HorarioService hs;

    @PostMapping("/add")
    public boolean add(@RequestBody Horario h) {
        return hs.addHorario(h);
    }

    @GetMapping("/views")
    public List<Horario> views() {
        return hs.list();
    }

    @GetMapping("/views/{val}")
    public Horario views(@PathVariable int val) {
        return hs.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Horario h) {
        return hs.addHorario(h);
    }

    @DeleteMapping("/delete/{id_horario}")
    public boolean delete(@PathVariable("id_horario") int h) {
        return hs.deleteById(h);
    }

}//fin()
