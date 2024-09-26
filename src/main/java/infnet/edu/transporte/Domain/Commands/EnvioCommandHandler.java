package infnet.edu.transporte.Domain.Commands;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.transporte.Contracts.Pedido_TransporteEventRecieved;
import infnet.edu.transporte.Events.Pedido_Transporte;

@Service
public class EnvioCommandHandler implements IEnvioCommandHandler {
    
    @Autowired
    private CommandGateway _gateway;

    @Override
    public CompletableFuture<String> CreateEnvioEvent(Pedido_TransporteEventRecieved request) {
        return _gateway.send(new Pedido_Transporte(
                UUID.randomUUID().toString(),
                request.pedidoId,
                request.produtoId,
                request.dataSaida,
                request.transportadora));
    }
}
