package com.Esfe.Asistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Esfe.Asistencia.Modelos.Grupo;
public interface IGrupoRepository extends JpaRepository<Grupo, Integer> {
    
}