import java.util.List;

/**
 * Created by ilyes on 2/23/2017.
 */
public class CacheServer {
	private int id;
	private int latency;// latency

	public CacheServer(int id, int latency) {
		this.id = id;
		this.latency = latency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLatency() {
		return latency;
	}

	public void setLatency(int latency) {
		this.latency = latency;
	}
}
