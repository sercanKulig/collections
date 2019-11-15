package com.example.collection;

import java.util.*;

public class QueueCollections {
    /**
     *Bu sınıf stack sınıfından farklı olarak özel durumlar dışında ilk giren ilk çıkar mantığı ile çalışmaktadır. FIFO (first in first out)
     * Üstarayüzleri: Collection, Iterable
     * Altarayüzleri: BlockingQueue
     * Kılgılayan sınıflar: AbstractQueue, ArrayBlockingQueue, ConcurrentLinkedQueue, DelayQueue, LinkedBlocking Queue, LinkedList, PriorityBlockingQueue, PriorityQueue, SynchronousQueue ‘dir
     * Listle ana farkı list istediğin elementi verir, queue ilk son ve ya sonraki elemente odaklanır.
     * queue.poll() yapmak ilk elementi silerken Arraylistte bu işlem için sıralama ve null check'le ilgilenmek gerekir.
     */
    public static void main(String[] args) {
        /**
         * PriorityQueue’e null eleman eklenemez.
         * Non-Generics bir PriorityQueue yapisinda ilk eleman Integer’sa sonrasinda farkli tipte bir eleman eklenemez elemanlarin hepsi Integer tipinde olmalidir.
         * PriorityQueue’e add veya offer metodu ile eleman eklenebilir. add metodu offer metodunu cagirmaktadir.
         * remove metodu ile ilgili elaman silinebilir. peek metodu PriorityQueue’teki ilk elemani dondurur , element metodu peek metodunu cagirir.
         * poll metodu PriorityQueue’teki ilk elemani dondurur fakat bu elemani siler , remove metodu poll metodunu cagirir.
         */
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(100);
        pq.add(10);
        pq.add(10);
        pq.add(50);
        pq.add(12);
        pq.add(150);

        pq.offer(-20);
        pq.offer(-10);
        System.out.println(Collections.singletonList(pq));
        pq.remove(12);
        System.out.println(Collections.singletonList(pq));
        Integer firstElement = pq.peek();
        //silmez
        System.out.println(firstElement);

        Integer firstElementPoll = pq.poll();
        //siler
        System.out.println(firstElementPoll);
        System.out.println(Collections.singletonList(pq));

        firstElement = pq.element();
        //element metodu peek metodunu cagirir.
        System.out.println(firstElement);


        /**
         * Natural Order
         */
        Queue<String> kuyruk = new LinkedList<>();
        kuyruk.offer("Gökhan");
        kuyruk.offer("Aslı");
        kuyruk.offer("Aykut");
        kuyruk.offer("Cem");
        kuyruk.offer("Fatma");
        kuyruk.offer("Görkem");
        kuyruk.offer("Ilknur");
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        kuyruk.poll();
        // hata vermez
        System.out.println(Collections.singletonList(kuyruk));

        /**
         * DEQUE Queue'dan türetilmiştir.
         * ekstra 5 method içerir
         * boolean offerFirst(E e) ve boolean offerLast(E e) metotları, şayet kuyruk kapasitesini aşmıyorsa elemanları ilgili sıra ile başa ve sona ekler. Ekleme başarılı ise true döner.
         * void pop() E removeFirst() ile aynı işleve sahiptir. void push(E e), kuyruğun başına ekleme yapar. Eğer kuyrukta kapasite yeterli değil ise IllegalStateException fırlatır.
         * E peekFirst() ve E peekLast() metotları kuyruktaki ilk ve son elemanların elde edilmesini sağlar ve bu elemanları kuyruktan kaldırmaz.
         * E pollFirst() ve E pollLast() metotları kuyruktaki ilk ve son elemanların elde edilmesini sağlar ve bu elemanları kuyruktan kaldırır.
         * Son olarak boolean removeFirstOccurrence(Object o) ve boolean removeLastOccurrence(Object o) parametre olarak gönderilen nesnelerin, sırasıyla kuyruktaki ilk ve son geçtiği yerlerden kaldırır.
         */
        Deque<String> deque = new LinkedList<>();
        deque.offer("Gökhan");
        deque.offer("Aslı");
        deque.offer("Aykut");
        deque.offer("Cem");
        deque.offer("Fatma");
        deque.offer("Görkem");
        deque.offer("Ilknur");
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 9 (Tail)");
        deque.push("Element 1 (Head)"); //add to head
        deque.offerFirst("Element deleted 1 (Head)");
        deque.offerLast("Element deleted 9 (Tail)");
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.pollFirst();
        deque.pollLast();
        System.out.println(Collections.singletonList(deque));
    }
}
