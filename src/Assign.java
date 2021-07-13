import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Assign {
	static TableView<Driver> assignedTrips;
	static String Driver;
	
	@SuppressWarnings("unchecked")
	public static void AssignDriver(Trips T) {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Assign a Driver");
		Window.setResizable(false);
		
		
		//Column #1
		TableColumn<Driver, String> DriverName = new TableColumn<>("Driver");
		DriverName.setMinWidth(130);
		DriverName.setEditable(false);
		DriverName.setCellValueFactory(new PropertyValueFactory<>("username"));
		//Column #2
		TableColumn<Driver, String> Available = new TableColumn<>("Availability");
		Available.setMinWidth(130);
		Available.setEditable(false);
		Available.setCellValueFactory(new PropertyValueFactory<>("available"));
		//Column #3
		TableColumn<Driver, String> vehicle = new TableColumn<>("Vehicle");
		vehicle.setMinWidth(130);
		vehicle.setEditable(false);
		vehicle.setCellValueFactory(new PropertyValueFactory<>("vehicle"));
		//Column #4
		TableColumn<Driver, String> Password = new TableColumn<>("Password");
		Password.setMinWidth(130);
		Password.setEditable(false);
		Password.setCellValueFactory(new PropertyValueFactory<>("Password"));
		
		assignedTrips = new TableView<>();
		assignedTrips.setItems(drivers());
		assignedTrips.getColumns().addAll(DriverName,vehicle,Available);
		
		Button ASSIGN = new Button("Assign");
		ASSIGN.setOnAction(e->{
			Driver driver = assignedTrips.getSelectionModel().getSelectedItem();
			if(Check(driver)) {
				assign(T, driver);
				try {
					convertAvailability(driver.getUsername());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
				Error.display("This DRIVER is not Available right now");
			Window.close();
		});
		
		StackPane main = new StackPane();
		VBox v = new VBox();
		v.getChildren().addAll(assignedTrips,ASSIGN);
		v.setPadding(new Insets(10,10,10,10));
		v.setSpacing(10);
		
		main.getChildren().addAll(v);
		Scene scene = new Scene(main,390,400);
		Window.setScene(scene);
		Window.show();
	}

	public static ObservableList<Driver> drivers() {
		ObservableList<Driver> D = FXCollections.observableArrayList();
		try{
			File File = new File("Drivers.txt");
			Scanner sc = new Scanner(File);
			while(sc.hasNext()){
				String name = sc.next();
				String password = sc.next();
				String vehicle = sc.next();
				String available = sc.next();
				System.out.println(name+password+vehicle+available);
				D.add(new Driver(name,available,vehicle,password));
			}
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return D;
	}
	
	public static void assign(Trips T,Driver D) {
		File file = new File(D.getUsername()+".txt");
		try {
			FileWriter rt = new FileWriter(file);
			String trip = T.getId()+" "+T.getExternal()+" "+T.getFrom()+" "+T.getTo()+" "+T.getPrice()+" "+T.getLTime()+" "+T.getATime()+" "+T.getAvailableSeat()+" "+T.getDistance()+" "+T.getRoundTrip()+" "+T.getNoStops()+" "+T.getVehicle()+" ";
			OutputStream out = new FileOutputStream(file);
			out.write(trip.getBytes());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void convertAvailability(String user) throws IOException {
		String assignedName = user;
		String assignedPassword = null;
		String assignedVehicle = null;
		String assignedavailable = null;
		File Dfile = new File("Drivers.txt");
		File temp = new File("temp.txt");
		
		try {
			Scanner sc = new Scanner(Dfile);
			OutputStream forTemp = new FileOutputStream(temp);
			while(sc.hasNext()) {
				String username = sc.next() ;
				String password = sc.next();
				String vehicle = sc.next();
				String availabel = sc.next();
				String index = username+" "+password+" "+vehicle+" "+availabel+" ";
				System.out.println(index);
				if(user.equals(username)) {
					assignedName = username;
					assignedPassword = password;
					assignedVehicle = vehicle;
					assignedavailable = availabel;
					continue;
				}
				else {
					forTemp.write(index.getBytes());
				}
				System.out.println(index);
			}
			sc.close();
			forTemp.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter w = new FileWriter("Drivers.txt");
		w.write("");
		w.close();			
		try {
			Scanner sc =new Scanner(temp);
			OutputStream forD = new FileOutputStream(Dfile,true);
			while(sc.hasNext()) {
				String username = sc.next() ;
				String password = sc.next();
				String vehicle = sc.next();
				String availabel = sc.next();
				String index = username+" "+password+" "+vehicle+" "+availabel+" ";
				System.out.println(index);
				forD.write(index.getBytes());
			}
			String DRIVER = assignedName+" "+assignedPassword+" "+assignedVehicle+" "+"false"+" ";
			System.out.println(DRIVER);
			forD.write(DRIVER.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static boolean Check(Driver D) {
		String user = D.getUsername();
		
		
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
				if(username.equals(user)) {
					if(available.equals("false"))
						return false;
				}
			}sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}
}
