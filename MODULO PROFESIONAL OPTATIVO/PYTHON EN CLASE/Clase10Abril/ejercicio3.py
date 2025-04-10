pos_pacman = int(input("¿Cuál es la posicion de pacman?"))
pos_phantom = int(input("¿Cuál es la posición del fantasma?"))

#Comprobamos que la posicion sea igual
if pos_pacman == pos_phantom:
    estado_pacman = input("¿Cómo está pacman? ")

    if estado_pacman == "caramelo":
        print ("pacman se ha comido al fantasma")
    else:
        print ("Pacman ha sido atrapado")
else:
    print ("Pacman ha escapado")