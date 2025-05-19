package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.DTO.EstadoDTO;

public interface IEstadoService {

    EstadoDTO insertEstadoDTO(EstadoDTO estado);

    EstadoDTO actualizarEstadoDTO(int id_estado, EstadoDTO estado);

    EstadoDTO deleteEstadoDTO(int id_estado);

    List<EstadoDTO> getAllEstado();

    EstadoDTO getById_estado(int id_estado);

}
