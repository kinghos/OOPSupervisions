### Section 10
1. The state pattern is when an object contains an object rather than inheriting from its class. This means any methods or state within the object can be used without needing to inherit from it. The strategy pattern is when an algorithm is selected at runtime, for example passed into a function which chooses which algorithm to use through selection.

[James] Not really correct about the State pattern - what you describe is just any 'Has-A' componentisation approach. A State strategy changes the behaviour of the Object based on an internal state; and crucially this behaviour determines the rules for transitioning to a different state (and hence set of behaviours). It is the implementation of a Finite State Machine. In contrast the Strategy pattern has no state associated with it. It injects a specific behaviour into a predefined pattern.

2. a) If a professor was changing role to a lecturer, there would be no clean way for them to switch in code when using inheritance.  [James] And we have to threrfore create a new Object, and then update all the old references that pointed to the Lecturer, and update them to the new Professor. This is error-prone.

    b) This would pass the reference to the rank object, which would allow modification of the internal object in undesirable ways/ [James] Yes.
3. a) Yes, as this forces each child to have its own clear implementation. [James] And because there is no sensible default implementation for any Shape.

    d) You could use an observer pattern to listen for when a shape is drawn, and then draw a border around that shape. Shown in `ObserverBorder.java`

[James] The Decorator pattern is a much more natural fit for the Frame question. The Oberver pattern is when we want some other thing (section of code) to react to the event, not to intercept/decorate with the event


### Section 11
