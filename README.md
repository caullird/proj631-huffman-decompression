# Decompression of coded data by the Huffman method

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)  [![forthebadge](http://forthebadge.com/images/badges/powered-by-electricity.svg)](http://forthebadge.com)

This program, using a binary string and a frequency dictionary, allows to decode a text that has been coded by the Huffman method

## How to install the program?

Clone the repo:

```sh
git clone git@github.com:caullird/proj631-huffman-decompression.git
```

## How to use the program?

Add your frequency and compression file to the **data/initial_data** folder

```java
String freqFile = "src/data/initial_data/poly_freq.txt";
String binaryFile = "src/data/initial_data/poly_comp.txt";
```

Run your program, a window with the result will appear! 

## Example of execution

**First Step :** 

The program retrieves the binary string

```bin
100011010111000101001110
```

**Second Step :**

The program retrieves the frequency dictionary

```bin
8
p 1
o 1
l 1
y 1
c 1
r 1
e 1
w 1
```

**Third Step :**

The program generates the Huffman tree

![image](https://user-images.githubusercontent.com/54810120/121153320-3fe26680-c846-11eb-9bc3-6ef37c1a6cf9.png)


**Fourth Step :**

The program traverses the tree with the binary string

```java
polycrew
```

## Fabriqué avec

* [Java](https://www.java.com/fr/)
* [Eclipse](https://www.eclipse.org/) - Java IDE

## Versions

**Latest stable release :** 1.0
**Latest release** 1.0


## Auteurs

* **CAULLIREAU Dorian** _alias_ [@caullird](https://github.com/caullird)

Read the list of [contributors](https://github.com/your/project/contributors) to see who helped with the project!





