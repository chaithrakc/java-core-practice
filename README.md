# Java Core & OOPs Practice

Personal practice repository while learning **Core Java & Object-Oriented Programming**.
Each package corresponds to one topic; each class is one small, self-contained, runnable
program that demonstrates a single concept — with comments explaining *what* and *why*.

## Why this structure?

- **One concept per file** – easy to review, easy for others (recruiters, mentors) to skim.
- **Package = topic** – mirrors how most Core Java courses are taught, so you can map
  each package directly back to your notes/course chapters.
- **Numbered class names** (`Ex01_...`, `Ex02_...`) – preserves the order you learned
  things in, so the repo reads like a story, not a random file dump.
- **A README per package** – a short recap of the concept + links to the files, written
  in your own words (best way to prove — to yourself and to anyone reviewing the repo —
  that you actually understand it, not just copied code).

## Structure

```
java-core-practice/
├── pom.xml                         # Maven build (compile/run without an IDE)
├── .gitignore
├── README.md
├── docs/
│   └── notes/                      # optional: markdown notes per topic
└── src/
    ├── main/java/com/yourname/corejava/
    │   ├── basics/
    │   │   ├── datatypes/
    │   │   ├── operators/
    │   │   ├── controlflow/
    │   │   ├── arrays/
    │   │   └── strings/
    │   ├── oops/
    │   │   ├── classesobjects/
    │   │   ├── constructors/
    │   │   ├── inheritance/
    │   │   ├── polymorphism/
    │   │   ├── encapsulation/
    │   │   ├── abstraction/
    │   │   ├── interfaces/
    │   │   └── statickeyword/
    │   ├── exceptionhandling/
    │   ├── collections/
    │   │   ├── list/
    │   │   ├── set/
    │   │   ├── map/
    │   │   └── comparablecomparator/
    │   ├── multithreading/
    │   └── iostreams/
    └── test/java/com/yourname/corejava/    # optional JUnit tests as you get comfortable
```

## How to use this while learning

1. Learn a concept (from your notes / course / the PDF).
2. Create a new file in the matching package: `ExNN_ShortConceptName.java`.
3. Write the smallest program that proves you understand it — include a `main` method,
   run it, and paste real output as a comment at the bottom.
4. Update that package's `src/main/java/com/chay/corejava/oops/README.md` with a 2–3 line summary in your own words.
5. Commit with a message that names the concept, e.g.:
   `git commit -m "Add example: method overriding vs overloading"`
6. Push. Over weeks this becomes a visible, well-organized changelog of your learning —
   great to link on a resume or LinkedIn.

## Running

```bash
# compile everything
mvn compile

# run a single class
mvn compile exec:java -Dexec.mainClass="inheritance.oops.com.chay.corejava.Ex01_BasicInheritance"
```

Or without Maven, plain `javac`/`java` from the `src/main/java` root also works fine.

## Renaming the package

Replace `com.yourname.corejava` with your own reverse-domain style package
(e.g. `com.chaithra.corejava`) — rename the folders under `src/main/java/com/` and
update the `package` line at the top of every file, plus `groupId` in `pom.xml`.
