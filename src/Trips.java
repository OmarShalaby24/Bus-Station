
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.DoubleToIntFunction;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

public class Trips implements ObservableList<Trips> {
	private String id;
	private String external;
	private String from;
	private String to;
	private String price;
	private String LTime;
	private String ATime;
	private String availableSeat;
	private String distance;
	private String roundTrip;
	private String noStops;
	private String Vehicle;
	
	public Trips() {
		this.id=null;
		this.external=null;
		this.from=null;
		this.to=null;
		this.price=null;
		this.LTime=null;
		this.ATime=null;
		this.availableSeat=null;
		this.distance=null;
		this.roundTrip=null;
		this.noStops=null;
		this.Vehicle=null;
	}
	public Trips(String id,String external,String from,String to,String price,String LTime,String ATime,String availableSeat,String distance,String roundTrip,String noStops,String Vehicle) {
		this.id=id;
		this.external=external;
		this.from=from;
		this.to=to;
		this.price=price;
		this.LTime=LTime;
		this.ATime=ATime;
		this.availableSeat=availableSeat;
		this.distance=distance;
		this.roundTrip=roundTrip;
		this.noStops=noStops;
		this.Vehicle=Vehicle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNoStops() {
		return noStops;
	}
	public void setNoStops(String noStops) {
		this.noStops = noStops;
	}
	public String getExternal() {
		return external;
	}
	public void setExternal(String external) {
		this.external = external;		
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLTime() {
		return LTime;
	}
	public void setLTime(String lTime) {
		LTime = lTime;
	}
	public String getATime() {
		return ATime;
	}
	public void setATime(String aTime) {
		ATime = aTime;
	}
	public String getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(String availableSeat) {
		this.availableSeat = availableSeat;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getRoundTrip() {
		return roundTrip;
	}
	public void setRoundTrip(String roundTrip) {
		this.roundTrip = roundTrip;
	}
	public String getVehicle() {
		return Vehicle;
	}
	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
	@Override
	public boolean add(Trips e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void add(int index, Trips element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean addAll(Collection<? extends Trips> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends Trips> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Trips get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<Trips> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<Trips> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<Trips> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Trips remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Trips set(int index, Trips element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Trips> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean addAll(Trips... elements) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void addListener(ListChangeListener<? super Trips> listener) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(int from, int to) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean removeAll(Trips... elements) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void removeListener(ListChangeListener<? super Trips> listener) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean retainAll(Trips... elements) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean setAll(Trips... elements) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean setAll(Collection<? extends Trips> col) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static boolean isRoundTrip() {
		String Choice = Profile.roundTrip_t.getValue();
		if(Choice.equals("Round_Trip"))
			return true;
		else
			return false;
	}
	
	public static boolean isExternal() {
		String Choice = Profile.external_t.getValue();
		if(Choice.equals("External"))
			return true;
		else
			return false;
	}
	
	public static String TicketPrice(String D) {
		double Price = 0;
//		double Distance = Double.valueOf(D);
		double Distance = Double.parseDouble(D);
		Price = (10/6)*Distance;
		if(isExternal()) {
			if(isRoundTrip()) {
				Price = Price + 20;
				Price = 2*Price - 0.2*Price;
				return Double.toString(Price);
			}
			else {
				Price = Price + 20;
				return Double.toString(Price);
			}
		}else {
			if(isRoundTrip()) {
				Price = 2*Price - 0.2*Price;
				return Double.toString(Price);
			}else {
				return Double.toString(Price);
			}
		}
	}
	
}
