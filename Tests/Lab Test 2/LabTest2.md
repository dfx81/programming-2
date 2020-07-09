# Lab Test Answer

## Question 1
```
Meow. I am a cat. My name is Kurre
and I am 6 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.

```

## Question 2

Since ```Cat``` and ```Dog``` are subclasses of ```Animal```, they obtain all of the parent classes
```public``` and ```protected``` properties and methods through inheritence.

## Question 3

```Animal``` object kurre and vilma contains an instance of ```Cat``` and ```Dog``` respectively.

## Question 4

The file ```Animal.java, Cat.java, Dog.java and even Lab1Stage2.java``` consists of a classes with
the same name as the file respectively. A class consists of properties and method definitions.

## Question 5

A class acts as a blueprint of an object or instance. A class defines the properties and methods of an
object or instance while the instance is the object of a class created to be used in a program.

## Question 6
```
Meow. I am a cat. My name is Kurre
and I am 3 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.

```
```static``` fields are special properties that can be accessed without instantiating a class. However,
only a single instance of it exists and shared between all objects of the same class. Therefore, when we
set the age of vilma to 3, kurre's age will also be set to 3 since the age is now a ```static``` field that
belongs to ```Animal```.

## Question 8

Instance variable were stored under the class it was defined in. For example, the kurre and vilma instance
variables were defined in the ```main``` method of class ```Lab1Stage2```. Therefore, the varibles belongs
to the scope of ```main``` method inside ```Lab1Stage2``` class.

## Question 9

Value of class variable was stored inside a property of the class' objects. For example, ```age``` is a property
of ```Animal```. Therefore, the class variable ```age``` will be stored in an ```Animal``` instance.

## Question 10

The keyword ```this``` refers to the class itself. If two variables or methods with the same name are used, ```this```
keyword will make sure the current class version of the two will be used instead.