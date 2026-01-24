package Java_Daily.Day10_Memory_Visualizer;

public class memory4 {
    /*
     * FAQ - StackOverflowError & Recursion
     * ------------------------------------------------------------------
     * 1. WHAT CAUSES StackOverflowError?
     * ------------------------------------------------------------------
     * Technical Answer:
     * It occurs when the "Call Stack" exceeds its memory limit.
     * Every method call creates a new "Stack Frame" to hold local variables.
     * If calls pile up faster than they return (pop), the stack hits its 
     * physical ceiling, and the JVM crashes the thread.
     *
     * ------------------------------------------------------------------
     * 2. WHY DOES RECURSION NEED A BASE CASE?
     * ------------------------------------------------------------------
     * Technical Answer:
     * The Base Case is the "Termination Condition."
     * Without it, the method calls itself infinitely.
     * It serves two roles:
     * a. Stops the addition of new Stack Frames.
     * b. Triggers the "Unwinding" process (returning values back up).
     *
     * ------------------------------------------------------------------
     * 3. WHY DON'T LOOPS CAUSE STACK OVERFLOW?
     * ------------------------------------------------------------------
     * Technical Answer:
     * Loops (for/while) do NOT create new Stack Frames.
     * They run inside a single method call (One Frame).
     * They simply update the value of existing variables (e.g., i++).
     * * Memory Complexity:
     * - Loop: O(1) (Constant Space)
     * - Recursion: O(N) (Linear Space - grows with input size)
     * ------------------------------------------------------------------
     */
}
    /*
     * Summary:
     * StackOverflowError is caused by excessive method calls
     * that exceed the call stack's memory limit.
     * Recursion needs a base case to stop infinite calls
     * and allow the stack to unwind.
     * Loops don't cause stack overflow because they
     * operate within a single stack frame.
     */
