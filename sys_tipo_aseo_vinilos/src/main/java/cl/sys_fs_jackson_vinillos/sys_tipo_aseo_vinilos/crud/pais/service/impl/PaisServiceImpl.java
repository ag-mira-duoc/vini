package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.DTO.PaisDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.repository.PaisRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.service.IPaisService;

@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    PaisRepository repo;

    @Override
    public PaisDTO insertPaisDTO(PaisDTO pokemon) {
        System.out.println("2222");
        PaisDTO aux = repo.save(pokemon);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public PaisDTO actualizarPaisDTO(int id_pais, PaisDTO pokemon) {
         pokemon.setId_pais(id_pais);
        PaisDTO aux = repo.save(pokemon);
        return aux; 
    }

    @Override
    public PaisDTO deletePaisDTO(int id_pais) {
          repo.deleteById(id_pais);
        return null;
    }

    @Override
    public List<PaisDTO> getAllPais() {
        List<PaisDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public PaisDTO getById_pais(int id_pais) {
        return repo.findById(id_pais).get();
    }

}
