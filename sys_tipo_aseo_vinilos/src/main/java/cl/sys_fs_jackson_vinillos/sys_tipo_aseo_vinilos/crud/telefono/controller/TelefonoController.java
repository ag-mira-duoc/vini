package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.controller;

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

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.DTO.TelefonoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.service.ITelefonoService;

@RestController
@RequestMapping("/api/crud/telefono")
public class TelefonoController {

     @Autowired
    private ITelefonoService telefonoService;

     @PostMapping
    public TelefonoDTO insertTelefonoDTO(@RequestBody TelefonoDTO telefono) {
        System.out.println("telefono añadido");
        TelefonoDTO aux = telefonoService.insertTelefonoDTO(telefono);
        return aux;
    }

     @PutMapping("/{numIdPais}")
    public TelefonoDTO actualizarTelefonoDTO(@PathVariable String numIdPais, @RequestBody TelefonoDTO telefono) {
        System.out.println("telefono actualizado");
        TelefonoDTO aux = telefonoService.actualizarTelefonoDTO(numIdPais, telefono);
        return aux;
    }

     @DeleteMapping("/{numIdPais}")
    public TelefonoDTO actualizarTelefonoDTO(@PathVariable String numIdPais) {
        System.out.println("telefono eliminado");
        TelefonoDTO aux = telefonoService.deleteTelefonoDTO(numIdPais);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<TelefonoDTO> getAllList(){
        System.out.println("busqueda de telefonos");
        return telefonoService.getAllTelefono();
    }

    @GetMapping("/{numIdPais}") // seleccionar uno
    public TelefonoDTO getByCodigo(@PathVariable String numIdPais){
        System.out.println("busqueda de un solo telefono");
        return telefonoService.getByNumIdPais(numIdPais);
    }
}
