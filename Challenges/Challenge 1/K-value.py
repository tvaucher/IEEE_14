n, m, k = list(map(int, input().strip().split(' ')))
integers = list(map(int, input().strip().split(' ')[:int(n)]))

minimum = min(integers)

sublist = integers[:m]
k_smallest = sorted(sublist)[k-1]

for i in range(m, n + m - 1):
	sublist = sublist[1:] + [integers[i % n]]
	list_k_smallest = sorted(sublist)[k-1]
	if list_k_smallest == minimum:
		k_smallest = minimum
		break
	elif list_k_smallest < k_smallest:
		k_smallest = list_k_smallest

print(k_smallest)