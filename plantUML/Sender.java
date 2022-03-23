package plantUML;

public class Sender {
    public static void main(String[] args) {
        stdMessenger Std = new stdMessenger();
        System.out.println("StdMessenger\n");
        Std.sendMessage("Gingerbread Cookie", "Greeting", "Hola Brave Cookie!");
        Std.sendMessage("DarkCacao Cookie", "Stop War", "Can you stop war with ur father?");

        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("Almond Cookie", "Secret", "Hey! can u tied me daddy?");
        mail.sendMessage("FrostQueen Cookie", "Freeze", "Grandma, stop freeze anything!!");
        mail.sendMessage("Sorbet Cookie", "Pirate", "Oooo0ooOoo0oOoo0oo~");
        mail.disconnect();
        mail.sendMessage("SeaFairy Cookie", "Love", "Ur so beautiful today..>.<");
    }
}