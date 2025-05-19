package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.genero.DTO;

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
@Table(name="GENERO")
@JsonIgnoreProperties(ignoreUnknown=true)
public class GeneroDTO {

    
    @Id
    @Column(name = "ID_GENERO")
    private int id_genero;
    @Column(name = "NOMBRE_GENERO")
    private String nombreGenero;
}
