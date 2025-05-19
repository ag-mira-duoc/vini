package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banco.DTO;



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
@Table(name="BANCO")   
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BancoDTO {

     @Id         
    @Column(name = "ID_BANCO")    // Nombre Real de la columna 
    private int id_banco;
    @Column(name = "NOMBRE_BANCO")    // Nombre Real de la columna 
    private String nombreBanco;

}
