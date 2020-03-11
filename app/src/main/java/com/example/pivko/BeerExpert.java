package com.example.pivko;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("светлое")) {
            brands.add("Budweiser");
            brands.add("Hoegaarden");
            brands.add("Franziskaner");
            brands.add("Edelweiss");
        } else if (color.equals("темное")) {
            brands.add("БАЛТИКА 9");
            brands.add("БАЛТИКА 7");
            brands.add("БАЛТИКА 3");
            brands.add("БАЛТИКА 0");
            brands.add("Velkopopovicky Kozel");
        } else {
            brands.add("хуй знает что");
            brands.add("да чо ты выбираешь, бери водку");
        }
        return brands;
    }
}
