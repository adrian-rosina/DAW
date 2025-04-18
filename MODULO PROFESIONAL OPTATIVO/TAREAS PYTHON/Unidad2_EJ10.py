dia = int(input("Introduce el día: "))
mes = int(input("Introduce el mes (1-12): "))
año = int(input("Introduce el año: "))

if mes < 1 or mes > 12:
    print("Mes no válido.")
elif dia < 1 or (mes == 2 and ((año % 4 == 0 and año % 100 != 0) or (año % 400 == 0) and dia > 29)) or (mes == 2 and dia > 28) or (mes in [4, 6, 9, 11] and dia > 30) or (mes in [1, 3, 5, 7, 8, 10, 12] and dia > 31):
    print("Fecha no válida.")
else:
    print(f"La fecha {dia}/{mes}/{año} es válida.")