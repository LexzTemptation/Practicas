
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

# Para crear los espacios se necesita dar un argumento en números enteros.
# Se le debe de dar un número que cuente tanto los caracteres ingresados como
# los espacios que se desean ingresar.

# Si se le llega a dar un número impar, Python considera cuál es la mejor alineación
# para asignar los espacios y alinear con el método asignado.

string = "Menú"

print("Métodos con espacios:")
print(string.center(20))
print(string.ljust(20))
print(string.rjust(20))

print("\nMétodos con caracter:")
print(string.center(20, "="))
print(string.ljust(20, "*"))
print(string.rjust(20, "#"))

print("\nVariable modificada:")
string = string.center(10, "=")
print(string)

print()

# ********** Concatenación con método "count()" **********
# En Python el método count(), es de gran utilidad cuando tenemos
# la necesidad de conocer la cantidad de veces que aparece una cadena
# o carácter en específico dentro de un texto.

# De manera predeterminada, el método count(), se encargará de buscar
# una cadena en particular, dentro de all contenido que compone a
# una cadena en específico.

# Además, el método counto, tiene la Capacidad de buscar una subcadena
# en una parte en específico de la cadena principal.

string = "mi mamá me mima"
contador = 0 # El contador es para indicar desde que posición queremos que empiece a contar

print(string.center(40, "="))

# El método puede diferenciar de mayusculas y minusculas, es normal que salga 0
contador = string.count("M")
print(f"\nLa letra M se encontró {contador} veces en la cadena: {string}")

contador = string.count("m")
print(f"\nLa letra m se encontró {contador} veces en la cadena: {string}")

contador = string.count("mamá")
print(f"\nLa palabra mamá se encontró {contador} veces en la cadena: {string}")

contador = string.count("me mima")
print(f"\nLa oración me mima se encontró {contador} veces en la cadena: {string}")

# El método también puede diferenciar de caracteres, por la letra "á"
# con acento no la va a contar
contador = string.count("ma")
print(f"\nLa palabra ma se encontró {contador} veces en la cadena: {string}")

# Si se le llega a agregar otro argumento como en el ejemplo, el método
# comenzará a contar desde la pocisión indicada
contador = string.count("m", 13)
print(f"\nLa letra m se encontró {contador} veces, desde la posición 13 en la cadena: {string}")

contador = string.count("m", 100)
print(f"\nLa letra m se encontró {contador} veces, desde la posición 100 en la cadena: {string}")

# En este caso cuando se le indica números negativos, el método comenzará a contar
# desde el otro extremo de la cadena, indicando que el final original de la cadena
# es la posición 0, pero esto no quita la forma de hacer el recorrido original,
# esto quiere decir que sigue recorriendo de izquierda a derecha, pero desde la
# posición indicada.
contador = string.count("m", -3)
print(f"\nLa letra m se encontró {contador} veces, desde la posición -3 en la cadena: {string}")

# Cuando se le indica dos números los cuales deben ser enteros se le está
# indicando que debe de comenzar en la primera posición indicada
# y terminar en la segunda posición indicada para encontrar el caracter
# indicado en el método.
contador = string.count("m", 3, 7)
print(f"\nLa letra m se encontró {contador} veces, desde la posición 3 hasta la posición 7 en la cadena: {string}")

# Si se le indica más caracteres de lo que contiene el método
# no arrojará un error, simplemente se va a encontrar al final de
# la cadena y el método finalizará dicendo que ha encontrado
# 0 veces la subcadena indicada.
contador = string.count("m", 100, 100)
print(f"\nLa letra m se encontró {contador} veces, desde la posición 100 hasta la posición 100 en la cadena: {string}")

# Aquí el método actua parecido como con los numeros positivos, pero
# el método comenzará a contar desde el otro extremo de la cadena indicando
# que el final original de la cadena es la posición 0, sin empbargo, como
# en este metodo los números son negativos, el primer número indicará que
# desde donde se comienza a contar y el segundo número donde termina
contador = string.count("m", -4, -1)
print(f"\nLa letra m se encontró {contador} veces, desde la posición -4 hasta la posición -1 en la cadena: {string}")

# ********** Concatenación con método "startswith()" y "endswith()" **********
# El método startswith(), se utiliza para comprobar si una cadena de caracteres
# comienza con una subcadena en particular.
# Además, es posible establecer un rango de búsqueda dentro de la cadena principal.
# Este método regresa valores booleanos

string = "Diana se peina sola"
resultado = 0
starts_with = "Ejemplos con startswith():"
ends_with = "Ejemplos con endswith():"

print(f"\n{starts_with.rjust(50, '=')}")

# Regresa un valor booleano si encuentra el caracter indicado (true)
resultado = string.startswith("D")
print(f"\n{string} comienza con la subcadena D: {resultado}")

# Regresa un valor booleano si encuentra el caracter indicado (false)
resultado = string.startswith("d")
print(f"\n{string} comienza con la subcadena d: {resultado}")

# Regresa un valor booleano si encuentra la sub-cadena indicada (true)
resultado = string.startswith("Diana")
print(f"\n{string} comienza con la subcadena Diana: {resultado}")

# Si se le llega a agregar otro argumento como en el ejemplo, el método
# comenzará a contar desde la pocisión indicada
resultado = string.startswith("se", 6)
print(f"\n{string} comienza con la subcadena se, desde la posición 6: {resultado}")

