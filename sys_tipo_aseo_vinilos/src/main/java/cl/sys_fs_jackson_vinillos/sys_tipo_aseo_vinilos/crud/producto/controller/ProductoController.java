package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.DTO.ProductoDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.service.IProductoService;

@RestController
@RequestMapping("/api/crud/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;


       @PostMapping
    public ProductoDTO insertProductoDTO(@RequestBody ProductoDTO producto) {
        System.out.println("producto añadido");
        ProductoDTO aux = productoService.insertProductoDTO(producto);
        return aux;
    }

     @PutMapping("/{sku}")
    public ProductoDTO actualizarProductoDTO(@PathVariable int sku, @RequestBody ProductoDTO producto) {
        System.out.println("producto actualizado");
        ProductoDTO aux = productoService.actualizarProductoDTO(sku, producto);
        return aux;
    }

     @DeleteMapping("/{sku}")
    public ProductoDTO actualizarProductoDTO(@PathVariable int sku) {
        System.out.println("pokemon eliminado");
        ProductoDTO aux = productoService.deleteProductoDTO(sku);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<ProductoDTO> getAllList(){
        System.out.println("busqueda de vinilos");
        return productoService.getAllProducto();
    }

    @GetMapping("/{sku}") // seleccionar uno
    public ProductoDTO getByCodigo(@PathVariable int sku){
        System.out.println("busqueda de un solo pokemon");
        return productoService.getBySku(sku);
    }


}
