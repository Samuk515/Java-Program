package Day18;

import java.util.Arrays;

public class StringArrayOps {
    public static void main(String[] args) {
        String[] names = {"Priya", "Arjun", "Sita", "Ram", "Zara", "Dev"};
        int n = names.length;

        //Bubble sort using compareTo
        for(int i = 0; i < n; i++){
            for (int j=0; j<n-i-1; j++){
                if(names[j].compareTo(names[j+1])>0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted   :");
        for(String name: names) System.out.println(name + " ");
        System.out.println();

        //Linear search
        String target = "Ram";
        int foundIdx = 1;
        for (int i = 0; i<n; i++){
            if(names[i].equals(target)){
                foundIdx = i;
                break;
            }
            System.out.println(target + "found at index " + foundIdx);

            //Names starting with vowel
            System.out.println("Vowel names: ");
            for (String name : names) {
            char first = Character.toLowerCase(name.charAt(0));
            if("aeiou".indexOf(first) >=0) System.out.println(name + " "); ;
            }
            System.out.println();
        }
    }
}
