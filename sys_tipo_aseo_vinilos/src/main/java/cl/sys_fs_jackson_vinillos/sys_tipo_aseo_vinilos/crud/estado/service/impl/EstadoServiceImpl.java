package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.DTO.EstadoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.repository.EstadoRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.service.IEstadoService;

@Service
public class EstadoServiceImpl implements IEstadoService {


    @Autowired
    EstadoRepository repo;

    @Override
    public EstadoDTO insertEstadoDTO(EstadoDTO estado) {
      System.out.println("2222");
        EstadoDTO aux = repo.save(estado);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public EstadoDTO actualizarEstadoDTO(int id_estado, EstadoDTO estado) {
         estado.setId_estado(id_estado);
        EstadoDTO aux = repo.save(estado);
        return aux; 
    }

    @Override
    public EstadoDTO deleteEstadoDTO(int id_estado) {
      repo.deleteById(id_estado);
        return null;
    }

    @Override
    public List<EstadoDTO> getAllEstado() {
       List<EstadoDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public EstadoDTO getById_estado(int id_estado) {
         return repo.findById(id_estado).get();
    }

}
