#convert.py
# This program converts temp from C to F
# Bryan Burns
# September 14, 2021

def main():
    for i in range(5):
        celcius = eval(input("What is the Celcius temperature? "))
        fahrenheit = 9/5 * celcius + 32
        print("The temperature is", fahrenheit, "degrees Fahrenheit.")

main()    
