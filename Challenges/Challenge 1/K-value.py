while True:
	n, m, k = list(map(int, input().strip().split(' ')))
	integers = list(map(int, input().strip.split(' ')[:int(n)]))
	condition1 = (1 < n and n <= 100000)
	condition2 = (1 <= m and m < n)
	condition3 = (1 <= k and k <= m)
	condition4 = True
	for val in integers:
		condition4 = (0 <= val and val <= 2147483647)
		if not condition4:
			break
	if (condition1 and condition2 and condition3 and condition4):
		break

k_smallest = []

for i in range(0, n):
	sublist = sorted([integers[i%n] for i in range(i, i+m)])
	k_smallest.append(sublist[k-1])
print(min(k_smallest))