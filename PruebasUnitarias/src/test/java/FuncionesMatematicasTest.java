import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FuncionesMatematicasTest {

        public FuncionesMatematicas funciones = new FuncionesMatematicas();



        @Test
        public void suma() {

            double resultado = 30;

            assertEquals(30,funciones.suma(15,15));
        }

        @Test
        public void resta() {

            double resultado = 0;

            assertEquals(0,funciones.resta(15,15));
        }

        @Test
        public void multiplicacion() {

            double resultado = 225;

            assertEquals(225,funciones.multiplicacion(15,15));
        }

        @Test
        public void division() {
            double resultado = 6;

            assertEquals(6,funciones.division(90,15));
        }

        @Test
        public void esCapicua() {

            boolean resultado = true;

            assertEquals(true,funciones.esCapicua(16461));
        }

        @Test
        public void digitos() {

            int resultado = 5;

            assertEquals(5,funciones.digitos(15461));
        }

        @Test
        public void esPrimo() {

            boolean resultado = true;

            assertEquals(true,funciones.esPrimo(23));
        }

        @Test
        public void siguientePrimo() {

            int resultado = 29;

            assertEquals(29,funciones.siguientePrimo(23));
        }

        @Test
        public void potencia() {

            double resultado = 9;

            assertEquals(9,funciones.potencia(3,2));
        }

        @Test
        public void voltea() {

            int resultado = 456;

            assertEquals(456,funciones.voltea(654));
        }

        @Test
        public void digitoN() {

            int resultado = 4;

            assertEquals(4,funciones.digitoN(15461,2));
        }

        @Test
        public void posicionDeDigito() {

            int resultado = 2;

            assertEquals(2,funciones.posicionDeDigito(15461,4));
        }

        @Test
        public void quitaPorDetras() {

            int resultado = 154;

            assertEquals(154,funciones.quitaPorDetras(15461,2));
        }

        @Test
        public void quitaPorDelante() {

            int resultado = 61;

            assertEquals(61,funciones.quitaPorDelante(15461,3));
        }

        @Test
        public void pegaPorDetras() {

            int resultado = 15461;

            assertEquals(15461,funciones.pegaPorDetras(1546,1));
        }

        @Test
        public void pegaPorDelante() {

            int resultado = 15461;

            assertEquals(15461,funciones.pegaPorDelante(5461,1));
        }

        @Test
        public void trozoDeNumero() {

            int resultado = 546;

            assertEquals(546,funciones.trozoDeNumero(15461,1,3));
        }

        @Test
        public void juntaNumeros() {

            int resultado = 15461;

            assertEquals(15461,funciones.juntaNumeros(15,461));
        }

    }



