package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.pais.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
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
@Table(name="PAIS")
@JsonIgnoreProperties(ignoreUnknown=true)
public class PaisDTO {

     @Id
    @Column(name = "ID_PAIS")
    private int id_pais;
    @Column(name = "NOMBRE_PAIS")
    private String nombrePais;
}
