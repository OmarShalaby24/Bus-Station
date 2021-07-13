import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Profile {
	
	static TableView<Trips> BookedTrips;
	static TableView<Trips> trips;
	static TableView<Trips> Dtrips;
	static String FILE;
	static int tripNo;
	
	@SuppressWarnings("unchecked")
	
	public static void Passenger() {
		Stage profile = new Stage();
		profile.initModality(Modality.APPLICATION_MODAL);
		profile.setTitle("Passenger Profile");
		profile.setResizable(false);

		VBox v = new VBox();
		
		HBox h = new HBox();		
		//Column #1
		TableColumn<Trips, String> id = new TableColumn<>("Trip no.");
		id.setMinWidth(40);
		id.setEditable(false);
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		//Column #2
		TableColumn<Trips, String> external = new TableColumn<>("External/Internal Trip");
		external.setMinWidth(200);
		external.setEditable(false);
		external.setSortable(false);
		external.setCellValueFactory(new PropertyValueFactory<>("external"));
		//Column #3
		TableColumn<Trips, String> from = new TableColumn<>("From");
		from.setMinWidth(200);
		from.setEditable(false);
		from.setSortable(false);
		from.setCellValueFactory(new PropertyValueFactory<>("from"));
		//Column #4
		TableColumn<Trips, String> to = new TableColumn<>("To");
		to.setMinWidth(200);
		to.setEditable(false);
		to.setSortable(false);
		to.setCellValueFactory(new PropertyValueFactory<>("to"));
		//Column #5
		TableColumn<Trips, String> price = new TableColumn<>("Price");
		price.setMinWidth(200);
		price.setEditable(false);
		price.setSortable(false);
		price.setCellValueFactory(new PropertyValueFactory<>("price"));
		//Column #6
		TableColumn<Trips, String> LTime = new TableColumn<>("Leaving Time");
		LTime.setMinWidth(150);
		LTime.setEditable(false);
		LTime.setSortable(false);
		LTime.setCellValueFactory(new PropertyValueFactory<>("LTime"));
		//Column #7
		TableColumn<Trips, String> ATime = new TableColumn<>("Arriving Time");
		ATime.setMinWidth(150);
		ATime.setEditable(false);
		ATime.setSortable(false);
		ATime.setCellValueFactory(new PropertyValueFactory<>("ATime"));
		//Column #8
		TableColumn<Trips, String> Seats = new TableColumn<>("Available Seats");
		Seats.setMinWidth(150);
		Seats.setEditable(false);
		Seats.setSortable(false);
		Seats.setCellValueFactory(new PropertyValueFactory<>("availableSeat"));
		//Column #9
		TableColumn<Trips, String> distance = new TableColumn<>("Distance(Km)");
		distance.setMinWidth(150);
		distance.setEditable(false);
		distance.setSortable(false);
		distance.setCellValueFactory(new PropertyValueFactory<>("distance"));
		//Column #10
		TableColumn<Trips, String> roundTrip = new TableColumn<>("Round/One-Way Trip");
		roundTrip.setMinWidth(150);
		roundTrip.setEditable(false);
		roundTrip.setSortable(false);
		roundTrip.setCellValueFactory(new PropertyValueFactory<>("roundTrip"));
		//Column #11
		TableColumn<Trips, String> vehicle = new TableColumn<>("Vehicle");
		vehicle.setMinWidth(200);
		vehicle.setEditable(false);
		vehicle.setSortable(false);
		vehicle.setCellValueFactory(new PropertyValueFactory<>("Vehicle"));		
		//Column #12
		TableColumn<Trips, String> noStops = new TableColumn<>("Type of Stops");
		noStops.setMinWidth(200);
		noStops.setEditable(false);
		noStops.setSortable(false);
		noStops.setCellValueFactory(new PropertyValueFactory<>("noStops"));

		
		trips = new TableView<>();
		trips.setItems(getTrip("Trips"));
		trips.getColumns().addAll(id,external,from,to,price,LTime,ATime,Seats,distance,roundTrip,noStops,vehicle);
		
//		---------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Column #1
		TableColumn<Trips, String> idh = new TableColumn<>("ID");
		idh.setMinWidth(40);
		idh.setEditable(false);
		idh.setCellValueFactory(new PropertyValueFactory<>("id"));
		//Column #2
		TableColumn<Trips, String> externalh = new TableColumn<>("External/Internal Trip");
		externalh.setMinWidth(200);
		externalh.setEditable(false);
		externalh.setSortable(false);
		externalh.setCellValueFactory(new PropertyValueFactory<>("external"));
		//Column #3
		TableColumn<Trips, String> fromh = new TableColumn<>("From");
		fromh.setMinWidth(200);
		fromh.setEditable(false);
		fromh.setSortable(false);
		fromh.setCellValueFactory(new PropertyValueFactory<>("from"));
		//Column #4
		TableColumn<Trips, String> toh = new TableColumn<>("To");
		toh.setMinWidth(200);
		toh.setEditable(false);
		toh.setSortable(false);
		toh.setCellValueFactory(new PropertyValueFactory<>("to"));
		//Column #5
		TableColumn<Trips, String> priceh = new TableColumn<>("Price");
		priceh.setMinWidth(200);
		priceh.setEditable(false);
		priceh.setSortable(false);
		priceh.setCellValueFactory(new PropertyValueFactory<>("price"));
		//Column #6
		TableColumn<Trips, String> LTimeh = new TableColumn<>("Leaving Time");
		LTimeh.setMinWidth(150);
		LTimeh.setEditable(false);
		LTimeh.setSortable(false);
		LTimeh.setCellValueFactory(new PropertyValueFactory<>("LTime"));
		//Column #7
		TableColumn<Trips, String> ATimeh = new TableColumn<>("Arriving Time");
		ATimeh.setMinWidth(150);
		ATimeh.setEditable(false);
		ATimeh.setSortable(false);
		ATimeh.setCellValueFactory(new PropertyValueFactory<>("ATime"));
		//Column #8
		TableColumn<Trips, String> Seatsh = new TableColumn<>("Available Seats");
		Seatsh.setMinWidth(150);
		Seatsh.setEditable(false);
		Seatsh.setSortable(false);
		Seatsh.setCellValueFactory(new PropertyValueFactory<>("availableSeat"));
		//Column #9
		TableColumn<Trips, String> distanceh = new TableColumn<>("Distance(Km)");
		distanceh.setMinWidth(150);
		distanceh.setEditable(false);
		distanceh.setSortable(false);
		distanceh.setCellValueFactory(new PropertyValueFactory<>("distance"));
		//Column #10
		TableColumn<Trips, String> roundTriph = new TableColumn<>("Round/One-Way Trip");
		roundTriph.setMinWidth(150);
		roundTriph.setEditable(false);
		roundTriph.setSortable(false);
		roundTriph.setCellValueFactory(new PropertyValueFactory<>("roundTrip"));
		//Column #11
		TableColumn<Trips, String> vehicleh = new TableColumn<>("Vehicle");
		vehicleh.setMinWidth(200);
		vehicleh.setEditable(false);
		vehicleh.setSortable(false);
		vehicleh.setCellValueFactory(new PropertyValueFactory<>("Vehicle"));
		//Column #12
		TableColumn<Trips, String> noStopsh = new TableColumn<>("Type of Stops");
		noStopsh.setMinWidth(200);
		noStopsh.setEditable(false);
		noStopsh.setSortable(false);
		noStopsh.setCellValueFactory(new PropertyValueFactory<>("noStops"));
		
		BookedTrips = new TableView<>();
		BookedTrips.getColumns().addAll(idh,externalh,fromh,toh,priceh,LTimeh,ATimeh,Seatsh,distanceh,roundTriph,noStopsh,vehicleh);
//		myTrips.setItems(getTrip(FILE));
		BookedTrips.setMaxHeight(70);
		
		Label my = new Label("My Trip");
		my.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,16));
		
		Button book = new Button("Book a Ticket");
		book.setOnAction(e->{
			System.out.println("booked");
			Trips selectedItem = trips.getSelectionModel().getSelectedItem();
			BookedTrips.setItems(Book(selectedItem));
			System.out.println(selectedItem.getId());
			SaveMyTripsP(selectedItem);
			
		});
		
		Button cancel = new Button("Cancel Trip");
		cancel.setOnAction(e->{
			System.out.println("Canceled");
			Trips selectedItem = trips.getSelectionModel().getSelectedItem();
			CancelP(selectedItem);
		});
		
		HBox hl = new HBox();
		hl.setPadding(new Insets(10,10,10,10));
		hl.setSpacing(10);
		hl.setAlignment(Pos.CENTER);
		hl.getChildren().add(my);
				
		h.setPadding(new Insets(10,10,10,10));
		h.setSpacing(10);
		
		h.getChildren().addAll(book,cancel);
		v.getChildren().addAll(trips,hl,BookedTrips,h);
		
		Scene scene = new Scene(v);
		profile.setScene(scene);
		profile.show();
		
		
	}
