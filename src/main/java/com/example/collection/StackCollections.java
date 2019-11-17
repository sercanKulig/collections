package com.example.collection;

import java.util.Stack;

public class StackCollections {
    /**
     * Stack sınıfı nesnelerin LIFO (last-input-first-output) yapısıyla depolanmasını sağlayan bir veri
     * tipidir. Bilgisayar uygulamalarında çok sık kullanılır. Üst üste konulmuş kutular gibidir. Yani gelen kutu
     * en üste konur. Alttaki ya da aradaki bir kutuyu almak için, en üsttekinden başlayarak, istenen kutuya
     * kadar üsttekileri sırayla almak gerekir.
     */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Londra");
        stack.push("Moskova");
        stack.push("Ankara");
        stack.push("Paris");
        stack.push("Viyana");
        System.out.println(stack);
        System.out.println(stack.search("Ankara"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
