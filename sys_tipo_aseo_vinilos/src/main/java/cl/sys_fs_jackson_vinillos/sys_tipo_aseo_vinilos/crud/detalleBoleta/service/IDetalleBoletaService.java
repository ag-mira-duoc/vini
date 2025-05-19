package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.service;

import java.util.List;

import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaDTO;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO.DetalleBoletaKeyDTO;

public interface IDetalleBoletaService {

    DetalleBoletaDTO insertDetalleBoletaDTO(DetalleBoletaDTO detalleBoleta);

    DetalleBoletaDTO actualizarDetalleBoletaDTO(DetalleBoletaKeyDTO numBoleta, DetalleBoletaDTO detalleBoleta);

    DetalleBoletaDTO deleteDetalleBoletaDTO(DetalleBoletaKeyDTO numBoleta);

    List<DetalleBoletaDTO> getAllDetalleBoleta();

    DetalleBoletaDTO getByNumBoleta(DetalleBoletaKeyDTO numBoleta);

}
