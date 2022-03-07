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
import spring.boot.backend.modelo.Curso;
import spring.boot.backend.service.CursoService;

@RestController
@RequestMapping(path = "/curso")
public class CursoController {

    @Autowired
    private CursoService cs;

    @PostMapping("/add")
    public boolean add(@RequestBody Curso c) {
        return cs.addCurso(c);
    }

    @GetMapping("/views")
    public List<Curso> views() {
        return cs.list();
    }

    @GetMapping("/views/{val}")
    public Curso views(@PathVariable int val) {
        return cs.findById(val);
    }

    @PutMapping("/update")
    public boolean views(@RequestBody Curso c) {
        return cs.addCurso(c);
    }

    @DeleteMapping("/delete/{id_curso}")
    public boolean delete(@PathVariable("id_curso") int c) {
        return cs.deleteById(c);
    }

}//fin()
