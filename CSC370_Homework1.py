#
# * To change this license header, choose License Headers in Project Properties.
# * To change this template file, choose Tools | Templates
# * and open the template in the editor.
# 


#*
# *
# * @author samuelnwuha
# 


class CSC370_Homework1:

    @staticmethod
    def encode(original):

        # if input is empty, returning empty strinG

        if len(original) == 0:

            return ""


        encoded = ""

        # finding first character

        c = original[0]

        # starting count with 1

        count = 1

        # looping from second index to last

        i = 1
        while i < len(original):

            # getting current character

            current = original[i]

            # checking if this char is not equal to c

            if c != current:

                # if count is 1, simply appending c to encoded (no 1 prefix)

                if count == 1:

                    encoded += c


                else:

                    # otherwise prepending count before c and appending to

                    # encoded

                    encoded += "" + str(count) + c



                # setting current as new c

                c = current

                # setting count to 1

                count = 1


            elif c == current:

                # same char, updating count
                count += 1


            i += 1


        if count == 1:

            encoded += c

        else:

            encoded += "" + str(count) + c


        return encoded


    def countChar(self, str, c):
        count = 0

        i = 0
        while i < len(str):
            if str[i] == c:
                count += 1
            i += 1

        return count


    @staticmethod
    def main(args):


        userInput = java.util.Scanner(System.in)
        print("Enter list of characters")

        userSequence = userInput.nextLine()

        enc = csc370_homework1.CSC370_Homework1.encode(userSequence)


        print("Original: " + userSequence)

        print("Encoded : " + enc)

# Main function added by Java to Python Converter:

def main():
    csc370_homework1.CSC370_Homework1.main([])

if __name__ == "__main__":
    main()