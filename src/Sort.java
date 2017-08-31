import java.util.ArrayList;
import java.util.List;

public class Sort {
	public static List bubbleSort(List source, boolean displayStep) {
		List<Integer> temp = new ArrayList<Integer>();
		temp.addAll(source);
		if (displayStep==true) System.out.println(temp.toString());
		for(int i=0; i<temp.size();i++) {
			for(int j=0;j<temp.size()-1-i;j++) {
				if(temp.get(j)>temp.get(j+1)) {
					int aTemp = temp.get(j);
					temp.set(j, temp.get(j+1));
					temp.set(j+1, aTemp);
				}
				if (displayStep==true) System.out.println(i+","+j+" " + temp.toString());
			}
			
		}
		return temp;
	}
	
	public static List removeDuplicateItems(List source) {
		List<Integer> temp = new ArrayList<Integer>();
		boolean isExist;
		for(int i=0; i<source.size(); i++) {
			isExist=true;
			for(int j=0; j<temp.size(); j++) {
				if(temp.get(j)==source.get(i)) {
					isExist=false;
					break;
				}
			}
			if (isExist==true) temp.add((Integer) source.get(i));
		}
		
		
		return temp;
	}
	
	public static List insertionSort(List source, boolean displayStep) {
		List<Integer> temp = new ArrayList<Integer>();
		temp.addAll(source);
		if (displayStep==true) System.out.println(temp.toString());
		int atemp;
		int insertionIndex = 0;
		for(int i=1; i<temp.size(); i++) {
			atemp = temp.get(i);
			insertionIndex = i;
			for(int j=i; j>0; j--) {
				if(atemp<temp.get(j-1)) {
					insertionIndex = j-1;
					temp.set(j, temp.get(j-1));
				} else {
					break;
				}
			}
			temp.set(insertionIndex, atemp);
			if (displayStep==true) System.out.println(i + ": " + temp.toString());
		}
		return temp;
	}
	public static void main(String[] args) {
		List<Integer> source = new ArrayList<Integer>();
		source.add(3);
		source.add(1);
		source.add(2);
		source.add(5);
		source.add(1);
		source.add(4);
		source.add(7);
		source.add(7);
		source.add(15);
		source.add(2);
		
		boolean debug = false;
		System.out.println("==================");
		System.out.println("INPUT SOURCE");
		System.out.println(source.toString());
		System.out.println("==================");
		
		System.out.println("1. Remove duplicate items: \n" + removeDuplicateItems(source).toString() + "\n");
		
		System.out.println("2. Bubble sort:");
		System.out.println(bubbleSort(source, debug).toString() + "\n");
		
		System.out.println("3. Insertion sort:");
		System.out.println(insertionSort(source, debug).toString() + "\n");
	}
	
}
