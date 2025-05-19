package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.producto.DTO;

import java.sql.Date;

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
@Table(name="PRODUCTO")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProductoDTO {

     @Id
   private int sku;
   private String nombreDisco;
   private String descripcion;
   private Date fechaLanzamiento;
   private int vunitario;
   private int stock;
   private int precio;
}

