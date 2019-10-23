import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class Bot extends TelegramLongPollingBot {

    //ИД чата
    private long chat_id;

    //клавиатура
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    //исходник для включения
    Path SourceOn = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\SourceFiles\\On.txt");
    //исходник для отключения
    Path SourceOff = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\SourceFiles\\Off.txt");
    //управляющая директория
    Path Destination = Paths.get("C:\\Users\\nurmukhametovde\\IdeaProjects\\Robot\\RequiredFolder\\Status.txt");


    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        chat_id = update.getMessage().getChatId();

        String text = update.getMessage().getText();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        try{
            sendMessage.setText(getMessage(text));
            execute(sendMessage);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public String getMessage(String msg){
        //список кнопок
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        //количество рядов копок
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        //настройка некоторых параметров клавиатуры
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        //очистка клавиатуры
        keyboard.clear();
        keyboardFirstRow.clear();
        //добавление кнопок
        keyboardFirstRow.add("On");
        keyboardFirstRow.add("Off");
        keyboard.add(keyboardFirstRow);

        String answ;
        switch (msg){
            //включение перерасчета
            case "on":
                try {
                    Files.copy(SourceOn, Destination, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                answ = "Перерасчет включен";
                break;

            //отключение перерасчета
            case "off":
                try {
                    Files.copy(SourceOff, Destination, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                answ = "Перерасчет отключен";
                break;

            default:
                answ = "Введите команду";
                break;
        }
        return answ;
    }


    public String getBotUsername(){
        return "@recalculator_bot";
    }

    public String getBotToken(){
        return "801621939:AAGW-hhq7H2rsciZlUNc35DLNsb4zsvtsRM";
    }
}
