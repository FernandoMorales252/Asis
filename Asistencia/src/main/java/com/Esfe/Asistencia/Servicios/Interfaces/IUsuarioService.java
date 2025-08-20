package com.Esfe.Asistencia.Servicios.Interfaces;
import java.util.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.Esfe.Asistencia.Modelos.Usuario;



public interface IUsuarioService {
    Page<Usuario> obtenerTodosPaginados(Pageable pageable);
    List<Usuario> obtenerTodos();
    Usuario obtenerPorId(Integer id);
    Usuario crearOEditar(Usuario usuario);
    void eliminarPorId(Integer id);

}
