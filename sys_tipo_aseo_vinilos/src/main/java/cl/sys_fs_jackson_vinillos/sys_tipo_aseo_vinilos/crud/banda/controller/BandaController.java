package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.controller;

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

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.DTO.BandaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.service.IBandaService;

@RestController
@RequestMapping("/api/crud/banda")
public class BandaController {

     @Autowired
    private IBandaService bandaService;

     @PostMapping
    public BandaDTO insertBandaDTO(@RequestBody BandaDTO banda) {
        System.out.println("banda añadida");
        BandaDTO aux = bandaService.insertBandaDTO(banda);
        return aux;
    }

     @PutMapping("/{id_banda}")
    public BandaDTO actualizarBandaDTO(@PathVariable int id_banda, @RequestBody BandaDTO banda) {
        System.out.println("banda actualizada");
        BandaDTO aux = bandaService.actualizarBandaDTO(id_banda, banda);
        return aux;
    }

     @DeleteMapping("/{id_banda}")
    public BandaDTO actualizarBandaDTO(@PathVariable int id_banda) {
        System.out.println("banda eliminada");
        BandaDTO aux = bandaService.deleteBandaDTO(id_banda);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<BandaDTO> getAllList(){
        System.out.println("busqueda de bandas");
        return bandaService.getAllBanda();
    }

    @GetMapping("/{id_banda}") // seleccionar uno
    public BandaDTO getByCodigo(@PathVariable int id_banda){
        System.out.println("busqueda de una sola banda");
        return bandaService.getById_banda(id_banda);
    }
}
