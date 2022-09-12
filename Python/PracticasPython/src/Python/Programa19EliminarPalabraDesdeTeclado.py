
print()

frase = input("Ingresa la frase: ")
palabra = input("Ingresa la palabra a eliminar de la frase: ")

palabraABuscar = frase.find(palabra)
fraseRecortada = frase[0 : palabraABuscar] + frase[palabraABuscar + len(palabra) + 1: ]
# frase[0 : palabraABuscar]: Busca desde la posición 0 hasta la palabra
# que se quiere eliminar

# frase[palabraABuscar + len(palabra) + 1: ]: Busca la palabra a eliminar se concatena y se
# coloca el parametro "len" que contendrá la logitud de la palabra a eliminar, se le suma 1
# indicando que se quiere borrar el seguro espacio que queda después de la palabra a eliminar.

print(f"\nLa frase recortada es: {fraseRecortada}")

print()
