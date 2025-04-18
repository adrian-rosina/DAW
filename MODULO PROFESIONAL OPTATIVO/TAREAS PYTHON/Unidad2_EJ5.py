#Ejercicio 5 - Día de la semanaºººººººººººººººººººººººº++++++++++++++++++7U8
dia = input("Dime que dia de la semana es").lower()

if dia in ["lunes", "martes", "miercoles", "jueves", "viernes"]:
    print (f"{dia.capitalize()} es día laborable.")
elif dia in ["sabado", "domingo"]:
    print (f"{dia.capitalize()} es fin de semana")
else:
    print("Día no valido")
    
