package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test void someLibraryMethodReturnsTrue() {
        Node<Integer, String> classUnderTest = new Node<Integer, String>(0, "First");
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void makeNode(){
        Node<Integer, String> testNode = new Node<Integer, String>(0,"123Test");
        assertEquals("123Test", testNode.getValue(), "a node with value '123Test' assigned at creation should return '123Test' with .get_value()");
        
    }

    @Test void addConnection(){

    }
}