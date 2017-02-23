import java.util.List;

public class Cache {

	private int id;
	private int size;
	private List<Integer> listOfVids;

	public Cache(int id, int size, List<Integer> listOfVids) {
		super();
		this.id = id;
		this.size = size;
		this.listOfVids = listOfVids;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Integer> getListOfVids() {
		return listOfVids;
	}

	public void setListOfVids(List<Integer> listOfVids) {
		this.listOfVids = listOfVids;
	}

}
