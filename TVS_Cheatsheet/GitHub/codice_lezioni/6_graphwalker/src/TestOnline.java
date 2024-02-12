import java.nio.file.Path;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.Machine;
import org.graphwalker.core.machine.SimpleMachine;
import org.graphwalker.core.model.Edge;
import org.graphwalker.core.model.Model;
import org.graphwalker.core.model.Vertex;
import org.junit.Test;
import org.graphwalker.java.test.TestBuilder;

public class TestOnline {
	
	private static final Path MODEL_PATH = Path.of("model/lampada.json");

//	@Test
//	public void testOnline() {
//		Lampada lampada = new Lampada();
// posso creare il modello anche con il codice
//		Model model = new Model().addVertex(new Vertex().setName("OFF"));
////				addEdge(
////				new Edge().setName("edge1").setGuard(new Guard("isTrue()")).setSourceVertex(start.setName("vertex1"))
////						.setTargetVertex(new Vertex().setName("vertex2")).addAction(new Action("myAction();")));
//		lampada.setModel(model.build());
//		lampada.setPathGenerator(new RandomPath(new VertexCoverage(100)));
//		// setNextElement(start);
//		Machine machine = new SimpleMachine(lampada);
//		while (machine.hasNextStep()) {
//			machine.getNextStep();
//		}
//	}

	@Test
	public void runSimpleTest() {
		LampadaTest context = new LampadaTest();
		RandomPath pathGenerator = new RandomPath(new EdgeCoverage(100));
		TestBuilder testBuilder = new TestBuilder();
		TestBuilder addContext = testBuilder.addContext(context, MODEL_PATH,
				pathGenerator);
		addContext.execute();
	}

}