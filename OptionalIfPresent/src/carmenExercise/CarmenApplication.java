package carmenExercise;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class CarmenApplication {

	public static void main(String[] args) throws IOException {

		CarmenService carmenService = new CarmenService();
		 Stream <String> filteredNames= carmenService.filterSuspectsByName("Carmen Sandiego");
		 
		 Optional <String> locationOptional1 = filteredNames.findFirst().flatMap(carmenService::getLocationBySuspectName);

		
		 if (locationOptional1.isPresent()) {
			 System.out.println("Week One, Carmen last seen in " + locationOptional1.get());
		 }else {
			 System.out.println("Carmen not found");
		 }
		 
		 
		 
		 
		 Stream <String> filteredNames2= carmenService.filterSuspectsByName2("Carmen Sandiego");
		 Optional <String> locationOptional2 = filteredNames2.findFirst().flatMap(carmenService::getLocationBySuspectName2);

		 if (locationOptional2.isPresent()) {
			 System.out.println("Week Two, Carmen last seen in " + locationOptional2.get());
		 }else {
			 System.out.println("Carmen not found");
		 }
		 
		 
		 
		 Stream <String> filteredNames3= carmenService.filterSuspectsByName3("Carmen Sandiego");
		 Optional <String> locationOptional3 = filteredNames3.findFirst().flatMap(carmenService::getLocationBySuspectName3);
		 
		 if (locationOptional3.isPresent()) {
			 System.out.println("Week Three, Carmen last seen in " + locationOptional3.get());
		 }else {
			 System.out.println("Carmen not found");
		 }
	}

}
