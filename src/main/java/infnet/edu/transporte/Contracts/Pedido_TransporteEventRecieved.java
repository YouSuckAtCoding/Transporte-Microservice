package infnet.edu.transporte.Contracts;

import java.time.LocalDate;

public class Pedido_TransporteEventRecieved {

    public String pedidoId;
    public String produtoId;
    public LocalDate dataSaida;
    public String transportadora;
    public String usuario;
    public Pedido_TransporteEventRecieved(String pedidoId, String produtoId, LocalDate dataSaida, String transportadora,
            String usuario) {
        this.pedidoId = pedidoId;
        this.produtoId = produtoId;
        this.dataSaida = dataSaida;
        this.transportadora = transportadora;
        this.usuario = usuario;
    }
}
