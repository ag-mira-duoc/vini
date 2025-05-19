package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.DTO.TelefonoDTO;

public interface ITelefonoService {

    TelefonoDTO insertTelefonoDTO(TelefonoDTO telefono);

    TelefonoDTO actualizarTelefonoDTO(String numIdPais, TelefonoDTO telefono);

    TelefonoDTO deleteTelefonoDTO(String numIdPais);

    List<TelefonoDTO> getAllTelefono();

    TelefonoDTO getByNumIdPais(String numIdPais);

}
