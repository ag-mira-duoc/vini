package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.DTO.ProductoDTO;

public interface IProductoService {

    ProductoDTO insertProductoDTO(ProductoDTO producto);

    ProductoDTO actualizarProductoDTO(int sku, ProductoDTO producto);

    ProductoDTO deleteProductoDTO(int sku);

    List<ProductoDTO> getAllProducto();

    ProductoDTO getBySku(int sku);

}
