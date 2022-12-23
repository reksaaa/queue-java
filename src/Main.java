public class Main {
    public static void main(String[] args) {

        Employee angelDimaria = new Employee("Angle","Dimaria", 1);
        Employee julianAlvarez = new Employee("Julian", "Alvarez",2);
        Employee kylianMbappe = new Employee("Kylian", "Mbappe",3);
        Employee olivierGiroud =  new Employee("Olivier", "Grioud", 4);
        Employee leoMessi = new Employee("Leonal","Messi", 5);

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(angelDimaria);
        queue.enqueue(julianAlvarez);
        queue.enqueue(kylianMbappe);
        queue.enqueue(olivierGiroud);
        queue.enqueue(leoMessi);


        //queue.dequeue();

        //queue.printQueue();

        System.out.println(queue.peekRear());
        System.out.println(queue.size());
    }
}