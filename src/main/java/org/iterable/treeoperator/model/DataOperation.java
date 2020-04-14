package org.iterable.treeoperator.model;

import lombok.Value;

/**
 * An implementation of a type of data that can be in a Node class which represents an operator.
 */
@Value
public class DataOperation implements Data {
    private final boolean isLogicalOr;

    public Boolean get() {
        return isLogicalOr;
    }
}
