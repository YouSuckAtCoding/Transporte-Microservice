package infnet.edu.transporte.Domain.ValueObjects;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import infnet.edu.transporte.Domain.Errors.DataEntregaDomainErrors;
import infnet.edu.transporte.Domain.Primitives.ValueObject;
import infnet.edu.transporte.Domain.Shared.Result;

public class DataEntrega extends ValueObject{

 public LocalDate value;

    private DataEntrega(LocalDate value)
    {
        this.value = value;
    }

    public static Result<DataEntrega> Create(LocalDate value, LocalDate data_inicial) throws Exception
    {
        if(Duration.between(value, data_inicial).toDays() > 10)
        {
            return Result.<DataEntrega>Failure(DataEntregaDomainErrors.TooLong());
        }
        
        return Result.<DataEntrega>Success(new DataEntrega(value)); 
    }


    @Override
    public List<Object> getAtomicValues() {
       return List.of(value);
    }

}
