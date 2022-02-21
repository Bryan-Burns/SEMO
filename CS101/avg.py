#avg2.py
#This runs an average of 3 exam scores
#Bryan Burns
#September 14, 2021

def main():
    print("This program computes the average of two exam scores. ")

    score1 = eval(input("Enter your first score: "))
    score2 = eval(input("Enter your second score: "))
    score3 = eval(input("Enter your third score: "))
    #This code is cleaner and easier for someone to understand--
    #just by looking at it, in my opinion.
    average = (score1 + score2 + score3) / 3

    print("The average of the scores is: ", average)

main()
