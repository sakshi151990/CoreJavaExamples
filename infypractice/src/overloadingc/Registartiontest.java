package overloadingc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Registartiontest {

	@Test
	void test() {
		
		Registration reg1=new Registration("kevin", "MIN789", new long[] {7858393,758378493});
		Registration reg2=new Registration("Julias", 123, "PN7878", new long[] {57583784});
		Registration reg3=new Registration("Jammy",56575,765 ,  new long[] {7858393,758378493});
		Registration reg4=new Registration("Rose","PN67", 56575,  new long[] {7858393,758378493});
		Assert.assertNotNull(reg4);
	}

}
