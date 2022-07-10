// Scala Tutorial 2

//Question 1 & 2
var k , i , j = 2
var m , n = 5
var f = 12.0f
var g = 4.0f
var c ='X'

//Question 3 ---->>>>>  part 1
k + 12 * m
m / j
n % j
m / j * j
f + 10 * 5 + g

//Question 3 ---->>>>>  part 2
var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f

b = b - 1
println(b * a + c * d)
d = d - 1

println(a)
a = a + 1

println(-2 * (g - k) + c)

println(c)
c = c + 1

c = c + 1
println(c * a)
a = a + 1




//Question 4

//part a
def normalWorkingSalary(h:Int):Double= 250.00 * h
def OTWorkingSalary(h:Int):Double= 85.00 * h
def income(normalHour:Int, OTHour:Int) : Double= normalWorkingSalary(normalHour) + OTWorkingSalary(OTHour)
def tax(income:Double):Double= income * 0.12
def takeHomeSalary(h1:Int,h2:Int):Double= income(h1,h2) - tax(income(h1,h2))

println(takeHomeSalary(25,10))



//part b
def  noOfPeople(Price:Int):Int= 120 + ( (15-Price) /5 ) * 20
def incomeFromTickets(P1:Int):Int = noOfPeople(P1:Int) * P1
def cost(P1:Int):Int = 500 + noOfPeople(P1) * 3
def profit(ticketPrice:Int):Int= incomeFromTickets(ticketPrice)- cost(ticketPrice)

println(profit(5), profit(10), profit(15))
println(profit(20), profit(25), profit(30),
  profit(35),profit(40),profit(45),profit(50))

println(profit(25))
//Best ticket price is Rs. 25 because maximum profit can be get from that price.