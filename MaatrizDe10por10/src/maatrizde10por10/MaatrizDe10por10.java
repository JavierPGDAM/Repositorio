package maatrizde10por10;

public class MaatrizDe10por10 {

    public static int azar(int tope) {
        int x;
        x = (int) Math.floor(Math.random() * (tope + 1));
        return x;
    }

    public static void desordenar(int[] v) {
        int a, b, temp, t;
        //cogemos dos números que serán las posiciones del vector

        //intercambiamos el contenido de las dos posiciones elegidas al azar
        for (t = 0; t < 500; t++) {
            a = azar(v.length - 1);
            b = azar(v.length - 1);

            temp = v[a];
            v[a] = v[b];
            v[b] = temp;
        }
    }

    public static void mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int i, j, t;

        int[][] m;
        m = new int[10][10];

        //matriz inicial de 0 a 9
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[0].length; j++) {
                m[i][j] = j;
            }
        }

        //creamos la función public static void desordenar(int[]v)
        //rellenamos la matriz con todos los números
        for (i = 1; i < m.length; i++) {
            desordenar(m[i]);
        }

        mostrar(m);
    }

}
