'''
Python
    Multiparadigma: Imperativo, Orientado a Objetos, Funcional
    Tipado: Dinámico, Fuerte
    Interpretado
    Sintaxis clara y sencilla
    Creado por Guido van Rossum en 1991
    Extensiones: .py
    IDEs: PyCharm, Visual Studio Code, Sublime Text, Atom, Jupyter Notebook
    Librerías: Numpy, Pandas, Matplotlib, Scikit-learn, TensorFlow, Keras, PyTorch
    Frameworks: Django, Flask, Pyramid, Bottle, Tornado, Web2py
'''

'''
    NORMAS DE ESTILO
    - Sangría de 4 espacios
    - Máximo 79 caracteres por línea
    - Líneas en blanco para separar funciones y clases
    - Comentarios en líneas separadas
    - Comentarios en inglés
    - Nombres de variables en minúsculas, con guiones bajos para separar palabras
    - Nombres de funciones y clases en minúsculas, con guiones bajos para separar palabras
    - Nombres de clases en CamelCase
    - Nombres de constantes en mayúsculas, con guiones bajos para separar palabras
'''


'''
    Comentario de varias líneas
    Se crea con tres comillas simples o dobles
'''
# Comentario de una línea
# Se crea con el símbolo hashtag o parrilla

# El tipado dinámico significa que no es necesario declarar el tipo de dato de una variable
x = 5
print(x) # ?
x = "Hola Mundo!"
print(x) # ?
x = True
print(x) # ?
x = 20.5
print(x) # ?

# El tipado fuerte significa que no se pueden mezclar tipos de datos en una operación
edad = 36
nombre = "Jordi"
# mensaje = "Mi nombre es " + nombre + " y tengo " + edad + " años."
mensaje = "Mi nombre es " + nombre + " y tengo " + str(edad) + " años."

# Esta variable cumple con las normas de estilo (snake_case)
ejemplo_de_variable = 5

print("Hola Mundo!")