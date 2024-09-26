package infnet.edu.transporte.Events;

import java.time.LocalDate;

import infnet.edu.transporte.Domain.Primitives.Event;

public class Pedido_Transporte extends Event<String>{


    public String pedidoId;
    public String produtoId;
    public LocalDate dataSaida;
    public String transportadora;

    public Pedido_Transporte(String id, String pedidoId, String produtoId, LocalDate dataSaida,
            String transportadora) {
        super(id);
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.dataSaida = dataSaida;
        this.transportadora = transportadora;
    } 
    
}
