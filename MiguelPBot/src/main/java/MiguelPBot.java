import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;




public class MiguelPBot extends TelegramLongPollingBot {




    @Override
    public void onUpdateReceived(Update update) {

        Message mensaje = update.getMessage();
        Long chatId = mensaje.getChatId();
        String mensajeRecibido = mensaje.getText();
        SendMessage enviarMensaje = new SendMessage();
        enviarMensaje.setChatId(chatId.toString());


        if ("/horoscopo".equals(mensajeRecibido)) {


            String amor = "";
            int valorRandomAmor = (int) Math.floor(Math.random()*(5-0+1)+0);

            if (valorRandomAmor == 0){
                amor = "El camino amoroso que has elegido es posible que se haya encontrado con otro obstaculo que te va a impedir continuar con la persona amada, es mejor mirar otras opciones, ";
            }
            if (valorRandomAmor == 1){
                amor = "El amor deseado esta mas cerca de lo que piensas, ese vacio que sientes es posible que se llene, siempre y cuando sepas buscarlo, ";
            }
            if (valorRandomAmor == 2){
                amor = "Como dice el refran \" los polos opuestos se atraen\", es posible que de aquello de lo que no te creas se convierta en realidad, ";
            }
            if (valorRandomAmor == 3){
                amor = "Sigue a tu corazon, no se equivoca en los asuntos del amor, ";
            }
            if (valorRandomAmor == 4){
                amor = "Esas mariposas que sentistes en el estomago se revolotearon por algo, no tengas miedo, ";
            }
            if (valorRandomAmor == 5){
                amor = "Fluye con los cambios y no te aferres a aquello que ya no te satisface como antes, ";
            }


            String dinero = "";
            int valorRandomDinero = (int) Math.floor(Math.random()*(5-0+1)+0);

            if( valorRandomDinero == 0){
                dinero = "es posible que no te sientas comodo en el lugar de trabajo, pero aguanta, algo mas grande te espera si tienes paciencia, ";
            }
            if( valorRandomDinero == 1){
                dinero = "el dinero llama al dinero, muchas puertas se te abriran cuando tu poder adquisitivo crezca, ";
            }
            if( valorRandomDinero == 2){
                dinero = "tendrás una gran cantidad de trabajo y muchas personas te pedirán tu apoyo. ¡Pon límites! Administra mejor tu tiempo, ";
            }
            if( valorRandomDinero == 3){
                dinero = "deberias buscar una nueva manera de generar ingresos sin desgastarte tanto. ¡Organízate! ";
            }
            if( valorRandomDinero == 4){
                dinero = "cuida tu economía y no gastes lo que no tienes. Este mes evita prestar dinero a otras personas, y revisa dos veces todo lo que firmes, ";
            }
            if( valorRandomDinero == 5){
                dinero = "busca tu independencia económica y lucha por tus objetivos, no por los de los demás, ";
            }



            String salud = "";
            int valorRandomSalud = (int) Math.floor(Math.random()*(5-0+1)+0);

            if( valorRandomSalud == 0){
                salud = "trata de superar ese mal hábito que te cuesta trabajo. El consejo de los astros es que no lo hagas durante 21 días para desacostumbrarte.";
            }
            if( valorRandomSalud == 1){
                salud = "los astros aconsejan que realices alguna actividad física, como correr. Esto te servirá para liberar energía. Por otro lado, reflexiona a qué le estás dando relevancia en tu vida.";
            }
            if( valorRandomSalud == 2){
                salud = "los astros recomiendas que hagas una limpieza a tu hogar. Libérate de todo aquello que ya no necesita y suelta aquello que te mantiene en un estado de estancamiento.";
            }
            if( valorRandomSalud == 3){
                salud = "serás un orgullo para tus familiares y amigos porque vienen grandes logros para ti.";
            }
            if( valorRandomSalud == 4){
                salud = "el desapego es clave para dejar ir miedos e inseguridades. No necesitas bastones emocionales; tienes las respuestas que buscas en tu interior.";
            }
            if( valorRandomSalud == 5){
                salud = "¿Necesitas ayuda? Solo pídela al Universo y te llegará.";
            }


            enviarMensaje.setText("Los astros me han hablado y han dicho lo siguiente: " +amor+dinero+salud );

        }

        else {
            enviarMensaje.setText("Comando incorrecto.");

        }

        try {
            sendMessage( enviarMensaje );
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }


    @Override
    public String getBotUsername () {
        return "MiguelPBot";
    }

    @Override
    public String getBotToken () {
        return "1166738749:AAHePAei4M0j3n42m03txeIhL1pxAhDSWoo";
    }
}
