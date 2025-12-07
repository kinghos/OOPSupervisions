### Section 10
1. The state pattern is when an object contains an object rather than inheriting from its class. This means any methods or state within the object can be used without needing to inherit from it. The strategy pattern is when an algorithm is selected at runtime, for example passed into a function which chooses which algorithm to use through selection.
2. a) If a professor was changing role to a lecturer, there would be no clean way for them to switch in code when using inheritance.

    b) This would pass the reference to the rank object, which would allow modification of the internal object in undesirable ways
3. a) Yes, as this forces each child to have its own clear implementation

    d) You could use an observer pattern to listen for when a shape is drawn, and then draw a border around that shape. Shown in `ObserverBorder.java`

### Section 11
