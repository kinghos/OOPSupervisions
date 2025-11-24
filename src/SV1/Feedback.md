Notes for SV1 (rather than annotating pdf)

1.2 You should also mention:
- differences in memory manipulation (i.e. abstracted in declarative, direct/explicit in imperative)
- preferences for recursion vs explicit iteration
- variables vs values
- local vs global scopes

1.3 null is not a primitive
c, i, k, l, t are all references
k and l are not *themselves* objects, but they are references *to* objects. The full answer to this is the Objects referred to.
Additionally, the Array referenced by i is also an Object.

1.5 b) yes

1.9 yes

2.1 Yes

2.2 More or less. The advantage is flexibility. The disadvantage is flexibility.

2.3 Mostly Yes. The second method is confusing without clear documentation...it is unclear whether it modifies the called vector or not.
The point of the 4th prototype is that it clarifies that no parameter vectors were harmed in the making of the output; it is entirely equivalent to the third.

Setting a class to be **final** does not mean it is immutable...it may still be perfectly possible to change its fields. Consider:

```java
public final class Thing {
    
    public int value = 2;
    
}
```

Even a class without any Setters may still be mutable (depending on what the other methods do). 

2.4 (b) A UML diagram also needs arrows between classes - to show that OOPLinkedList is dependent on OOPLinkedListElement

2.5 Yes

2.6 All Objects have a hashcode() method - and can be used as keys in a HashMap. The key thing to explain is why this is a bad idea. [Will discuss in supervision]

3.1 Yes. Additionally, you cannot commit the horrors of C-like pointer arithmetic.

3.2 Good - except that p -> null is not correct. p *is* null (it holds a special value that says this), and it does 
not point to anything at all.

3.3 Yes

3.5 Yes, pass by reference is likely to use more memory! A memory reference is often larger than a primitive 
(an int, say), and we need this additional memory for every parameter. It is not correct that, 'if any two variables 
store the same data they can just point to the same data instead', as this may be a transient equality (but I see 
what you mean).
Another issue is that everytime we access a primitive in code, we have to go through a reference to it...which could 
be a performance hit in computation-heavy code.

4.2 No. The default access modifier is 'package-private'. This is visible to anything in the same package (not just 
the class). [Remind me if we have time in the supervision to talk about package structure in Java]

4.4 You need to put multiplicities on the arrows (a key point the question asks for)

4.5 
a) Yes
b) Yes
c) No - unspecified would be fine
d) Yes

4.6 Yes