
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
edad = 22

print(f"Hola {nombre} tienes {edad} años y mides {estatura} centímetros.")
print()

# Ejemplo3
'''
nombre = input("¿Cúal es tu nombre?: ")
num_uno = int(input("Introduce un número: "))
num_dos = int(input("Introduce un segundo número: "))

print()

print(f"Hola {nombre} el resultado de {num_uno} + {num_dos} es: {num_uno + num_dos}")
'''

# ********** Concatenación con método "strip()" **********
# El método strip , se utiliza para eliminar caracteres especificados al
# INICIO Y AL FINAL de una cadena de caracteres, tomando en cuenta que
# si al método strip no se le especifica uno o más caracteres a eliminar,
# solo eliminara espacios en blanco y saltos de línea.
print("strip()")

cadena = "\tHola Lexz\n" # \t = tabulación de 4 espacios
print(cadena)

cadena = cadena.strip("H xz\t\n")
# Hace comprobaciones hasta que quite las letras especificadas al inicio
# o al final de la cadena
print(cadena)

print()

# ********** Concatenación con método "rstrip()" **********
# El método rstrip(), se utiliza para eliminar únicamente
# caracteres especificados al FINAL de una cadena.
# Al igual que el método strip(), si no se especifica uno o más
# caracteres a eliminar, solo eliminara espacios en blanco y saltos de línea.
print("rstrip()")

cadena = "\tHola Lexz\n"
print(cadena)

cadena = cadena.rstrip(" xz\t\n")
print(cadena)

print()

# ********** Concatenación con método "lstrip()" **********
# El método Istripo, se utiliza para eliminar únicamente
# caracteres especificados al INICIO de una cadena.
# Al igual que los dos métodos anteriores, si no se especifica uno o más
# caracteres a eliminar, solo eliminara espacios en blanco y saltos de línea.
print("lstrip()")

cadena = "\tHola Lexz\n"
print(cadena)

cadena = cadena.lstrip("Hol \t\n")
print(cadena)

print()

# ********** Concatenación con método "istitle()" y "title()" **********
# En Python, es posible convertir la primera letra de cada
# palabra de un String en mayúsculas, y a su vez, convertir el
# resto de letras que componen a cada palabra de un String en minúsculas.

# Para realizar esta acción, contamos con los métodos
# "istitle()" y "title()", los cuales se utilizan para identificar si la
# primera letra de cada palabra comienza con mayúscula, y el
# resto de letras se encuentran en minúsculas, y de no ser así,
# realizar la respectiva conversión.
'''
first_name = input("Nombre: ")
last_name = input("Apellido: ")
full_name = f"{first_name} {last_name}"

print()
print(f"¿El formato del método title() se ha aplicado?: {full_name.istitle()}") # Regresa un true o false
print(f"Aplicando el método title(): {full_name.title()}") # Aplica el método y regresa el texto de forma correcta "Alejandro Cornejo"
print(f"Volvemos a imprimir el nombre: {full_name}") # Regresa el texto como se ingresó "aleJAndrO coRNeJO"


print()
full_name = full_name.title() # Aquí se aplica el formato correcto de forma permanente
print(f"¿El formato del método title() se ha aplicado?: {full_name.istitle()}") # Regresa un true o false
print(f"Se ha aplicado el método title() de manera permanente: {full_name}") #
print(f"Volvemos a imprimir el nombre: {full_name}") # Y aquí se regresa el texto con el método title() de manera permanente

print()
'''
# ********** Concatenación con método "islower()" y "lower()" **********
# En Python, contamos con métodos que nos permiten convertir todas
# las letras de una cadena de caracteres a mayúsculas, o bien, a minúsculas.

# Y a su vez, también contamos con métodos para identificar si una
# cadena de caracteres se encuentra completamente en mayúsculas o en minúsculas.
'''
string = input("Introduce un String:")

print(f"\n¿Todas las letras están en minúsculas?: {string.islower()}")
# Regresa un true o false, comprueba si todas las letras están en minusculas
print(f"String en minúsculas: {string.lower()}")
# Convierte todas las letras en minusculas
print(f"String original: {string}")

print(f"\n¿Todas las letras están en mayúsculas?: {string.isupper()}")
# Regresa un true o false, comprueba si todas las letras están en mayusculas
print(f"String en mayúsculas: {string.upper()}")
# Convierte todas las letras en mayusculas
print(f"String original: {string}")
'''

print()

# ********** Concatenación con método "swapcase()" **********

# En Python, contamos con el método swapcase(), que a diferencia de los
# métodos lower() y upper(), nos permite invertir todas las letras de una
# cadena de caracteres, donde las mayúsculas se convierten en minúsculas
# y las minúsculas se convierten en mayúsculas.

txt_lower_upper = "atHeNA TECnoLOgIeS"
print(txt_lower_upper.swapcase())

txt_upper = "CADENA DE MAYÚSCULAS"
print(txt_upper.swapcase())

txt_lower = "cadena con minúsculas"
print(txt_lower.swapcase())

txt_number = "1234!-*"
print(txt_number)

print()

# No modificados con el método "swapcase()"

print(txt_lower_upper)
print(txt_upper)
print(txt_lower)
print(txt_number)

print()

# ********** Concatenación con método "capitalize()" **********

# En Python, el método "capitalize()" se utiliza para convertir el
# primer carácter de un String en una letra mayúscula, y a su vez,
# todas las letras restantes en minúsculas.

string = "eL VIAJE eS la RecoMpensa"

print(f"Antes de capitalize(): {string}")
string = string.capitalize()
print(f"Después de capitalize(): {string}")

print()

# ********** Concatenación con método "center()", "ljust()" y "rjust()" **********

# En Python, es posible alinear el texto que imprimimos en pantalla, de
# acuerdo a nuestras necesidades, es decir, podemos alinear una impresión
# en pantalla, a la izquierda, a la derecha o al centro.















