#Ejercicio 2 - Portero de discoteca
edad = int(input ("Dame tu DNI"))

if edad >= 18 and edad <=60:
    print ("Puedes pasar")
elif edad > 60:
    print ("Estas cascado, vete a la old school disco")
elif edad >= 16:
    print ("Puedes venir mañana al tardeo")
else:
    print ("A casa joven")