# Cuando se le indica dos números los cuales deben ser enteros se le está
# indicando que debe de comenzar en la primera posición indicada
# y terminar en la segunda posición indicada para encontrar el caracter
# indicado en el método.
resultado = string.startswith("se", 6, 8)
print(f"\n{string} comienza con la subcadena se, desde la posición 6 hasta la posición 7: {resultado}")

resultado = string.startswith("se", 100, 100)
print(f"\n{string} comienza con la subcadena se, desde la posición 100 hasta la posición 100: {resultado}")

resultado = string.startswith("se", -4, -1)
print(f"\n{string} comienza con la subcadena se, desde la posición -4 hasta la posición -1: {resultado}")

# El método endswith(), se utiliza para comprobar si una cadena de caracteres termina
# con una subcadena en particular.
# Además, es posible establecer un rango de búsqueda dentro de la cadena principal.
# Esté método busca de derecha a izquierda.

print(f"\n{ends_with.rjust(50, '=')}")

resultado = string.endswith("A")
print(f"\n{string} termina con la subcadena A: {resultado}")

resultado = string.endswith("a")
print(f"\n{string} termina con la subcadena a: {resultado}")

resultado = string.endswith("sola")
print(f"\n{string} termina con la subcadena sola: {resultado}")

resultado = string.endswith("sola", 10)
print(f"\n{string} termina con la subcadena sola, desde la posición 10: {resultado}")

resultado = string.endswith("s", 9, 14)
print(f"\n{string} termina con la subcadena s, desde la posición 9 hasta la posición 14: {resultado}")

resultado = string.endswith("s", 100, 100)
print(f"\n{string} termina con la subcadena s, desde la posición 100 hasta la posición 100: {resultado}")

# Este orden del método cuenta de derecha a izquierda, por lo cual está buscando desde
# la posición indicada solo un caracter indicado de la cadena digitada.
resultado = string.endswith("s", -4, -2)
print(f"\n{string} termina con la subcadena s, desde la posición -4 hasta la posición -2: {resultado}")
print()

# ********** Concatenación con substrings **********

# En Python, una cadena de caracteres, es una sucesión que puede
# contener caracteres especiales o alfanuméricos.
# Es decir, letras, números y/o símbolos.
# En Python es posible acceder a partes específicas de una cadena
# de caracteres, también llamadas substrings o subcadenas.

# variable[inicio : final : saltos]
# Inicio: Establece al índice en donde se iniciará la subcadena.
# Final. Establece al índice en donde se terminará la subcadena.
# Saltos: Establece el número de saltos que realizará el índice para
# generar la subcadena.

# Los valores asignados al inicio, final y saltos, deberán ser
# valores enteros, y a su vez, el valor que se le asigne a los
# índices pueden ser positivos o negativos.

# Teniendo en cuenta que los índices positivos se situaran desde
# el inicio de la cadena, haciendo su recorrido de izquierda a derecha
# Mientras que los índices negativos, se situaran desde el final
# de la cadena, haciendo su recorrido igualmente de izquierda a derecha.

string = "0123456789"
substring = ""

print(f"Cadena principal: {string}")

# El método recorre las posiciones indicadas y regresa el caracter
# que tiene a la derecha de su posición actual.
substring = string[0]
print(f"\nSubcadena con indice en la posición [0] es: {substring}")

substring = string[5]
print(f"\nSubcadena con indice en la posición [5] es: {substring}")

# Cuenta de derecha a izquierda
substring = string[-4]
print(f"\nSubcadena con indice en la posición [-4] es: {substring}")

# Rango de índice 0 a 3, solo toma los valores que están en este rango inicado
substring = string[0:3]
print(f"\nSubcadena con indices en las posiciones [0:3] es: {substring}")

# Si no hay un índice indicado entonces lo tomará como desde la posición 0
substring = string[:3]
print(f"\nSubcadena con indices en las posiciones [:3] es: {substring}")

# Aquí buscará la subcadena desde la posición 5 hasta la última posición de la subcadena
substring = string[5:]
print(f"\nSubcadena con indices en las posiciones [5:] es: {substring}")

# De esta forma iŕa hasta el final de la cadena y contará hacia atras con el rango indicado
# recordando que cuenta de derecha a izquierda.
substring = string[-4:-1]
print(f"\nSubcadena con indices en las posiciones [-4:-1] es: {substring}")

# Aquí no hay un valor establecido, así que el índice es tomado desde el inicio de
# la subcadena y el final de la misma.
substring = string[:]
print(f"\nSubcadena con indices en las posiciones [:] es: {substring}")

# Con tres valores de manera simultánea toma el primer número como el índice, y el segundo
# como el rango final, el tercero hace intervalos de dos, y suma el índice por el valor indicado
# en el mismo, pero no hay que confundir con que va a regresar la suma, el método regresará los números
# encontrados en la subcadena
substring = string[1:6:2]
print(f"\nSubcadena con indices en las posiciones y salto [1:6:2] es: {substring}")

# De igual forma aquí no va a tener un índice y un final, pero los intervalos los tiene establecidos
substring = string[::3]
print(f"\nSubcadena con indices en las posiciones y salto [::3] es: {substring}")








