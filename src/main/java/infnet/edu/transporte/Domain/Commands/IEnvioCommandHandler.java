package infnet.edu.transporte.Domain.Commands;

import java.util.concurrent.CompletableFuture;

import infnet.edu.transporte.Contracts.Pedido_TransporteEventRecieved;

public interface IEnvioCommandHandler {

    CompletableFuture<String> CreateEnvioEvent(Pedido_TransporteEventRecieved request);

}