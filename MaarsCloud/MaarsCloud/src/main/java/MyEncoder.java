import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		System.out.printf("hashed val is ****:" + passwordEncoder.encode("mypassword") + ":****");
	}

}
