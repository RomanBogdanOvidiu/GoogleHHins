public class RequestDescription {

	private int endPointId;
	private int videoId;
	private int noOfReq;

	public RequestDescription(int endPointId, int videoId, int noOfReq) {
		this.endPointId = endPointId;
		this.videoId = videoId;
		this.noOfReq = noOfReq;
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
