package marcos.webapi.repository;

import marcos.webapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");            
        }else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um"));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario());
        usuarios.add(new Usuario());
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um"));
        return new Usuario();
    }
    public Usuario findByUsuarionome(String usuarionome) {
        System.out.println(String.format("FIND/username - Recebendo o username id: %d para "));
        return new Usuario();
    }
}
