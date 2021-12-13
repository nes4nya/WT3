

public class ServiceController implements Controller {
    private final CommandProvider commandProvider = new CommandProvider();

    @Override
    public String action(String request) {
        String[] params = request.split("\\s+");
        return commandProvider.getCommand(params[1]).execute(request);
    }
}
