import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class PaymentCalender {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());

        List<String[]> dataLines = new ArrayList<>();


        for (int i=0; i<365; i++){
           if (c.get(Calendar.DAY_OF_WEEK)!=7 && c.get(Calendar.DAY_OF_WEEK)!=1 ) {
               dataLines.add(new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"});

           }
            c.add(Calendar.DATE, 1);

        }

        ToFile.saveList(dataLines,"PaymentCalender.txt");
    }


}
