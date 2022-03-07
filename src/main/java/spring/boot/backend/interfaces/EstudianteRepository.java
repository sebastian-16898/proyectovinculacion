package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    @Query(value = "SELECT * FROM Estudiante WHERE id_estudiante=?1", nativeQuery = true)
    Estudiante FindById(int id_estudiante);

}//fin()
