package ca.sheridancollege.tanciong.commands;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.doc.standard.CommandInfo;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;

@CommandInfo(
	name = {"Schedule"},
	description = "Displays scheduled invents for server community"
)

public class Schedule extends Command {
	private List<String> strings = new ArrayList<String>();
	public Schedule() {
		this.name = "Schedule";
		this.aliases = new String[]{"sch", "sched"};
		this.help = "shows scheduled events";
		this.botPermissions = new Permission[] {Permission.MESSAGE_EMBED_LINKS};
		this.guildOnly = true;
	}
		
	public void setSchedule(LocalDate date, LocalTime time, String event) {
		
		
	}
	
	public MessageBuilder getSchedule() {
		for(int i=0; i<scheduleList.length; i++) {
			
		}
	}
	

	@Override
	protected void execute(CommandEvent event) {
		EmbedBuilder builder = new EmbedBuilder();
		builder.setTitle("Upcoming Events")
			.setColor(Color.cyan);
	
		
	}
	
	

}
