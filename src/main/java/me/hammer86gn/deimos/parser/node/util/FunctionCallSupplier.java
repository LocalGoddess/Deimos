package me.hammer86gn.deimos.parser.node.util;

import me.hammer86gn.deimos.parser.node.FunctionCallNode;

public class FunctionCallSupplier implements ValueSupplier {

    private final FunctionCallNode node;

    public FunctionCallSupplier(FunctionCallNode node) {
        this.node = node;
    }

    @Override
    public <U> U getValue() {
        return null;
    }
}
