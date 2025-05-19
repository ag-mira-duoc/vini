package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.repository;

import org.springframework.data.repository.CrudRepository;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.DTO.ProductoDTO;

public interface ProductoRepository extends CrudRepository<ProductoDTO,Integer> {

}
