# wordlength.py
# This program determines the average word length in a sentence
# Bryan Burns
# November 9, 2021

def main():

    sentence = str(input("Enter a sentence: "))

    word_list = sentence.split()

    total_characters = 0

    for i in range(len(word_list)):
        word = word_list[i]

        total_characters += len(word)

    avg_word_length = (total_characters / len(word_list))
    print("The average word length is ", avg_word_length)


main()
