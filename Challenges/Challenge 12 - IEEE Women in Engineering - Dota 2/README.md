Time to play some DOTA 2!
=========================

You and a group of friends decide one afternoon to hang around together in your friends garage for an intensive session of LAN party. One of your friends suggest to play a game of DOTA 2, a popular game present in the most prestigious e-sport events, in particular your friend suggests this game after been able to watch this years “The International” DOTA 2 tournament which gathers the best teams in the whole world. 

“DOTA 2 is a multiplayer online battle arena game, with the gameplay focused around combat in map divided in two fronts where teams of 5 players play against each other. The player may command a single controllable character called a "Hero", which is chosen from a selection pool of heroes. Each Hero begins the match at level one, but may become more powerful by leveling up by accumulating experience through combat. The Hero's methods of combat are influenced by its primary property, which can be Strength, Agility, or Intelligence.” 

The night is long and you and your friends played for hours and after that long gaming session you and your friends come to the conclusion that this game is so fun and challenging that you start thinking of creating a competitive team with your friends. You are so excited with the idea that you start to plan your first steps into competitive play and you realize that you need some sort of feedback of your actual gameplay in order to improve and become one of the best. Unfortunately, you realize this problem involves some technical skills and luckily, you are fortunate to know that one of your friends is a good proficient engineer in programming which also likes DOTA 2 and decides to give you a hand to devise your own Hero Coacher. 

He states that he has the perfect way to identify which heroes a player needs to select depending on its previous history from a small selection. He defines the quality of a hero for that player, as qi = fi/zi. 

fi = winner ratio percentage which is proportional to win:loss ratio of all the games played by that player **rounded down to the nearest whole number** 

zi = world wide rank, which in our case it is assumed as follows: 

“The list of proposed heroes will always be given in the order of their popularity, this means that the first hero is picked more than the second hero, the second more than the third, etc.. Briefly speaking, we can see that further down this hero is in the list, the less popular he is. 

In order to simplify things; the value zi can be mapped as the relative popularity based on its position in the list (i'th position) which will be proportional to 1/i.” 

**Example**: “If the hero Spectre with 34:22 ratio is located in the position 3 of the list, its world wide rank is proportional to 1/3 and its winner ratio will be 60 (i.e. 34/(22+34) = 0.607 = 60.7%, therefore his winner ratio will be 60, i.e. 60.7=60 when rounded down to the nearest whole number) so q3 = 60/(1/3) = 180” 

In addition, you are capable of identifying a players affinity for a certain type of hero from the Strength, Agility and Intelligence areas on the pool of the selected group of heroes that you give as a solution.


Task
====

Your task is to select from a pool of heroes and game plays statistics of the player, a subset of desired heroes that the player excels most based on the quality of a hero. In addition, you should give out the affinity of the hero type of that player based on the small pool asked previously for.

Input
=====

The first line of input contains two integers n and m (1 <= n <= 50000, 1 <= m <= n), the number of heroes available, and the number of heroes to select. Then follow n lines. The ith of these lines contains a string with the hero name, the hero type and the win:loss ratio with that hero, separated by commas.

Output
======

Output a list of the m heroes with the highest quality qi, in decreasing order of quality. If two heroes have the same quality, give precedence to the one appearing first on the list. 
After that, you should print the affinity in the order Intelligence, Strength, Agility for each type of hero as a percentage formatted down to 2 digits on the selected group of heroes. 
Note: There is a newline character at the end of the last line of the output.

Sample Input 1
==============

    4 2 
    Silencer,Intelligence,83:80 
    Tiny,Strength,94:76 
    Spectre,Agility,34:22 
    Dazzle,Intelligence,60:89

Sample Output 1
===============

    Spectre 
    Dazzle
    
    This set of heroes: 
    Contains 50.00 percentage of Intelligence 
    Contains 0.00 percentage of Strength 
    Contains 50.00 percentage of Agility

Sample Input 2
==============

    15 3 
    Lina,Agility,91:29 
    Necrophos,Intelligence,93:36 
    Lycan,Strength,95:54 
    Skeleton King,Strength,20:33 
    Chaos Knight,Strength,67:75 
    Leshrac,Intelligence,16:63 
    Magnus,Strength,31:19 
    Anti Mage,Agility,55:99 
    Rubick,Intelligence,13:33 
    Clinkz,Agility,9:95 
    Drow Ranger,Agility,12:12 
    Bane,Intelligence,89:16 
    Spirit Breaker,Strength,63:20 
    Templar Assassin,Agility,74:57 
    Spectre,Agility,72:49

Sample Output 2
===============

    Bane 
    Spirit Breaker 
    Spectre
    
    This set of heroes: 
    Contains 33.33 percentage of Intelligence 
    Contains 33.33 percentage of Strength 
    Contains 33.33 percentage of Agility

***

Test results
============

**42.86 points**

- \# 0  0.15s : Success  (sample)
- \# 1  0.15s : Success  (sample)
- \# 2  0.15s : Success 
- \# 3  0.16s : Wrong Answer 
- \# 4  0.18s : Wrong Answer 
- \# 5  0.56s : Wrong Answer 
- \# 6  4s : Terminated due to timeout 