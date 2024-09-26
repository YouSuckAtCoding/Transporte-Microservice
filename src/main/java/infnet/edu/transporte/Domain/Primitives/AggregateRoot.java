package infnet.edu.transporte.Domain.Primitives;

public abstract class AggregateRoot extends EntityRoot{

    protected AggregateRoot(String id) {
        super(id);    
    }

    protected AggregateRoot()
    {}
}