//	-------------------------------------------------------------------------Manager Profile----------------------------------------------------------------
	
	static TextField id_t;
	static TextField from_t ;
	static TextField to_t;
	static ChoiceBox<String> external_t;
	static TextField price_t;
	static TextField LTime_t;
	static TextField ATime_t;
	static TextField Seats_t;
	static TextField distance_t;
	static ChoiceBox<String> roundTrip_t;
	static ChoiceBox<String> vehicle_t;
	static ChoiceBox<String> noStops_t;
	
	
	@SuppressWarnings("unchecked")
	public static void Manager() {
		Stage profile = new Stage();
		profile.setTitle("Manager Profile");
		profile.setResizable(false);

		VBox main = new VBox();
		
		
		//Column #1
		TableColumn<Trips, String> id = new TableColumn<>("ID");
		id.setMinWidth(40);
		id.setEditable(false);
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		//Column #2
		TableColumn<Trips, String> external = new TableColumn<>("External/Internal Trip");
		external.setMinWidth(200);
		external.setEditable(false);
		external.setSortable(false);
		external.setCellValueFactory(new PropertyValueFactory<>("external"));
		//Column #3
		TableColumn<Trips, String> from = new TableColumn<>("From");
		from.setMinWidth(200);
		from.setEditable(false);
		from.setSortable(false);
		from.setCellValueFactory(new PropertyValueFactory<>("from"));
		//Column #4
		TableColumn<Trips, String> to = new TableColumn<>("To");
		to.setMinWidth(200);
		to.setEditable(false);
		to.setSortable(false);
		to.setCellValueFactory(new PropertyValueFactory<>("to"));
		//Column #5
		TableColumn<Trips, String> price = new TableColumn<>("Price");
		price.setMinWidth(200);
		price.setEditable(false);
		price.setSortable(false);
		price.setCellValueFactory(new PropertyValueFactory<>("price"));
		//Column #6
		TableColumn<Trips, String> LTime = new TableColumn<>("Leaving Time");
		LTime.setMinWidth(150);
		LTime.setEditable(false);
		LTime.setSortable(false);
		LTime.setCellValueFactory(new PropertyValueFactory<>("LTime"));
		//Column #7
		TableColumn<Trips, String> ATime = new TableColumn<>("Arriving Time");
		ATime.setMinWidth(150);
		ATime.setEditable(false);
		ATime.setSortable(false);
		ATime.setCellValueFactory(new PropertyValueFactory<>("ATime"));
		//Column #8
		TableColumn<Trips, String> Seats = new TableColumn<>("Available Seats");
		Seats.setMinWidth(150);
		Seats.setEditable(false);
		Seats.setSortable(false);
		Seats.setCellValueFactory(new PropertyValueFactory<>("availableSeat"));
		//Column #9
		TableColumn<Trips, String> distance = new TableColumn<>("Distance(Km)");
		distance.setMinWidth(150);
		distance.setEditable(false);
		distance.setSortable(false);
		distance.setCellValueFactory(new PropertyValueFactory<>("distance"));
		//Column #10
		TableColumn<Trips, String> roundTrip = new TableColumn<>("Round/One-Way Trip");
		roundTrip.setMinWidth(150);
		roundTrip.setEditable(false);
		roundTrip.setSortable(false);
		roundTrip.setCellValueFactory(new PropertyValueFactory<>("roundTrip"));
		//Column #11
		TableColumn<Trips, String> noStops = new TableColumn<>("Type of Stops");
		noStops.setMinWidth(200);
		noStops.setEditable(false);
		noStops.setSortable(false);
		noStops.setCellValueFactory(new PropertyValueFactory<>("noStops"));
		//Column #12
		TableColumn<Trips, String> vehicle = new TableColumn<>("Vehicle");
		vehicle.setMinWidth(200);
		vehicle.setEditable(false);
		vehicle.setSortable(false);
		vehicle.setCellValueFactory(new PropertyValueFactory<>("Vehicle"));
		
		trips = new TableView<>();
		trips.setItems(getTrip("Trips"));
		trips.getColumns().addAll(id,external,from,to,price,LTime,ATime,Seats,distance,roundTrip,noStops,vehicle);
		
		id_t = new TextField();
		id_t.setPromptText("id");
		id_t.setMaxWidth(100);
		
		from_t = new TextField();
		from_t.setPromptText("From");
		
		to_t = new TextField();
		to_t.setPromptText("To");
		
		external_t=new ChoiceBox<>();
		external_t.getItems().add("Internal");
		external_t.getItems().add("External");
		external_t.setValue("Internal");
		
		price_t = new TextField();
		price_t.setPromptText("Price");
		
		LTime_t = new TextField();
		LTime_t.setPromptText("Leaving Time");
		
		ATime_t = new TextField();
		ATime_t.setPromptText("Arriving Time");
		
		Seats_t = new TextField();
		Seats_t.setPromptText("Available Seats");
		
		distance_t = new TextField();
		distance_t.setPromptText("Distance");
		
		roundTrip_t =new ChoiceBox<>();
		roundTrip_t.getItems().add("One-Way_Trip");
		roundTrip_t.getItems().add("Round_Trip");
		roundTrip_t.setValue("One-Way_Trip");

		
		vehicle_t = new ChoiceBox<>();
		vehicle_t.getItems().add("Bus");
		vehicle_t.getItems().add("Mini-Bus");
		vehicle_t.getItems().add("Limousine");
		vehicle_t.setValue("Bus");
		
		
		noStops_t = new ChoiceBox<>();
		noStops_t.getItems().add("No_Stops");
		noStops_t.getItems().add("One_Stop");
		noStops_t.getItems().add("Many_Stops");
		noStops_t.setValue("No_Stops");
		
		Button addTrip = new Button("Add Trip");
		addTrip.setOnAction(e->ADDTRIP());
		
		Button assign = new Button("Assign to Driver");
		
		assign.setOnAction(e->{
			Trips selectedItem = trips.getSelectionModel().getSelectedItem();
			
			Assign.AssignDriver(selectedItem);
			
		});
		Button deletTrip = new Button("Delete Trip");
		deletTrip.setOnAction(e->{
			Trips selectedItem = trips.getSelectionModel().getSelectedItem();
		    trips.getItems().remove(selectedItem);
		    Cancel(selectedItem);
		});
		
		Button add = new Button("Add Driver");
		add.setOnAction(e->AddDriver.display());
		
		
		HBox prop = new HBox();
		prop.setPadding(new Insets(10,10,10,10));
		prop.setSpacing(10);
		prop.getChildren().addAll(add,assign);
		
		HBox h = new HBox();
		h.setPadding(new Insets(10,10,10,10));
		h.setSpacing(10);
		h.getChildren().addAll(id_t,external_t,from_t,to_t,LTime_t,ATime_t,Seats_t,distance_t,roundTrip_t,noStops_t,vehicle_t,addTrip,deletTrip);
		
 		
		main.getChildren().addAll(trips,h,prop);
		
		Scene scene = new Scene(main,1700,550);
		profile.setScene(scene);
		profile.show();
	}
