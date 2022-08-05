
print()

#La compañía multinacional Rappi, solicita un sistema que determine
#los días de vacaciones a los que tiene derecho un trabajador, 
#tomando en cuenta las siguientes características:

#Departamento de Atención al cliente. (Clave 1) 
#Trabajadores con clave 1 (Atención al cliente):
#1 año de servicio, reciben 6 dias de vacaciones. 
#2 a 6 años de servicio, reciben 14 días de vacaciones.
# A partir de 7 años de servicio, reciben 20 días de vacaciones.

# Departamento de Logística. (Clave 2) 
#Trabajadores con clave 2 (Logística):
#1 año de servicio, reciben 7 dias de vacaciones. 
#2 a 6 años de servicio, reciben 15 días de vacaciones. 
#A partir de 7 años de servicio, reciben 22 días de vacaciones.


# Gerencia. (Clave 3)
#Trabajadores con clave 3 (Gerencia):
#1 año de servicio, reciben 10 días de vacaciones.
#2 a 6 años de servicio, reciben 20 días de vacaciones. 
#partir de 7 años de servicio, reciben 30 días de vacaciones.

nombre = input("Ingrese su nombre: ")
clave = input("\nIngrese su clave ('Clave 1, Clave 2, Clave 3'): ")
clave = clave.lower()
aniosServicio = int(input("\nIngrese sus años de servicio: "))

if clave == "clave 1":

    if aniosServicio == 1:
        print("\nEmpleado",nombre,"le corresponden 6 días de vacaciones")

    elif aniosServicio >= 2 and aniosServicio <= 6:
        print("\nEmpleado",nombre,"le corresponden 14 días de vacaciones")

    elif aniosServicio >= 7:
        print("\nEmpleado",nombre,"le corresponden 20 días de vacaciones")

    else:
        print("\nSin derecho a vacaciones")

elif clave == "clave 2":

    if aniosServicio == 1:
        print("\nEmpleado",nombre,"le corresponden 7 días de vacaciones")

    elif aniosServicio >= 2 and aniosServicio <= 6:
        print("\nEmpleado",nombre,"le corresponden 15 días de vacaciones")

    elif aniosServicio >= 7:
        print("\nEmpleado",nombre,"le corresponden 22 días de vacaciones")

    else:
        print("\nSin derecho a vacaciones")

elif clave == "clave 3":

    if aniosServicio == 1:
        print("\nEmpleado",nombre,"le corresponden 10 días de vacaciones")

    elif aniosServicio >= 2 and aniosServicio <= 6:
        print("\nEmpleado",nombre,"le corresponden 20 días de vacaciones")

    elif aniosServicio >= 7:
        print("\nEmpleado",nombre,"le corresponden 30 días de vacaciones")

    else:
        print("\nSin derecho a vacaciones")

else:
    print("\nLa clave ingresada no existe")


print()
