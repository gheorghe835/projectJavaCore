public class VolumeCylinder
    {
        public static void main(String[] args)
        {
            //Program pentru calcularea volumului cilindrului.

            final float PI = 3.14f;       // constanta PI
            byte radius = 10; // raza cilindrului
            byte height = 50; // inaltimea cilindrului

            float volume = PI * radius * radius * height;

            System.out.printf("  Volumul cilindrului se va calcula :: V = π * r * r * h  %n ");

            System.out.printf("  Constanta π = %.2f%n   ",PI  );
            System.out.printf("  Raza cilindrului = %d%n   ",radius  );
            System.out.printf("    Inaltimea cilindrului = %d%n%n   ",height  );

            System.out.print(PI);
            System.out.print(" * ");
            System.out.print(radius);
            System.out.print(" * ");
            System.out.print(radius);
            System.out.print(" * ");
            System.out.print(height);
            System.out.print(" = ");
            System.out.print(volume);

            System.out.printf("%n%n  Volumul cilindrului = %.2f ",volume);
            
        }
    }
