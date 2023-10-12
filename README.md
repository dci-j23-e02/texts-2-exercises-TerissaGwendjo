# EX1: substring() in java

## Overview:

The java string substring() method returns a part of the string.
We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive.
In other words, start index starts from 0 whereas end index starts from 1.

## Task

### "Without own words"
Please write a program that prints out "Hello Gregor", The challange is you are not allowed to create own chars & strings. But only use elements of a given string provided in the solution.java file.


### Output
"Hello Gregor"


# EX2: trim() in java

## Overview:

The Java String trim() method returns a new string of the given input string without the leading and trailing spaces.

## Task

Have a look at the ["isEmpty"](https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html#isEmpty()). We want to build an improved version that is not only identifies empty strings but also strings that consists only of whitespaces.

Therefore the method should return:
* "empty string"
* "only whitespaces"
* "not empty"

### Input / Output:
"" --> "empty string"  
"  " --> "only whitespaces"  
" hello " --> "not empty"  


# EX3: Functioninator 8000
## Task
Create a function that takes a single word string and does the following:

Concatenates inator to the end if the word ends with a consonant otherwise, concatenate -inator instead.

Adds the word length of the original word to the end, supplied with '000'.

## Input / Output

* inatorInator("Shrink") ➞ "Shrinkinator 6000"
* inatorInator("Doom") ➞ "Doominator 4000"
* inatorInator("EvilClone") ➞ "EvilClone-inator 9000"
