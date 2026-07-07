# Coding Prep

Algoritmizálós és alap-logikai gyakorlófeladatok gyűjteménye Java-ban.
A collection of algorithmic and core-logic practice exercises in Java.

Minden feladat egy önálló, futtatható osztály — a cél a problémamegoldó gondolkodás
és az alap-adatszerkezetek (tömbök, string-ek, Map-ek) rutinszerű használata.
Each exercise is a standalone, runnable class — the goal is to build problem-solving
fluency and comfort with core data structures (arrays, strings, maps).

---

## Magyar

### Technológiák

- Java 21
- Maven build

### Cél

Ez a projekt kis, önmagában megálló feladatok gyűjteménye. Mindegyik egy konkrét
alapproblémát old meg (string-manipuláció, tömbök bejárása, számjegyek kezelése,
gyakoriság-számlálás Map-pel, stb.). A hangsúly nem a méreten van, hanem azon, hogy
a klasszikus minták (két mutató, egymásba ágyazott ciklusok, HashMap-es keresés,
számjegyre bontás modulóval) magabiztosan menjenek.

### Felépítés

A feladatok téma szerinti csomagokba rendezve, minden feladat külön osztály saját
`main` metódussal — így önállóan futtatható és bármikor visszanézhető.

```
src/main/java/com/attila/
├── strings/       string-műveletek (fordítás, palindróma, anagramma, szófordítás)
├── arrays/        tömbös feladatok (pl. Two Sum, legnagyobb elem)
├── numbers/       számokkal kapcsolatos feladatok (számjegyek, összegzés)
├── collections/   
└── streams/       
```

### Feladat-minta

Minden osztály önállóan futtatható a `main`-jén keresztül:

```java
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));  // [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        // ...
    }
}
```

### Indítás

Egy adott feladat futtatása IntelliJ-ben: nyisd meg az osztályt, és futtasd a `main`-jét.

Parancssorból:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.attila.arrays.TwoSum"
```

### Témák, amiket a gyűjtemény lefed

- String-műveletek: megfordítás, palindróma-vizsgálat, szavak megfordítása, anagramma.
- Tömbök: bejárás, keresés, párok keresése (Two Sum), min/max.
- Számok: számjegyekre bontás modulóval és egész-osztással, számjegyek összege.

### Hátra lévő témák
- Gyűjtemények: gyakoriság-számlálás HashMap-pel, leggyakoribb elem.
- Stream API: szűrés, map-elés, összegzés lambda kifejezésekkel.

---

## English

### Tech stack

- Java 21
- Maven build

### Purpose

This project is a collection of small, self-contained exercises. Each one solves a
specific core problem (string manipulation, array traversal, digit handling, frequency
counting with a map, etc.). The focus isn't on size but on making the classic patterns
(two pointers, nested loops, HashMap lookups, digit extraction with modulo) second nature.

### Structure

Exercises are organized into topic packages; each one is a separate class with its own
`main` method — so it can be run on its own and revisited anytime.

```
src/main/java/com/attila/
├── strings/       string operations (reverse, palindrome, anagram, word reversal)
├── arrays/        array exercises (e.g. Two Sum, largest element)
├── numbers/       number-related exercises (digits, summation)
├── collections/   
└── streams/       
```

### Exercise pattern

Each class is runnable on its own via `main`:

```java
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));  // [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        // ...
    }
}
```

### Running

To run a specific exercise in IntelliJ: open the class and run its `main`.

From the command line:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.attila.arrays.TwoSum"
```

### Topics covered

- String operations: reversal, palindrome check, word reversal, anagram check.
- Arrays: traversal, search, finding pairs (Two Sum), min/max.
- Numbers: digit extraction with modulo and integer division, sum of digits.

### Later
- Collections: frequency counting with HashMap, most frequent element.
- Stream API: filtering, mapping, reducing with lambda expressions.

---

A growing collection of Java practice exercises focused on core problem-solving patterns
and data-structure fundamentals.
