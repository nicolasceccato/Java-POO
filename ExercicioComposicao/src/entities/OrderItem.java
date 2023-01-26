package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    public Double subtotal(){
        return  quantity*price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Product getProduct() {
        return product;
    }


    public String toString(){

        return getProduct().getName() + ", " + getProduct().getPrice() + " Quantidade: " + getQuantity() + " Subtotal: $" + String.format("%.2f", subtotal()) + "\n";
    }
}
