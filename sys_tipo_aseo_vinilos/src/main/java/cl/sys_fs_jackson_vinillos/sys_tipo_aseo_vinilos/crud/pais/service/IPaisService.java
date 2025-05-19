package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.DTO.PaisDTO;

public interface IPaisService {

    PaisDTO insertPaisDTO(PaisDTO pokemon);

    PaisDTO actualizarPaisDTO(int id_pais, PaisDTO pokemon);

    PaisDTO deletePaisDTO(int id_pais);

    List<PaisDTO> getAllPais();

    PaisDTO getById_pais(int id_pais);

}
