
import terminal.TerminalReader;
import terminal.parser.CommandParser;
import terminal.parser.CommandParserImpl;
import zoo.Zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        CommandParser parserZoo = new CommandParserImpl();
        TerminalReader.newTerminalReader(parserZoo, zoo);
    }

}
