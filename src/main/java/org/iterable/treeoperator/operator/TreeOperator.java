package org.iterable.treeoperator.operator;

import org.iterable.treeoperator.model.Data;
import org.iterable.treeoperator.model.Node;

public class TreeOperator {

    public static Boolean deriveResult(final Node node) {
        if (node == null) {
            return null;
        } else if (node.getLeft() == null || node.getRight() == null) {
            return node.getData().get();
        } else {
            final Boolean leftRecursionResult = deriveResult(node.getLeft());
            final Boolean rightRecursionResult = deriveResult(node.getRight());
            return doLogicalOperation(node.getData(), leftRecursionResult, rightRecursionResult);
        }
    }

    private static Boolean doLogicalOperation(final Data data, final Boolean left, final Boolean right) {
        if (data.get())
            return doOrOperation(left, right);
        else
            return doAndOperation(left, right);
    }

    private static Boolean doOrOperation(final Boolean left, final Boolean right) {
        return left || right;
    }

    private static Boolean doAndOperation(final Boolean left, final Boolean right) {
        return left && right;
    }
}
