import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update){
        update.getUpdateId();

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        if(update.getMessage().getText().equals("On")){
            sendMessage.setText("hello");
            try{
                execute(sendMessage);
            }
            catch (TelegramApiException e){
                e.printStackTrace();
            }
        }

    }

    public String getBotUsername(){
        return "@recalculator_bot";
    }

    public String getBotToken(){
        return "801621939:AAGW-hhq7H2rsciZlUNc35DLNsb4zsvtsRM";
    }
}
