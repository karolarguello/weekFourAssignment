package weekFourAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class weekFourAssignmnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Jeremy");
		employeeNames.add("John");
		employeeNames.add("Natasha");
		employeeNames.add("Brian");
		employeeNames.add("Chris");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(5100);
		ids.add(5101);
		ids.add(5102);
		ids.add(5103);
		ids.add(5104);
		
		Map<Integer, String> employeeMap = new HashMap <Integer, String>();
		
		int i=0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		System.out.println(employeeMap);
		
		for (Integer employeeId : employeeMap.keySet())
			System.out.println("key: " + employeeId);
		for (String employeeName : employeeMap.values())
			System.out.println("value: " + employeeName);
		
		
		StringBuilder idsBuilder = new StringBuilder();
		String dashString = "-";
			for (Integer dash : ids) {
			idsBuilder.append(dash).append(dashString);
			}
		System.out.println(idsBuilder.toString()); 
			
			
		StringBuilder namesBuilder = new StringBuilder();
		String result = " ";
			for (String name : employeeNames) {
				namesBuilder.append(name).append(result);
			}		
		System.out.println(namesBuilder.toString());
	}
}
