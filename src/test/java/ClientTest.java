import org.junit.*;
import static org.junit.Assert.*;

public class ClientTest {

	@Test
	public void Client_instantiatesCorrectly_true() {
		Client myClient = new Client("Jina");
		assertEquals(true, myClient instanceof Client);
	}

	@Test
	public void Client_instantiatesWithName_String() {
		Client myClient = new Client("Jina");
		assertEquals("Jina", myClient.getName());
	}

	@Test
	public void all_returnsAllInstancesOfClient_true() {
		Client firstClient = new Client("Jina");
		Client secondClient = new Client("Jenna");
		assertEquals(true, Client.all().contains(firstClient));
		assertEquals(true, Client.all().contains(secondClient));
	}

	@Test
	public void clear_emptiesAllClientsFromArrayList_0() {
		Client myClient = new Client("Jina");
		Client.clear();
		assertEquals(Client.all().size(), 0);
	}

	@Test
	public void getId_instantiatesWithAnId_1() {
		Client.clear();
		Client myClient = new Client("Jina");
		assertEquals(1, myClient.getId());
	}

	@Test
	public void find_returnsClientWithSameId_secondClient() {
		Client firstClient = new Client("Jenna");
		Client secondClient = new Client("Jina");
		assertEquals(Client.find(secondClient.getId()), secondClient);

	}
}