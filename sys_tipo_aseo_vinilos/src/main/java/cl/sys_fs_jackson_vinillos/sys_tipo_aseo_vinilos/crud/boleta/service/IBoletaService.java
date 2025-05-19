package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.DTO.BoletaDTO;

public interface IBoletaService {

    BoletaDTO insertBoletaDTO(BoletaDTO boleta);

    BoletaDTO actualizarBoletaDTO(int numBoleta, BoletaDTO boleta);

    BoletaDTO deleteBoletaDTO(int numBoleta);

    List<BoletaDTO> getAllBoleta();

    BoletaDTO getByNumBoleta(int numBoleta);

}
