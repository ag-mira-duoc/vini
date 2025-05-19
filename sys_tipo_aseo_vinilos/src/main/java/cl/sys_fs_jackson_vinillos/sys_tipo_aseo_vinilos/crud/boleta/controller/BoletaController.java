package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.controller;

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

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.DTO.BoletaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.service.IBoletaService;

@RestController
@RequestMapping("/api/crud/boleta")
public class BoletaController {


    @Autowired
    private IBoletaService boletaService;

     @PostMapping
    public BoletaDTO insertBoletaDTO(@RequestBody BoletaDTO boleta) {
        System.out.println("boleta añadida");
        BoletaDTO aux = boletaService.insertBoletaDTO(boleta);
        return aux;
    }

     @PutMapping("/{numBoleta}")
    public BoletaDTO actualizarBoletaDTO(@PathVariable int numBoleta, @RequestBody BoletaDTO boleta) {
        System.out.println("boleta actualizada");
        BoletaDTO aux = boletaService.actualizarBoletaDTO(numBoleta, boleta);
        return aux;
    }

     @DeleteMapping("/{numBoleta}")
    public BoletaDTO actualizarBoletaDTO(@PathVariable int numBoleta) {
        System.out.println("boleta eliminada");
        BoletaDTO aux = boletaService.deleteBoletaDTO(numBoleta);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<BoletaDTO> getAllList(){
        System.out.println("busqueda de boletas");
        return boletaService.getAllBoleta();
    }

    @GetMapping("/{numBoleta}") // seleccionar uno
    public BoletaDTO getByCodigo(@PathVariable int numBoleta){
        System.out.println("busqueda de una sola boleta");
        return boletaService.getByNumBoleta(numBoleta);
    }
}
