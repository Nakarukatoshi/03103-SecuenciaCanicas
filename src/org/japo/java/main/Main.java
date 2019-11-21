/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final int CANICAS_INICIALES = 5;
        final int CANICAS_PERDIDAS = 4;
        final String CANICAS_NOMBRE = "Ruperta";
        final int CANICAS_SUPERVIVIENTES = CANICAS_INICIALES - CANICAS_PERDIDAS;

        //Salidas
        // Cabecera
        System.out.println("Secuencia de Canicas");
        System.out.println("====================");

        //  Nombre de la canica especial
        System.out.printf("Nombre de la canica ........: %s%n",
                CANICAS_NOMBRE);

        //  Separador_1
        System.out.println("---");

        //  Canicas iniciales y finales
        System.out.printf("Número de canicas inicial ..: %d%n",
                CANICAS_INICIALES);
        System.out.printf("Número de canicas final ....: %d%n",
                CANICAS_SUPERVIVIENTES);

        //  Separador_2
        System.out.println("---");

        // Canicas perdidas
        System.out.printf("Número de canicas perdidas .: %d%n",
                CANICAS_PERDIDAS);
    }
}
