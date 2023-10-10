num = 9
def Factorial(num):

	value = 1
	count = 1

	while count <= num:
		value = value * count
		count = count + 1

	return value


max = 16
min = 1

def FizzBuzz(min , max):
	
	while max > min:
		if min % 3 == 0:
			if min % 5 == 0:
				print("FizzBuzz")
		elif min % 3 == 0:
			print("fizz")
		elif min % 5 == 0:
			print("Buzz")
		else:
			print(min)


		min = min + 1


n = 15
def Fibonacci(n):

	previous = 0
	current = 1
	index = 1
	while index <= n:

		print(current)
		temp = current
		current = current + previous
		previous = temp
		index += 1



print("Fibonacci")
Fibonacci(n)
print()

print("Factorial")
print(Factorial(num))
print()

print("FizzBuzz")
FizzBuzz(min,max)
print()
