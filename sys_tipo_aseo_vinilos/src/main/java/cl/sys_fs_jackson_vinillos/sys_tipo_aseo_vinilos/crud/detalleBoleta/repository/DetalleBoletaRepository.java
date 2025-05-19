package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.repository;

import org.springframework.data.repository.CrudRepository;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaKeyDTO;

public interface DetalleBoletaRepository extends CrudRepository<DetalleBoletaDTO,Integer> {

      Iterable<DetalleBoletaDTO> findByNumBoleta(DetalleBoletaKeyDTO numBoleta);

}
