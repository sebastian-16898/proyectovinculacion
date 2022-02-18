package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Malla;

@Repository
public interface MallaRepository extends JpaRepository<Malla, Integer> {

}//fin()
