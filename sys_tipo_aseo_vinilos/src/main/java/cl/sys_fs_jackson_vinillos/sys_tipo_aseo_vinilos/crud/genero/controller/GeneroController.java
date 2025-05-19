package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.DTO.GeneroDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.service.IGeneroService;

@RestController
@RequestMapping("/api/crud/genero")
public class GeneroController {

    @Autowired
    private IGeneroService generoService;

     @PostMapping
    public GeneroDTO insertGeneroDTO(@RequestBody GeneroDTO genero) {
        System.out.println("genero añadido");
        GeneroDTO aux = generoService.insertGeneroDTO(genero);
        return aux;
    }

     @PutMapping("/{id_genero}")
    public GeneroDTO actualizarGeneroDTO(@PathVariable int id_genero, @RequestBody GeneroDTO genero) {
        System.out.println("genero actualizado");
        GeneroDTO aux = generoService.actualizarGeneroDTO(id_genero, genero);
        return aux;
    }

     @DeleteMapping("/{id_genero}")
    public GeneroDTO actualizarGeneroDTO(@PathVariable int id_genero) {
        System.out.println("genero eliminado");
        GeneroDTO aux = generoService.deleteGeneroDTO(id_genero);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<GeneroDTO> getAllList(){
        System.out.println("busqueda de generoes");
        return generoService.getAllGenero();
    }

    @GetMapping("/{id_genero}") // seleccionar uno
    public GeneroDTO getByCodigo(@PathVariable int id_genero){
        System.out.println("busqueda de un solo genero");
        return generoService.getById_genero(id_genero);
    }

    
}
