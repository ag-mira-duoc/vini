package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.estado.DTO;

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
@Table(name="ESTADO")
@JsonIgnoreProperties(ignoreUnknown=true)

public class EstadoDTO {

        @Id
    @Column(name = "ID_ESTADO")
    private int id_estado;
    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;
}
