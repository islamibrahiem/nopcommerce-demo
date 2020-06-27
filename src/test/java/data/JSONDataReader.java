package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDataReader {
	
		public String firstName,lastName,email,confirmEmail,userName,
		password,confirmPassword;
		
		public void JsonReader() throws IOException, ParseException
		{
			String filePath = System.getProperty("user.dir") + "/src/test/java/data/userData.Json";
			File srcFile = new File(filePath);
			
			JSONParser parser = new JSONParser();
			JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));
			
			for(Object jsonObj : jarray)
			{
				JSONObject person = (JSONObject) jsonObj;
				firstName = (String) person.get("firstname");
				lastName = (String) person.get("lastname");
				email = (String) person.get("email");
				confirmEmail = (String) person.get("cofirmemail");
				userName = (String) person.get("username");
				password = (String) person.get("password");
				confirmPassword = (String) person.get("confirmpassword");
			    System.out.println(userName);
			}
			
		}
	}


