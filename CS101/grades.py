# grades.py
# This program determines the letter grade you get
# Bryan Burns
# November 9, 2021

def main():
    grade = int(input("What did you get on your exam? "))

    if grade < 60:
        print("Your letter grade is a F")
        
    if (grade >= 60) & (grade <= 69):
        print("Your letter grade is a D")
    
    if (grade >= 70) & (grade <= 79):
        print("Your letter grade is a C")

    if (grade >= 80) & (grade <= 89):
        print("Your letter grade is a B")

    if (grade >= 90) & (grade <= 99):
        print("Your letter grade is an A")

main()
