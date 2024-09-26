package infnet.edu.transporte.Domain.Commands;

import java.time.LocalDate;

import infnet.edu.transporte.Domain.Primitives.Command;

public class CreateEnvioCommand extends Command<String> {

    public String destinatario;
    public String produtoId;
    public String nomeProduto;
    public String transportadora;
    public int quantidade;
    public LocalDate data_entrega;
    public LocalDate data_saida;
    public String pedidoId;
    
    public CreateEnvioCommand(String id, String destinatario, String produtoId, String nomeProduto,
            String transportadora, int quantidade, LocalDate data_entrega, LocalDate data_saida,  String pedidoId) {
        super(id);
        this.destinatario = destinatario;
        this.produtoId = produtoId;
        this.nomeProduto = nomeProduto;
        this.transportadora = transportadora;
        this.quantidade = quantidade;
        this.data_entrega = data_entrega;
        this.data_saida = data_saida;
        this.pedidoId = pedidoId;
    }

}
