package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="DETALLEBOLETA")   
@JsonIgnoreProperties(ignoreUnknown=true)
public class DetalleBoletaDTO {

     @Id
    private int numBoleta;
    
    private int sku;
    //private int rutCliente;
    private int vunitario;
    private int codPromocion;
    private String desciProm;
    private int descuento;
    private int cantidad;
    private int totalLinea;
}
