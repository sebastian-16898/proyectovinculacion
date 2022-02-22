package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    @Query(value = "SELECT * FROM Rol WHERE id_rol=?1", nativeQuery = true)
    Rol FindById(int id_rol);

}//fin()
