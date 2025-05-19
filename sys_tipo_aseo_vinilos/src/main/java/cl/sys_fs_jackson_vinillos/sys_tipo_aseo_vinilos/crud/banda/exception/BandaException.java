package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.banda.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter   // Crea un Constructor con todos los parámetros
@Setter 
public class BandaException extends RuntimeException {


    private static final long serialVersionUID = 1L;
    private HttpStatus httpError;
    private String codigo;
    private String detalle;
    public BandaException(HttpStatus httpError,String codigo,String detalle) {
        super("( " + codigo +" ) " + detalle);
        this.httpError=httpError;
        this.codigo=codigo;
        this.detalle=detalle;
    }
}
