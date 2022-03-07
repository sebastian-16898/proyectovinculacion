package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.boot.backend.modelo.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {

    @Query(value = "SELECT * FROM Horario WHERE id_horario=?1", nativeQuery = true)
    Horario FindById(int id_horario);

}//fin()
