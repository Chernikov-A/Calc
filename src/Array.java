public class Array {
    public static <T> boolean compareArrays(T[] arr, T[] arr2){
        boolean isTheLengths = arr.length == arr2.length;
        boolean isTheClaas = arr.getClass().getName().equals(arr2.getClass().getName());
        return isTheLengths && isTheClaas;
    }
}
