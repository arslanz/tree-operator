package org.iterable.treeoperator.model;

import lombok.Value;

@Value
public class Node {
    private final Data data;
    private final Node left;
    private final Node right;
}
