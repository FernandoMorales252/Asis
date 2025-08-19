package com.Esfe.Asistencia.Servicios.Implementaciones;

import com.Esfe.Asistencia.Repositorios.*;
import com.Esfe.Asistencia.Modelos.*;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import com.Esfe.Asistencia.Servicios.Interfaces.IDocenteGrupoService;

@Service
public class DocenteGrupoService implements IDocenteGrupoService {

    @Autowired
    private IDocenteGrupoRepository docenteGrupoRepository;

    @Override
    public List<DocenteGrupo> obtenerTodos() {
        return docenteGrupoRepository.findAll();
    }

    @Override
    public Page<DocenteGrupo> buscarTodosPaginados(Pageable pageable) {
        return docenteGrupoRepository.findByOrderByDocenteDesc(pageable);
    }

    @Override
    public DocenteGrupo buscarPorId(Integer id) {
        return docenteGrupoRepository.findById(id).orElse(null);
    }

    @Override
    public DocenteGrupo crearOEditar(DocenteGrupo docenteGrupo) {
        return docenteGrupoRepository.save(docenteGrupo);
    }

    @Override
    public void eliminarPorId(Integer id) {
        docenteGrupoRepository.deleteById(id);
    }
}
