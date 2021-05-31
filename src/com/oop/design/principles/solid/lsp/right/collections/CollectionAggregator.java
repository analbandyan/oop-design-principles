package com.oop.design.principles.solid.lsp.right.collections;

import java.util.Collection;

public class CollectionAggregator {

    private final Collection<Integer> collection;

    public CollectionAggregator(Collection<Integer> collection) {
        this.collection = collection;
    }

    public int calculateSummary() {
        return collection.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int calculateProduct() {
        return collection.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, CollectionAggregator::multiply);
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

}
