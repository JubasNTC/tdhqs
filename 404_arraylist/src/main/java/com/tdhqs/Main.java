package com.tdhqs;

/*
    "Представьте, что вы пишете оптимальную по памяти реализацию ArrayList для примитива int. Дано:
    private int[] array;
    private int size;
    public void deleteAll(Predicate predicate){
        // напишите свою реализацию. Единственный метод в предикате - boolean test(int)
        // т.е. надо все элементы массива почекать этим предикатом - если true, то удалять
     }
    Напишите junit-тесты."
 */

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        try {
            CustomArrayList arrayList = new CustomArrayList();
            arrayList.add(1);
            arrayList.add(3);
            arrayList.add(1);
            arrayList.add(4);
            arrayList.add(5);

            System.out.println("Исходный ArrayList: ");
            arrayList.print();

            Predicate<Integer> isOdd = i -> (i % 2 != 0);
            arrayList.deleteAll(isOdd);

            System.out.println("Удалены все нечетные элементы: ");
            arrayList.print();
        } catch (ArrayIndexOutOfBoundsException | OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }
    }
}