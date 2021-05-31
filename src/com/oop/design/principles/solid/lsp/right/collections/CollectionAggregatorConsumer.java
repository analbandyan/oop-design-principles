package com.oop.design.principles.solid.lsp.right.collections;

import java.util.List;

public class CollectionAggregatorConsumer {

    public void consume() {
        CollectionAggregator collectionAggregator = new CollectionAggregator(
                List.of(1, 2, 3, 4)
//                Set.of(1, 2, 3, 4)
        );

        collectionAggregator.calculateProduct();
        collectionAggregator.calculateSummary();

    }

}
