package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Modalidad;

@Repository
public interface ModalidadRepository extends JpaRepository<Modalidad, Integer> {

    @Query(value = "SELECT * FROM Modalidad WHERE id_modalidad=?1", nativeQuery = true)
    Modalidad FindById(int id_modalidad);

}//fin()
