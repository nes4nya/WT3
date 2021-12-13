package by.bsuir.library.lab.service.impl;

import by.epam.library.client.presentation.PresentationProvider;
import by.epam.library.client.presentation.View;
import by.epam.library.client.service.ConsoleDataService;

import java.util.Scanner;

public class ConsoleDataServiceImpl implements ConsoleDataService {
    private static ConsoleDataServiceImpl instance;

    private ConsoleDataServiceImpl() {}

    public static ConsoleDataServiceImpl getInstance() {
        if (instance == null) {
            instance = new ConsoleDataServiceImpl();
        }
        return instance;
    }

    @Override
    public int getNumFromConsole(String message, int min, int max) {
        int number;
        View view;
        Scanner in;

        view = PresentationProvider.getInstance().getVIEW();
        in = new Scanner(System.in);

        view.print(message);
        while (!in.hasNextInt()) {
            view.print(message);
            in.next();
        }
        number = in.nextInt();
        in.nextLine();

        if (number >= min && number <= max) {
            return number;
        } else {
            return getNumFromConsole(message, min, max);
        }
    }

    @Override
    public String getStringFromConsole(String message) {
        String text;
        View view;
        Scanner in;

        view = PresentationProvider.getInstance().getVIEW();
        in = new Scanner(System.in);

        view.print(message);

        while (!in.hasNextLine()) {
            view.print(message);
            in.next();
        }
        text = in.nextLine();
        return text;
    }
}
