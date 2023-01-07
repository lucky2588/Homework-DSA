public class Main {

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.addValue(1);
        myHashSet.addValue(2);
        System.out.println("Is Contrains 1 ? "+myHashSet.contrains(1));
        System.out.println("Is Contrains 2 ? "+myHashSet.contrains(2));
        System.out.println("Is Contrains 3 ? "+myHashSet.contrains(3));
    }
}
