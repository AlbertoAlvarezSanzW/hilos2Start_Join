public class Main {

    public static void main(String[] args) {

        try {
            Cliente t1 = new Cliente(25);
            t1.start(); // inicio del hilo
            t1.join();  // en este caso los Join nos dira el salario que queda
            Cliente t2 = new Cliente(25);
            t2.start();
            t2.join();
            Cliente t3 = new Cliente(25);
            t3.start();
            t3.join();
            Cliente t4 = new Cliente(25);
            t4.start();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
