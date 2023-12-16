import java.util.Scanner;;

/**
 * Ex6withoutFunc
 */
public class Ex6withoutFunc {

    static int calculateArea (int l, int w){
        int area = l * w;
        return area;
    }

    static int calculatevolume (int l, int w, int h){
        int vol = calculateArea(l, w) *h;
        return vol;
    }

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("input length = ");
        p = input15.nextInt();
        System.out.println("Input widht = ");
        l = input15.nextInt();
        System.out.println("Input height = ");
        t = input15.nextInt();

        L = p* l;
        System.out.println("area of the rectangle =" +L);
        vol = p * l *t;
        System.out.println("Volume of the rectangle = " + vol);
    }
}