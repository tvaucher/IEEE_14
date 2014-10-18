#size of matrix:
n = int(input())
city = []
for _ in range(n):
	city.append( list(map(int, input().split(' '))) )


def greedy_path(a=(0,0)): ## ALL coordinates will be in (y, x)
	y_start, x_start  = a
	total_cost = 0
	current_x = x_start
	current_y = y_start

	while current_x < n - 1:
		lowest_cost = city[current_y][current_x + 1]
		lowest_dest = (current_y, current_x + 1)
		going = "RIGHT"
		for potential_y in range(current_y, n): #DOWN.
			step_cost = sum([city[i][current_x] for i in range(current_y+1, potential_y+1)]) + city[potential_y][current_x + 1]
			if step_cost < lowest_cost:
				lowest_cost = step_cost
				lowest_dest = (potential_y, current_x + 1)
				going = "DOWN"
		for potential_y in range(0, current_y): #UP
			step_cost = sum([city[i][current_x] for i in range(potential_y, current_y)]) + city[potential_y][current_x + 1]
			if step_cost < lowest_cost:
				lowest_cost = step_cost
				lowest_dest = (potential_y, current_x + 1)
				going = "UP"
		total_cost += lowest_cost
		current_y, current_x = lowest_dest
	return total_cost

shortest_trip = city[0][0] + greedy_path((0, 0))
for i in range(1, n):
	trip = city[i][0] + greedy_path((i, 0))
	if trip < shortest_trip:
		shortest_trip = trip
print(shortest_trip)