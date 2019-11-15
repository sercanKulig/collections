package com.example.collection;

import java.util.*;

public class MapCollections {
    public static void main(String[] args) {


        /**
         * Map yapisinda , key unique/essiz/tek olmalidir , duplicate izin verilmez.
         * Ayni key’e sahip eleman eklendiginde eski elemani override eder.
         * Key farkli olduktan sonra value duplicate olabilir.
         */
        /**
         * HashMap sınıfına, karışık eşleme de denilebilir.
         * Verileri anahtar - değer mantığına göre saklamaktadır.
         * Eşleme tablosuna eleman ekleme, çıkartma işlemlerinde ve anahtarı verilen elemanı tabloda bulma işlemlerinde oldukça etkilidir.
         * [k,v][k,v][k,v].....
         */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"bir");
        hashMap.put(2,"iki");
        hashMap.put(3,"üç");
        System.out.println(Collections.singletonList(hashMap));
        /**
         * HashMap null key degerine ve null value degerlere sahip olabilir.
         * Hashtable ise null key veya null degerlere sahip olamaz.
         */
        hashMap.put(null, null);

        Map<String, Integer> hashtable = new Hashtable<>();
        //hashtable.put(null, null);
        // hata verecektir.
        System.out.println(Collections.singletonList(hashtable));

        /**
         * Sıralı eşleme denilebilir. HashMap Sınıfından türemiştir.
         * Bu sınıf elemanları sıralı olarak tutar.
         * Bu sıralama ekleme sırası ya da erişim sırasına göre olabilir.
         * HashMap'ten türetilip Map'le order verildiğinden HashMap'e göre daha yavaştır.
         * [k,v]->[k,v]->[k,v]
         */
        Map<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("key1", "value1");
        linkedMap.put("key2", "value2");
        linkedMap.put("key3", "value3");
        linkedMap.put("key4", "value4");
        System.out.println(Collections.singletonList(linkedMap));

        /**
         * Natural order’a gore key’e gore siralama yapar. String key’ekledikten sonra , Integer tipte bir key eklenemez.
         * Bu durumda String ile Integer arasinda siralama yapamayacaktir.Ilk hangi tip eklersek o tipte key’leri eklemeye devam edecektir.
         * Eger kendi olusturdugumuz bir sinifi TreeMap’te key olarak kullanmak istersek bu durumda Comparable arabirimini uygulamalidir.
         */
        Map<String,String> treeMap = new TreeMap<>();

        treeMap.put("key1", "value1");
        treeMap.put("key5", "value5");
        treeMap.put("key2", "value2");
        treeMap.put("key3", "value3");
        System.out.println(Collections.singletonList(treeMap));

        //class Otobus implements Comparable
    }
}
