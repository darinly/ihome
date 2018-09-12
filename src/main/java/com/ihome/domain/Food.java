package com.ihome.domain;

public class Food {

	int id;

	String name;
	
	String url;
	
	int price;
	
	int commentNum;
	
	String category;
	
	String address;
	
	double scoreTaste;
	
	double scoreEnvironment;
	
	double scoreService;
	
	String scoreMerchant;
	
	String imageUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getScoreTaste() {
		return scoreTaste;
	}

	public void setScoreTaste(double scoreTaste) {
		this.scoreTaste = scoreTaste;
	}

	public double getScoreEnvironment() {
		return scoreEnvironment;
	}

	public void setScoreEnvironment(double scoreEnvironment) {
		this.scoreEnvironment = scoreEnvironment;
	}

	public double getScoreService() {
		return scoreService;
	}

	public void setScoreService(double scoreService) {
		this.scoreService = scoreService;
	}

	public String getScoreMerchant() {
		return scoreMerchant;
	}

	public void setScoreMerchant(String scoreMerchant) {
		this.scoreMerchant = scoreMerchant;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
