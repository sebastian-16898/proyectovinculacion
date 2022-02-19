package spring.boot.backend.service;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.backend.interfaces.AsignaturaRepository;
import spring.boot.backend.modelo.Asignatura;

@Service
public class AsignaturaService {

	@Autowired
	private AsignaturaRepository ar;

	public boolean addAsignaturas(Asignatura asignatura) {
		try {
			GregorianCalendar gc = new GregorianCalendar();
			Asignatura a2 = asignatura;
			a2.setFecha_creacion(gc);
			ar.save(a2);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Asignatura save(Asignatura a) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	public Optional<Asignatura> findById(Integer val) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	public List<Asignatura> findAll() {
		return ar.findAll();
	}

	public boolean deleteById(Integer a) {
		Asignatura asignatura = ar.FindById(a);
		if (asignatura.getId_asignatura() > 0) {
			ar.delete(asignatura);
			return true;
		} else {
			return false;
		}

	}
}
