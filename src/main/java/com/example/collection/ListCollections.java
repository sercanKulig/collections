package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListCollections {
    public static void main(String[] args) {

        /**
         * Bu arabirim sayesinde koleksiyonumuzda tekrarlanan ya da tekrarlanmayan elemanları sıralı olarak tutabiliriz.
         * Aynı zamanda elemanlara indeks yoluyla erişebiliriz.
         * Listler index base ordered'dır, sıralıdır.
         */

        /**
         *  ArrayList
         *  Bu sınıf elemanlarını boyutu değişen dinamik dizilerde tutmaktadır.
         *  Dinamik olarak genişletilebilir array gibi düşünülebilir.
         *  Yani bu sınıfa ait dizilerin boyutları azaltılabilir ya da arttırılabilir.
         *  Bir başka ifade ile bir dizinin boyutunu değiştiğinde ilk dizideki elemanlar yeni diziye kopyalanır.
         *  ArrayList arrayi kendi içerisinde yönetir.
         *  Array belirtilen sayıda eleman tutar ve primitive sışında eleman tutamaz, Arraylistler bunu yapabilir.
         *  [0][1][2][3][4][5].......
         * */
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.forEach(System.out::println);

        /**
         * LinkedList
         * Bağlı listeler, Bu sınıf C dilindeki bağlı listelerin javadaki görüntüsüdür.
         * Bu tip listelerde elemanlar kendisinden sonra gelen elemanlanın bilgilerini ya da adreslerini tutarlar.
         * Bu sınıf herhangi bir listeye eleman ekleme konusunda ArrayList sınıfından daha etkilidir.
         * linkedlist Arraylistten daha yavaştır.
         * [0]->[1]->[2].....
         *   <-   <-
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a1");
        linkedList.add("b2");
        linkedList.add("c3");
        linkedList.addLast("e4");
        linkedList.addFirst("d5");
        linkedList.forEach(System.out::println);

        /**
         * Collections Sort
         * Dizinin elemanlari sayi ise kucukten buyuge siralama yapacaktir.
         * Dizinin elemanlari String ise unicode degerine gore siralama yapacaktir.
         * Tabi bizim icin faydali olacak konu sozluk mantiginda harf/kelime siralamasi yapacagidir.
         * Burada dikkat etmemiz gereken nokta buyuk harflerin unicode degerleri kucuk harflerin unicode degerlerinden daha kucuktur.
         */

        Collections.sort(linkedList);
        linkedList.forEach(System.out::println);

        /**
         * Search - binarySearch
         * binarySearch metodu ile search/arama yapabiliriz.
         * binarySearch metodunun dogru calisabilmesi icin oncelikle Collections.sort metodu ile sort islemi yapilmalidir.
         * binarySearch işlemi index döner.
         */

        System.out.println(Collections.binarySearch(linkedList,"b2"));


        /**
         * Vector
         * Vector sinifi Java’nin 1.2 versiyonundan itibaren vardir.
         * Vector temel olarak ArrayList’e benzemektedir fakat Vector’un metotlari thread-safe yani synchronized ‘dir.
         * Vector sinifi yerine ArrayList tercih edilmektedir.
         * Thread safe yapisi gerektigi durumda java.util.Collections sinifinda yer alan metotlar yardimi ile yapilmaktadir.
         */
    }
}
