


public class Cliente extends Thread{


    /*
                Puntos importantes:
          1º extends Thread                       --> linea 4
          2º metodo run      (quitar el super)    --> linea 15
          3º hemos generado una nueva clase llamada dinero,
          esta tendra un long de tipo estatico para consultar el dinero

          4º Empezamos a hacer el proceso para consultar en este caso el dinero
          5º para sumular un delay hemos creado un (long)(Math.random()*1000)
          6º en cuanto llamemos al metodo start() sleep() nos pedira crear un try catch para controlar la excepcion

          7º esto es importante, hemos creado una variable salario para que se vaya restando el salario a medida
          que se ejecute   --> linea 27 y linea 29

          8º El ultimo paso es restar al maximo el dinero por cada iteración.


     */


    private final long salario;

    public Cliente(long salario){this.salario = salario;}




    @Override
    public void run() {

        try {
            System.out.println("Simular la lectura de la cartilla del banco");
            long dinero = DineroMaximo.cash;
            // generamos un delay para simular el tiempo que tarda en consultar
            long tiempoDeEspera = (long)(Math.random()*1000);
            sleep(tiempoDeEspera);
            dinero = dinero - this.salario;

            // Volvemos a poner un delay para simular el tiempo que tarda la transición en realizarse
            sleep(tiempoDeEspera);
            System.out.println("Voy a sacar una cantidad de 25€ ");
            DineroMaximo.cash = dinero;
            System.out.println("la cantidad total de lo que me queda es: "+DineroMaximo.cash+"€");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
