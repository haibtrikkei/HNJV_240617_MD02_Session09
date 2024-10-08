package cac_lop_sap_xep;

import product.entity.Product;

import java.util.Comparator;

public class GiamDanTheoGia implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()-o1.getPrice());
    }
}
