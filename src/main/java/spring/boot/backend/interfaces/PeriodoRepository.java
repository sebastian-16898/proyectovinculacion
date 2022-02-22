package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Integer> {
    
    @Query(value = "SELECT * FROM Periodo WHERE id_periodo=?1", nativeQuery = true)
    Periodo FindById(int id_periodo);

}//fin()
