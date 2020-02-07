package com.ceri.tp1;

public class Animal {

	private int hightestLifespan; // years
	private String imgFile;
	private int gestationPeriod; // days
	private float birthWeight; // kg
	private int adultWeight; // kg
	private String conservationStatus;

	public Animal(int hightestLifespan, String imgFile, int gestationPeriod, float birthWeight, int adultWeight, String conservationStatus) {
		this.hightestLifespan = hightestLifespan;
		this.imgFile = imgFile;
		this.gestationPeriod = gestationPeriod;
		this.birthWeight = birthWeight;
		this.adultWeight = adultWeight;
		this.conservationStatus = conservationStatus;
	}

	public int getHightestLifespan() {
		return hightestLifespan;
	}

	public String getStrHightestLifespan() {
		return Integer.toString(hightestLifespan)+" années";
	}

	public void setHightestLifespan(int hightestLifespan) {
		this.hightestLifespan = hightestLifespan;
	}

	public String getImgFile() {
		return imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}

	public int getGestationPeriod() {
		return gestationPeriod;
	}

	public String getStrGestationPeriod() {
		return Integer.toString(gestationPeriod)+" jours";
	}

	public void setGestationPeriod(int gestationPeriod) {
		this.gestationPeriod = gestationPeriod;
	}

	public float getBirthWeight() {
		return birthWeight;
	}

	public String getStrBirthWeight() {
		return Float.toString(birthWeight)+" kg";
	}

	public void setBirthWeight(int birthWeight) {
		this.birthWeight = birthWeight;
	}

	public int getAdultWeight() {
		return adultWeight;
	}

	public String getStrAdultWeight() {
		return Integer.toString(adultWeight)+" kg";
	}

	public void setAdultWeight(int adultWeight) {
		this.adultWeight = adultWeight;
	}

	public String getConservationStatus() {
		return conservationStatus;
	}

	public void setConservationStatus(String conservationStatus) {
		this.conservationStatus = conservationStatus;
	}

}
