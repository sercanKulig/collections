package com.example.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {
    public static void main(String[] args) {

        //todo Serializable nedir?
        /**
         * Set<java.io.Serializable> hashSet = new LinkedHashSet<java.io.Serializable>();
         *         hashSet.add(10);
         *         hashSet.add(20);
         *         hashSet.add("non-generic durumda string de ekleyebiliriz.");
         *         System.out.println(hashSet);
         */

        /**
         * Set Collections'tan türer.
         * Listle Farkları:
         * Sıralı olarak tutmaz(Unsorted).(TreeSet harici)
         * Dublice veri tutmaz
         * Index pozisyonuna ile ulaşılamaz
         *
         * Matematikte bir kumede(set) ayni elamandan sadece birtane olabilir.
         * Benzer sekilde Java’da da Set mantiginda duplicate elamanlara izin verilmez.
          */

        /**
         * HashSet Duplicate eleman eklemeye izin vermez.
         * Eleman eklenmesi List’te oldugu gibi index based degildir. Elemanlari ekledigimiz sirada HashSet’e eklenmez.(Unordered)
         */
        Set<Integer> numbers = new HashSet<Integer>();
        //numbers.add(5);
        // Ayni int degerini 2 kere eklemeye izin vermez.
        numbers.add(5);
        numbers.add(100);
        numbers.add(25);
        numbers.add(10);
        numbers.add(500);
        numbers.add(1000);
        numbers.forEach(System.out::println);

        /**
         * Ordered bir Set veri yapisina ihtiyacimiz varsa LinkedHashSet kullanabiliriz. Ekleme sırasına göre gösterir.
         */
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

        linkedHashSet.add(5);
        // Ayni int degerini 2 kere eklemeye izin vermez.
        linkedHashSet.add(10);
        linkedHashSet.add(25);
        linkedHashSet.add(100);
        linkedHashSet.add(500);
        linkedHashSet.add(1000);
        linkedHashSet.forEach(System.out::println);

        /**
         * List orneklerimizde toArray metotu ile Set’i array/diziye donusturebiliriz.
         */

        Object[] objectArray = linkedHashSet.toArray();
        for (Object o : objectArray) {
            System.out.println(o);
        }

        /**
         *Bu ornekte 3 elemani da HashSet’e ekleyecektir.
         * Bu referans degiskenleri icin equals metodu false dondugu icin bunlarin hic biri duplicate eleman durumunda degildir.
         */
        Otobus otobus1 = new Otobus();
        Otobus otobus2 = new Otobus();
        Otobus otobus3 = new Otobus();
        Set<Otobus> otobusSet = new HashSet<Otobus>();
        otobusSet.add(otobus1);
        otobusSet.add(otobus2);
        otobusSet.add(otobus3);
        System.out.println(otobusSet.size());

        /**
         * TreeSet ordered ve sorted ozellige sahiptir.
         * TreeSet eger Generics yapida tanimlanmadiysa ilk hangi tipte eleman eklendiyse sonraki elemanlar da ayni tipte olmalidir.
         */
        Set hashSet = new LinkedHashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add("non-generic durumda string de ekleyebiliriz.");
        System.out.println(hashSet);

        Set treeSet = new TreeSet();

        treeSet.add(10);
        treeSet.add(20);
        // TreeSet e Integer elemanlar ekledikten sonra String ekleyemeyiz.
        treeSet.add("ClassCastException");
        // java.lang.ClassCastException: java.lang.Integer cannot be cast to
        // java.lang.String

        Set treeSetCar = new TreeSet();

        Otobus otobus = new Otobus();

        treeSetCar.add(otobus);
        // Otobus sinifi Comparable olmadigi icin calisma zamaninda
        // java.lang.ClassCastException hatasi verecektir.

        //Otobus sinifimiz icin java.util.Comparable arabirimini uygulanırsa, TreeSet’e Otobus tipinde elemanlar ekleyebiliriz
        //class Otobus implements Comparable

    }
}
