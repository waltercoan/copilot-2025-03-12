package br.com.kasolution.spring_copilot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.kasolution.spring_copilot.entities.Cliente;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNomeContaining(String nome);
}