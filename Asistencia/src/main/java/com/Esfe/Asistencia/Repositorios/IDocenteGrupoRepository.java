package com.Esfe.Asistencia.Repositorios;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Esfe.Asistencia.Modelos.DocenteGrupo;

public interface IDocenteGrupoRepository extends JpaRepository<DocenteGrupo, Integer> {
    Page<DocenteGrupo> findByOrderByDocenteDesc(Pageable pageable);

    


}
