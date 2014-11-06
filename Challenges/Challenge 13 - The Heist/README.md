Rob to the Big Bank
===================

Today is your great day; you and your team have everything ready for one of the biggest hits of your life by launching a heist to the ?Big Bank?. You and your partners manage to take control over all the hostages and guards without many casualties, everything goes smoothly and you are ready to start drilling the big vault for the biggest pay of your life. 

Your friend Dallas starts the drill, which unfortunately hangs multiple times during the process (that what happens when you buy cheap tools for a big robbery!) Making the robbery take more time than expected but still the drill manages to open the vaults thick lock. 

Unfortunately, something goes wrong and after opening the door, an alarm safety triggers which starts to send an immediate response to the authorities about the breach of the vault. Everyone now knows that the robbery is taking place and you realize that there is not so much time left before the police shows up at your doorstep with a bulldozer and a swat team. 

Time is crucial and luckily, you come prepared for this problem and you put in practice your tech skills and run a program in order to help you decide which items you need to carry in order to gain the highest profit based on your total teams load capacity. 

Of course, as you would expect a large amount of money is in game as the vault is ?endless?; if not why would you want to rob the ?Big Bank? in the first place? As a good robber and programmer you know that your program needs to be fast enough to give you a solution in a reasonable amount of time so you also give **priority** to the items stored in the vault based on their profit **Ratio = value/load** (you want to keep the items with highest value and have less load).



Task
====

Your task involves implementing a program that will help the robbers choose how many values they need to grab in order to maximize the revenue of their robbery and the items you need to get from the vault in order to achieve this. You will also show how much share each robber gains from this hit based on what they can carry after the revenue has been decided.

Input
=====

The information for the program will be passed through standard input. The first line will contain two positive single space separated integer values **N** and **M**, corresponding to the number of robbers involved in the heist and to the load capacity of each robber (all robbers will have the same load capacity equal to **M**). . 

Then it will follow multiple lines with details of each valuable stored in the vault with their respective load and value, in the following format: 
[item name],[whole load amount],[value for whole amount] 

**Example**: Diamond,2000000,200 : the 200 is the value for the whole amount of 2000000 Diamonds 

The list of elements of the bank will finish with the keyword END in the last line of input.

**Note: There will be at maximum 5 items per input test case.**

Output
======

The format of the solution will be in the form of multiple lines where the first lines have the following structure: 
[item name],[number of times taken],[total aggregated load of this item],[total aggregated value of this item]. 
The items in the output string should be listed in alphabetical order (from A to Z) based on the name of each item (for example, if the items chosen to be taken are Jewelry, Money, and Diamond, then tehy should be ordered as Diamond, Jewelry and then Money). 
Then, the next line should report the total load of all items in solution and the total value of these items, in the following format: 
[total load of all items in solution],[total value of all the items in solution] 
Finally the last line of the output should report the split share that each robber gets from the heist depending on the total number of robbers involved. The format of this line should be as follows: 
Each robber gets: [value] 
(Please note the space after the : and before the [value]). 
The [value] for this last line should be **rounded to 2 decimal digits**. 
**Note: There is a newline character at the end of the last line of the output.**


Sample Input 1
==============

    4 8089000 
    Diamond,2000000,200 
    Ruby,3500000,400 
    Gold,10000000,1000 
    Jewelry,1500000,160 
    Money,1000000,100 
    END

Sample Output 1
===============

    Jewelry,2,3000000,320 
    Money,1,1000000,100 
    Ruby,8,28000000,3200 
    32000000,3620 
    Each robber gets: 905.00

Sample Input 2
==============

    5 6471200 
    Jewelry,995756,962 
    Money,392852,13 
    Ruby,564827,1388 
    Gold,844392,854 
    Diamonds,800830,584 
    END

Sample Output 2
===============

    Ruby,57,32195139,79116 
    32195139,79116 
    Each robber gets: 15823.20

***

Test results
============

**33.33 points**

- \# 0  0.05s : Success  (sample)
- \# 1  0.05s : Success  (sample)
- \# 2  0.05s : Wrong Answer 
- \# 3  0.21s : Runtime Error 
- \# 4  0.05s : Wrong Answer 
- \# 5  0.05s : Wrong Answer 
