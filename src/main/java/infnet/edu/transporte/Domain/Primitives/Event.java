package infnet.edu.transporte.Domain.Primitives;

import java.time.Instant;

public class Event<T> {
    public T id = null;
    public Instant created = Instant.now();

    public Event(T id) {
        this.id = id;
    }
}
