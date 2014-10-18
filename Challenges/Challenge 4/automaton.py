rule, max_iters, n, init, *meh = map(int, input().split(' '))

def byte(number, n=8):
	return bin(number)[2:].zfill(n)

def display(line):
	print('-', end='')
	for char in line:
		if char == '1':
			print('*', end='')
		else:
			print(' ', end='')
	print('-')

def get_value(pix, old_line):
	pos = [pix-1, pix, pix+1]
	truth = ['0', '0', '0']
	for i in range(len(pos)):
		if pos[i] >= 0 and pos[i] < n:
			truth[i] = old_line[pos[i]]
	return dic[''.join(truth)]

#Define the rule:
rulebook = ['111', '110', '101', '100', '011', '010', '001', '000']
rule = [x for x in byte(rule)]
dic = dict(zip(rulebook, rule))

#Initialize cells:
line = []
cell_matrix = []
b_init = byte(init, n)
for bit in b_init:
	line.append(bit)
cell_matrix.append(line)

#Till' morning comes, let's iterate. https://www.youtube.com/watch?v=Qg6BwvDcANg
for i in range(1, max_iters):
	line = []
	for pix in range(n):
		line.append(get_value(pix, cell_matrix[i-1]))
	cell_matrix.append(line)

#Display.
for i in range(len(cell_matrix)):
	print(str(i+1) + ' '*(4-len(str(i+1))), end='')
	display(cell_matrix[i])
	if i > 0:
		if cell_matrix[i] == cell_matrix[i-1]:
			break
