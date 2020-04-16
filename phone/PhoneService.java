package com.jse.phone;

public interface PhoneService {
	public void add(GalaxyNote phone);
	public void add(Iphone phone);
	public void add(CellPhone phone);
	public void add(Phone phone);
	
	public GalaxyNote[] galaxyNoteList();
	public Iphone[] iphoneList();
	public CellPhone[] cellPhoneList();
	public Phone[] phoneList();
	
	public Iphone detail(Iphone phone);
	public GalaxyNote detail(GalaxyNote phone);
	public CellPhone Detail(CellPhone phone);
	public Phone detail(Phone phone);

	public int count();
	
	
	public void update(Phone phone);
	public void delete(Phone phone);
	

}