//	-----------------------------------------------------------------------Driver---------------------------------------------------------------------------
	
	static String DriverName;
	static String Password;
	static String Vehicle;
	static String Availability;

	@SuppressWarnings("unchecked")
	public static void Driver() {
		Stage profile = new Stage();
		profile.setTitle("Manager Profile");
		profile.setResizable(false);

		VBox main = new VBox();
	
		//Column #1
		TableColumn<Trips, String> id = new TableColumn<>("ID");
		id.setMinWidth(40);
		id.setEditable(false);
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		//Column #2
		TableColumn<Trips, String> external = new TableColumn<>("External/Internal Trip");
		external.setMinWidth(200);
		external.setEditable(false);
		external.setSortable(false);
		external.setCellValueFactory(new PropertyValueFactory<>("external"));
		//Column #3
		TableColumn<Trips, String> from = new TableColumn<>("From");
		from.setMinWidth(200);
		from.setEditable(false);
		from.setSortable(false);
		from.setCellValueFactory(new PropertyValueFactory<>("from"));
		//Column #4
		TableColumn<Trips, String> to = new TableColumn<>("To");
		to.setMinWidth(200);
		to.setEditable(false);
		to.setSortable(false);
		to.setCellValueFactory(new PropertyValueFactory<>("to"));
		//Column #6
		TableColumn<Trips, String> LTime = new TableColumn<>("Leaving Time");
		LTime.setMinWidth(150);
		LTime.setEditable(false);
		LTime.setSortable(false);
		LTime.setCellValueFactory(new PropertyValueFactory<>("LTime"));
		//Column #7
		TableColumn<Trips, String> ATime = new TableColumn<>("Arriving Time");
		ATime.setMinWidth(150);
		ATime.setEditable(false);
		ATime.setSortable(false);
		ATime.setCellValueFactory(new PropertyValueFactory<>("ATime"));
		//Column #8
		TableColumn<Trips, String> Seats = new TableColumn<>("Available Seats");
		Seats.setMinWidth(150);
		Seats.setEditable(false);
		Seats.setSortable(false);
		Seats.setCellValueFactory(new PropertyValueFactory<>("availableSeat"));
		//Column #9
		TableColumn<Trips, String> distance = new TableColumn<>("Distance(Km)");
		distance.setMinWidth(150);
		distance.setEditable(false);
		distance.setSortable(false);
		distance.setCellValueFactory(new PropertyValueFactory<>("distance"));
		//Column #10
		TableColumn<Trips, String> roundTrip = new TableColumn<>("Round/One-Way Trip");
		roundTrip.setMinWidth(150);
		roundTrip.setEditable(false);
		roundTrip.setSortable(false);
		roundTrip.setCellValueFactory(new PropertyValueFactory<>("roundTrip"));
		//Column #11
		TableColumn<Trips, String> noStops = new TableColumn<>("Type of Stops");
		noStops.setMinWidth(200);
		noStops.setEditable(false);
		noStops.setSortable(false);
		noStops.setCellValueFactory(new PropertyValueFactory<>("noStops"));
		
		Label title = new Label("Assigned Trips");
		title.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,20));
		
		
		Dtrips = new TableView<>();
		Dtrips.setItems(getTrip(FILE));
		Dtrips.getColumns().addAll(id,external,from,to,LTime,ATime,Seats,distance,roundTrip,noStops);
		
		HBox h = new HBox();
		h.setPadding(new Insets(10,10,10,10));
		h.setSpacing(10);
		
		System.out.println(Login.user+" "+Login.pass);
		selectDriver(Login.user, Login.pass);

		Label NAME = new Label("Name : ");
		NAME.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,14));
		
		Label username = new Label (DriverName);
		username.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,14));
		
		Label vehicle = new Label("Vehcle : ");
		vehicle.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,14));
		
		Label type = new Label(Vehicle );
		type.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,14));
		

		HBox t1 = new HBox();
		t1.getChildren().addAll(NAME,username);		//+Driver.Username
		HBox t2 = new HBox();
		t2.getChildren().addAll(vehicle,type);		//+Driver.Username
		t1.setPadding(new Insets(10,10,10,10));
		t1.setSpacing(10);
		t2.setPadding(new Insets(10,10,10,10));
		t2.setSpacing(10);
				
		HBox T = new HBox();
		T.setPadding(new Insets(10,10,10,10));
		T.setSpacing(10);
		T.setAlignment(Pos.CENTER);
		T.getChildren().addAll(title);
		
		VBox info= new VBox();
		info.getChildren().addAll(t1,t2);
		
		main.getChildren().addAll(info,T,Dtrips,h);
		
		Scene scene = new Scene(main,1700,550);
		profile.setScene(scene);
		profile.show();
	}
