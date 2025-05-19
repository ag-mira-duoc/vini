package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.DTO;

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
@Table(name="CLIENTE")   
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    

    @Id         
    @Column(name = "RUT")
    private String rut;
    @Column(name = "NOMBRE")    // Nombre Real de la columna 
    private String nombre;
    @Column(name = "DIRECCION")    // Nombre Real de la columna 
    private String direccion;
    @Column(name = "TELEFONO")    // Nombre Real de la columna 
    private String telefono;
    @Column(name = "MAIL")    // Nombre Real de la columna 
    private String mail;
    @Column(name = "CREDITO")    // Nombre Real de la columna 
    private Integer credito;
    @Column(name = "SALDO")    // Nombre Real de la columna 
    private Integer saldo;


}
