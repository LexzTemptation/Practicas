
print("\nElija una opción")

num = int(input(""
      "1.- Suma"
      "\n2.- Resta"
      "\n3.- Multiplicación"
      "\n4.- División (decimal, entera y resto (modulo))"
      "\n5.- Exponente"
      "\nOpción: "))

if num == 1:
    # Asignación de Suma
    num = int(input("\nIngrese el primer número: "))
    num += int(input("Ingrese el segundo número: "))

    print("\nEl resultado de la suma es:", num)

elif num == 2:
    # Asignación de resta
    num = int(input("\nIngrese el primer número: "))
    num -= int(input("Ingrese el segundo número: "))

    print("\nEl resultado de la resta es:", num)

elif num == 3:
    # Asignación de Multiplicación
    num = int(input("\nIngrese el primer número: "))
    num *= int(input("Ingrese el segundo número: "))

    print("\nEl resultado de la multiplicación es:", num)

elif num == 4:
    # Asignación de División
    num = int(input("\nIngrese el primer número: "))
    num /= int(input("Ingrese el segundo número: "))

    print("\nEl resultado de la División es:",
          "\nDecimal:", num)

    num = int(input("\nIngrese el primer número: "))
    num //= int(input("Ingrese el segundo número: "))

    print("\nEl resultado de la División es:",
          "\nEntera:",num)

    num = int(input("\nIngrese el primer número: "))
    num %= int(input("Ingrese el segundo número: "))

    print("\nEl resultado de la División es:",
          "\nResto:",num)

elif num == 5:
    # Asignación de Exponente
    num = int(input("\nIngrese el coheficiente: "))
    num **= int(input("Ingrese el exponente: "))

    print("\nEl resultado es:", num)

else:
    print("Lo sentimos, este programa solo admite numeros del 1 al 5")





