package lesson18;

/**
 * Created by Alex on 02.11.2017.
 */
public class Definition {
    private void notifyUsers(String[] userEmail){
        for (String email : userEmail){

            //обработка ошибки
            try {

                //send email to user - error
                System.out.println("Email" + email + "was sent");
                //
                //
                //
            } catch (Exception e) {
                //how should I handle exception
                System.err.println("Email" + email + "was not sent");
            } finally {
                //updateStatus
            }


//            }catch (type2 e){
//
//            }

        }
    }
}
