This is the solution to the following exercise:

Write down a tree data structure to represent Boolean expressions such as:
((true && false) || (false || false)) && (true && false)
Can be represented as a tree that looks like:
                     &&
                    root
                 /        \

            ||                &&
            l                  r
        /        \         /      \

      &&           ||   true      false
      ll           lr    rl         rr
   /     \       /    \

 true  false  false  false
 lll   llr    lrl    lrr


These expressions can contain:

    literals (true and false)
    logical operators && and ||, which have their usual meaning

We won't be asking you to write a parser, but we will be asking you to write some functions over the tree. For this exercise we only ask to support literals as leaf nodes, but in principle one should be able to support more complicated predicates.

It's safe to assume the logical AND and OR operators are binary operators. That is, they accept two operands.
