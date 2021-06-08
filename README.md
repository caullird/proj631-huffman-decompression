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

### Example of execution

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

Entrez les programmes/logiciels/ressources que vous avez utilisé pour développer votre projet

_exemples :_
* [Materialize.css](http://materializecss.com) - Framework CSS (front-end)
* [Atom](https://atom.io/) - Editeur de textes

## Contributing

Si vous souhaitez contribuer, lisez le fichier [CONTRIBUTING.md](https://example.org) pour savoir comment le faire.

## Versions
Listez les versions ici 
_exemple :_
**Dernière version stable :** 5.0
**Dernière version :** 5.1
Liste des versions : [Cliquer pour afficher](https://github.com/your/project-name/tags)
_(pour le lien mettez simplement l'URL de votre projets suivi de ``/tags``)_

## Auteurs
Listez le(s) auteur(s) du projet ici !
* **Jhon doe** _alias_ [@outout14](https://github.com/outout14)

Lisez la liste des [contributeurs](https://github.com/your/project/contributors) pour voir qui à aidé au projet !

_(pour le lien mettez simplement l'URL de votre projet suivi de ``/contirubors``)_

## License

Ce projet est sous licence ``exemple: WTFTPL`` - voir le fichier [LICENSE.md](LICENSE.md) pour plus d'informations


