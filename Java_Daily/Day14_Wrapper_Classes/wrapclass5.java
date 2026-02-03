package Java_Daily.Day14_Wrapper_Classes;

public class wrapclass5 {
    
    // ---DOCUMENTATION---

/*
 * ------------------------------------------------------------------
 * ENGINEERING CHEAT SHEET: Primitives vs. Wrappers
 * ------------------------------------------------------------------
 *
 * 1. WHEN TO USE PRIMITIVES (int, double, boolean)
 * ------------------------------------------------------------------
 * ALWAYS default to primitives unless you have a specific reason not to.
 * * - FOR MATH: formulas, counters, loops (i++).
 * - FOR MEMORY: If you have an array of 1,000,000 numbers.
 * int[] arr = 4 MB RAM.
 * Integer[] arr = 20 MB RAM (5x bigger!).
 * - FOR SAFETY: When a value MUST exist (cannot be null).
 *
 * ------------------------------------------------------------------
 * 2. WHEN TO USE WRAPPERS (Integer, Double, Boolean)
 * ------------------------------------------------------------------
 * Use them only when Java forces you to, or for data modeling.
 *
 * - COLLECTIONS: ArrayList<Integer>, HashMap<String, Integer>.
 * (Collections do not accept primitives).
 * - DATABASES: When a value might be missing (NULL).
 * int price = 0;   (Is it free? Or did we forget to enter it?)
 * Integer price = null; (We definitely don't know the price).
 * - UTILITIES: Parsing strings (Integer.parseInt("123")).
 *
 * ------------------------------------------------------------------
 * 3. THE TRADE-OFF
 * ------------------------------------------------------------------
 * - Primitives = High Performance, Low Overhead.
 * - Wrappers = High Flexibility, Null Support, Higher Memory Cost.
 *
 * RULE OF THUMB:
 * "Use int for calculations. Use Integer for storage in Lists."
 * ------------------------------------------------------------------
 */

    }
    

