package ca.sheridancollege.tanciong;

import java.time.OffsetDateTime;

import lombok.Getter;


public class Constants {
	@Getter
    public static OffsetDateTime STARTUP = OffsetDateTime.now();
	@Getter
    private static String prefix          = "!";
	@Getter
    private static String token = "";
    

	

}
