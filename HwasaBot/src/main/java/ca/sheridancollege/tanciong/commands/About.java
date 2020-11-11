package ca.sheridancollege.tanciong.commands;

import java.awt.Color;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.commons.JDAUtilitiesInfo;
import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import com.jagrosh.jdautilities.examples.doc.Author;


import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDAInfo;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.sharding.ShardManager;



@CommandInfo(
		name = "About", 
		description = "Displays info about bot."
		)

@Author("John Grosh (jagrosh)")
public class About extends Command {


	public About() {
        this.name = "about";
        this.help = "shows info about the bot";
        this.guildOnly = false;
        this.botPermissions = new Permission[]{Permission.MESSAGE_EMBED_LINKS};
	}


	@Override
	protected void execute(CommandEvent event) {

		ShardManager sm = event.getJDA().getShardManager();
		event.reply(new MessageBuilder()
				.setContent(" **About Hwasa Bot** ")
				.setEmbed(new EmbedBuilder()
						.setColor(!event.isFromType(ChannelType.TEXT) ? Color.GRAY : event.getSelfMember().getColor())
						.setDescription(
								"Hello, I am **Hwasa**#8540, a bot designed for basic mod purposes!\n"
										+ "I was written in Java by **boop_stahh**#4701 using [JDA](" + JDAInfo.GITHUB
										+ ") and [JDA-Utilities](" + JDAUtilitiesInfo.GITHUB + ")\n" + "Type `"
										+ event.getClient().getPrefix() + event.getClient().getHelpWord()
										+ "` for help and information contact maker.\n\n")
						.addField("Stats", sm.getShardsTotal() + " Shards\n" + sm.getGuildCache().size() + " Servers",
								true)
						.addField("",
								sm.getUserCache().size() + " Users\n" + Math.round(sm.getAverageGatewayPing())
										+ "ms Avg Ping",
								true)
						.addField("",
								sm.getTextChannelCache().size() + " Text Channels\n" + sm.getVoiceChannelCache().size()
										+ " Voice Channels",
								true)
						.setFooter("Last restart", null).setTimestamp(event.getClient().getStartTime()).build())
				.build());
	}
}
