◉ Engineering Log: Week 01 (Java Foundations)
Focus: Data Handling, Binary Logic, & Control Flow Optimization.

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