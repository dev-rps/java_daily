package Java_Daily.Day12_String_vs_StringBuilder;

public class strings5 {
// This file is for documentation only.

/*
 * ------------------------------------------------------------------
 * 1. WHEN TO USE String?
 * ------------------------------------------------------------------
 * Use 'String' for 95% of your code.
 * - When the text is not changing (Constants, Names, URLs).
 * - When you are passing data between methods.
 * - Why? It is safer and easier to read.
 * Example: String name = "Batman";
 *
 * ------------------------------------------------------------------
 * 2. WHEN TO USE StringBuilder?
 * ------------------------------------------------------------------
 * Use 'StringBuilder' ONLY when you are modifying text inside a LOOP.
 * - If you are concatenating (+) more than 3-4 times.
 * - If you are building a large file (CSV, JSON, HTML).
 * - Why? To avoid creating thousands of garbage objects in the Heap.
 * Example: for(i=0; i<100; i++) { sb.append(i); }
 *
 * ------------------------------------------------------------------
 * 3. WHY IS IMMUTABILITY A FEATURE? (The "Why" Question)
 * ------------------------------------------------------------------
 * It seems annoying, but it provides three huge benefits:
 *
 * A. Security (The most important):
 * If you pass a Database Password (String) to a plugin, you know
 * for a fact that the plugin cannot modify that password.
 * The original string is safe.
 *
 * B. Caching (The String Pool):
 * Since Strings never change, Java can save one copy of "Hello"
 * in memory and let 500 variables point to it. This saves huge RAM.
 * (If it were mutable, one change would break all 500 variables).
 *
 * C. Thread Safety:
 * In multi-threaded apps, you don't need to lock Strings.
 * Since no one can write to them, no one can corrupt them.
 * ------------------------------------------------------------------
 */
}
