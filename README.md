# Intelematics

1. Assuptions:
	a) The JDK has enough memory to hold a large data set.
	b) Use the Java 8 collection library

2. Runtime optimised approach
	This approach will utilise the LinkedList from java.util package. The advantage of this approach is it can immediately re-sort the order of the tree to maintain the order of the tree by move the item one step forward on the linked list if its counter is greater than the item before it. It will not requires second pass to find out the most common number.  Each LinkedList node contains references to the previous and next elements as well as a reference to the data value. Such node occupies 24 bytes (12 bytes header + 3*4 bytes for references), which is 6 times more than ArrayList in terms of per-node overhead. 

3. Space optimised approach
	This approach will utilise the array list from java.util.ArrayList. The advantage of this approach is it only requires 4 byte per node. The memory consumption will be 4 * SIZE of list. It is a lot smaller that the TreeSet approach. However, this approach has serious drawback -- it requires second pass to find out the most common integer, the process time will be at least double.

4. This exercise will take the second approach. The command to execute the application as follow:
	java -jar intelematics.jar