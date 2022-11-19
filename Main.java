import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        int ans = computePointOfInterception(x, y);
        System.out.println(ans);
    }

    public static int computePointOfInterception(int x, int y){
        LinkedList l = new LinkedList();
        Node X = l.getNode(x);
        Node Y = l.getNode(y);

        while(X!=Y){
            X=X.next.next;
            Y=Y.next;
        }
        return X.data;
    }
}