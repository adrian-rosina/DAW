#Ejercicio 3 - Si el numero es divisible por 3 y por 5
numero = int (input("Dame un numero entero"))

if numero % 3 == 0 and numero % 5 == 0:
    print (f"{numero} es divisible por 3 y por 5")
else:
    print(f"{numero} no es divisible por 3 y por 5")