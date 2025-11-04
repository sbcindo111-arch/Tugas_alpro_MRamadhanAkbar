import java.util.Scanner;

public class gajikaryawan {
    
    public static void main(String[] args) {
        
        int gajii = gaji();
        int anakk = anak();
        int tunj = 0;

        if (anakk < 3) {

            tunj = gajii * 2/10; 
            
        } else {

            tunj = gajii * 3/10;

        }

        System.out.println("Total anak: " + anakk);
        System.out.println("Gaji kotor: " + gajii);
        System.out.println("Tunjangan yang didapat: " + tunj);


    }

    public static int anak() {
        
        System.out.println("Masukkan total anak: ");
        Scanner input = new Scanner(System.in);
        int totalanak = input.nextInt();
        return totalanak;

    }

    public static int gaji() {

        System.out.println("Masukkan Gaji");
        Scanner input = new Scanner(System.in);
        int kotor = input.nextInt();
        return kotor;

    }

}
