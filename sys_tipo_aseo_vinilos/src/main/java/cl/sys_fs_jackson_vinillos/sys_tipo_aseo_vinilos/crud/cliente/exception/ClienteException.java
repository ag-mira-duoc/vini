package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter   // Crea un Constructor con todos los parámetros
@Setter 
public class ClienteException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private HttpStatus httpError;
    private String codigo;
    private String detalle;
    public ClienteException(HttpStatus httpError,String codigo,String detalle) {
        super("( " + codigo +" ) " + detalle);
        this.httpError=httpError;
        this.codigo=codigo;
        this.detalle=detalle;
    }
}
