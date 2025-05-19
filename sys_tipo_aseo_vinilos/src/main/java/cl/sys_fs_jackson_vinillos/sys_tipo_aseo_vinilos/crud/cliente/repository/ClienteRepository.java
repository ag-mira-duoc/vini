package cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.repository;
import cl.sys_fs_jackson_vinillos.sys_tipo_aseo_vinilos.crud.cliente.DTO.ClienteDTO;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository  extends CrudRepository<ClienteDTO, String>{

}
