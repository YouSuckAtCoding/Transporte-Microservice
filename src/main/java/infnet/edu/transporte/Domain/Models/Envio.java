package infnet.edu.transporte.Domain.Models;

import java.time.LocalDate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateLifecycle;

import infnet.edu.transporte.Domain.Commands.CreateEnvioCommand;
import infnet.edu.transporte.Domain.Primitives.EntityRoot;
import infnet.edu.transporte.Events.Pedido_Transporte;
import jakarta.persistence.Entity;

@Entity
public class Envio extends EntityRoot{

    public String pedidoId;
    public String destinatario;
    public String produtoId;
    public String nomeProduto;
    public String transportadora;
    public int quantidade;
    public LocalDate data_entrega;
    public LocalDate data_saida;

    public Envio()
    {}

    public Envio(String pedidoId, String destinatario, String produtoId, String nomeProduto, String transportadora, int quantidade,
            LocalDate data_entrega, LocalDate data_saida) {
                this.pedidoId = pedidoId;
        this.destinatario = destinatario;
        this.produtoId = produtoId;
        this.nomeProduto = nomeProduto;
        this.transportadora = transportadora;
        this.quantidade = quantidade;
        this.data_entrega = data_entrega;
        this.data_saida = data_saida;
    }
    public Envio(String id, String pedidoId, String destinatario, String produtoId, String nomeProduto, String transportadora,
            int quantidade, LocalDate data_entrega, LocalDate data_saida) {
        super(id);
        this.pedidoId = pedidoId;
        this.destinatario = destinatario;
        this.produtoId = produtoId;
        this.nomeProduto = nomeProduto;
        this.transportadora = transportadora;
        this.quantidade = quantidade;
        this.data_entrega = data_entrega;
        this.data_saida = data_saida;
    }

    
    @CommandHandler
    public Envio(CreateEnvioCommand command)
    {
        AggregateLifecycle.apply(
            new Pedido_Transporte(command.id, command.pedidoId, command.produtoId, command.data_saida, command.transportadora)
        );
    }

    @EventSourcingHandler
    protected void on(Pedido_Transporte event)
    {
        this.produtoId = event.produtoId;
        this.transportadora = event.transportadora;
        this.data_saida = event.dataSaida;
    }


    public void processar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processar'");
    }
    
}
