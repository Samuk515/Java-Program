package Day19;

public class StringCompareTo {
    public static void main(String[] args) {
        String[] cities = {"Kathmandu", "Pokhara", "Biratnagar", "Lalitpur", "Dharan"};
        int n= cities.length;

        //Insertion sort using compareTo
        for (int i=1; i<n; i++){
            String key = cities[i];
            int j = i-1;
            while (j >= 0 && cities[j].compareTo(key) > 0){
                cities[j + 1] = cities[j];
                j--;
            }
            cities[j+1] = key;
        }
        System.out.println("Sorted  : ");
        for (String c : cities ) System.out.println(c + " ");
        System.out.println();

        System.out.println("Smallest: " +cities[0]);
        System.out.println("Largest : " +cities[n-1]);

        String s1 = "Pokhara", s2 = "Kathmandu";
        int result = s1.compareTo(s2);
        System.out.println(s1 + " vs " + s2 + " : " + s1 + " comes " + (result < 0 ? "BEFORE" : "AFTER"));
    }
}
