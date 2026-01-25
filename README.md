# ◉ Engineering Log: Week 01 (Java Foundations)
**Focus:** Data Handling, Binary Logic, & Control Flow Optimization.

➢ Key Technical Takeaways:

1. I/O Management & Buffer Architecture
I learned that handling user input isn't as simple as just "reading data."

• The Challenge: I encountered the "Input Ghost" issue where nextInt() leaves a newline character in the buffer, causing subsequent string inputs to fail.

• The Fix: I now explicitly manage the input stream by consuming leftover newlines or parsing strings directly.

• UX Focus: I moved away from raw println debugging and adopted printf with width specifiers (%-15s, %.2f) to create professional, aligned data tables in the console.

2. Bitwise Logic (Machine-Level Efficiency)
This was the most technically demanding part of the week. I explored how computers process data at the binary level.

• Optimization: I replaced standard arithmetic with bitwise shifting (<<, >>) for high-speed multiplication and division.

• Permission Systems: Instead of using multiple boolean variables (which consumes more memory), I implemented a Bitmasking Permission System. I used:

| (OR) to grant permissions.

& (AND) to verify access.

^ (XOR) to toggle states efficiently.

• Why it matters: This approach allows storing complex user states in a single integer, which is crucial for database scalability.

3. Control Flow & Cyclomatic Complexity
I focused on writing clean branching logic to avoid "spaghetti code."

• Switch Expressions: I refactored traditional switch-case blocks into modern Java 14+ Switch Expressions (->). This eliminated "fall-through" bugs and reduced boilerplate code significantly.

• Loop Optimization: I practiced using break and continue to manually control loops.

• Insight: Using break to stop a search early isn't just about logic; it's a performance optimization that saves CPU cycles in large datasets.

➢ Code Snippet Highlights:
Here are a few patterns I implemented this week:

The "Bitwise Permission Check" Pattern:

Java
// Checking if a user has specific access without multiple if-statements
if ((userPermissions & READ_ACCESS) != 0) {
    System.out.println("Access Granted");
}

The Modern Switch Expression:

Java
// Cleaner, safer, and returns a value directly
String type = switch (day) {
    case 1, 7 -> "Weekend";
    default -> "Weekday";
};

➢ Trade-offs & Reflections:

Bitwise vs. Readable Code: While bitwise operations are faster, they decrease code readability. I learned that proper commenting is non-negotiable when writing low-level logic.

Input Handling: Using Scanner is great for learning, but I realized it has limitations for complex input streams. I'm curious to explore BufferedReader in the future for better performance.

-- End of Log - Week 01 --

# ◉ Engineering Log: Week 02 (Memory & Data Structures)

**Focus:** Memory Architecture, Reference Semantics, & Algorithmic recursion.

### ➢ Key Technical Takeaways:

**1. Memory Architecture (Stack vs. Heap)**
I moved beyond writing code to understanding *where* it lives in RAM.

* **The Stack:** I learned this is for temporary execution. It stores method frames and primitive variables. It cleans itself up automatically (LIFO) when methods return.
* **The Heap:** This is the "Warehouse" for objects (Arrays, ArrayLists). I learned that variables in the Stack are just "Remote Controls" (references) pointing to the actual data in the Heap.
* **The Crash:** I intentionally triggered `StackOverflowError` (infinite recursion) to prove the Stack has a physical limit (~10,000 frames).

**2. Pass-by-Value & Reference Semantics**
This was the "Ah-Ha" moment for method communication.

* **The Mechanism:** Java passes a *copy* of the value.
* For primitives (`int`), it copies the number.
* For objects (`int[]`), it copies the *address*.


* **The Side Effect:** I realized that passing an array to a method allows that method to modify the *original* data (shared access), even though Java is technically "Pass-by-Value."
* **Defensive Coding:** I learned to be careful when passing large data structures to methods, as changes are permanent.

**3. Algorithmic Thinking (Recursion)**
I replaced loops with self-calling functions.

* **The Base Case:** The most critical component. Without a "Stop Condition," the Stack explodes.
* **The Trade-off:** Recursion is cleaner for complex tasks (like directory trees), but Loops are safer for memory.
* **Visualizing Unwinding:** I learned that `return` doesn't just stop the code; it destroys the stack frame and returns control to the previous caller.

**4. Data Structure Evolution (Array  ArrayList)**
I transitioned from static to dynamic storage.

* **Arrays:** Good for speed, but bad for flexibility (Fixed Size).
* **ArrayList:** Handles resizing automatically.
* **The Shift Cost:** I learned that removing an item from the *start* of a list is expensive because the computer must shift every subsequent item one slot to the left.

### ➢ Code Snippet Highlights:

**The "Base Case" Pattern (Recursion):**

java
// Prevents StackOverflow by stopping execution at a target
if (n == 0) {
    return; // The "Emergency Brake"
}
recurse(n - 1); // Moving towards the brake


**The "Shared Reference" Pattern:**
java

// Modifying Heap data via a passed reference
public void securityCheck(ArrayList<String> guests) {
    // This affects the original list in 'main'
    guests.remove("Joker"); 
}

```

### ➢ Trade-offs & Reflections:

* **Static vs. Dynamic:** Arrays are faster and simpler, but `ArrayList` saves development time by handling the CRUD logic (add/remove/resize) for me.
* **Recursion Risks:** While recursion is elegant, I learned that for simple counters, a `for-loop` is vastly superior in memory usage ( vs ).
* **Debugging:** Understanding the "Stack Trace" is now easier because I can visualize the stack frames piling up.

-- **End of Log - Week 02** --