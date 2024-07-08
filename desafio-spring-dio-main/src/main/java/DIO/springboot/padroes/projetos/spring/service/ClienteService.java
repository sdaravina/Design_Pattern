package DIO.springboot.padroes.projetos.spring.service;

import DIO.springboot.padroes.projetos.spring.model.Cliente;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.UUID;
@SuppressWarnings("unused")
@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
