package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.boot.backend.modelo.Rol_Usuario;

@Repository
public interface Rol_UsuarioRepository extends JpaRepository<Rol_Usuario, Integer> {

    @Query(value = "SELECT * FROM Rol_Usuario WHERE id_RolUsuario=?1", nativeQuery = true)
    Rol_Usuario FindById(int id_RolUsuario);

}//fin()
