package intermedExam.quickstart;


import java.util.List;
import java.util.ListIterator;


public class MyListUtil {

		public static void Crescente(List<Integer>num) {
			int temp,tempI,tempJ;
			for(int i=0;i<num.size();i++) {
				for(int j=i+1;j<num.size();j++) {
					if(num.get(i)>num.get(j)) {
						tempJ=num.get(j);
						tempI=num.get(i);
						temp=tempJ;
						tempJ=tempI;
						tempI=temp;
						num.set(i, tempI);
						num.set(j,tempJ);
					}
				}
			}
			
		}
		
		public static void Decrescente(List<Integer>num) {
			int temp,tempI,tempJ;
			for(int i=0;i<num.size();i++) {
				for(int j=i+1;j<num.size();j++) {
					if(num.get(i)<num.get(j)) {
						tempJ=num.get(j);
						tempI=num.get(i);
						temp=tempJ;
						tempJ=tempI;
						tempI=temp;
						num.set(i, tempI);
						num.set(j,tempJ);
					}
				}
			}
		}
}
