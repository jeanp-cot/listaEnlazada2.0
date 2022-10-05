public class Main {
    public static void main(String[] args) {

        ListaEnlazada listaEnlazada = new ListaEnlazada();

        //Agregamos al final de la lista estos valores
        listaEnlazada.push(1);
        listaEnlazada.push(2);
        listaEnlazada.push(3);
        listaEnlazada.push(4);

        //Mostramos la lista
        System.out.println(listaEnlazada.obtenerSusObjetos());

        //Le quita el primer valor de la lista
        listaEnlazada.shift();
        System.out.println(listaEnlazada.obtenerSusObjetos());

        //Le quita el ultimo valor de la lista
        listaEnlazada.pop();
        System.out.println(listaEnlazada.obtenerSusObjetos());

        //Agregamos al inicio un valor a la lista
        listaEnlazada.unshift(200);
        System.out.println(listaEnlazada.obtenerSusObjetos());
    }
}