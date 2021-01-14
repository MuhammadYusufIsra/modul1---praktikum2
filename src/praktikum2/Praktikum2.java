//Package
package praktikum2;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Praktikum2 {
    //Method Main
    public static void main(String[] args) {
        //Perulangan for(Looping bersarang)
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("@");
                //Percabangan IF
                if (i==j){
                    //break = untuk mengentikan program
                    break;
                }
                
            }
            // \n digunakan untuk "spasi" antar baris
            System.out.print("\n");
        }
    }
    
}
