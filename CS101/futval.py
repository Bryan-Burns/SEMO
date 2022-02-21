# futval.py
# This program computes the value of an investment 10 years into the future
# Bryan Burns
# September 14, 2021

def main():
    print("This program clculates the future value")
    print("of a future years investment.")

    principal = eval(input("Enter the initial principal: "))
    apr = eval(input("Enter the annual interest rate: "))
    years = eval(input("Enter how many years in the fuure you want to know: "))

    for i in range(years):
        principal = principal * (1 + apr)

    print("The value in", years, "years is:", principal)

main()
