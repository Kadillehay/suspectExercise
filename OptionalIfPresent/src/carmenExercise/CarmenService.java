package carmenExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarmenService{
	Suspect suspects = new Suspect();
	String line;
//	Stream<String[]> stream;
//	Suspect[] suspects;
	List <String[]> dataList1;
	List <String[]> dataList2;
	List <String[]> dataList3;
	
	public CarmenService() throws IOException{
		

	
	this.dataList1 = Files.lines(Paths.get("C:\\Users\\kadil\\OneDrive\\Documents\\coders campus\\OptionalIfPresentExercise\\InterpolWatchReport-Week1.csv"))
								   .skip(1)
								   .map(line ->line.split(","))
								   .collect(Collectors.toList());
	this.dataList2 = Files.lines(Paths.get("C:\\Users\\kadil\\OneDrive\\Documents\\coders campus\\OptionalIfPresentExercise\\InterpolWatchReport-Week2.csv"))
			   .skip(1)
			   .map(line ->line.split(","))
			   .collect(Collectors.toList());
	
	this.dataList3 = Files.lines(Paths.get("C:\\Users\\kadil\\OneDrive\\Documents\\coders campus\\OptionalIfPresentExercise\\InterpolWatchReport-Week3.csv"))
			   .skip(1)
			   .map(line ->line.split(","))
			   .collect(Collectors.toList());
		
		 }
			
	public Optional<String> getLocationBySuspectName(String name){
		return dataList1.stream().filter(lineData -> lineData[1].equals(name))
				     .map(lineData -> lineData[0])
				     .findFirst();
				
		}
	

	public Stream<String> filterSuspectsByName(String name) {
		
		return dataList1.stream()
				.filter(lineData-> lineData[1].equalsIgnoreCase(name))
				     .map(lineData ->lineData[1]);
	}
	
	
	
	public Optional<String> getLocationBySuspectName2(String name){
		return dataList2.stream().filter(lineData -> lineData[1].equals(name))
				     .map(lineData -> lineData[0])
				     .findFirst();
		}
	

	public Stream<String> filterSuspectsByName2(String name) {
		
		return dataList2.stream()
				.filter(lineData-> lineData[1].equalsIgnoreCase(name))
				     .map(lineData ->lineData[1]);
	}
	
	
	
	public Optional<String> getLocationBySuspectName3(String name){
		return dataList3.stream().filter(lineData -> lineData[1].equals(name))
				     .map(lineData -> lineData[0])
				     .findFirst();	
		}
	public Stream<String> filterSuspectsByName3(String name) {
		
		return dataList3.stream()
				.filter(lineData-> lineData[1].equalsIgnoreCase(name))
				     .map(lineData ->lineData[1]);
	}
						
	}

			


