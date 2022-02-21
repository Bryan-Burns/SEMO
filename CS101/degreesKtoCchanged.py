#degreesKtoCchanged.py
#This program converts Kelvin temperature to Celcius
#Bryan Burns
#December 7, 2021

def main():
    k = eval(input("What is your Kelvin Temperature? "))
    if k < 0:
        print("This is not a real Kelvin Temperature. ")
    elif k == 0:
        print("This is an Absolute Zero Temperature.")
    else:
        c = k - 273
        if c == 0:
            print("The temperature is 0˚C and is the freezing point of water. ")
        else:
            print(f"The temperature is {c}˚C ")

main()
