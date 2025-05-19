package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.DTO.BandaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.repository.BandaRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.service.IBandaService;

@Service
public class BandaServiceImpl implements IBandaService {


     @Autowired
    BandaRepository repo;
    @Override
    public BandaDTO insertBandaDTO(BandaDTO banda) {
        System.out.println("2222");
        BandaDTO aux = repo.save(banda);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public BandaDTO actualizarBandaDTO(int id_banda, BandaDTO banda) {
        banda.setId_banda(id_banda);
        BandaDTO aux = repo.save(banda);
        return aux; 
    }

    @Override
    public BandaDTO deleteBandaDTO(int id_banda) {
       repo.deleteById(id_banda);
        return null;
    }

    @Override
    public List<BandaDTO> getAllBanda() {
    List<BandaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public BandaDTO getById_banda(int id_banda) {
        return repo.findById(id_banda).get();
    }

}
