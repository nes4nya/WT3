

public class AddFileCommand implements Command {
    FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        String response;

        response = "file added!";

        // получаем файл через сокет в виде объекта
        //fileBaseService.addFile();

        return response;
    }
}
