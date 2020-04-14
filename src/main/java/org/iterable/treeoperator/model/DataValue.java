package org.iterable.treeoperator.model;

import lombok.Value;

/**
 * An implementation of a type of data that can be in a Node class which represents a value.
 */
@lombok.Value
public class DataValue implements Data {
    private final boolean value;

    public Boolean get() {
        return value;
    }
}
