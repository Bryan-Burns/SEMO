# word_counting.py
# This program determines the number of lines, words, and characters in a File
# Bryan Burns
# November 9, 2021

def main():

    filename = input("Enter FileName: ")

    infile = open(filename, "r")

    numlines = 0
    numwords = 0
    numchars = 0

    for line in infile.readlines():
        numlines += 1

        line_list = line.split()
        numwords += len(line_list)

        for word in line_list:
            numchars += len(word)

    print("The number of lines = ", numlines)
    print("The number of words = ", numwords)
    print("The number of characters = ", numchars)

main()
            
    
