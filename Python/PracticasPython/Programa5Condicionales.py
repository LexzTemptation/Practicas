
print()
#Condicionales
num1 = int(input("Ingrese un número: "))

print()

if num1 >= 5:
    print("El número", num1,"es mayor a 5")
else:
    print("El número", num1," es menor a 5")

print()

#Programa que calcula el promedio pidiendo datos por teclado

mate = int(input("Ingresa tu calificación en matematicas: "))
esp = int(input("Ingresa tu calificación en español: "))
bd = int(input("Ingresa tu calificación en base de datos: "))

promedio = (mate + esp + bd)/3

print()

if promedio >=6:
    print("Has aprobado con promedio de: ", promedio)
#Para redondear se usa la sentencia round y después de 
#la variable se ponen los decimales que se desean que se muestren
    print("Has aprobado con promedio de: ", round(promedio,2))
else:
    print("No has logrado aprobar con promedio de: ", promedio)
    print("No has logrado aprobar con promedio de: ", round(promedio))

print()
