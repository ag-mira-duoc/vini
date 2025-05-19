package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.DTO.GeneroDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.repository.GeneroRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.service.IGeneroService;

@Service
public class GeneroServiceImpl implements IGeneroService {


      @Autowired
    GeneroRepository repo;
    @Override
    public GeneroDTO insertGeneroDTO(GeneroDTO genero) {
         System.out.println("2222");
        GeneroDTO aux = repo.save(genero);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public GeneroDTO actualizarGeneroDTO(int id_genero, GeneroDTO genero) {
        genero.setId_genero (id_genero);
        GeneroDTO aux = repo.save(genero);
        return aux; 
    }
    

    @Override
    public GeneroDTO deleteGeneroDTO(int id_genero) {
       repo.deleteById(id_genero);
        return null;
    }

    @Override
    public List<GeneroDTO> getAllGenero() {
        List<GeneroDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public GeneroDTO getById_genero(int id_genero) {
         return repo.findById(id_genero).get();
    }

}
