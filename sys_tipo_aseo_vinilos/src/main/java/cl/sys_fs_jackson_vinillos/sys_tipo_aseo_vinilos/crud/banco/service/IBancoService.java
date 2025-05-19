package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.DTO.BancoDTO;

public interface IBancoService {

    BancoDTO insertBancoDTO(BancoDTO banco);

    BancoDTO actualizarBancoDTO(int id_banco, BancoDTO banco);

    BancoDTO deleteBancoDTO(int id_banco);

    List<BancoDTO> getAllBanco();

    BancoDTO getById_banco(int id_banco);

}
