def hcf(x, y):  
    if x > y:  
            smaller = y  
    else:  
            smaller = x  
    for i in range(1,smaller + 1):  
            if((x % i == 0) and (y % i == 0)):  
               hcf = i  
    return hcf  
  
num1 =int(input("Enter the Fisrst number: "))   
num2 =int(input("Enter the Second number: "))  
print("The H.C.M of", num1,"and", num2,"is", hcf(num1, num2))