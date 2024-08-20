package cac_lop_sap_xep.sudung;

import cac_lop_sap_xep.GiamDanTheoTen;
import cac_lop_sap_xep.TangDanTheoGia;
import cac_lop_sap_xep.TangDanTheoTen;
import product.entity.Product;

import java.util.Arrays;
import java.util.Date;

public class SuDungCacLopSapXep {
    public static void main(String[] args) {
        Product[] ds = new Product[3];

        ds[0] = new Product("p01","Tivi","Toshiba",2022,new Date(), 5000);
        ds[1] = new Product("p02","Tu lanh","Sanyo",2023,new Date(), 4000);
        ds[2] = new Product("p03","May tinh","Dell",2021,new Date(), 3000);

        System.out.println("DS sap xep tang dan theo ten: ");
        Arrays.sort(ds,new TangDanTheoTen());
        for(Product p: ds){
            System.out.println(p);
        }

        System.out.println("\nDS sap xep giam dan theo ten: ");
        Arrays.sort(ds,new GiamDanTheoTen());
        for(Product p: ds){
            System.out.println(p);
        }

        System.out.println("\nDS sap xep tang dan theo gia: ");
        Arrays.sort(ds,new TangDanTheoGia());
        for(Product p: ds){
            System.out.println(p);
        }
    }
}
