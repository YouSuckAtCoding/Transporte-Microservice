package infnet.edu.transporte.Infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import infnet.edu.transporte.Domain.Models.Envio;

public interface EnvioRepository extends JpaRepository<Envio, String>{
    
}
