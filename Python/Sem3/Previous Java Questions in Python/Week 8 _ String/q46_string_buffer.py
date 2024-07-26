def main():
    string_buffer = []

    string_buffer.extend(["Hello", " ", "world"])
    print("Content of string_buffer:", "".join(string_buffer))

    string_buffer.extend([", ", "how", " ", "are", " ", "you"])
    print("Updated content of string_buffer:", "".join(string_buffer))

    string_buffer.insert(12, "beautiful ")
    print("Content after insertion:", "".join(string_buffer))

    string_buffer[21:24] = ["doing"]
    print("Content after replacement:", "".join(string_buffer))

    del string_buffer[29:33]
    print("Content after deletion:", "".join(string_buffer))


if __name__ == "__main__":
    main()
