
print()
#Multicondicionales, en python no existe el switch como en java,
#así que lo que se hace es lo siguiente para suplantar esta función

print("Menú de opciones: \n")
print("Presiona 1 para convertir de número a palabra.")
print("Presiona 2 para convertir de palabra a número. \n")

op = int(input("¿Cúal es tu opción deseada?:"))

if op == 1:
    print("\n Conversor de número a palabra. \n")

    num = int(input("¿Cúal es el número que deseas convertir a palabra?: "))
    print()

    if num == 1:
        print("El numero es 'uno'")

    elif num == 2:
        print("El numero es 'dos'")

    elif num == 3:
        print("El numero es 'tres'")

    elif num == 4:
        print("El numero es 'cuatro'")

    elif num == 5:
        print("El numero es 'cinco'")
    
    else:
        print("El número seleccionado no esta registrado.")  


elif op == 2:
    print("\n Conversor de palabra a número. \n")

    palabra = input("¿Cual es la plabra que deseas convertir a número?: ")
    palabra = palabra.lower() #"lower" lo usamos para una validación en las palabras, lo que
    print()                   #significa, que "lower" identifica la diferencia entre mayusculas y minusculas
                              #e imprime en pantalla sin errores de la distición de estas.

    if palabra == "uno":
        print("El número es '1'")

    elif palabra == "dos":
        print("El número es '2'")

    elif palabra == "tres":
        print("El número es '3'")

    elif palabra == "cuatro":
        print("El número es '4'")

    elif palabra == "cinco":
        print("El número es '5'")

    else:
        print("El número seleccionado no esta registrado.")

else:
    print("Opción no disponible.")

print()
