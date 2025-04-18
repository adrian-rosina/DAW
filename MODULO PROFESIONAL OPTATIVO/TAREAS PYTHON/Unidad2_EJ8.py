#Ejercicio 8 - Días del mes

mes = input("Dime un mes").lower()

if mes == "febrero":
    dias = 28
elif mes in ["enero", "marzo", "mayo", "julio", "septiembre", "noviembre"]:
    dias = 31
elif mes in ["abril", "junio", "agosto", "octubre", "diciembre"]:
    dias = 30
else:
    print("Mes no valido")

print(f"{mes.capitalize()} tiene {dias} dias.")