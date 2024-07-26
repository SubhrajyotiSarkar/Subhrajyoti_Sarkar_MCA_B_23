def word_count(s):
    return len(s.strip().split())

def main():
    text = input("Enter a text : ")
    count = word_count(text)
    print(f"Number of word(s) in the string : {count}")

if __name__ == "__main__":
    main()
