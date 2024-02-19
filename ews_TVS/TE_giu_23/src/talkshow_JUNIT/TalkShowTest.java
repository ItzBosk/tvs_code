package talkshow_JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

public class TalkShowTest {

	@Test
	public void C_AVALLA() {
		TalkShow t = new TalkShow();
		
		assertEquals(t.persone[0].stato, 0);
		assertEquals(t.persone[1].stato, 0);
		assertEquals(t.persone[2].stato, 0);
		assertEquals(t.persone[3].stato, 0);
		assertEquals(t.persone[4].stato, 0);
		assertEquals(t.persone[5].stato, 0);
		assertEquals(t.persone[0].tempoAttesa, t.MAX_TEMPO_ATTESA);
		// ..
		t.persone[0].vuoleParlare = true;
		assertEquals(t.persone[0].vuoleParlare, true);
		t.scegliNextParla();
		
		assertEquals(t.persone[0].stato, 1);
		assertEquals(t.persone[0].tempoAttesa, t.MAX_TEMPO_ATTESA);
		assertEquals(t.persone[1].stato, 0);
		assertEquals(t.persone[2].stato, 0);
		assertEquals(t.persone[3].stato, 0);
		assertEquals(t.persone[4].stato, 0);
		assertEquals(t.persone[5].stato, 0);
		assertEquals(t.persone[0].vuoleParlare, true);
		
		// ..
	}

}
