package com.yagmur.entity;

public abstract class Personel {

    public Long id;
    public String ad;
    public double maas;
    public String unvan;

    Object ozlukDetay() {
        return null;
    }

    public void save(Object o){

   }

   public abstract void lol();

    /**
     * Personellerin kadrolarına göre maaşları hesaplanır.
     * Unvan listesi;
     * 1-Hizmetli
     * 2-Büro Çalışanı
     * 3-Kıdemli personel
     * 4-Mühendis
     * 5-Mutemet
     * 6-Müdür
     * 7-Genel müdür
     * 8-CEO
     * @param unvan
     * @return
     */
    public int maasHesapla(String unvan){

       switch (unvan){
           case "hizmetli": return 25000;
           case "müdür": return 30000;
           case "mühendis": return 40000;
           case "ceo": return 50000;
           default:return 20000;
       }
    }

}
