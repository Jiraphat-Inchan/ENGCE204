import java.util.Scanner;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource " + id + " finalized (destroyed).");
        } finally {
            super.finalize();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String id1 = sc.next();
        String id2 = sc.next();
        String id3 = sc.next();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.gc();

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        r3 = null;

        System.gc();
        
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        
        sc.close();
    }
}
