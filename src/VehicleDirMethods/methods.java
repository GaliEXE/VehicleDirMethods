package VehicleDirMethods;
import java.util.ArrayList;


	class Car {
		private String make;
		private String model;
		private String color;
		private int year;
		private int mileage;

		public Car(String make, String model, String color, int year, int mileage) {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;

		}
		
		@Override
		public String toString() {
			return "Make: " + make + ", Model: " + model + ", Color: " + color + ", Year: " + year + ", Mileage: "
					+ mileage;
		}
		
		public String getMake() {
			return make;
		}
		public String getModel() {
			return model;
		}
		public String getColor() {
			return color;
		}
		public int getYear() {
			return year;
		}
		public int getMileage() {
			return mileage;
		}
		
		public void setMake(String make) {
	        this.make = make;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public void setMileage(int mileage) {
	        this.mileage = mileage;
	    }
	}

		public class methods {

			static ArrayList<Car> carList = new ArrayList<>();

			public static String addVehicle(String make, String model, String color, int year, int mileage) {
				carList.add(new Car(make, model, color, year, mileage));
				System.out.println("Vehicle added successfully!");
				return null;
			}
			
			public static void listVehicles(){
				if(carList.isEmpty()) {
					System.out.println("There Are Currently No Vehicles To Display!");
					System.out.println("To Add A Car Use The add Command.");
				}else {
					int i = 0;
					for (Car Car : carList) {
						i = i + 1;
						System.out.println("#" + i + " " + Car);
					}	
				}	
			}
			public static void listVehicleByNumber(int userNum) {
				if(carList.isEmpty()) {
					System.out.println("There Are Currently No Vehicles To Display!");
					System.out.println("To Add A Car Use The add Command.");
				}else {
					System.out.println(carList.get(userNum - 1));
				}
			}
			public static void updateVehicle(int userNum2, String userInput3, int userNum3, String userInput2) {
			    System.out.println(userInput2 + userInput3);
				if (carList.isEmpty()) {
			        System.out.println("There Are Currently No Vehicles To Update!");
			        System.out.println("To Add A Car Use The add Command.");
			    } else if (userNum2 <= 0 || userNum2 > carList.size()) {
			        System.out.println("Invalid vehicle number.");
			    } else {
			        Car carToUpdate = carList.get(userNum2 - 1);

			        switch (userInput2.toLowerCase()) {
			            case "make":
			                carToUpdate.setMake(userInput3);
			                break;
			            case "model":
			                carToUpdate.setModel(userInput3);
			                break;
			            case "color":
			                carToUpdate.setColor(userInput3);
			                break;
			            case "year":
			                carToUpdate.setYear(userNum3);
			                break;
			            case "mileage":
			                carToUpdate.setMileage(userNum3);
			                break;
			            default:
			                System.out.println("Not A Valid Attribute!");
			                return;
			        }
			        System.out.println("Vehicle updated successfully!");
			    }
			}
			public static void removeVehicle(int userNum4) {
				if(carList.isEmpty()) {
					System.out.println("There Are Currently No Vehicles To Remove!");
					System.out.println("To Add A Car Use The add Command.");
				} else {
					carList.remove(userNum4 - 1);
					System.out.println("Vehicle removed successfully!");
				}
			}

		}
