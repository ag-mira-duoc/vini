package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.DTO.EstadoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.service.IEstadoService;

public class EstadoController {

    @Autowired
    private IEstadoService estadoService;

     @PostMapping
    public EstadoDTO insertEstadoDTO(@RequestBody EstadoDTO estado) {
        System.out.println("estado añadido");
        EstadoDTO aux = estadoService.insertEstadoDTO(estado);
        return aux;
    }

     @PutMapping("/{id_estado}")
    public EstadoDTO actualizarEstadoDTO(@PathVariable int id_estado, @RequestBody EstadoDTO estado) {
        System.out.println("estado actualizado");
        EstadoDTO aux = estadoService.actualizarEstadoDTO(id_estado, estado);
        return aux;
    }

     @DeleteMapping("/{id_estado}")
    public EstadoDTO actualizarEstadoDTO(@PathVariable int id_estado) {
        System.out.println("estado eliminado");
        EstadoDTO aux = estadoService.deleteEstadoDTO(id_estado);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<EstadoDTO> getAllList(){
        System.out.println("busqueda de estadoes");
        return estadoService.getAllEstado();
    }

    @GetMapping("/{id_estado}") // seleccionar uno
    public EstadoDTO getByCodigo(@PathVariable int id_estado){
        System.out.println("busqueda de un solo estado");
        return estadoService.getById_estado(id_estado);
    }

}
