package product.entity;

import java.util.Comparator;
import java.util.Date;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private String producer;
    private int yearMaking;
    private Date expireDate;
    private double price;

    public Product() {
    }

    public Product(String id, String name, String producer, int yearMaking, Date expireDate, double price) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.expireDate = expireDate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
//        return name.compareTo(o.getName());  //tang dan theo ten
        return o.getName().compareTo(name); //giam dan theo ten
//        return (int) (price-o.getPrice());  //tang dan theo gia
//        return (int) (o.getPrice()-price); //giam dan theo gia
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", yearMaking=" + yearMaking +
                ", expireDate=" + expireDate +
                ", price=" + price +
                '}';
    }
}
