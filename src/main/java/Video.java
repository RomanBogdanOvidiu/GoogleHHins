/**
 * Created by ilyes on 2/23/2017.
 */
public class Video {
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private int id;
	private int size;

	public Video(int id, int size) {
		this.id = id;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
