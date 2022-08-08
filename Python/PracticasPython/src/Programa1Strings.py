
# Cadenas

# Python detecta de forma autónoma que estamos
# haciendo una suma, no una concatenación lo cual
# esto sucede también con cadenas de texto

num = 20.3
num += 50.482

print(num)

# Para este caso, la concatenación de java a python
# es distinta, ya que si queremos concatenar una
# cadena de texto con algún valor numérico tenemos que hacer lo siguiente

num1 = 7
num2 = 10

result = num1+num2
# print("Este es el resultado" + resultado)
# Haste este punto, a pesar de que no marca "error"
# en el script, esto está mal en la salida, para que
# no salga error hacemos lo siguiente

resultado = str(result)
print()
# Que sucede?, le estamos diciendo que dentro de la
# variable llamada "resultado", haga la conversión
# de la variable llamada "result" de un valor numeric
# a un valor de texto, y se guarda dentro de la variable "resultado"

print("Este es el resultado " + resultado)
print()
# Búsqueda en cadenas

# Buscamos en una cadena una subcadena más pequeña
# (como en los arreglos cuando buscamos caracteres specifics

mensaje = "Hey python"
# Esto no va a extraer la palabra, pero va a buscar
# la posición en la que está.
# Recordemos que esta wea busca desde la posición 0,
# así que por esta razón nos mostró en pantalla la posición de la cadena

buscarSubcadena = mensaje.find("python")
buscar = str(buscarSubcadena)
print("R= "+buscar)
print()
# Aquí estamos extrayendo una parte de la cadena (subcadena)"
# En la posición inicial estamos indicando desde donde queremos
# extraer la cadena, y en la final hasta donde queremos llegar"

extraerSubCadena = mensaje[2:9]
extraer = str(extraerSubCadena)
print("R= "+extraer)
print()

# ********** Concatenación con método ".format(var1, var2)" **********
# Alternativa 1

nombre = "Carlos"
edad = 25

print("Hola {} tienes {} años".format(nombre, edad))

# Alternativa 2

print("Hola {nombre} tienes {edad} años".format(nombre = "Carlos", edad = 25))

# Alternativa 3, esta alternativa se imprime por la posición de las variables
# que están dentro del ".format()"
#                                         0     1
print("Hola {1} tienes {0} años".format(edad, nombre))
print()

# ********** Concatenación con método "f-Strings" **********

# Las "f-Strings", fueron introducidas a partir de la versión 3.6 de Python.
# Permiten agregar expresiones dentro de una constante de tipo String, y al
# mismo tiempo, obtener una mayor legibilidad en nuestro código.

# Ejemplo1
print(f"El resultado de la suma de 4 + 1 = {4+1}")
print()

# Ejemplo2
nombre = "Carlos"
estatura = 1.80
edad = 2

print(f"Hola {nombre} tienes {edad} años y mides {estatura} centímetros.")
print()

# Ejemplo3
nombre = input("¿Cúal es tu nombre?: ")
num_uno = int(input("Introduce un número: "))
num_dos = int(input("Introduce un segundo número: "))

print()

print(f"Hola {nombre} el resultado de {num_uno} + {num_dos} es: {num_uno + num_dos}")

# ********** Concatenación con método "strip()" **********



