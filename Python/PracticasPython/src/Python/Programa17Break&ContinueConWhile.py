
# En Python, la sentencia break se utiliza para detener
# la ejecución de una iteración y salir de ella, con lo
# cual, el programa podrá continuar con la ejecución del
# código que se encuentre fuera de nuestro bucle.
# Ejemplo para break

print("while con la sentencia break \n")
contador = 0
while contador < 10:
    contador += 1

    if contador > 5:
        break

    print("Valor actual de la variable: ", contador)

print("Fin del programa, la sentencia break se ha ejecutado.")

# Ejemplo para continue

print("\nwhile con la sentencia continue \n")
contador = 0
while contador < 10:
    contador += 1

    if contador == 5:
        continue
        # El continue en lugar de imprimir la línea
        # siguiente va a regresar a ejecutar la condición y
        # cuando el contador sea igual a 5 no lo va a imprimir,
        # el ciclo se va a repetir hasta que la condición
        # se deje de cumplir.

    print("Valor actual de la variable: ", contador)




