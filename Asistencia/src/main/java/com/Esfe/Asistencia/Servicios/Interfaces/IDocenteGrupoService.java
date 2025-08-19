package com.Esfe.Asistencia.Servicios.Interfaces;
import com.Esfe.Asistencia.Modelos.DocenteGrupo;
import java.util.*;
import org.springframework.data.domain.*;

public interface IDocenteGrupoService {
    List<DocenteGrupo> obtenerTodos();
    Page<DocenteGrupo> buscarTodosPaginados(Pageable pageable);
    DocenteGrupo buscarPorId(Integer id);
    DocenteGrupo crearOEditar(DocenteGrupo docenteGrupo);
    void eliminarPorId(Integer id);
}
