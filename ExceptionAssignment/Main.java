// import java.util.*;

// public class Main{
//     public static void main(String[]args){
//         int arr[]={1,2,3,4,5};
//         int arr2[]={4,5,6,7,8};
//         ArrayList<Integer>list = new ArrayList<>();
//         for(int i =0; i<arr.length;i++){
//             list.add(arr[i]);
//         }
//         for(int i =0; i<arr2.length;i++){
//             if(!list.contains(arr2[i])){
//                 list.add(arr2[i]);
//             }
//         }
//         System.out.println(list);
//     }
// } 




import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arr2[] = {7,8,6,8,9};
		LinkedList <Integer> list = new LinkedList<>();
		for(int i = 0 ; i<arr.length ; i++) {
			list.add(arr[i]);
		}
		for(int i = 0; i<arr2.length; i++) {
			if(!list.contains(arr2[i])) {
				list.add(arr2[i]);
			}
		}
		System.out.println(list);
		
	}
	
}
