# Unexpected Behavior with removeIf on MutableList
This repository demonstrates an uncommon bug in Kotlin related to the use of the `removeIf` function on a mutable list.  The `removeIf` function, while convenient, can lead to unexpected results if not used carefully.  The provided code shows the issue and a solution using an iterator for safe removal.

## Bug Description
The original code attempts to remove even numbers from a list using `removeIf`.  However, the removal of an element alters the list's indices, potentially leading to elements being skipped or the iteration not completing as expected.

## Solution
The solution avoids this by using an iterator to remove elements. This allows for safe removal without disrupting the iteration process.