import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        double radius = 1;
        double height = 1;
        Point center;
        Circle circle;
        Cylinder cylinder;


        System.out.println("Enter X Coordinate: ");
        boolean bool = true;
        while(bool) {
            if (s.hasNextInt()) {
                x = s.nextInt();
                bool = false;
            }
            else{
                System.out.println("Please enter a number:");
                s.nextLine();
            }
        }
        System.out.println("Enter Y Coordinate: ");
        bool = true;
        while(bool) {
            if (s.hasNextInt()) {
                y = s.nextInt();
                bool = false;
            }
            else{
                System.out.println("Please enter a number:");
                s.nextLine();
            }
        }
        System.out.println("Enter radius: ");
        bool = true;
        while(bool) {
            if (s.hasNextInt()) {
                radius = s.nextInt();
                bool = false;
            }
            else{
                System.out.println("Please enter a number:");
                s.nextLine();
            }
        }
        System.out.println("Enter Height: ");
        bool = true;
        while(bool) {
            if (s.hasNextInt()) {
                height = s.nextInt();
                bool = false;
            }
            else{
                System.out.println("Please enter a number:");
                s.nextLine();
            }
        }

        boolean quit = true;
        int response;
        while(quit) {
            System.out.println("1 Create a Point object \n2 Create a Circle Object \n3 Create a Cylinder \n4 Display Circle Properties \n5 Display Cylinder Properties \n6 Quit");
            if(s.hasNextInt()) {
                response = s.nextInt();
                if (response == 1){
                    System.out.println("Enter X Coordinate: ");
                    bool = true;
                    while(bool) {
                        if (s.hasNextInt()) {
                            x = s.nextInt();
                            bool = false;
                        }
                        else{
                            System.out.println("Please enter a number:");
                            s.nextLine();
                        }
                    }
                    System.out.println("Enter Y Coordinate: ");
                    bool = true;
                    while(bool) {
                        if (s.hasNextInt()) {
                            y = s.nextInt();
                            bool = false;
                        }
                        else{
                            System.out.println("Please enter a number:");
                            s.nextLine();
                        }
                    }
                }
                else if(response == 2){
                    System.out.println("Enter radius: ");
                    bool = true;
                    while(bool) {
                        if (s.hasNextInt()) {
                            radius = s.nextInt();
                            bool = false;
                        }
                        else{
                            System.out.println("Please enter a number:");
                            s.nextLine();
                        }
                    }
                }
                else if(response == 3){
                    System.out.println("Enter Height: ");
                    bool = true;
                    while(bool) {
                        if (s.hasNextInt()) {
                            height = s.nextInt();
                            bool = false;
                        }
                        else{
                            System.out.println("Please enter a number:");
                            s.nextLine();
                        }
                    }
                }
                else if(response == 4){
                    center = new Point(x,y);
                    circle = new Circle(center, radius);
                    System.out.println("Surface: " + circle.computeSurface() + " Circumference: " + circle.computeCircumference());
                }
                else if(response == 5){
                    center = new Point(x,y);
                    circle = new Circle(center, radius);
                    cylinder = new Cylinder(circle, height);
                    System.out.println("Surface: " + cylinder.computeSurface() + " Volume: " + cylinder.computeVolume());
                }
                else if(response == 6){
                    quit = false;
                }
            }
            s.nextLine();
        }
    }
}
