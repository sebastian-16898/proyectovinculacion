package spring.boot.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.backend.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}//fin()
