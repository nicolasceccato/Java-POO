package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducts extends Product{
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProducts(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getName());
        stringBuilder.append(" (used) $ ");
        stringBuilder.append(this.getPrice());
        stringBuilder.append(" (Manufacture date:  ");
        stringBuilder.append(simpleDateFormat.format(this.getManufactureDate()));
        stringBuilder.append(")");
        return  stringBuilder.toString();

    }

}
