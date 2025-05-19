package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.detalleBoleta.DTO;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DetalleBoletaKeyDTO implements Serializable{

    
    // Definimos solo los campos que pertenecen a la clave única
    private Integer numBoleta;
    private Integer sku;
    // Constructor sin Parmámetros dbe ser obligatorio


  

    // Configuramos el igual
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final DetalleBoletaKeyDTO aux = (DetalleBoletaKeyDTO) obj;
        if (!Objects.equals(this.numBoleta,aux.numBoleta)){          return false;        }        if (!Objects.equals(this.sku,aux.sku)){          return false;        }
        return true;
    }

    // Configuramos el hashCode
    public int hashCode() {
        int hash=7;
        hash = 59* hash +  Objects.hashCode(this.numBoleta);        hash = 59* hash +  Objects.hashCode(this.sku);
        return hash;
    }
}
