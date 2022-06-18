# Beexl

Beexl is a programming language based on python, it has most of the basic programming fuctions and has the plus of being able to draw pixel art.

## Authors
- [Bernardo Giron Arana](https://github.com/Jobegiar99)
- [Diana Martinez Valverde](https://github.com/donut99marverde)

## Index
- [1. User Manual](#1-user-manual)
	- [1.1. Previous requirements to run the program](#11-previous-requirements-to-run-program)
	- [1.2. Program structure](#12-program-structure)
	- [1.3. Data Types](#13-data-types)
	- [1.4. Variables](#14-variables)
	- [1.5.Operators](#15-operators)
	- [1.6. Functions](#16-functions)
	- [1.7. Return](#17-return)
	- [1.8. Print](#18-print)
	- [1.9 Save Animation](#19-save-animation)
- [2. Documentation](#2-documentation)
- [3. Video Tutorial](#video-tutorial)


# 1 User Manual

## 1.1. Previous requirements to run the program

To be able to run the program you need to have:

1. Python 3, you can downloaded [here](https://www.python.org/downloads/). 

2. Antlr, you can downloaded [here](https://www.antlr.org). You can also check out this really useful tutorial [here](https://www.youtube.com/watch?v=p2gIBPz69DM)

3. You must install some Python libraries, like `pip install Pillow`, `pip install time`, `pip install copy`, and `pip install cv2`


## 1.2. Program structure

There are two ways to start a new file either `create` or `read` a file, one must always start with this.

`create`
```bash
filename create "beexl.png";
canvas 100,100;
background rgba ( 10 , 10 , 10 , 244 );

# Functions

fun void main () {
    # code
}
```

`read`
```bash
filename read "beexl.png";

*Functions*

fun void main () {
    # code
}
```

## 1.3. Data types

Beexl has different data types: 
- `int`
- `rgba`
- `vector`
- `float`
- `bool`


## 1.4. Variables

To correctly declare a variable one has to put `var :` , then the variable data type `;`. 
The ID must start with a letter, it can be followed by a letter or number, or a `_` 
After that, in another line we assign the value.

### Correct way
`var` `popipo` `:` `data_type` `;`
`var` `Hatsune_Miku20` `:` `data_type` `;`

### Incorrect way
`var` `1o1ipop` `:` `data_type` `;`
`var` `Hatsune-Miku` `:` `data_type` `;`

1. Example with integer

```sh
var fact:int;
fact = 5;
```

2. Example with array

```sh
var arr1[ 4 ]:int;
arr1[x] = 2
```

3. Example with vector
```sh
var al: vector; 
# assign value
```

## 1.5. Operators

| Operation| Operand |
| ------------- | ------------- |
| Addition  | +  |
| Subtraction  | -  |
| Multiplication  | *  |
| Division  | /  |
| Greater than  | >  |
| Less than  | <  |
| Greater or equal to  | >=  |
| Lesser or equal to  | <=  |
| Equal  | ==  |
| Not equal  | !=  |
| AND  | &  |
| OR  | \|  |
| Equal between  | =  |

## 1.6.  Functions
There are two types of `void` and value returning.

`void`
```sh
fun void ameno ( Parameters){
	#code
}
```
Value returning
```sh
fun int ameno ( Parameters){
	#code
	return value;
}
```

## 1.7. Return
The return structure starts with `return` followed by the value we want to return and a `;`. 

```sh
return value;
```

## 1.8. Print
This function can print various things into the console. It's a `print` followed by two parenthesis, between those parenteses you put what you wanna print, then a `;`. 

```sh
print ( 3 );
```

## 1.9. Save Animation
`save_animation` shows the image one creates.

## 2. Documentation

If you want to know more about Beexl then check the [documentation here](https://docs.google.com/document/d/1XxfQl1E8LS0H9Gq30Hi9CTA_gnfen0_qnIqxe5_SkVE/edit?usp=sharing)

## 3. Video Tutorial
A [video tutorial](https://drive.google.com/drive/folders/1ZlJpQWWbXlspeFnnvzQiuw5Ua5pxQJ8M?usp=sharing)  of how to run and make programs in Beexl. There were audio issues while recording it. Will update it soon.
