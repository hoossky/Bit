package com.jse.phone;

public class PhoneServiceImpl implements PhoneService {
	private Phone[] phones;
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	private int count;
	
	public PhoneServiceImpl() {
		phones = new Phone[3];
		cellPhones = new CellPhone[3];
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;
		
	}
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}
	public Iphone[] getIphones() {
		return iphones;
	}
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	public CellPhone[] getCellPhones() {
		return cellPhones;
	}
	public void setCellPhones(CellPhone[] cellPhones) {
		this.cellPhones = cellPhones;
	}
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	public Phone[] getPhones() {
		return phones;
	}
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void add(CellPhone phone) {
		cellPhones[count] = phone;
		count++;
	}
	public void add(Iphone phone) {
		iphones[count] = phone;
		count++;
	}
	public void add(GalaxyNote phone) {
		galaxyNotes[count] = phone;
		count++;
	}
	@Override
	public Phone[] phoneList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CellPhone[] cellPhoneList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iphone[] iphoneList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GalaxyNote[] galaxyNoteList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Phone detail(Phone phone) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public void update(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CellPhone Detail(CellPhone phone) {
		// TODO Auto-generated method stub
		return null;
	}
//	@Override
//	public Iphone iDetail(Phone phone) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public GalaxyNote gDetail(Phone phone) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public Iphone detail(Iphone phone) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GalaxyNote detail(GalaxyNote phone) {
		// TODO Auto-generated method stub
		return null;
	}

}



