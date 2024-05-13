package tech.maikcosta.exam2;

public class SobrescrevendoArray {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {'A', 'B'};
        arr1 = arr2;
        System.out.println(arr1.length + arr2.length);
    }
}
