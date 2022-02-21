#sum.py
#This calculates the sum a number of points
#Bryan Burns
#September 21, 2021

import math
def main():
    sumnum = int(input("Enter how many numbers do you want to sum: "))
    total = 0
    for i in range(sumnum):
        num = int(input("Enter a number: "))
        total = total + num
    print(total)
main()
