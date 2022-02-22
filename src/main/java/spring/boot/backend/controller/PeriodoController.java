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
import spring.boot.backend.modelo.Periodo;
import spring.boot.backend.service.PeriodoService;

@RestController
@RequestMapping(path = "/periodo")
public class PeriodoController {

    @Autowired
    private PeriodoService ps;

    @PostMapping("/add")
    public boolean add(@RequestBody Periodo p) {
        return ps.addPeriodo(p);
    }

    @GetMapping("/views")
    public List<Periodo> views() {
        return ps.list();
    }

    @GetMapping("/views/{val}")
    public Periodo views(@PathVariable int val) {
        return ps.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Periodo p) {
        return ps.addPeriodo(p);
    }

    @DeleteMapping("/delete/{id_periodo}")
    public boolean delete(@PathVariable("id_periodo") int p) {
        return ps.deleteById(p);
    }

}//fin()

