package demo_sapxep;

import product.entity.Product;

import java.util.Arrays;
import java.util.Date;

public class GiamDanTheoGia {
    public static void main(String[] args) {
        Product[] ds = new Product[3];

        ds[0] = new Product("p01","Tivi","Toshiba",2022,new Date(), 5000);
        ds[1] = new Product("p02","Tu lanh","Sanyo",2023,new Date(), 4000);
        ds[2] = new Product("p03","May tinh","Dell",2021,new Date(), 3000);

        Arrays.sort(ds);

        System.out.println("Danh sach giam dan theo gia: ");
        for(Product p: ds){
            System.out.println(p);
        }
    }
}
