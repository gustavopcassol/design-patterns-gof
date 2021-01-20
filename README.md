# design-patterns-gof

###### This project aims to implement very minimalistic examples of each pattern in the book _Design Patterns: Elements of Reusable Object-Oriented Software (1994)_.

Code in "structure" packages are based on the "Structure" and "Participants" parts of each design pattern chapter.

Code in "implementation" packages are based on the whole design pattern chapter.

Some liberties were taken on "structure" packages:

- Classes with undefined visibility are "package-private";
- Fields with undefined visibility are "private";
- Fields with undefined type are "int";
- Methods with undefined visibility are "package-private";
- Methods with undefined type are "void";
- Getters and setters are implemented; and
- Other small changes based on linters recommendations.