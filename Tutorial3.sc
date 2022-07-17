//------------------------------------Question 01--------------------------------------------------
//  Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?

def areaDisk (r:Int):Double = math.Pi * r * r
areaDisk(5)


//-------------------------------------------------------------------------------------------------





//------------------------------------Question 02--------------------------------------------------
//  The temperature is 35C; convert this temperature into Fahrenheit. ( ºF =ºC * 1.8000 + 32.00 )

def tempFahren (c:Int) :Double = c * 1.8000 + 32.00
tempFahren(35)


//-------------------------------------------------------------------------------------------------





//------------------------------------Question 03--------------------------------------------------
//  The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

def volume(R:Int) : Double = 4/3 * math.Pi * R * R * R
volume(5)


//-------------------------------------------------------------------------------------------------






//------------------------------------Question 04--------------------------------------------------
//  Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.
//  Shipping costs Rs. 3 for the first 50 copies and 75 cents for each additional copy.
//  What is the total wholesale cost for 60 copies?

def salesPriceofBook(n: Int): Double = n * 24.95
def discount(n: Int): Double = salesPriceofBook(n:Int) * 0.40
def shippingCost (n: Int):Double = if (n <= 50) 3  else 3 + (n-50) * 0.75
def wholesaleCost (m:Int) : Double = salesPriceofBook(m: Int) + shippingCost(m: Int) - discount(m:Int)

wholesaleCost(60)


//-------------------------------------------------------------------------------------------------





//------------------------------------Question 05--------------------------------------------------
//  I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 min per km) and 2 km at easy pace
//  again to reach home. What is the total running time?

def timeEasyPace(k:Int):Int = 8 * k
def timeTempo(m:Int):Int = 7 * m
def totalRunningtime (d1:Int, d2:Int, d3:Int): Int = timeEasyPace(d1:Int) + timeTempo(d2:Int) + timeEasyPace(d3:Int)

totalRunningtime(2,3,2)


//-------------------------------------------------------------------------------------------------
