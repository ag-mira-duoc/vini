package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.telefono.DTO;

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
@Table(name="TELEFONO")   
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TelefonoDTO {

    

    @Id         
    @Column(name = "NUMIDPAIS")    // Nombre Real de la columna 
    private String numIdPais; // es el numero identificador  de cada pasi como el +56
    @Column(name = "DESCRIPCION_PAIS")    // Nombre Real de la columna 
    private String descPais;
}
