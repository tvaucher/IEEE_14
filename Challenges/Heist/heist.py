
robbers, robber_load = list(map(int, input().strip().split(' ')))
robber_load *= robbers
init_robber_load = robber_load
items = []
while True:
	inp = str(input().strip())
	if inp == 'END':
		break
	else:
		name, load, value = inp.split(',')
		items.append({'name': name, 'load': int(load), 'value': int(value), 'ratio': (int(value)/int(load)) })
"""
robbers = 4
robber_load = 8089000 * robbers
init_robber_load = robber_load

items = [{'load': 2000000, 'ratio': 0.0001, 'value': 200, 'name': 'Diamond'},
		 {'load': 3500000, 'ratio': 0.00011428571428571428, 'value': 400, 'name': 'Ruby'},
		 {'load': 10000000, 'ratio': 0.0001, 'value': 1000, 'name': 'Gold'},
		 {'load': 1500000, 'ratio': 0.00010666666666666667, 'value': 160, 'name': 'Jewelry'},
		 {'load': 1000000, 'ratio': 0.0001, 'value': 100, 'name': 'Money'}]
"""

items = sorted(items, key=lambda k: (-k['ratio'], k['load'], k['value'], k['name']))
smallest_load = min([item['load'] for item in items])
variations = []
i = 0
taken = []


while robber_load >= smallest_load:
	#take one of the best elements available
	name = items[i]['name']
	load = items[i]['load']
	value = items[i]['value']
	if load > robber_load:
		i += 1
		if i > len(items):
			break
		continue
	if not any(d['name'] == name for d in taken):
		taken.append({'name': name, 'amount': 1, 'load': load, 'value': value})
	else:
		taken[i]['amount'] += 1
		taken[i]['load'] += load
		taken[i]['value'] += value
	robber_load -= load
variations.append(taken)


robber_load = init_robber_load
taken = []
i = 0
j = 0
while robber_load >= smallest_load:
	#take one of the best elements available
	name = items[i]['name']
	load = items[i]['load']
	value = items[i]['value']
	if (load + items[i+1]['load'] > robber_load) and j <= 1:
		i += 1
		if i > len(items):
			break
		j += 1
		continue
	if not any(d['name'] == name for d in taken):
		taken.append({'name': name, 'amount': 1, 'load': load, 'value': value})
	else:
		taken[i]['amount'] += 1
		taken[i]['load'] += load
		taken[i]['value'] += value
	robber_load -= load
variations.append(taken)

def display(taken):
	for item in sorted(taken, key=lambda k: k['name']):
		print(item['name'] + ',' + str(item['amount']) + ',' + str(item['load']) + ',' + str(item['value']))
	total = sum([taken[i]['value'] for i in range(len(taken))])
	print(str(sum([ taken[i]['load'] for i in range(len(taken))])) + ',' + str(total))
	print("Each robber gets: " + str(round(total / robbers * 1.00, 1)) + '0')

#Choosing the best variation.
if (sum([variations[0][i]['value'] for i in range(len(variations[0]))])) > (sum([variations[1][i]['value'] for i in range(len(variations[1]))])):
	display(variations[0])
else:
	display(variations[1])