package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.controller;

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

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.DTO.ClienteDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.service.IClienteService;

@RestController
@RequestMapping("/api/crud/cliente")
public class ClienteController {
 @Autowired
    private IClienteService clienteService;

     @PostMapping
    public ClienteDTO insertClienteDTO(@RequestBody ClienteDTO cliente) {
        System.out.println("cliente añadido");
        ClienteDTO aux = clienteService.insertClienteDTO(cliente);
        return aux;
    }

     @PutMapping("/{rut}")
    public ClienteDTO actualizarClienteDTO(@PathVariable String rut, @RequestBody ClienteDTO cliente) {
        System.out.println("cliente actualizado");
        ClienteDTO aux = clienteService.actualizarClienteDTO(rut, cliente);
        return aux;
    }

     @DeleteMapping("/{rut}")
    public ClienteDTO actualizarClienteDTO(@PathVariable String rut) {
        System.out.println("cliente eliminado");
        ClienteDTO aux = clienteService.deleteClienteDTO(rut);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<ClienteDTO> getAllList(){
        System.out.println("busqueda de clientes");
        return clienteService.getAllCliente();
    }

    @GetMapping("/{rut}") // seleccionar uno
    public ClienteDTO getByCodigo(@PathVariable String rut){
        System.out.println("busqueda de un solo cliente");
        return clienteService.getByRut(rut);
    }
}
