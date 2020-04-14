package org.iterable.treeoperator;

import org.iterable.treeoperator.model.Node;
import org.iterable.treeoperator.operator.TreeOperator;

public class LogicalOperationTester {

    public static void main(String[] args) {
        final Node tree = TreePopulator.createTreeWithBasicTestCase();
        final Boolean result = TreeOperator.deriveResult(tree);

        System.out.println("Tree input: " + tree);
        System.out.println("Tree evaluation result: " + result);
    }



}
