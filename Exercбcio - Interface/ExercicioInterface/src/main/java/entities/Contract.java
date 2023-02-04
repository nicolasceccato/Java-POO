package entities;

import java.sql.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;

    private List<Installment> installments;
}
