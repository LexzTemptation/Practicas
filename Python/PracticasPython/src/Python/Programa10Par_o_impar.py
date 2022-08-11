
#Un número impar es un número entero que no es divisible entre dos
#Es decir, que al momento de que un entero sea dividido entre dos
#el resto (O MODULO) sea igual a uno

print()

num = int(input("Ingrese un número: "))

#Si el contenido de la variable número, divido entre dos al obtener
#su MODULO (recordar que el signo de porcentaje también hace una división
#solo que este signo en vez de tener el resultado obtiene el sobrante)
#o resto es igual a 0, que nos diga que el numero ingresado es PAR
if num% 2 == 0:
    print("El número", num, "es par")

#De lo contrario que nos diga que es IMPAR
else:
    print("El número ", num, "es impar")
print()



