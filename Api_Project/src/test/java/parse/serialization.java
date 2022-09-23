package parse;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class serialization {

	public static void main(String []args) throws Throwable, JsonMappingException, IOException{
		int[] phNum= {98254,75845,78569};
		
		Employee emp=new Employee("Meeth",001,false,phNum);
		ObjectMapper objMap=new ObjectMapper();
		objMap.writeValue(new File("./jsonEmployee.json"), emp);
		}
		
	}

