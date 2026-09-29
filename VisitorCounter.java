public class VisitorCounter {
    public static void main(String[] args) {
        int visitorCount = 0;

        System.out.println("Initial Visitors: " + visitorCount);
        
        // Prefix increment: increment first, then return value
        System.out.println("Visitor entered (Prefix ++count): " + (++visitorCount));
        
        // Postfix increment: return value, then increment
        System.out.println("Visitor entered (Postfix count++): " + (visitorCount++));
        System.out.println("Current count after postfix: " + visitorCount);

        // Decrementing
        System.out.println("Visitor left (Prefix --count): " + (--visitorCount));
    }
}