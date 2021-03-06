package ca.sheridancollege.tanciong;

import java.util.concurrent.Executors;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;

import ca.sheridancollege.tanciong.commands.About;
import ca.sheridancollege.tanciong.commands.Ping;
import ca.sheridancollege.tanciong.commands.Schedule;
import ca.sheridancollege.tanciong.commands.ServerInfo;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class HwasaBot {
	private final EventWaiter waiter;

	private HwasaBot() throws Exception{
		//Config config = ConfigFactory.load();
		waiter = new EventWaiter(Executors.newSingleThreadScheduledExecutor(), false);
		CommandClient client = new CommandClientBuilder()
				.setPrefix(Constants.getPrefix())
				.setActivity(Activity.playing("Mamamoo"))
				.addCommands(
						new About(),
						new Ping(),
						new ServerInfo(),
						new Schedule()
						)

                .build();
		
		JDA jda = JDABuilder.createDefault(Constants.getToken())
				.build();
				
				
		
	}
	
	public static void main(String[] args) throws Exception {
		new HwasaBot();
	}
}
