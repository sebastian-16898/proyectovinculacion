package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    @Query(value = "SELECT * FROM Curso WHERE id_curso=?1", nativeQuery = true)
    Curso FindById(int id_curso);

}//fin()
