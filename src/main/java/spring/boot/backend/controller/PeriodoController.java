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
import spring.boot.backend.interfaces.PeriodoRepository;
import spring.boot.backend.modelo.Periodo;

@RestController
@RequestMapping(path = "/periodo")
public class PeriodoController {

    @Autowired
    private PeriodoRepository repo;

    @PostMapping("/add")
    public Periodo add(@RequestBody Periodo p) {
        return repo.save(p);
    }

    @GetMapping("/views")
    public List<Periodo> views() {
        return repo.findAll();
    }

    @GetMapping("/views/{val}")
    public Optional<Periodo> views(@PathVariable Integer val) {
        return repo.findById(val);
    }

    @PutMapping("/update")
    public Periodo views(@RequestBody Periodo p) {
        return repo.save(p);
    }

    @DeleteMapping("/delete/{val}")
    public String delete(@PathVariable Integer p) {
        repo.deleteById(p);
        return "Id : " + p + " delete";
    }

}//fin()

