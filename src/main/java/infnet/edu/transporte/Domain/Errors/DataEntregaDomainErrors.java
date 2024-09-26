package infnet.edu.transporte.Domain.Errors;

import infnet.edu.transporte.Domain.Shared.Error;


public class DataEntregaDomainErrors {

    public static final Error TooLong (){
        
        return new Error("DataEntrega.TooLong", "Date is too far off the inital value");
    } 

}
