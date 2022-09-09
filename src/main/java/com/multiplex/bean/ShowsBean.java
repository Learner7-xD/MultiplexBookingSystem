package com.multiplex.bean;


public class ShowsBean {
	private int movieId;
	private int hallId;
	private int slotId;
	private String fromDate;
	private String toDate;
	
	public int getMovieId() {
		return movieId;
	}

	public int getHallId() {
		return hallId;
	}

	public int getSlotId() {
		return slotId;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public ShowsBean(int movieId, int hallId, int slotId, String fromDate, String toDate) {
		super();
		this.movieId = movieId;
		this.hallId = hallId;
		this.slotId = slotId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public ShowsBean() {
		super();
	}
	
}
