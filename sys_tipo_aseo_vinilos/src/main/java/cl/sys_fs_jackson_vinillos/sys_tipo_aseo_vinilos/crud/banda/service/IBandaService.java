package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.DTO.BandaDTO;

public interface IBandaService {

    BandaDTO insertBandaDTO(BandaDTO banda);

    BandaDTO actualizarBandaDTO(int id_banda, BandaDTO banda);

    BandaDTO deleteBandaDTO(int id_banda);

    List<BandaDTO> getAllBanda();

    BandaDTO getById_banda(int id_banda);

}
