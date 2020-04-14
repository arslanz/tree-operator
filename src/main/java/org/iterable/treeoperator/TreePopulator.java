package org.iterable.treeoperator;

import org.iterable.treeoperator.model.DataOperation;
import org.iterable.treeoperator.model.DataValue;
import org.iterable.treeoperator.model.Node;

/**
 * Helper class to create a tree with child nodes populated.
 */
public class TreePopulator {

    public static Node createTreeWithBasicTestCase() {
        final Node lll = new Node(new DataValue(true), null, null);
        final Node llr = new Node(new DataValue(false), null, null);

        final Node lrl = new Node(new DataValue(false), null, null);
        final Node lrr = new Node(new DataValue(false), null, null);

        final Node ll = new Node(new DataOperation(false), lll, llr);
        final Node lr = new Node(new DataOperation(true), lrl, lrr);

        final Node rl = new Node(new DataValue(true), null, null);
        final Node rr = new Node(new DataValue(false), null, null);

        final Node left = new Node(new DataOperation(true), ll, lr);
        final Node right = new Node(new DataOperation(false), rl, rr);

        return new Node(new DataOperation(false), left, right);
    }
}
