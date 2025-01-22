package com.example.generics;

import java.util.Arrays;

interface MinMax<T extends Comparable<T>> {
    T findMin();
    T findMax();
}

class ArrayMinMax<T extends Comparable<T>> implements MinMax<T> {
    private T[] array;

    public ArrayMinMax(T[] array) {
        this.array = array;
    }

    @Override
    public T findMin() {
        return Arrays.stream(array).min(T::compareTo).orElse(null);
    }

    @Override
    public T findMax() {
        return Arrays.stream(array).max(T::compareTo).orElse(null);
    }
}

public class GenericsMinMaxExample {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {3, 5, 1, 8, 7};
        ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>(intArray);
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Minimum: " + intMinMax.findMin());
        System.out.println("Maximum: " + intMinMax.findMax());

        // String array
        String[] strArray = {"apple", "orange", "banana", "pear"};
        ArrayMinMax<String> strMinMax = new ArrayMinMax<>(strArray);
        System.out.println("\nString Array: " + Arrays.toString(strArray));
        System.out.println("Minimum: " + strMinMax.findMin());
        System.out.println("Maximum: " + strMinMax.findMax());

        // Character array
        Character[] charArray = {'b', 'd', 'a', 'c'};
        ArrayMinMax<Character> charMinMax = new ArrayMinMax<>(charArray);
        System.out.println("\nCharacter Array: " + Arrays.toString(charArray));
        System.out.println("Minimum: " + charMinMax.findMin());
        System.out.println("Maximum: " + charMinMax.findMax());

        // Float array
        Float[] floatArray = {3.5f, 5.1f, 1.4f, 8.2f, 7.6f};
        ArrayMinMax<Float> floatMinMax = new ArrayMinMax<>(floatArray);
        System.out.println("\nFloat Array: " + Arrays.toString(floatArray));
        System.out.println("Minimum: " + floatMinMax.findMin());
        System.out.println("Maximum: " + floatMinMax.findMax());
    }
}
