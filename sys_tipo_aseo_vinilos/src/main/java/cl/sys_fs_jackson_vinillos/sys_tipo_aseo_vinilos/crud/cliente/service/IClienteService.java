package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.DTO.ClienteDTO;

public interface IClienteService {

    List<ClienteDTO> getAllCliente();

    ClienteDTO getByRut(String rut);

    ClienteDTO deleteClienteDTO(String rut);

    ClienteDTO actualizarClienteDTO(String rut, ClienteDTO cliente);

    ClienteDTO insertClienteDTO(ClienteDTO cliente);

}
