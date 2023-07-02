package Dirigida2.Tablerogrone;

public class Main {

    public static void main(String[] args) {
        //n-goro
        // (1,1) (1,2), (1,3), (1,n)  ... (1,n+1) (j)
        //(2,1)  (2,2)
        //

        //(1,n) (2,n)     ...  (n,n)  ... (n,n+1)

        //(n,n)-"[n+1,n+1]--(1,n+1)"(filo derecha abajo -sube)
        //(1,n+1)- "[2,n+2]"--(2,1) "(sale por la derecha- al otro lado)
        //(n,n-1)- "[n+1,n)-(1,n)"
        //solo hay dos maneras posibles de salirse es por derecha y por abajo
        //por abajo misma columna(la que se paso) 1ra fila
        //por derecha misma fila (la que se paso) 1ra columna

        //recibir por string n
        String information="2-3>3-5>1-4";
        //caso1, 4
        //caso2, 3
        //caso3, 5

        int n=5;
        int[][] arr = new int [n+2][n+3];
        arr[1][1]=1;
        int cont = 1;
        //aumentando una fila abajo y a la derecha
        int aux1=0;
        int auxj=0;
        //mientras el maximo valor no sea alcanzado i-1*j-1
        /*for(int i=1;i<n;i++){
            for(int j=1;i<n;i++){
                if(i<n+2&&i<n+3){
                    arr[i][j]=cont;
                    cont++;
                }else if(i>=n+2){

                    arr[aux1][aux2]
                }
            }
        }*/
        int i=1,j=1;
        int auxil=0;
        int auxjl=0;
        // (0,1)  (1,0)
        //n=5 , max = 5*6 =30
        while(cont<=n*(n+1)){
            if(i<=n&&j<=n+1){
                arr[i][j]=cont;
                i++;j++;
                cont++;
            }else if(i==n+1){ // se pasa de fila
                //8arr[][]=n
                //auxil=i;auxjl=j;//mantiene la suma
              i=1;
                arr[i][j]=cont;
                cont++;
            }else if(j==n+2){
                //auxil=i;
               // auxjl=j;
               j=1;
                arr[i][j]=cont;
                cont++;
            }

        }

        for(int p=1;p<=n;p++){
            for(int q=1;q<=n+1;q++){
                System.out.print(arr[p][q]+"| ");
            }
            System.out.println();
        }
    }

}
