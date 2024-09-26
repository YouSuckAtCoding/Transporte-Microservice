package infnet.edu.transporte.Handler;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import infnet.edu.transporte.Domain.Models.Envio;
import infnet.edu.transporte.Domain.Primitives.Event;
import infnet.edu.transporte.Events.Pedido_Transporte;
import infnet.edu.transporte.Infrastructure.EnvioRepository;

public class Pedido_TransporteEventHandler {
 
    @Autowired
    private EnvioRepository _repository;

    @Autowired
    @Qualifier("envioAggregateEventSourcingRepository")
    private EventSourcingRepository<Envio> envioEventSourcingRepository;

    @EventHandler
    void on(Pedido_Transporte event) {
        TratarRequisicao(event);
    }
    //Meramente ilustrativo, apenas para simbolizar onde seriam tratados os eventos.
    private Envio TratarRequisicao(Event event) {

        var agregado = envioEventSourcingRepository.load(event.id.toString()).getWrappedAggregate().getAggregateRoot();
        agregado.processar();
        _repository.save(agregado);
        return new Envio();
    }
}
