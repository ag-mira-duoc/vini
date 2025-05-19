package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.DTO;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="BOLETA")  
@JsonIgnoreProperties(ignoreUnknown=true)



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BoletaDTO {

     @Id
    @Column(name = "NUM_BOLETA")   
    private Integer numBoleta;
    @Column(name = "NUM_CLIENTE")
    private String numCliente;
    @Column(name = "NUM_EMPLEADO")
    private int numEmpleado;
    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "TOTAL") 
    private int total;
    @Column(name = "COD_PAGO")
    private int codPago;
}
