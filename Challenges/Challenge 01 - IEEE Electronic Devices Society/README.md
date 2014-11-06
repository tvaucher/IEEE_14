“K”-value
=========

You are given N integers that are arranged circularly. There are N ways to pick consecutive subsequences of length M (M < N). For any such subsequence we can find the “K”-value of that subsequence. “K”-value for a given subsequence is the Kth smallest number in that subsequence.

Task
====

Find the smallest “K”-value out of all possible subsequences. 
1 < N <= 100,000 
1 <= M < N 
1 <= K <= M 
0 <= any integer in the circle <= 2,147,483,647

Input
=====

First line of the input will contain three integers N, M and K separated by spaces respectively. 
Second line of the input will contain N integers separated by spaces in clockwise order starting from an arbitrary location.

Output
======

Output should contain only one integer, smallest “K”-value out of all possible subsequences. 
Note: There is a newline character at the end of the last line of the output.

Sample Input
============

    5 3 2 
    1 5 3 4 2

Sample Output
=============

    2

Sample Explanation
==================

2nd smallest of subsequence 1, 5, 3 is 3 
2nd smallest of subsequence 5, 3, 4 is 4 
2nd smallest of subsequence 3, 4, 2 is 3 
2nd smallest of subsequence 4, 2, 1 is 2 
2nd smallest of subsequence 2, 1, 5 is 2 
Therefore the smallest “K”-value is 2.


Test Results
============

**50 points**

- \# 0  0.32s : Success
- \# 1  3.48s : Success
- \# 2  10s : Terminated due to timeout
- \# 3  0.05s : Success 
- \# 4  0.32s : Success 
- \# 5  0.08s : Success 
- \# 6  10s : Terminated due to timeout 
- \# 7  10s : Terminated due to timeout 
- \# 8  10s : Terminated due to timeout 
- \# 9  10s : Terminated due to timeout