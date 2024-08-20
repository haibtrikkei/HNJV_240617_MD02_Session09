package cac_lop_sap_xep;

import product.entity.Product;

import java.util.Comparator;

public class GiamDanTheoTen implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
