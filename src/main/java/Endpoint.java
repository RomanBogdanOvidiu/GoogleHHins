import java.util.List;

/**
 * Created by ilyes on 2/23/2017.
 */
public class Endpoint {
    private int id;
    private int latency;
    private int nrOfCacheServers;
    private List<CacheServer> caches;

    public Endpoint(int id, int latency, int nrOfCacheServers,List<CacheServer> caches) {
        this.id = id;
        this.latency = latency;
        this.nrOfCacheServers = nrOfCacheServers;
        this.caches = caches;
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

    public int getNrOfCacheServers() {
        return nrOfCacheServers;
    }

    public void setNrOfCacheServers(int nrOfCacheServers) {
        this.nrOfCacheServers = nrOfCacheServers;
    }

    public List<CacheServer> getCaches() {
        return caches;
    }

    public void setCaches(List<CacheServer> caches) {
        this.caches = caches;
    }
}
