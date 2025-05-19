package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.DTO.PaisDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.service.IPaisService;

public class PaisController {

     @Autowired
    private IPaisService paisService;

     @PostMapping
    public PaisDTO insertPaisDTO(@RequestBody PaisDTO pokemon) {
        System.out.println("pais añadido");
        PaisDTO aux = paisService.insertPaisDTO(pokemon);
        return aux;
    }

     @PutMapping("/{id_pais}")
    public PaisDTO actualizarPaisDTO(@PathVariable int id_pais, @RequestBody PaisDTO pokemon) {
        System.out.println("pais actualizado");
        PaisDTO aux = paisService.actualizarPaisDTO(id_pais, pokemon);
        return aux;
    }

     @DeleteMapping("/{id_pais}")
    public PaisDTO actualizarPaisDTO(@PathVariable int id_pais) {
        System.out.println("pais eliminado");
        PaisDTO aux = paisService.deletePaisDTO(id_pais);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<PaisDTO> getAllList(){
        System.out.println("busqueda de paisess");
        return paisService.getAllPais();
    }

    @GetMapping("/{id_pais}") // seleccionar uno
    public PaisDTO getByCodigo(@PathVariable int id_pais){
        System.out.println("busqueda de un solo pais");
        return paisService.getById_pais(id_pais);
    }
}
