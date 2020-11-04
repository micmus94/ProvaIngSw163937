package intermedExam.quickstart;


import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class MyListUtil {

		public List<Integer> Crescente(List<Integer>num) {
			int temp,tempI,tempJ;
			List<Integer>ord=Arrays.asList();
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
			return num;
		}
		
		public List<Integer> Decrescente(List<Integer>num) {
			int temp,tempI,tempJ;
			List<Integer>ord=Arrays.asList();
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
			
			}return num;
		}
}
