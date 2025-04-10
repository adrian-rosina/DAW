num_multiplo = int(input("Introduce un numero entero"))

if num_multiplo % 3 == 0 and num_multiplo % 5 == 0:
    print("Es multiplo de 3 y de 5")
elif num_multiplo % 3 == 0:
    print ("Este numero es múltiplo de 3")
elif num_multiplo % 5 == 0:
    print ("Este numero es multiplo de 5")
else:
    print ("Este numero no es multiplo de 3 ni de 5")
