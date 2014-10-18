k, *seq = list(map(int, input().split(' ')))
seq_of_seq = []

def nekops_nu(sequence):
	result = []
	current = sequence[0]
	sequence.append('#') # Much hack. Such bad.
	counter = 0
	i = 0
	for value in sequence:
		if value == current:
			counter += 1
		else:
			result += [counter, current]
			current = value
			counter = 1
	return result

max_length = len(seq)
seq_of_seq.append(seq)

for _ in range(k):
	seq = nekops_nu(list(seq))
	seq_of_seq.append(seq)
	if max_length < len(seq):
		max_length = len(seq)

for step in seq_of_seq:
	dots = (max_length - len(step))
	print('.'*dots + ' '.join(list(map(str, step))) + '.'*dots)
print(len(seq))