 import java.util.Scanner;

// public class NameAndAge {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.println("Hello " + name + ", you are " + age + " years old!");
        
//         sc.close();
//     }}

//q1
    // public class Name{
    //     public static void main(String[] args) {
    //     Scanner ne = new Scanner(System.in);

    //     System.out.print("Enter your name: ");
    //     String names = ne.nextLine();

    //     System.out.print("Enter your age: ");
    //     int age = ne.nextInt();

    //     System.out.println("name is " + names + "age is " + age);
    //     ne.close();
    //     }

    // }

    //q2

    //    public class Name{
    //     public static void main(String[] args) {
    //     Scanner ne = new Scanner(System.in);

    //     System.out.print("Enter your age: ");
    //     int age = ne.nextInt();
    //     if (age > 0){
    //         System.out.print("+");
    //     }
    //     else if(age < 0){
    //         System.out.print("-");
    //     }
    //     else if (age == 0 ){
    //         System.out.print("zero");
    //     }

    //     ne.close();
    //     }

    // }

    //q3

    //       public class Name{
    //     public static void main(String[] args) {
    //     Scanner ne = new Scanner(System.in);

    //     System.out.print("Enter your numb: ");
    //     int age = ne.nextInt();

    //     for (int i=0;i <=10;i++ ){
    //         int table = i * age;
    //         System.out.print(table);
    //     }
    //     ne.close();
    //     }

    // }


    //assign 2
    //q1

    
    //       public class Name{
    //     public static void main(String[] args) {
    //     Scanner ne = new Scanner(System.in);
    //     int sum =0;
    //     int[] age = new int[10];
    //     //int[]age = {1,2,3,4,5,6,7,8,9,0};
    //     System.out.print("Enter your numb: ");
    //     for (int i=0; i <age.length; i++){
    //         age[i] = ne.nextInt();
    //          sum += age[i];
    //     }
    //     int average = sum/10;
    //     System.out.println(sum+ " " + average );
    //     ne.close();
    //     }

    // }

    //q2

        //  public class Name{
        // public static void main(String[] args) {
        // Scanner ne = new Scanner(System.in);

        // int[] age = new int[10];
        // //int[]age = {1,2,3,4,5,6,7,8,9,0};
        // System.out.print("Enter your numb: ");
        
        // for (int i=0; i <10; i++){
        //     age[i] = ne.nextInt();}


        //     int max = age[0];
        //     int min = age[0];
            
        // for (int i = 1; i < age.length; i++) {
        //     if (age[i] > max) {
        //         max = age[i];
        //     }
        //     if (age[i] < min) {
        //         min = age[i];
        //     }
        // }
        
        
        // System.out.println("Maximum value: " + max +" "+ min);
        // ne.close();
        // }}

    


//assignment 3 
//q1 linear search


    //      public class Name{
    //     public static void main(String[] args) {
    //     Scanner ne = new Scanner(System.in);

    //     //int[] age = new int[10];
    //     int[]age = {0,1,2,3,4,5,6,4,7,9};
    //     System.out.print("target");
    //     int tar = ne.nextInt();

    //     int index = -1;

    //     for (int i=0; i<age.length; i++){
    //         if(age[i] == tar){
    //             index = i;
    //             break;
    //         }
    //     }
    //         if(index != -1){
    //             System.out.println("index =" + index);
    //         } else {
    //             System.out.println("not found");
    //         }
    //     }
    
    // }

    //q2 binay search

    

    //      public class Name{
    //     public static void main(String[] args) {
    //     Scanner ne = new Scanner(System.in);

    //     //int[] age = new int[10];
    //     int[]age = {0,1,2,3,4,5,6,7,8,9};
    //     System.out.print("target");
    //     int tar = ne.nextInt();

    //     int index = -1;
    //     int left = 0;
    //     int right = age.length - 1;
        
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
    //         if (age[mid] == tar) {
    //             index = mid;
                  swapCount++; // 🔥 count it ffor checking swaps
    //             break;
    //         } else if (age[mid] < tar) {
    //             left = mid + 1;
    //         } else {
    //             right = mid - 1;
    //         }
    //     }




    //         if(index != -1){
    //             System.out.println("index =" + index);
    //         } else {
    //             System.out.println("not found");
    //         }
    //     }
    

    // }



/assign 04 q1
    //bubble sort

    public class Name{
        public static void main(String[] args) {
            int[]age={1,2,5,32,5,4,3};
            
            for(int i=0;i<age.length -1;i++){
                for(int j=0;j < age.length-i-1; j++){
                    if(age[j] > age[j+1] ){  //this is accending if you do < then this is decending
                        //swap
                        int temp = age[j];
                        age[j] = age[j+1];
                        age[j+1] = temp;
                     swapCount++; // 🔥 count it for check swaps
                    }
                }
            }
            for (int k=0; k < age.length; k++){
                System.out.println(age[k]);
            }
        }
    }

//selection swap 
public class Name{
    public static void main(String[] args) {
        int[]age= {1,3,2,5,6,8,5,7,4};
        int swapCount = 0;
        for (int i=0; i<age.length; i++){
             
            int smallest = i;
        for(int j=i+1; j<age.length; j++){
            if(age[smallest] > age[j] ) { //accending order
                smallest = j;
            }
        }
        if (i != smallest) { // only swap if needed
                int temp = age[smallest];
                age[smallest] = age[i];
                age[i] = temp;
                swapCount++; // count actual swap
            }
        }
        System.out.println(swapCount);
        for (int k=0; k < age.length; k++){
                 System.out.println(age[k]);
           }
    }
}

//insertation sort


public class Name{
    public static void main (String [] args) {
        int[]age = {1,3,2,5,6,7,4,3};
        for (int i=0; i<age.length; i++) {
            int current = age[i];
            int j = i-1;
            while(j >= 0 && current < age[j] ){ //accending for decent > btw current and age
                age[j+1] = age[j]; 
             swapCount++; // 🔥 count it checking swaps 
                j--;
            }
            age[j+1] = current;
        }
        for (int k=0; k < age.length; k++){
              System.out.println(age[k]);}
    }
}




