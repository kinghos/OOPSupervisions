### Section 5
1. An abstract class is a class designed to be instantiated, which can contain abstract methods with no implementation, which must be implemented by any subclasses. An interface is similar, but it does not have any state, and cannot have any methods with implementations (unless they have default methods)
2. Dynamic polymorphism is when the function to be called is decided during runtime. The object type is checked in memory and the relevant method is called. e.g.
```java
class Animal {
    void speak() {}
}

class Dog extends Animal {
    void speak() {System.out.println("Woof");}
}
```
3. This idea goes against the principles of inheritance - if only certain behaviour and states need to be inherited, the parent class should only contain said behaviour and states, and anything else should be decomposed into other classes.


6. a) Indexing is $O(1)$, appending is $O(n)$, deletion at an index is $O(1)$, modifying at an index is $O(1)$, search is $O(n)$

    d) The complexity would still be $O(n)$ as in the worst case the array still needs to be expanded, but it will be faster since most of the time it will not need to be expanded.


### Section 6
1. a) is the most performant in terms of execution, as it does not require much rearrangement of memory during deletion. However, it is not very useful as very small isolated chunks of memory could be left free which does not leave much memory for larger data. b) has the same cost of deleting, but afterwards rearranges the empty space in memory to allow for larger data. c) has the biggest costs of marking and deletion, as it moves around a lot of data in memory during execution, but is still more useful than b) as it leaves the biggest chunks of the heap free. It would be the least performant, though

2. Immutable classes mean there will generally be less references overall. This makes it easier for the garbage collector to find and delete objects that have no references to them.


4. Marker interfaces allow labelling classes, e.g. in the case of Cloneable it is clear that the class can be cloned, even if it does not have to implement any methods
5. Default state from the parent will not be copied - for example, if cloning a child of a List structure, the array/linked list structure from the parent will not be cloned and hence data will be lost.
6. c) It is difficult to do deep cloning with copy constructors, and inheritance makes it confusing as it is unclear which constructor to use when type casting.
    
    d) When making a shallow copy and there are no subclasses
7. mData is final, so trying to reassign it after calling super.clone() will not work

### Section 7
1. Vector, LinkedList and ArrayList are all expandable data structures which store a sequence of elements. However, Vector is a legacy class that is like an ArrayList but threadsafe. ArrayLists work by storing the data in an Array whereas LinkedLists join elements with pointers. A TreeSet is a similar collection, but with no duplicates, as it is meant to represent the mathematical notion of a set. The objects would be stored in order.


4. An ArrayList would be the better choice, as it has $O(1)$ access time to the end of the list, whereas with a LinkedList it would be $O(n)$ to access the last element, making adding and removing items from the list very inefficient
5. `==` checks reference equality. In the first example, two seperate objects are being created, as specified by the `new` keyword. This means they do not have the same reference and hence are not equal (so false is printed). In the second example, the strings are declared with string literals. After the first string is created, the compiler recognises there is already an object storing "Hi" and instead of creating a new identical object it gives s4 the same reference as s3, hence true is printed.
6. 