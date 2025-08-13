package com.Esfe.Asistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Esfe.Asistencia.Modelos.Docente;
public interface IDocenteRepository extends JpaRepository<Docente, Integer>{

    
}