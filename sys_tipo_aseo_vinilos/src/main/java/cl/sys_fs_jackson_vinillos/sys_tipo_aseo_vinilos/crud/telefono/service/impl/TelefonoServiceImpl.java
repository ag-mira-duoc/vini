package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.DTO.TelefonoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.repository.TelefonoRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.service.ITelefonoService;

@Service
public class TelefonoServiceImpl implements ITelefonoService {

      @Autowired
    TelefonoRepository repo;

    @Override
    public TelefonoDTO insertTelefonoDTO(TelefonoDTO telefono) {
        System.out.println("2222");
        TelefonoDTO aux = repo.save(telefono);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public TelefonoDTO actualizarTelefonoDTO(String numIdPais, TelefonoDTO telefono) {
       telefono.setNumIdPais(numIdPais);
        TelefonoDTO aux = repo.save(telefono);
        return aux; 
    }

    @Override
    public TelefonoDTO deleteTelefonoDTO(String numIdPais) {
       repo.deleteById(numIdPais);
        return null;
    }

    @Override
    public List<TelefonoDTO> getAllTelefono() {
         List<TelefonoDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public TelefonoDTO getByNumIdPais(String numIdPais) {
         return repo.findById(numIdPais).get();
    }

}
