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
		
		for(int i=0; i<temp.size(); i++) {
			
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
		
		System.out.println("==================");
		System.out.println("INPUT SOURCE");
		System.out.println(source.toString());
		
		System.out.println("\n\n");
		System.out.println("1. remove duplicate items: \n" + removeDuplicateItems(source).toString());
		
		System.out.println("\n\n");
		System.out.println("2. bubble sort:\n" + bubbleSort(source, false).toString());
		
		
		
		System.out.println("\n\nINPUT SOURCE");
		System.out.println(source.toString());
	}
	
}
