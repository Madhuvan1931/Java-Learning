
public class for_Loop {
    public static void main(String[] args) {
        for(int i=0; i<=10; i+=2){
            if(i==4){
                System.out.println("4 hai");
                break;
            }
            System.out.println(i+" ");
        }
        for(int i=0; i<=5; i++){
            if(i==3){
                System.out.println("3 skip hai");
                continue;
            }
            System.out.println(i+" ");
        }
    // // print square pattern 
    //     for(int i=0; i<4; i++){
    //         System.out.println("* * * * *");
    //     }
    }
}
