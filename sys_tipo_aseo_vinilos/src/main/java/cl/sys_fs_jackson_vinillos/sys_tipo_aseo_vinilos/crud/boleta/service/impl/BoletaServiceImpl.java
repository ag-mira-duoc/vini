package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.DTO.BoletaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.repository.BoletaRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.service.IBoletaService;

@Service
public class BoletaServiceImpl implements IBoletaService {


      @Autowired
    BoletaRepository repo;
    @Override
    public BoletaDTO insertBoletaDTO(BoletaDTO boleta) {
         System.out.println("2222");
        BoletaDTO aux = repo.save(boleta);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public BoletaDTO actualizarBoletaDTO(int numBoleta, BoletaDTO boleta) {
       boleta.setNumBoleta(numBoleta);
        BoletaDTO aux = repo.save(boleta);
        return aux; 
    }

    @Override
    public BoletaDTO deleteBoletaDTO(int numBoleta) {
        repo.deleteById(numBoleta);
        return null;
    }

    @Override
    public List<BoletaDTO> getAllBoleta() {
        List<BoletaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public BoletaDTO getByNumBoleta(int numBoleta) {
           return repo.findById(numBoleta).get();
    }

}
