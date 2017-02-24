import java.util.List;
import java.util.ArrayList;

public class Stylist {
	private String mCategory;
	private static List<Stylist> instances = new ArrayList<Stylist>();
	private int mId;
	private List<Client> myClients;

	public Stylist(String category) {
		mCategory = category;
		instances.add(this);
		mId = instances.size();
		myClients = new ArrayList<Client>();
	}

	public String getCategory() {
		return mCategory;
	}

	public static List<Stylist> all() {
		return instances;
	}

	public static void clear() {
		instances.clear();
	}

	public int getId() {
		return mId;
	}

	public static Stylist find(int id) {
		return instances.get(id - 1);
	}

	public List<Client> getClients() {
		return myClients;
	}

	public void addClient(Client client) {
		myClients.add(client);
	}


}