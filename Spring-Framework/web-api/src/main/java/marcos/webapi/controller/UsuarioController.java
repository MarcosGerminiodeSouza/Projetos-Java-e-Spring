package marcos.webapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import marcos.webapi.model.Usuario;
import marcos.webapi.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/usuarios")
    public List<Usuario>getUsuarios() {
        return repository.findAll();
    }
}
