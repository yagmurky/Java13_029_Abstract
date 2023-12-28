package com.yagmur;

import com.yagmur.entity.Hizmetli;
import com.yagmur.entity.Mudur;
import com.yagmur.entity.Personel;

public class Runner {
    public static void main(String[] args) {

        Hizmetli hizmetli=new Hizmetli();
        Mudur mudur=new Mudur();
        /**
         * abstract classlar newlenerek nesne üretemezler.
         * interfaceler de newlenemez.
         */
        System.out.println(mudur.maasHesapla("müdür"));
    }
}