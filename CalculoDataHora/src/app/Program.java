package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
		Instant d06 = Instant.parse("2023-07-20T01:30:26Z");

		LocalDate pastWeekLocaldate = d04.minusDays(7);
		LocalDate nextWeekLocaldate = d04.plusDays(7);
		
		System.out.println(pastWeekLocaldate);
		System.out.println(nextWeekLocaldate );
		
		LocalDateTime pastWeekLocaldateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocaldateTime = d05.plusDays(7);
		
		System.out.println(pastWeekLocaldateTime);
		System.out.println(nextWeekLocaldateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocaldate.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocaldateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
	}

}
