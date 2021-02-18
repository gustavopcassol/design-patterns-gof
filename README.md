# Design Patterns GoF

#### This project aims to implement very minimalistic examples of each pattern in the book _Design Patterns: Elements of Reusable Object-Oriented Software (1994)_.

Project Java version: `15.0.2`

Code in "structure" packages are based on the "Structure" and "Participants" parts of each design pattern chapter.

Code in "implementation" packages are based on the whole chapter of the design pattern.

Some liberties were taken on "structure" packages:

- Classes with undefined visibility are "package-private";
- Fields with undefined visibility are "private";
- Fields with undefined type are "int";
- Methods with undefined visibility are "package-private";
- Methods with undefined type are "void";
- The "Client" classes that are shown in the diagram are not implemented;
- Getters and setters that are shown in the diagram are implemented; and
- Other small changes were made based on linters recommendations.