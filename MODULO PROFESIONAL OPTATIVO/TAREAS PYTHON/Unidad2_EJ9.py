precio = float (input("Introduce el precio del producto"))

if precio > 100:
    descuento = precio * 0.1
    precio_descontado = precio - descuento
elif precio <= 100 and precio >= 0:
    precio_descontado = precio
else:
    print("Precio no valido")

print(f"Tu precio es {precio_descontado} y se te ha descontado {descuento}")