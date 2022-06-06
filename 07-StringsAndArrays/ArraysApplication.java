public class ArraysApplication {
    public static void main(String[] args) {
        int[] arrayOfInt = new int[10];
        for (int i =0; i<arrayOfInt.length; i++){
            arrayOfInt[i] =  (int) (Math.random()*100);
        }
        System.out.println("Initial array: ");
        for (int i=0; i<arrayOfInt.length; i++){
            System.out.println(arrayOfInt[i]);
        }
        //sorting
        for (int i = 0; i < arrayOfInt.length - 1; ++i)
        {
            for (int j = i + 1; j < arrayOfInt.length; ++j)
            {
                if (arrayOfInt[i] > arrayOfInt[j])
                {
                    int temp = arrayOfInt[i];
                    arrayOfInt[i] = arrayOfInt[j];
                    arrayOfInt[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");

        for (int i=0; i<arrayOfInt.length; i++){
            System.out.println(arrayOfInt[i]);
        }
    }
}
