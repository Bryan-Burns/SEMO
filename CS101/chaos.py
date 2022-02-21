#chaos.py
#This runs the chaos program from chapter 1
#Bryan Burns
#September 7, 2021

def main():
    print("This program illustrates a chaotic function")  
    x = eval(input("Enter a number between 0 and 1: "))
    n = eval(input("How many numbers should I print? "))
    for i in range (n):
        x = 3.9 * x * (1-x)    
        print(x)
main()
