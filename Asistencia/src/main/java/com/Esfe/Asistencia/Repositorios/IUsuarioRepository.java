package com.Esfe.Asistencia.Repositorios;
import com.Esfe.Asistencia.Modelos.Usuario;
import org.springframework.data.jpa.repository.*;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
  

}
