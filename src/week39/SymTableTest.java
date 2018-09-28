package week39;


import week37.ISymTable;
import week38.BinarySearchTree;
import week38.RedBlackBST;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static helpers.Verify.*;
import static helpers.Verify.verifyEquals;

/**
 * @author Torstein Strømme
 */
public class SymTableTest {


    public static void main(String[] args) {
        test(new BinarySearchTree<>());
        test(new RedBlackBST<>());
        test(new ChainingHashTable<>());
    }

    private static void test(ISymTable<String, Integer> bst) {
        System.out.print("Sanity test of binary search tree: " + bst.getClass().getCanonicalName() + "... ");

        verifyEquals(bst.size(), 0);
        verifyFalse(bst.containsKey("A"));

        bst.put("B", 4);
        verifyEquals(bst.size(), 1);
        bst.put("C", 5);
        verifyEquals(bst.size(), 2);
        bst.put("A", 3);
        verifyEquals(bst.size(), 3);

        verify(bst.containsKey("A"));
        verify(bst.containsKey("B"));
        verify(bst.containsKey("C"));

        verifyFalse(bst.containsKey("D"));

        verifyEquals(bst.get("B"), 4);


        bst.delete("A");
        verifyEquals(bst.size(), 2);

        verifyFalse(bst.containsKey("A"));
        verifyNull(bst.get("A"));

        verify(bst.containsKey("B"));
        verify(bst.containsKey("C"));

        verifyEquals(bst.get("C"), 5);

        bst.delete("D");
        verifyEquals(bst.size(), 2);
        verifyFalse(bst.containsKey("D"));

        bst.put("A", 32);
        verifyEquals(bst.get("A"), 32);
        verifyEquals(bst.size(), 3);


        System.out.println("all ok!");
    }
}
