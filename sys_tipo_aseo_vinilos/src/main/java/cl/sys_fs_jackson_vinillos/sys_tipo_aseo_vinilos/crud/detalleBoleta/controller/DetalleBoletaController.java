package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaKeyDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.service.IDetalleBoletaService;

public class DetalleBoletaController {

    @Autowired
    private IDetalleBoletaService detalleBoletaService;

     @PostMapping
    public DetalleBoletaDTO insertDetalleBoletaDTO(@RequestBody DetalleBoletaDTO detalleBoleta) {
        System.out.println("detalleBoleta añadido");
        DetalleBoletaDTO aux = detalleBoletaService.insertDetalleBoletaDTO(detalleBoleta);
        return aux;
    }

     @PutMapping("/{numBoleta}")
    public DetalleBoletaDTO actualizarDetalleBoletaDTO(@PathVariable DetalleBoletaKeyDTO numBoleta, @RequestBody DetalleBoletaDTO detalleBoleta) {
        System.out.println("detalleBoleta actualizado");
        DetalleBoletaDTO aux = detalleBoletaService.actualizarDetalleBoletaDTO(numBoleta, detalleBoleta);
        return aux;
    }

     @DeleteMapping("/{numBoleta}")
    public DetalleBoletaDTO actualizarDetalleBoletaDTO(@PathVariable DetalleBoletaKeyDTO numBoleta) {
        System.out.println("detalleBoleta eliminado");
        DetalleBoletaDTO aux = detalleBoletaService.deleteDetalleBoletaDTO(numBoleta);
        return aux;
    }

    @GetMapping //seleccionar todo
    public List<DetalleBoletaDTO> getAllList(){
        System.out.println("busqueda de detalleBoletaes");
        return detalleBoletaService.getAllDetalleBoleta();
    }

    @GetMapping("/{numBoleta}") // seleccionar uno
    public DetalleBoletaDTO getByCodigo(@PathVariable DetalleBoletaKeyDTO numBoleta){
        System.out.println("busqueda de un solo detalleBoleta");
        return detalleBoletaService.getByNumBoleta(numBoleta);
    }

}
