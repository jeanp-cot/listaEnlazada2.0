# listaEnlazada
Ejercicio #9 del #30DaysOfCodeByAEIS

Lenguaje: Java

Objetivos:
1.	🧑‍💻👩‍💻 Crea la siguiente lista enlazada:
  1 -> 54 -> 20 -> 13 -> 43 ->18 -> 11-> 53
2.	🧑‍💻👩‍💻 Muestra la lista anterior, para esto puedes construir un bloque o función que reciba una lista enlazada y devuelva lo anteriormente indicado (suma puntos si lo imprimes de manera creativa, clara o divertida).
3.	🧑‍💻👩‍💻 Con los métodos shift y push inserta los valores 68, 95, 3, 7 y 37, aleatoriamente, en la lista y muéstrala por pantalla.
4.	🧑‍💻👩‍💻 Crea un bloque o función que tome una lista y nos devuelva dos listas, una con los números pares y otra con los impares.
Para esto NO deberás modificar las funciones o métodos que creaste antes, tienes que trabajar con los mismos.

Ya habia creado la funcion para imprimir los elementos, solo leía los nodos hasta que saliera alguno que no tuviera informacion y ahí me detenia. Para el random solo tenia que usar la misma lógica que usé en el bingo. Para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debes usar esta fórmula
valorEntero = Math.floor(Math.random()*(N-M+1)+M);

Luego para separar las listas cree dos listas auxiliares para pasar los datos y para guardar solo iba preguntando si la informacion que contenia el nodo al dividirla para dos su residuo era 0. Si era así entonces le hacía un push a la lista que guardaba a los pares, sino a la de impares y al final los pasaba en un array de listas enlazadas.
