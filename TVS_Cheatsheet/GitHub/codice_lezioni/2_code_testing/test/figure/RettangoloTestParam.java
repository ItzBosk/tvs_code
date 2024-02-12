package figure;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class RettangoloTestParam {
	
	Rettangolo r;
	int base;
	int altezza;
	int perimetroAtteso;
	
	@Parameters
	public static Collection<Integer[]> setParameters(){
		List<Integer[]> params = new ArrayList<>();
		params.add(new Integer[] {0,0,0});
		params.add(new Integer[] {4,4,16});
		params.add(new Integer[] {5,7,24});
		return params;
	}
	
	public RettangoloTestParam(int b, int a, int pA) {
		base = b;
		altezza = a;
		r = new Rettangolo (a,b);
		perimetroAtteso = pA;
	}
	
	@Test
	public void testCalcoloPerimetro() {
		 int p = r.getPerimetro();
		 assertEquals(perimetroAtteso, p);
	}

	
}
