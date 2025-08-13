package com.Esfe.Asistencia.Servicios.Implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.Esfe.Asistencia.Modelos.Grupo;
import com.Esfe.Asistencia.Repositorios.IGrupoRepository;
import com.Esfe.Asistencia.Servicios.Interfaces.IGrupoService;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService implements IGrupoService {

    @Autowired
    private IGrupoRepository grupoRepository;

    @Override
    public Page<Grupo> buscarTodos(Pageable pageable) {
        return grupoRepository.findAll(pageable);
    }

    @Override
    public List<Grupo> ObtenerTodos() {
        return grupoRepository.findAll();
    }

   
    @Override
    public Optional<Grupo> buscarPorId(Integer id) { 
        return grupoRepository.findById(id);
    }

    @Override
    public Grupo crearOeditar(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public void eliminarporId(Integer id) {
        grupoRepository.deleteById(id);
    }
}