package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {

    @Query(value = "SELECT * FROM Asignatura WHERE id_asignatura=?1", nativeQuery = true)
    Asignatura FindById(int id_asignatura);

}//fin()
