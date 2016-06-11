# Intelematics

1. Assuptions:
	a) The JDK has enough memory to hold a large data set.
	b) Use the Java 8 collection library

2. Runtime optimised approach
	This approach will utilise the tree set from java.util.TreeSet. The advantage of this approach is it can immediately re-sort the order of the tree to maintain the order of the tree. It will not requires second pass to find out the most common number. This means this approach provids guaranteed log(n) operations. The disadvantage of this approach is the memory consumption, the tree set is a red-black tree, it means that a node occupies 12 bytes for header, 20 bytes for 5 object fields and 1 byte for the flag. So the total consumption is 12+20+1 = 40 (due to 8 byte alignment) per node. The memory consumption will be
	40 * SIZE of tree. 

3. Space optimised approach
	This approach will utilise the array list from java.util.ArrayList. The advantage of this approach is it only requires 4 byte per node. The memory consumption will be 4 * SIZE of list. It is a lot smaller that the TreeSet approach. However, this approach has serious drawback -- it requires second pass to find out the most common integer, the process time will be at least double.

4. This exercise will take the first approach. The command to execute the application as follow:
	java -jar intelematics.jar