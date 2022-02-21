#degreesKtoC.py
#This program converts Kelvin temperature to Celcius
#Bryan Burns
#December 7, 2021

def main():
    degreesK = eval(input("What is your Kelvin Temperature? "))
    degreesC = degreesK - 273
    print("The degrees in Celcius is ", degreesC, "˚")

main()
