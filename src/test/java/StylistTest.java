import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class StylistTest {

	@Test
	public void Stylist_instantiatesCorrectly_true() {
		Stylist testStylist = new Stylist("Retouch");
		assertEquals(true, testStylist instanceof Stylist);	
	}

	@Test
	public void Stylist_instantiatesWithName_true() {
		Stylist testStylist = new Stylist("Retouch");
		assertEquals("Retouch", testStylist.getCategory());
	}

	@Test
	public void all_returnsAllInstancesOfStylists_true() {
		Stylist firstStylist = new Stylist("Braiding");
		Stylist secondStylist = new Stylist("Washing");
		assertEquals(true, Stylist.all().contains(firstStylist));
		assertEquals(true, Stylist.all().contains(secondStylist));
	}

	@Test
	public void clear_emptiesAllStylistFromList_0() {
		Stylist testStylist =  new Stylist("Retouch");
		Stylist.clear();
		assertEquals(Stylist.all().size(), 0);
	}

	@Test
	public void getId_stylistInstantiatesWithAnId_1() {
		Stylist testStylist = new Stylist("Retouch");
		assertEquals(1, testStylist.getId());
	}

	@Test
	public void find_returnsStylistWithSameId_secondStylist() {
		Stylist.clear();
		Stylist firstStylist = new Stylist("Braiding");
		Stylist secondStylist = new Stylist("Washing");
		assertEquals(Stylist.find(secondStylist.getId()), secondStylist);
	}

	@Test
	public void getClients_initiallyReturnsEmptyList_ArrayList() {
		Stylist.clear();
		Stylist testStylist = new Stylist("Retouch");
		assertEquals(0, testStylist.getClients().size());
	}

	@Test
	public void addClient_addsClientToList_true() {
		Stylist testStylist = new Stylist("Retouch");
		Client testClient =  new Client("Jina");
		testStylist.addClient(testClient);
		assertTrue(testStylist.getClients().contains(testClient));
	}

}