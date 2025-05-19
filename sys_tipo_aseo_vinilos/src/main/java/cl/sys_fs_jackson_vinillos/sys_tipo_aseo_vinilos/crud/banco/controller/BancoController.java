package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.controller;

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

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.DTO.BancoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.service.IBancoService;


@RestController
@RequestMapping("/api/crud/banco")
public class BancoController {

    @Autowired
    private IBancoService bancoService;

     @PostMapping
    public BancoDTO insertBancoDTO(@RequestBody BancoDTO banco) {
        System.out.println("banco añadido");
        BancoDTO aux = bancoService.insertBancoDTO(banco);
        return aux;
    }

     @PutMapping("/{id_banco}")
    public BancoDTO actualizarBancoDTO(@PathVariable int id_banco, @RequestBody BancoDTO banco) {
        System.out.println("banco actualizado");
        BancoDTO aux = bancoService.actualizarBancoDTO(id_banco, banco);
        return aux;
    }

     @DeleteMapping("/{id_banco}")
    public BancoDTO actualizarBancoDTO(@PathVariable int id_banco) {
        System.out.println("banco eliminado");
        BancoDTO aux = bancoService.deleteBancoDTO(id_banco);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<BancoDTO> getAllList(){
        System.out.println("busqueda de bancoes");
        return bancoService.getAllBanco();
    }

    @GetMapping("/{id_banco}") // seleccionar uno
    public BancoDTO getByCodigo(@PathVariable int id_banco){
        System.out.println("busqueda de un solo banco");
        return bancoService.getById_banco(id_banco);
    }
}
