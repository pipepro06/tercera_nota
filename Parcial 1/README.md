# Parcial Práctico – Programación I
## Lenguaje: Java

**Asignatura:** Programación I  
**Tema a evaluar:** Condicionales, ciclos y arreglos lineales  
**Modalidad:** Práctica individual  
**Tipo de entrega:** Proyecto en Java funcional  

---

## Indicaciones generales

Lea cuidadosamente cada uno de los puntos antes de comenzar.

Este parcial busca evaluar su capacidad de análisis, lógica y desarrollo en Java.  
Cada problema está planteado de manera descriptiva, por lo tanto deberá interpretar la necesidad, organizar la solución y programarla correctamente.

### Requisitos generales
- El desarrollo debe realizarse en **Java**.
- Todos los ejercicios deben resolverse por consola.
- Solicite los datos al usuario.
- Muestre resultados claros y organizados.
- Use nombres de variables comprensibles.
- El programa debe compilar y ejecutarse correctamente.
- Se evaluará tanto la lógica como la presentación de la solución.

---

# Punto 1 – Condicionales
## Cálculo de valor a pagar en una tienda

Una tienda desea automatizar el cálculo del valor final de una compra realizada por un cliente.

El programa debe solicitar:
- Nombre del cliente
- Valor total de la compra

Con base en el valor ingresado, se debe aplicar el siguiente criterio de descuento:

- Si la compra es menor a **50.000**, no tiene descuento.
- Si la compra está entre **50.000 y 99.999**, tiene un descuento del **5%**.
- Si la compra está entre **100.000 y 199.999**, tiene un descuento del **10%**.
- Si la compra es de **200.000 o más**, tiene un descuento del **15%**.

### El programa debe mostrar:
- Nombre del cliente
- Valor original de la compra
- Porcentaje de descuento aplicado
- Valor descontado
- Valor final a pagar

### Condiciones adicionales
- Si el valor ingresado es negativo, el programa debe informar que el dato es inválido.
- La salida debe ser clara y organizada.

### Lo que se espera evaluar en este punto
- Uso correcto de estructuras condicionales
- Validación de entradas
- Cálculo de porcentajes
- Claridad en la presentación de resultados

---

# Punto 2 – Ciclos con arreglos lineales
## Registro de ventas de una semana

Un pequeño negocio necesita registrar las ventas realizadas durante 7 días consecutivos para hacer un análisis rápido del comportamiento semanal.

Construya un programa que permita:

1. Crear un arreglo lineal para almacenar las ventas de los **7 días**.
2. Solicitar al usuario el valor de venta de cada día.
3. Recorrer el arreglo y determinar:
   - La venta más alta
   - La venta más baja
   - El promedio de ventas
   - Cuántos días tuvieron ventas superiores a 100.000
   - Cuántos días tuvieron ventas inferiores a 50.000
   - El total acumulado de ventas de la semana

4. Mostrar las ventas registradas día por día.
5. Mostrar un resumen final con todos los resultados calculados.

### Restricciones
- El ingreso de datos debe hacerse mediante ciclos.
- El análisis debe realizarse recorriendo el arreglo.
- No se permite resolver el problema usando variables independientes por cada día.

### Lo que se espera evaluar en este punto
- Uso de arreglos lineales
- Uso de ciclos para lectura y procesamiento
- Manejo de contadores y acumuladores
- Comparación de valores dentro de un arreglo
- Organización lógica del programa

---

# Criterios generales de evaluación

Se tendrá en cuenta:
- Comprensión del problema
- Aplicación correcta de condicionales
- Aplicación correcta de ciclos
- Uso adecuado de arreglos
- Funcionamiento del programa
- Orden y legibilidad del código

---

# Entregable

Debe entregar un proyecto en Java que contenga la solución de los dos puntos.

---
**Éxitos.**  
Piense bien la lógica antes de comenzar. El teclado no resuelve, pero sí delata.
Happy Coding!!
