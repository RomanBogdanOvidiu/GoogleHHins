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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Cache cache = (Cache) o;

		if (getId() != cache.getId()) return false;
		if (getSize() != cache.getSize()) return false;
		return getListOfVids() != null ? getListOfVids().equals(cache.getListOfVids()) : cache.getListOfVids() == null;

	}

	@Override
	public int hashCode() {
		int result = getId();
		result = 31 * result + getSize();
		result = 31 * result + (getListOfVids() != null ? getListOfVids().hashCode() : 0);
		return result;
	}
}
