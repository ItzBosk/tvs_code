import org.junit.Test;

// test offline del modello
// 1. creo il modello con studio
// 2. genero i casi di test con 
public class TestGeneratorOffline {

	@Test
	public void testCLI() {		
		//org.graphwalker.cli.CLI.main(("offline -m model/test.json random(edge_coverage(100))").split(" "));
		org.graphwalker.cli.CLI.main(new String[]{"offline","-m","model/lampada.json","random(edge_coverage(100))"});
	}
	
}
