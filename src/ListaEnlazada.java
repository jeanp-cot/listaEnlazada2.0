public class ListaEnlazada {
    private Nodo primerNodo;

    public ListaEnlazada() {
        this.primerNodo = null;
    }

    public void push(Object objeto) {
        if (laListaEstaVacia()) {
            this.primerNodo = new Nodo(objeto);
        } else {
            Nodo auxiliarParaEncontrarElUltimoNodo = primerNodo;

            while (auxiliarParaEncontrarElUltimoNodo.obtenerSiguienteNodo() != null) {
                auxiliarParaEncontrarElUltimoNodo = auxiliarParaEncontrarElUltimoNodo.obtenerSiguienteNodo();
            }

            auxiliarParaEncontrarElUltimoNodo.ponerObjeto(objeto);
        }
    }

    private boolean laListaEstaVacia() {
        return primerNodo == null;
    }

    public String obtenerSusObjetos() {
        Nodo auxiliarParaObtenerTodosLosNodos = primerNodo;
        String auxiliarParaPasarElContenidoDeLosNodos = "[";
        while (auxiliarParaObtenerTodosLosNodos != null) {
            auxiliarParaPasarElContenidoDeLosNodos += auxiliarParaObtenerTodosLosNodos.obtenerObjeto()+", ";
            auxiliarParaObtenerTodosLosNodos = auxiliarParaObtenerTodosLosNodos.obtenerSiguienteNodo();
        }

        auxiliarParaPasarElContenidoDeLosNodos = auxiliarParaPasarElContenidoDeLosNodos.substring(0,Math.abs(auxiliarParaPasarElContenidoDeLosNodos.length()-2));

        auxiliarParaPasarElContenidoDeLosNodos += "]";

        return auxiliarParaPasarElContenidoDeLosNodos;
    }

    public void pop() {
        if (primerNodo.obtenerSiguienteNodo() == null || laListaEstaVacia()) {
            shift();
        } else {
            Nodo auxiliarParaEncontrarElUltimoValor = primerNodo;
            Nodo auxiliarParaEncontrarElValorAnteriorAlUltimo = primerNodo;

            while (auxiliarParaEncontrarElUltimoValor.obtenerSiguienteNodo() != null) {
                auxiliarParaEncontrarElUltimoValor = auxiliarParaEncontrarElUltimoValor.obtenerSiguienteNodo();
            }

            while (auxiliarParaEncontrarElValorAnteriorAlUltimo.obtenerSiguienteNodo() != auxiliarParaEncontrarElUltimoValor) {
                auxiliarParaEncontrarElValorAnteriorAlUltimo = auxiliarParaEncontrarElValorAnteriorAlUltimo.obtenerSiguienteNodo();
            }

            auxiliarParaEncontrarElValorAnteriorAlUltimo.borrarSiguienteNodo();
        }
    }

    public void shift() {
        if (!laListaEstaVacia()) {
            primerNodo = primerNodo.obtenerSiguienteNodo();
        }
    }

    public void unshift(Object objeto) {
        primerNodo = new Nodo(objeto, primerNodo);
    }
}
