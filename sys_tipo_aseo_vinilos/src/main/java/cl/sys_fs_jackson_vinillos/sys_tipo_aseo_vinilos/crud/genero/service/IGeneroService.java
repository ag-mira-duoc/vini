package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.DTO.GeneroDTO;

public interface IGeneroService {

    GeneroDTO insertGeneroDTO(GeneroDTO genero);

    GeneroDTO actualizarGeneroDTO(int id_genero, GeneroDTO genero);

    GeneroDTO deleteGeneroDTO(int id_genero);

    List<GeneroDTO> getAllGenero();

    GeneroDTO getById_genero(int id_genero);

}
