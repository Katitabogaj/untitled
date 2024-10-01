public class Main {
    public static void main(String[] args) {
      /*  int x = 42;
        int b = 100;
        int o = 0;
        for (int i = x; i <= b; i++) {
            if (i % 2 == 0) {
                o = o + i;
                //System.out.println("i = " + i);
            }
        }
        System.out.println("o = " + o);*/
        double els = 3.8;
        double mas = 0;
        String jel = "/";

        if (jel.equals("*")) {
            System.out.print("Az eredmeny: " );
            System.out.print(els * mas);
        }
        else if (jel.equals("+")){
            System.out.print("Az eredmeny: " );
            System.out.print(els + mas);
        }
        else if (jel.equals("-")){
            System.out.print("Az eredmeny: " );
            System.out.print(els - mas);
        }
        else if (jel.equals("/")){
            if (mas == 0) {
                System.out.println("nem osztunk 0-val");
            } else {
                System.out.print("Az eredmeny: ");
                System.out.print(els / mas);
            }
        }else {
            System.out.println("Hibás művelet!");
        }
    }
}