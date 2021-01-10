package chiharu.hagihara.minecraftscalatemplate

import org.bukkit.command.{Command, CommandSender}
import org.bukkit.plugin.java.JavaPlugin

class ScalaPractice extends JavaPlugin{
  override def onEnable(): Unit = {
  }

  override def onDisable(): Unit = {
  }

  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    sender.sendMessage("§cScalaの世界へようこそ。")
    true
  }
}