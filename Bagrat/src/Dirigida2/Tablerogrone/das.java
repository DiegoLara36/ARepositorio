package Dirigida2.Tablerogrone;


    public class das {
        public static void main(String[] args) {
           extrayendo(" 0812345694");

        }

        public static void extrayendo(String NUSS){


            //pasando a char
            int cont1=0;
            int cont2=0;
            int aux=0;
            boolean flag = false;
            for(int i=0;i<10;i++){
                //(int)(NUSS.charAt(i))-48;
                aux=aux*10+(((int)(NUSS.charAt(i)))-48);
                if(i==3){
                  cont1 = aux;
                }
                if(i==6){
                   cont2 = aux%((int)Math.pow(10,6));
                }

            }
            int cont3=aux%1000;

            System.out.println(cont1+" "+cont2 +" "+cont3);
            if(cont2%97==94){
                System.out.println("es corecto");

            }else{
                System.out.println("no es correcta");
            }

        }
    }
