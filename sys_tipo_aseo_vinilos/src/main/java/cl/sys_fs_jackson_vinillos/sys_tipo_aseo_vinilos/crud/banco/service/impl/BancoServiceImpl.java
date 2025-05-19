package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.DTO.BancoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.repository.BancoRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.service.IBancoService;


@Service
public class BancoServiceImpl implements IBancoService {


       @Autowired
       
    BancoRepository repo;
    @Override
    public BancoDTO insertBancoDTO(BancoDTO banco) {
          System.out.println("2222");
        BancoDTO aux = repo.save(banco);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public BancoDTO actualizarBancoDTO(int id_banco, BancoDTO banco) {
        banco.setId_banco(id_banco);
        BancoDTO aux = repo.save(banco);
        return aux; 
    }

    @Override
    public BancoDTO deleteBancoDTO(int id_banco) {
       repo.deleteById(id_banco);
        return null;
    }

    @Override
    public List<BancoDTO> getAllBanco() {
         List<BancoDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public BancoDTO getById_banco(int id_banco) {
       return repo.findById(id_banco).get();
    }

}
