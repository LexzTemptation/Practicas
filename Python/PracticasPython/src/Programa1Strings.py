
# Cadenas

# Python detecta de forma autónoma que estamos
# haciendo una suma, no una concatenación lo cual
# esto sucede también con cadenas de texto

num = 20.3
num += 50.482

print(num)
print("")

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
# Que sucede?, le estamos diciendo que dentro de la
# variable llamada "resultado", haga la conversión
# de la variable llamada "result" de un valor numeric
# a un valor de texto, y se guarda dentro de la variable "resultado"

print("Este es el resultado " + resultado)

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

# Aquí estamos extrayendo una parte de la cadena (subcadena)"
# En la posición inicial estamos indicando desde donde queremos
# extraer la cadena, y en la final hasta donde queremos llegar"

extraerSubCadena = mensaje[2:9]
extraer = str(extraerSubCadena)
print("R= "+extraer)

# Concatenación




