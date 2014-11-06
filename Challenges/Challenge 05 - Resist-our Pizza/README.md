Resist-our Pizza
================

Pizza is one of the top food choices for the IEEE Xtreme Programming Competition in North American universities. Although delicious, there are 270 calories in each pizza slice, plus additional calories for toppings as described in the table below.

![](http://hr-filepicker.s3.amazonaws.com/ieee-xtreme-2014/Pizza_Img1.png)

This problem was designed to help teams select food for the IEEE Xtreme that would provide a more balanced diet and therefore improve their performance in the competition.

Task
====

Write a program that takes as an input a number of different pizza combinations and estimates the total calories eaten for that meal.

The input should be of the form: number of different pizza combinations, number of slices of each pizza, and toppings selected for each of the slices.

Input
=====

The input will contain:

- 1 <= different pizza combinations <= 100
- For each pizza combination: 
    - 0 <= Number of slices of pizza eaten < 100
    - A comma separated list of toppings with at least one topping (no spaces before/after commas).

Output
======

The output should state, “The total calorie intake is “ followed by the number of calories. 
**Note: There is a newline character at the end of the last line of the output string.**

Sample Input 1
==============

    2 1 Pepperoni 2 Pineapple,Ham

Sample Output 1
===============

    The total calorie intake is 1024

***

Test results
============

**100 points**

- \# 0  0.15s : Success 
- \# 1  0.15s : Success  (sample)
- \# 2  0.15s : Success 
- \# 3  0.15s : Success 
- \# 4  0.14s : Success 