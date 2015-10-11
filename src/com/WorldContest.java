import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int opponentCount = in.nextInt(); // Opponent count
        int a=0,b=0,c=0,count=0;

        // game loop
        while (true) {
            int gameRound = in.nextInt();
            int x = in.nextInt(); // Your x position
            
            int y = in.nextInt(); // Your y position
            
            if(count==0){
                a=x;b=y;
                count=1;
            }
            int backInTimeLeft = in.nextInt(); // Remaining back in time
            for (int i = 0; i < opponentCount; i++) {
                int opponentX = in.nextInt(); // X position of the opponent
                int opponentY = in.nextInt(); // Y position of the opponent
                int opponentBackInTimeLeft = in.nextInt(); // Remaining back in time of the opponent
            }
            for (int i = 0; i < 20; i++) {
                String line = in.next(); // One line of the map ('.' = free, '0' = you, otherwise the id of the opponent)
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if(c!=1){
                if(x==0 && y==0){
                    x=x+1;
                }
                else if(x==34 && y!=19){
                    y=y+1;
                }
                else if(a==x && y==b){
                    y=y-1;
                }
                else if(a==x && y<b && y!=0){
                    y=y-1;
                }
                else if(x==34 && y==19){
                    x=x-1;
                }
                else if(y==19 && x!=a){
                    x=x-1;
                }
                else if(y==0 && x!=34){
                    x=x+1;
                }
                else if(x==a && (y==19|| y>b)){
                    y=y-1;
                }
                else if(x==a && y==b){
                    c=1;
                    
                    System.err.println("he");
                }
                
            }
            System.out.println(x+" "+y); // action: "x y" to move or "BACK rounds" to go back in time
        }
    }
}






import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int opponentCount = in.nextInt(); // Opponent count

        // game loop
        while (true) {
            int gameRound = in.nextInt();
            int x = in.nextInt(); // Your x position
            int y = in.nextInt(); // Your y position
            int backInTimeLeft = in.nextInt(); // Remaining back in time
            for (int i = 0; i < opponentCount; i++) {
                int opponentX = in.nextInt(); // X position of the opponent
                int opponentY = in.nextInt(); // Y position of the opponent
                int opponentBackInTimeLeft = in.nextInt(); // Remaining back in time of the opponent
            }
            for (int i = 0; i < 20; i++) {
                String line = in.next(); // One line of the map ('.' = free, '0' = you, otherwise the id of the opponent)
            }
            while(x!=16 || y!=10){
                if(x>16){
                    x=x-1;
                }
                else if(x<16){
                    x=x+1;
                }
                if(y>10){
                    y=y-1;
                }else if(y<10){
                    y=y+1;
                }
                System.out.println(x+" "+y);
            }
            int count=0;int dist=0,a=0,b=0,breaked=0;
            while((x>=0 && x<35) && (y>=0 && y<20)){
                a=dist+1;b=a+1;
                for(int i=0;i<=a;i++){
                    y=y-1;
                    if(y<0){
                        breaked=1;
                        break;
                    }
                    System.out.println(x+" "+y);
                    count++;
                }
                for(int i=0;i<=a+1;i++){
                    x=x+1;
                    System.out.println(x+" "+y);
                }
                for(int i=0;i<=b;i++){
                    y=y+1;
                    System.out.println(x+" "+y);
                }
                for(int i=0;i<=b+1;i++){
                    x=x-1;
                    System.out.println(x+" "+y);
                }
                dist+=2;
                if(breaked!=0){
                    y=0;
                    break;
                }
            }
            while(y<20){
                for(int i=x;i>=0;i--){
                    System.out.println(i+" "+y);
                }if(y==18){
                    y+=1;
                    System.out.println(0+" "+y);
                }else if(y<18){
                y+=2;
                System.out.println(0+" "+(y-1));
                System.out.println(0+" "+y);
                }
                else{
                    y+=2;
                }
                
                for(int i=0;i<=x;i++){
                    System.out.println(i+" "+y);
                }
                if(y==18){
                    y+=1;
                    System.out.println(x+" "+y);
                }else if(y<18){
                y+=2;
                System.out.println(x+" "+(y-1));
                System.out.println(x+" "+y);
                }
                else{
                    y+=2;
                }
            }
            y=19;x=x+1;
            while(x<=27){
                System.out.println(x+" "+y);
                x=x+1;
            }
            while(y>=0){
                for(int i=x;i<35;i++){
                    System.out.println(i+" "+y);
                }
                y+=1;
                System.out.println(34+" "+y);
                for(int i=34;i>=x;i--){
                    System.out.println(i+" "+y);
                }
                y+=1;
                System.out.println(x+" "+y);
            }
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            //System.out.println("17 10"); // action: "x y" to move or "BACK rounds" to go back in time
        }
    }
}