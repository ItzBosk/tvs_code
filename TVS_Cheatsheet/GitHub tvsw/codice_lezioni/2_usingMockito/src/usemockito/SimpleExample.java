package usemockito;

import java.util.LinkedList;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class SimpleExample {
	
	public static void main(String[] args) {
		LinkedList<String> mockedList = mock(LinkedList.class);
		// stubbing appears before the actual execution
		when(mockedList.get(0)).thenReturn("first");
		// the following prints "first"
		System.out.println(mockedList.get(0));
		// the following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));
	}

}
