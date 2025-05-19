package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaKeyDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.repository.DetalleBoletaRepository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.service.IDetalleBoletaService;

@Service
public class DetalleBoletaServiceImpl implements IDetalleBoletaService{


      @Autowired
    DetalleBoletaRepository repo;

    @Override
    public DetalleBoletaDTO insertDetalleBoletaDTO(DetalleBoletaDTO detalleBoleta) {
        System.out.println("2222");
        DetalleBoletaDTO aux = repo.save(detalleBoleta);
        return aux; //ahora la bd maneja el arreglo 
    }

    //@Override
    //public DetalleBoletaDTO actualizarDetalleBoletaDTO(int numBoleta, DetalleBoletaDTO detalleBoleta) {
    //  detalleBoleta.setNumBoleta(numBoleta);
    //DetalleBoletaDTO aux = repo.save(detalleBoleta);
    //return aux; 
    //}

    @Override
    public DetalleBoletaDTO deleteDetalleBoletaDTO(DetalleBoletaKeyDTO numBoleta) {
    
        return null;
    }

    @Override
    public List<DetalleBoletaDTO> getAllDetalleBoleta() {
          List<DetalleBoletaDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public DetalleBoletaDTO getByNumBoleta(DetalleBoletaKeyDTO numBoleta) {
       return null;
    }

    @Override
    public DetalleBoletaDTO actualizarDetalleBoletaDTO(DetalleBoletaKeyDTO numBoleta, DetalleBoletaDTO detalleBoleta) {
       return null;
    }

    

}
