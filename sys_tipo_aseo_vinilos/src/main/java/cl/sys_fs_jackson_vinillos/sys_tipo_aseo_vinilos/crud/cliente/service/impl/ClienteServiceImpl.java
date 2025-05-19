package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.DTO.ClienteDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.repository.ClienteRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

 @Autowired
    ClienteRepository repo;


    @Override
    public List<ClienteDTO> getAllCliente() {
   
        List<ClienteDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public ClienteDTO getByRut(String rut) {
         return repo.findById(rut).get();
    }

    @Override
    public ClienteDTO deleteClienteDTO(String rut) {
       repo.deleteById(rut);
        return null;
    }

    @Override
    public ClienteDTO actualizarClienteDTO(String rut, ClienteDTO cliente) {
        cliente.setRut(rut);
        ClienteDTO aux = repo.save(cliente);
        return aux; 
    }

    @Override
    public ClienteDTO insertClienteDTO(ClienteDTO cliente) {
       System.out.println("2222");
        ClienteDTO aux = repo.save(cliente);
        return aux; //ahora la bd maneja el arreglo
    }

}
