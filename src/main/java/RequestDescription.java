public class RequestDescription {

	private int endPointId;
	private int videoId;
	private int noOfReq;
	private int totalLatency;

	public RequestDescription(int endPointId, int videoId, int noOfReq) {
		this.endPointId = endPointId;
		this.videoId = videoId;
		this.noOfReq = noOfReq;
	}

	public int getTotalLatency() {
		return totalLatency;
	}

	public void setTotalLatency(int totalLatency) {
		this.totalLatency = totalLatency;
	}

	public int getEndPointId() {
		return endPointId;
	}

	public void setEndPointId(int endPointId) {
		this.endPointId = endPointId;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public int getNoOfReq() {
		return noOfReq;
	}

	public void setNoOfReq(int noOfReq) {
		this.noOfReq = noOfReq;
	}

}