//	-----------------------------------------------------------------Methods--------------------------------------------------------------------------------
	
	
	
	public static ObservableList<Trips> getTrip(String fileName){
		ObservableList<Trips> trips = FXCollections.observableArrayList();
//		fileName = "Trips";
		try{
			File file = new File(fileName+".txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()){
				String id = sc.next();
				String external = sc.next();
				String from = sc.next();
				String to = sc.next();
				String price = sc.next();
				String LTime = sc.next();
				String ATime = sc.next();
				String availableSeat = sc.next();
				String distance = sc.next();
				String roundTrip = sc.next();
				String noStops = sc.next();
				String Vehicle = sc.next();
				trips.add(new Trips(id,external,from,to,price,LTime,ATime,availableSeat,distance,roundTrip,noStops,Vehicle));			
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return trips;
	}
	
	public static void ADDTRIP() {
		if(id_t.getText()!=null) {
			if(from_t.getText()!=null) {
				if(to_t.getText()!=null) {
					if(LTime_t.getText()!=null) {
						if(ATime_t.getText()!=null) {
							if(Seats_t.getText()!=null) {
								if(distance_t.getText()!=null) {
									Trips trip = new Trips();
									trip.setId(id_t.getText());
									String a = external_t.getValue();
									trip.setExternal(a);
									trip.setFrom(from_t.getText());
									trip.setTo(to_t.getText());
									trip.setPrice(Trips.TicketPrice(distance_t.getText()));
									trip.setLTime(LTime_t.getText());
									trip.setATime(ATime_t.getText());
									trip.setAvailableSeat(Seats_t.getText());
									trip.setDistance(distance_t.getText());
									String b = roundTrip_t.getValue();
									trip.setRoundTrip(b);
									String c = noStops_t.getValue();
									trip.setNoStops(c);
									String d = vehicle_t.getValue();
									trip.setVehicle(d);
									trips.getItems().add(trip);
									id_t.clear();
									from_t.clear();
									to_t.clear();
									price_t.clear();
									LTime_t.clear();
									ATime_t.clear();
									Seats_t.clear();
									distance_t.clear();
									SaveMyTrips(trip);
								}else
									Error.display("You need to fill all the fields(the Trip information)");
							}else
								Error.display("You need to fill all the fields(the Trip information)");
						}else
							Error.display("You need to fill all the fields(the Trip information)");
					}else
						Error.display("You need to fill all the fields(the Trip information)");
				}else
					Error.display("You need to fill all the fields(the Trip information)");
			}else
				Error.display("You need to fill all the fields(the Trip information)");
		}else
			Error.display("You need to fill all the fields(the Trip information)");
	}	
	public static String getChoice(ChoiceBox<String> choicebox){
		String choice = choicebox.getValue();
		return choice;
	}
	
	public static ObservableList<Trips> Book(Trips T) {
		ObservableList<Trips> added = FXCollections.observableArrayList();
		added.add(T);
		return added;
	}
	
	public static void SaveMyTrips(Trips T) {
		try {
			String add = T.getId()+" "+T.getExternal()+" "+T.getFrom()+" "+T.getTo()+" "+T.getPrice()+" "+T.getLTime()+" "+T.getATime()+" "+T.getAvailableSeat()+" "+T.getDistance()+" "+T.getRoundTrip()+" "+T.getNoStops()+" "+T.getVehicle()+" ";
			OutputStream addedTrip = new FileOutputStream(FILE+".txt",true);
			addedTrip.write(add.getBytes());
			addedTrip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void SaveMyTripsP(Trips T) {
		try {
			String add = T.getId()+" "+T.getExternal()+" "+T.getFrom()+" "+T.getTo()+" "+T.getPrice()+" "+T.getLTime()+" "+T.getATime()+" "+T.getAvailableSeat()+" "+T.getDistance()+" "+T.getRoundTrip()+" "+T.getNoStops()+" "+T.getVehicle()+" ";
			OutputStream addedTrip = new FileOutputStream(FILE+".txt",false );
			addedTrip.write(add.getBytes());
			addedTrip.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Cancel(Trips T) {
		//TODO : Active this method
		//you can get help from convertAvailability() method from Assign class
		String DeletedTrip = T.getId()+" "+T.getExternal()+" "+T.getFrom()+" "+T.getTo()+" "+T.getPrice()+" "+T.getLTime()+" "+T.getATime()+" "+T.getAvailableSeat()+" "+T.getDistance()+" "+T.getRoundTrip()+" "+T.getNoStops()+" "+T.getVehicle()+" ";
		String currentLine;
			File inputFile = new File(FILE+".txt");
			File tempFile = new File("temp.txt");

			try {
				Scanner sc = new Scanner(inputFile);
				OutputStream temp = new FileOutputStream(tempFile,true);
//				FileWriter rt = new FileWriter(new File("temp.txt"));
				while(sc.hasNext()) {
					String id = sc.next();
					String external = sc.next();
					String from = sc.next();
					String to = sc.next();
					String price = sc.next();
					String LTime = sc.next();
					String ATime = sc.next();
					String availableSeat = sc.next();
					String distance = sc.next();
					String roundTrip = sc.next();
					String noStops = sc.next();
					String Vehicle = sc.next();
					String index = id+" "+external+" "+from+" "+to+" "+price+" "+LTime+" "+ATime+" "+availableSeat+" "+distance+" "+roundTrip+" "+noStops+" "+Vehicle+" ";
					System.out.println(DeletedTrip+"-");
					System.out.println(index+"-");
					if(DeletedTrip.equals(index)) {
						continue;
					}
					else {
						temp.write(index.getBytes());
					}
				}
				sc.close();
				temp.close();
			}catch(Exception e) {
				System.out.println("Error");
			}
			
			try {
				OutputStream stream = new FileOutputStream(inputFile);
				stream.write("".getBytes());
				stream.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try
			{
				Scanner sc= new Scanner(new File ("temp.txt")); 
				OutputStream out = new FileOutputStream(inputFile,true);
				
				while (sc.hasNext())
				 {
					while(sc.hasNext()) {
						String id = sc.next();
						String external = sc.next();
						String from = sc.next();
						String to = sc.next();
						String price = sc.next();
						String LTime = sc.next();
						String ATime = sc.next();
						String availableSeat = sc.next();
						String distance = sc.next();
						String roundTrip = sc.next();
						String noStops = sc.next();
						String Vehicle = sc.next();
						String index = id+" "+external+" "+from+" "+to+" "+price+" "+LTime+" "+ATime+" "+availableSeat+" "+distance+" "+roundTrip+" "+noStops+" "+Vehicle+" ";
						out.write(index.getBytes());
					}
					
				 }
				     sc.close();
				     out.close();
			}catch(Exception e) {
					System.out.println("Error");
			}
			
			try {
				FileWriter w = new FileWriter("temp.txt");
				w.write("");
				w.close();
			}catch(Exception e) {
				System.out.println("Error");
			}
	}
	
//	private static void Close(Trips T) {
//		// TODO Auto-generated method stub
//		String id = null;
//		String external = null;
//		String from = null;
//		String to = null;
//		String price = null;
//		String LTime = null;
//		String ATime = null;
//		String availableSeat = null;
//		String distance = null;
//		String roundTrip = null;
//		String noStops = null;
//		String Vehicle = null;
//		
//	}
	
	public static void CancelP(Trips T) {
		try {
			FileWriter rt = new FileWriter(FILE+".txt");
			rt.write("");
			rt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BookedTrips.setItems(getTrip(FILE));
		System.out.println(FILE);
	}
	
	public static void selectDriver(String user,String pass) {

		File file = new File("Drivers.txt");
		String username = null;
		String password = null;
		String vehicle = null;
		String available = null;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				username = sc.next(); 
				password = sc.next();
				vehicle = sc.next();
				available = sc.next();
				System.out.println(user+" "+pass);
				if(username.equals(user)&&password.equals(pass)) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		DriverName = username;
		Vehicle = vehicle;
		Availability = available;
	}
	
	public static void addSeat(Trips T) {

		String newid = null;
		String newexternal = null;
		String newfrom = null;
		String newto = null;
		String newprice = null;
		String newLTime = null;
		String newATime = null;
		String newavailableSeat = null;
		String newdistance = null;
		String newroundTrip = null;
		String newnoStops = null;
		String newVehicle = null;
		
		double temp = 0.0;
		String selectedTrip = T.getId()+" "+T.getExternal()+" "+T.getFrom()+" "+T.getTo()+" "+T.getPrice()+" "+T.getLTime()+" "+T.getATime()+" "+T.getAvailableSeat()+" "+T.getDistance()+" "+T.getRoundTrip()+" "+T.getNoStops()+" "+T.getVehicle()+" ";
		File tripsFile = new File("Trips.txt");
		File tempFile = new File("temp.txt");
		try {
			Scanner sc = new Scanner(tripsFile);
			OutputStream forTemp = new FileOutputStream(tempFile);
			while(sc.hasNext()) {
				String id = sc.next();
				String external = sc.next();
				String from = sc.next();
				String to = sc.next();
				String price = sc.next();
				String LTime = sc.next();
				String ATime = sc.next();
				String availableSeat = sc.next();
				String distance = sc.next();
				String roundTrip = sc.next();
				String noStops = sc.next();
				String Vehicle = sc.next();
				String index = id+" "+external+" "+from+" "+to+" "+price+" "+LTime+" "+ATime+" "+availableSeat+" "+distance+" "+roundTrip+" "+noStops+" "+Vehicle+" ";
				if(selectedTrip.equals(index)) {
					newid = id;
					newexternal = external;
					newfrom = from;
					newto = to;
					newprice = price;
					newLTime = LTime;
					newATime = ATime;
					
					temp = Double.parseDouble(availableSeat);
					temp++;
					newavailableSeat = Double.toString(temp);
					
					newdistance = distance;
					newroundTrip = roundTrip;
					newnoStops = noStops;
					newVehicle = Vehicle;
					continue;
				}
				else
					forTemp.write(index.getBytes());
			}
			sc.close();
			forTemp.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void removeSeat() {
		
	}
}
