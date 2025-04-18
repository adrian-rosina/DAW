#Ejercicio 4 - Notas academicas
nota = float (input("¿Qué nota has sacado?"))

if nota < 5:
    print (f"Has sacado un {nota}, por lo que estas suspenso")
elif nota <= 6:
    print (f"Has sacado un {nota} por lo que estas aprobado")
elif nota <= 8:
     print (f"Has sacado un {nota} por lo que tienes un notable")
elif nota <= 10:
      print (f"Has sacado un {nota} por lo que tienes un sobresaliente")
else:
    print ("Nota no valida")