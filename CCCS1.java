import java.util.*;



public class CCCS1{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        ArrayList<int[]> data = new ArrayList<int[]>();
        // System.out.println("How many observations? ");
        int number = num.nextInt();
        for (int i =0; i < number; i++){
            // System.out.println("Enter time and position: ");
            int time = num.nextInt();
            int pos = num.nextInt();
            int[] datapoint = {time,pos};
            data.add(datapoint);
            
        
        }
        data.sort((o1, o2)->o1[0] - o2[0]);
        float highspeed = 0;
        for (int i=0; i < data.size() -1; i++){
            float displacement = data.get(i+1)[1] - data.get(i)[1]; 
            float DeltaTime = data.get(i+1)[0] - data.get(i)[0];
            float speed = Math.abs(displacement / DeltaTime);

            if (speed > highspeed){
                highspeed = speed;
            }
        }
        System.out.println(highspeed);
        

        
    
    }
}
