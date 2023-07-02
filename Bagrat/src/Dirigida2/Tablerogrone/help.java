package Dirigida2.Tablerogrone;

public class help {
    public static void main(String[] args) {
        System.out.println("n filas =5, n +1 columnas=6");

        for(int m=0;m<=5;m++){
            for(int k=0;k<=6;k++){
                    if(m==0||k==0){
                        System.out.print("[["+m+","+k+"+]]\t");
                }else{
                        System.out.print(("("+m+","+k+"+)\t"));
                    }

                }
            System.out.println();
            }
    }
}
