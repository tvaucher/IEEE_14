Rajus Training
==============

Raju was accepted at the Computer Science Department of a leading University and he is now interested in becoming a winner at IEEEXtreme 8.0. However his programming skills are not ?sharp? enough and thus he asked the help of Rano, a senior year student of the same department. 
Raju has analyzed all subjects of study that has to mastered before he becomes proficient in programming and has discovered that there are some constraints in the way that these subjects should be studied (i.e. certain subjects may be studied before some others). Rano, who is more experienced, volunteered to organize these subjects according to their constraints and provide Raju with a plan of study that will be consistent to the provided constraints. Can you verify that Ranos plan of study indeed satisfies all constraints?

Task
====

Given a number of study subjects (N) and some constraints (M), your task is to evaluate a given study plan and assert whether it satisfies all constraints or not.

Input
=====

In the first line of the input, two space-separated positive integer values [N, M] will be provided (1 <= N <= 1000; 0 <= M <= 100000). The first number (N) corresponds to the number of study subjects whereas the second one represents the number of constraints characterizing these subjects.

Then, M lines will follow, each one containing two space-separated positive integer values [S, U] \(1 <= S <= N; 1 <= U <= N). Each of these two integers corresponds to a study subject and when both numbers are considered as a pair,they describe a constraint (for example the pair [3 4] would mean that subject 3 must be studied **before** subject 4).

The final line of the input contains a sequence of space-separated positive integers, each of which corresponds to one of the N study subjects. This line represents the study plan that was proposed by Rano.

Output
======

Your program should output to the standard output stream a single line containing the word:  
YES (if the proposed study plan fulfills **all** the provided constraints) , or the word:  
NO (if the proposed study plan fails to fulfill **even a single constraint** )  
**Note: There is a newline character at the end of the last line of the output.**

Sample Input 1
==============

    5 6 
    1 3 
    1 4 
    3 5 
    5 2 
    4 2 
    1 2 
    1 3 4 5 2

Sample Output 1
===============

    YES

***

Test Results
============

**100 points**

- \# 0  0.15s : Success  (sample)
- \# 1  0.15s : Success 
- \# 2  0.14s : Success 
- \# 3  0.15s : Success 
- \# 4  0.15s : Success 
- \# 5  0.15s : Success 
- \# 6  0.15s : Success 
- \# 7  0.15s : Success 