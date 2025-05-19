package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.DTO.ProductoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.service.IProductoService;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.repository.ProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    ProductoRepository repo;

    @Override
    public ProductoDTO insertProductoDTO(ProductoDTO producto) {
  
        System.out.println("2222");
        ProductoDTO aux = repo.save(producto);
        return aux; //ahora la bd maneja el arreglo 
    }

    @Override
    public ProductoDTO actualizarProductoDTO(int sku, ProductoDTO producto) {
   
        producto.setSku(sku);
        ProductoDTO aux = repo.save(producto);
        return aux; 
    }

    @Override
    public ProductoDTO deleteProductoDTO(int sku) {
       repo.deleteById(sku);
        return null;
    }

    @Override
    public List<ProductoDTO> getAllProducto() {
        List<ProductoDTO> aux = new ArrayList<>();
        repo.findAll().forEach(aux::add);
        return aux;
    }

    @Override
    public ProductoDTO getBySku(int sku) {
        return repo.findById(sku).get();
    }

}
