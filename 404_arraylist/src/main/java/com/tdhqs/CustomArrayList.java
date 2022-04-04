package com.tdhqs;

import java.util.Arrays;
import java.util.function.Predicate;

public class CustomArrayList {
    final private int INITIAL_SIZE = 2;
    private int[] array;
    private int size = 0;

    public CustomArrayList() {
        this.array = new int[this.INITIAL_SIZE];
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return this.array[index];
    }

    private void resize() {
        this.array = Arrays.copyOf(this.array, this.array.length * 2);
    }

    public boolean add(int element) throws OutOfMemoryError {
        try {
            boolean shouldScale = this.array.length - this.size <= this.array.length / 2;

            if (shouldScale) {
                this.resize();
            }

            this.array[this.size++] = element;

            return true;
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());

            return false;
        }
    }


    public int delete(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int element = this.array[index];
        int tempIndex = index;
        this.array[index] = 0;

        while (tempIndex < this.size) {
            this.array[tempIndex] = this.array[tempIndex + 1];
            this.array[tempIndex + 1] = 0;
            tempIndex++;
        }

        this.size--;

        return element;
    }

    public void deleteAll(Predicate<Integer> predicate) {
        int i = 0;

        while (i < this.size) {
            if (predicate.test(this.array[i])) {
                this.delete(i);
            } else {
                i++;
            }
        }
    }

    public void print() {
        if (this.size == 0) {
            System.out.print("[]");
        }

        System.out.print("[");
        final int lastIndex = this.size - 1;

        for (int i = 0; i < this.size; i++) {
            String outputElement = String.valueOf(this.array[i]);

            if (i != lastIndex) {
                outputElement += ",";
            }

            System.out.print(outputElement);
        }

        System.out.print("]\n");
    }
}
