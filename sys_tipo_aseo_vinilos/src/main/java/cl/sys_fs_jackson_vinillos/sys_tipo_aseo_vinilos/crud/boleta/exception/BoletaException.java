package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.boleta.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoletaException extends RuntimeException {


    
    private static final long serialVersionUID = 1L;
    private HttpStatus httpError;
    private String codigo;
    private String detalle;
    public BoletaException(HttpStatus httpError,String codigo,String detalle) {
        super("( " + codigo +" ) " + detalle);
        this.httpError=httpError;
        this.codigo=codigo;
        this.detalle=detalle;
    }
}
