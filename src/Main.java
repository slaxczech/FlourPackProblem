//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(Boolean.toString(canPack(1,0,4)));
        System.out.println(Boolean.toString(canPack(1,0,5)));
        /*System.out.println(Boolean.toString(canPack(1,0,6)));*/
        System.out.println(Boolean.toString(canPack(0,5,4)));
        /*System.out.println(Boolean.toString(canPack(0,5,5)));
        System.out.println(Boolean.toString(canPack(0,5,6)));
        System.out.println(Boolean.toString(canPack(-3,2,12)));
        System.out.println(Boolean.toString(canPack(3,-2,12)));
        System.out.println(Boolean.toString(canPack(3,2,-12)));
        System.out.println(Boolean.toString(canPack(3,0,15)));*/
        System.out.println(Boolean.toString(canPack(2,2,11)));
        /*System.out.println(Boolean.toString(canPack(2,2,12)));
        System.out.println(Boolean.toString(canPack(2,1,12)));
        System.out.println(Boolean.toString(canPack(2,1,5)));
        System.out.println(Boolean.toString(canPack(5,3,24)));
        System.out.println(Boolean.toString(canPack(2,7,18)));
        System.out.println(Boolean.toString(canPack(2,10,18)));
        System.out.println(Boolean.toString(canPack(2,10,19)));
        System.out.println(Boolean.toString(canPack(2,10,20)));
        System.out.println(Boolean.toString(canPack(2,10,21)));
        System.out.println(Boolean.toString(canPack(4,18,19)));
        System.out.println(Boolean.toString(canPack(6,2,17)));*/
        System.out.println(Boolean.toString(canPack(-3,2,12)));
        /*System.out.println(Boolean.toString(canPack(4,18,19)));*/
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int big = bigCount * 5;
        int small = smallCount * 1;
        int bigNum1 = 0;
        int smallNum1 = 0;

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if(big + small < goal){
            return false;
        }else{
            if(bigCount!=0) {
                bigNum1 = goal / 5;
                smallNum1 = goal - (5 * bigNum1);
            }

            if(smallNum1 == 0){
                return true;
            }else{
                if(smallNum1 <= smallCount){
                    return true;
                }
            }
            return false;
        }

    }
}