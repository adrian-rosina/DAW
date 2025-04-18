numero1 = float(input("Dime el primer numero"))
numero2 = float(input("Dime el segundo numero"))
operador = input("Dime el operador que deseas")

if operador == "+":
    resultado = numero1 + numero2
elif operador == "-":
    resultado = numero1 - numero2
elif operador == "*":
    resultado = numero1 * numero2
elif operador == "/":
    if numero2 !=0:
        resultado = numero1 / numero2
    else:
        resultado ="Error, división por 0"
else:
    resultado = "Operador no valido."

print(f"Resultado: {resultado}")

