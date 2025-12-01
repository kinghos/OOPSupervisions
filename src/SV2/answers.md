### Section 5
1. An abstract class is a class designed to be instantiated, which can contain abstract methods with no implementation, which must be implemented by any subclasses. An interface is similar, but it does not have any state, and cannot have any methods with implementations (unless they have default methods)

[James] No. An abstract class is one that *cannot* be instantiated. *Instantiation* is the process of creating an 
*Object* (from, if you like, a Class as template).

2. Dynamic polymorphism is when the function to be called is decided during runtime. The object type is checked in 
   memory and the relevant method is called. e.g.
```java
class Animal {
    void speak() {}
}

class Dog extends Animal {
    void speak() {System.out.println("Woof");}
}

        // [James] The code should also include a main metho
        // (or other means) that calls speak()
```
3. This idea goes against the principles of inheritance - if only certain behaviour and states need to be inherited, the parent class should only contain said behaviour and states, and anything else should be decomposed into other classes.

[James] Better and more accurate to say that it violates the Liskov Substitution Principle in that the sub-class can 
no longer be treated as a parent class instance.

6. a) Indexing is $O(1)$, appending is $O(n)$, deletion at an index is $O(1)$, modifying at an index is $O(1)$, 
   search is $O(n)$

    d) The complexity would still be $O(n)$ as in the worst case the array still needs to be expanded, but it will 
   be faster since most of the time it will not need to be expanded. 

[James] The doubling on expansion ArrayList is O(1) for insertion, as the O(n) cost is amortised over n items.


### Section 6
1. a) is the most performant in terms of execution, as it does not require much rearrangement of memory during deletion. However, it is not very useful as very small isolated chunks of memory could be left free which does not leave much memory for larger data. b) has the same cost of deleting, but afterwards rearranges the empty space in memory to allow for larger data. c) has the biggest costs of marking and deletion, as it moves around a lot of data in memory during execution, but is still more useful than b) as it leaves the biggest chunks of the heap free. It would be the least performant, though

[James] The last method also halves the memory we can use. also worth noting that all approaches are O(n) for 
marking, where n is the number of objects. I.e. they are independent of the heap size or memory used.

2. Immutable classes mean there will generally be less references overall. This makes it easier for the garbage collector to find and delete objects that have no references to them.

[James] When we use Immutable classes, we often have more references! We create a new Object every time we would (in 
a mutable case) make a change to an object. This can lead to many more Objects on the heap, which leads to the GC 
doing more. In practice - as long as we're not using large immutable objects - the GC is very well optimised for 
this. The larger problem with immutable objects then becomes the overhead of object creation.

4. Marker interfaces allow labelling classes, e.g. in the case of Cloneable it is clear that the class can be cloned, even if it does not have to implement any methods

[James] Yes.

5. Default state from the parent will not be copied - for example, if cloning a child of a List structure, the 
   array/linked list structure from the parent will not be cloned and hence data will be lost.

[James] Yes.

6. c) It is difficult to do deep cloning with copy constructors, and inheritance makes it confusing as it is unclear which constructor to use when type casting.
    
    d) When making a shallow copy and there are no subclasses

[James] Yes. fully safe copy constructors require a `final` class that only inherits from `Object`. In this case 
there is not inheritance possible to complicate things.
 
7. mData is final, so trying to reassign it after calling super.clone() will not work

[James] Yes.

### Section 7
1. Vector, LinkedList and ArrayList are all expandable data structures which store a sequence of elements. However, Vector is a legacy class that is like an ArrayList but threadsafe. ArrayLists work by storing the data in an Array whereas LinkedLists join elements with pointers. A TreeSet is a similar collection, but with no duplicates, as it is meant to represent the mathematical notion of a set. The objects would be stored in order.

[James] Yes.

4. An ArrayList would be the better choice, as it has $O(1)$ access time to the end of the list, whereas with a LinkedList it would be $O(n)$ to access the last element, making adding and removing items from the list very inefficient

[James] No. A linkedList will be far more performant. RTQ! We are adding to the *start* of the list.

7. `==` checks reference equality. In the first example, two seperate objects are being created, as specified by the `new` keyword. This means they do not have the same reference and hence are not (so false is printed). In the second example, the strings are declared with string literals. After the first string is created, the compiler recognises there is already an object storing "Hi" and instead of creating a new identical object it gives s4 the same reference as s3, hence true is printed.

[James] Yes.

### Section 8
1. Generics do not support primitive types due to treating all parameter types as Objects after type erasure, and primitive types are not objects. Calling T() is forbidden due to the compiler not knowing what constructor to call (since all parametrised types are treated as Objects)

[James] Yes.

3. Wildcards allows you to specify bounds for a class, e.g. If you want a class to take a Generic, you can specify that it is either a Number or one of its children. This allows you to treat classes of related types similarly without causing problems.

[James] Yes. You should also explain the detail of the nomenclature here. I.e. what is the different behaviour of:
- List<? extends Number>
- List<? super Number>
- List<?>

4. i The signature uses the same type for src and dest, but in the call doubles and numbers are being passed in. While 
these are related, it is not sufficient as they are not truly the same type.

[James] Yes.

### Section 9
2. Checked, as the code should be written in a way that handles the error properly, with a try catch statement. Unchecked errors are for programming/logic errors that are not the client's fault.

[James] Yes.

4. This code is poorly written as it uses an exception as a way to obtain the answer, waiting for it to be thrown to break the flow of code. Instead, iteration should be used, or simply recursion with a base case, without using exceptions.

[James] Yes. It also will infinitely recurse and stackoverflow with a negative input.

6. 6 is returned, but the code in the finally block will run first.
[James] YEs.