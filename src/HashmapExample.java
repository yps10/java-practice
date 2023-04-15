import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args) {
        int[] a={1,2,2,2,3,4,1};

        // initializing hash map
        HashMap<Integer,Integer> frequency=new HashMap<>();

        // iterating through the array
        for(int i=0;i<a.length;i++){
            // checking if the item at current position is in the hashmap
          if(frequency.containsKey(a[i])){
              // if it exists then increasing the frequency by 1
              frequency.put(a[i],frequency.get(a[i]) +1);
          }else {
              // if it doesn't exist then add the frequency 1
              frequency.put(a[i],1);
          }

        }
        System.out.println(frequency);

    //frequency.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

