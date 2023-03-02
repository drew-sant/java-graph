/**
 * First javadoc thing.
 * 
 */
package graph;

//imports
import java.util.HashMap;
import java.util.Set;

/**
* A class that implements a node object.
* 
* The node has a value and a key associated to them and can have multiple "connections".
*/
public class Node<KeyType, ValueType>{
    // State variables
    // connections - Holds names of all the other nodes that this node connects to.
    private HashMap connections = new HashMap<KeyType, ValueType>();
    private ValueType value;
    private KeyType key;

    /**
    * Creates a new node and assigns it a key and a value.
    */
    public Node(KeyType key, ValueType value){
        this.value = value;
        this.key = key;
    }

    /**
     * REMOVE LATER -- FOR TESTING PURPOSES
     * @return the boolean value true
     */
    public boolean someLibraryMethod(){
        return true;
    }

    /**
     * Return the value of the node
     * @return the value of the node
     */
    public ValueType getValue(){
        return this.value;
    }

    /**
     * Return connection keys
     * @return a Set containing key values of the nodes the node is connected to
     */
    public Set<KeyType> getConnectionKeys(){
        return connections.keySet();
    }

    /**
     * Add a new connection of an existing node with the key value "key" to the node
     * @param key the key value that is associated with the node to be connected
     */
    public void addConnection(KeyType key){

    }

    /**
     * Remove the connection between the node and the node associated with the key value
     * @param key the key value that is associated with the node to be removed
     */
    public void removeConnection(KeyType key){

    }
}