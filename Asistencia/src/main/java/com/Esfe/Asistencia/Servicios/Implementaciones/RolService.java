package com.Esfe.Asistencia.Servicios.Implementaciones;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.Esfe.Asistencia.Repositorios.IRolRepository;
import com.Esfe.Asistencia.Servicios.Interfaces.IRolService;
import com.Esfe.Asistencia.Modelos.Rol;

import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService {

    @Autowired
    private IRolRepository rolRepository;

    @Override
    public List<Rol> obtenerTodos() {
        return rolRepository.findAll();
    }

}
