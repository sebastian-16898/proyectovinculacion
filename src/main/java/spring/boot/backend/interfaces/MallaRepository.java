package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Malla;

@Repository
public interface MallaRepository extends JpaRepository<Malla, Integer> {

    @Query(value = "SELECT * FROM Malla WHERE id_malla=?1", nativeQuery = true)
    Malla FindById(int id_malla);

}//fin()
