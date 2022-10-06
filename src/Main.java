public class Main {
    public static void main(String[] args) {

        ListaEnlazada listaEnlazada = new ListaEnlazada();

        //Agregamos al final de la lista estos valores
        listaEnlazada.push(1);
        listaEnlazada.push(54);
        listaEnlazada.push(20);
        listaEnlazada.push(13);
        listaEnlazada.push(43);
        listaEnlazada.push(18);
        listaEnlazada.push(11);
        listaEnlazada.push(53);

        System.out.println(listaEnlazada.obtenerSusObjetos());

        ingresarDatosAletoriamentePushOShift(listaEnlazada, 68);
        ingresarDatosAletoriamentePushOShift(listaEnlazada, 95);
        ingresarDatosAletoriamentePushOShift(listaEnlazada, 3);
        ingresarDatosAletoriamentePushOShift(listaEnlazada, 7);
        ingresarDatosAletoriamentePushOShift(listaEnlazada, 37);

        System.out.println(listaEnlazada.obtenerSusObjetos());

        ListaEnlazada[] listas = separarLaListaEnParEImpar(listaEnlazada);

        System.out.println("Lista de pares: " + listas[0].obtenerSusObjetos());
        System.out.println("Lista de impares: " + listas[1].obtenerSusObjetos());

    }

    private static ListaEnlazada[] separarLaListaEnParEImpar(ListaEnlazada listaEnlazada) {
        ListaEnlazada listaAuxiliarPares = new ListaEnlazada();
        ListaEnlazada listaAuxiliarImpares = new ListaEnlazada();
        Nodo nodoAuxiliar = listaEnlazada.obtenerPrimerNodo();

        while (nodoAuxiliar != null) {
            if ((int) nodoAuxiliar.obtenerObjeto() % 2 == 0) {
                listaAuxiliarPares.push(nodoAuxiliar.obtenerObjeto());
            } else {
                listaAuxiliarImpares.push(nodoAuxiliar.obtenerObjeto());
            }
            nodoAuxiliar = nodoAuxiliar.obtenerSiguienteNodo();
        }

        return new ListaEnlazada[]{listaAuxiliarPares, listaAuxiliarImpares};
    }

    private static void ingresarDatosAletoriamentePushOShift(ListaEnlazada listaEnlazada, int i) {
        //Para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debes usar esta fórmula
        //valorEntero = Math.floor(Math.random()*(N-M+1)+M);

        switch ((int) Math.floor(Math.random() * 2)) {
            case 0 -> listaEnlazada.push(i);
            case 1 -> listaEnlazada.unshift(i);
            default -> System.out.println("Algo salio mal");
        }
    }
}