# Intelematics

Problem:  

Given an array of integers, find the sum of the most common integer.  

Example:  
    (1, 2, 3, 4, 5,1, 8) returns 2 (as 1+1 = 2)   
    
Response instructions: 

    Provide 2 solutions, one implemented in Java and the other solution described in paragraph form.                    
    
    One approach shall be optimised for runtime.                     
    The other solution shall be optimised for space. 
                       
It is your choice as to which one is implemented and which one is described. 

·         For each solution, state:                                 
            - any assumptions (if any),                                  
            - the average runtime complexity                        
            - space complexity (memory usage)  
           
Solution Details: 

·         The response should include 3 files:                    
            1.    README.txt – shall explain the two approaches (including runtime and space/memory calculation).                   
            2. One source code file (.java) with the solution. The code should be documented and clearly written. The program should be executed from the command line and not have any GUI or take any user input.                   
            3. One source code file (.java) with the necessary unit tests covering the common usecases.      


1. Assuptions:
	a) The JDK has enough memory to hold a large data set.
	b) Use the Java 8 collection library

2. Runtime optimised approach
	This approach will use a hash map object to keep tracking the integer occurs and has reference to the current most occurs integer and counter.Once the algorithm completed the first scan of the input array, it will be able to provide the most common integer and its occurs. This approach requires only 1 pass of the input array, thus, it has O(n) time complexity, and O(n) space complexity due to the extra hash map object required. 

	Here is how the time complexity calculate:
		The traditional for-loop statement has 3 basic operations
		The array access is 1 basic operation.
		The retrieve of integer from hash map object has a O(1) operation as JVM indicated.
		The assigning count varialbe value has 2 basic operations
		The put of integer and its counter into hash map object has a O(1) operation.
		The verify is most common interger has 1 basic operation
		The update the most common integer has 2 base operations may or may happy depends on previous step.
	Thus, as the iteration over the array progress, the hash collision inside the hash map may happen and then the time complexity would be O(n).

	The space complexity calculate as follow:
		Each unqiue integer will requires a enter in hash map and an additional counter, total 4 bytes.
		The best case will be the whole array has a same integer number, thus, the hash map object will only requires one entry.
		The worst case will be the whole array has no duplicated integer, thus, the hash map object will has complete copy of the input array and a counter of each integer.
		The real case will be as the arry size getting large, the hash map object size will proportionly getting larger, thus, the space complexity would be O(n) 

3. Space optimised approach
	This approach will sorted the input array first and then iterator over it to find the most common integer. Since it does not required the hash map object to keep tracking the integer occurs, it will give the space complexity of o(1). However, it requires 2 pass over the array, this gives O(nlogn) time complexity.

	Here is how to time complexity calcuate:
		First pass, sort the array, depends on what sorting algorithm is employed, result may vary, however, given the space optimised as primary object, Heapsort, Bubble Sort and Insertion Sort are the good candidates. The Heapsort given O(nlogn) time complexity compare to Bubble Sort and Insertion Sort's O(n^2) time complexity is a sensible option. 
		Second pass:
			The traditional for-loop statement has 3 basic operations
			The array access is 1 basic operation.
			verify the integer is greater than the previous one is 1 basic operation.
			increase the counter is 1 basic operation if the integer is same as previous one.
			verify the counter is greater the the max counter is 1 basic operaiton if the integer is greater than previous one.
			update the max counter is 1 basic operation if the the max counter is less than the integer counter.
			update the previous integer is 1 basic operation.
		Thus, the second pass time complexity is O(n).
	The whole approach's time complexity will O(nlogn) as result.

	The space complexity calcuate is simple, it only requires 2 counters and one integer to hould the most common integer on top of the input array, thus, the space complexity is O(1). 

4. This exercise will take the first approach. The command to execute the application as follow:
	java -jar intelematics.jar