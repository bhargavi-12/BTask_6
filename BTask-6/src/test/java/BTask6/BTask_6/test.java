package BTask6.BTask_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class test {
	private static Logger logger=LogManager.getLogger(test.class);
//	private static Logger logger=(Logger) LogManager.getLogger(test.class);
	@Test
	public void collections() {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		String exit="No";
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		int size2=list1.size();
		if(size2>=10) {
			do {
				logger.info("1.add element\n2.remove element\n3.fetch from arraylist\n4.elements are:");
				logger.info("Enter choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:logger.info("enter element\n");
				       int ele=sc.nextInt();
				       list1.add(ele);
				       break;
				case 2:logger.info("Enter insdex of element to remove\n");
				       int index=sc.nextInt();
				       int ele1=list1.remove(index);
				       logger.info("deleted element is:"+ele1);
				       break;
				case 3:logger.info("Enter index of element to fetch\n");
				       int index1=sc.nextInt();
				       int ele2=list1.get(index1);
				       logger.info("fetched element arryList:"+ele2);
				       break;
				case 4:logger.info("arraylist");
				       Iterator<Integer> it1=list1.iterator();
				       while(it1.hasNext()) {
				    	   logger.info("it1 : "+it1.next());
				    	   //logger.info(it1.next());
				       }
				       break;
				case 5:logger.info("size\n");
				         
				         //logger.info(list1.size());
				       break;
				case 6:logger.info("exited\n");
				       break;
				default:logger.error("Invalid choice");
				        break;
				}
			} while(choice!=6);
		}
				else {
					logger.info("Array list should contain atleast 10 elements\n");
				       
				}
				
	}

}
