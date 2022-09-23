package parse;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Deserialization {
	public  static void main(String [] args) throws Throwable, JsonMappingException, IOException {
		
		
		
		ObjectMapper objMap=new ObjectMapper();
		Employee empRead=objMap.readValue(new File("./jsonEmployee.json"),Employee.class);
		System.out.println(empRead.getEmpId());
		System.out.println(empRead.getEmpName());
		System.out.println(empRead.isMstatus());
		System.out.println(empRead.phnos[0]);
		
		
		
		}
	}


