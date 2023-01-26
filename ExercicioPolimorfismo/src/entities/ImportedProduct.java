package entities;

import java.text.SimpleDateFormat;

public class ImportedProduct extends Product{
    SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return this.getName() + " $ " + String.format("%.2f", this.getPrice()+this.getCustomsFee()) + " (Taxas de importação: $ "+ String.format("%.2f", this.getCustomsFee()) + ")";
    }


}
