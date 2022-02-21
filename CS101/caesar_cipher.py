# caesarcipher.py
# This program runs a caesar cipher encryption and decryption process
# Bryan Burns
#November 9, 2021

def main():
    
    plain_text = input("Type in what you want to encode: ")
    key_val = eval(input("Type in a number for the key between 1 and 25: "))
    encrypt_arr = []
    decrypt_arr = []

    for char in plain_text:

        e_char = chr(ord(char))
        
        if e_char == " ":
            encrypt_arr.append(e_char)
        else:
            if e_char.isupper():
                e_char = chr(ord(char) + key_val)
                if ord(e_char) > 90:
                    e_char = chr(ord(e_char) - 26)         
            else:
                e_char = chr(ord(char) + key_val)
                if ord(e_char) > 122:
                    e_char = chr(ord(e_char) - 26)
            encrypt_arr.append(e_char)
            
    str_1 = "".join(encrypt_arr)
            
    for char in (str_1):
        d_char = chr(ord(char))

        if d_char == " ":
            decrypt_arr.append(d_char)  
        else:
            if d_char.isupper():
                d_char = chr(ord(char) - key_val)
                if ord(d_char) < 65:
                    d_char = chr(ord(d_char) + 26)        
            else:
                d_char = chr(ord(char) - key_val)
                if ord(d_char) < 97:
                    d_char = chr(ord(d_char) + 26)
            decrypt_arr.append(d_char)

    str_2 = "".join(decrypt_arr)
    
    print("The encoded message is: ", str_1)
    print("The decoded message is: ", str_2)
    
main()
     
