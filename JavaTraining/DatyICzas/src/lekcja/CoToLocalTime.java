package lekcja;

import java.time.LocalTime;

public class CoToLocalTime {
	public static void main(String[] args) throws InterruptedException {
		LocalTime now = LocalTime.now();
	
		for(int i=0;i<10;i++) {
			System.out.println(now);
			now = now.plusSeconds(1);
			Thread.sleep(1000);
		}
	}
}