package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.backend.modelo.Periodo;

public interface PeriodoRepository extends JpaRepository<Periodo, Integer> {

}//fin()
