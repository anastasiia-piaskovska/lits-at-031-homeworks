import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class addDate {
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {
        Date currentDate = new Date();

        changeDate(currentDate);
    }

    static void changeDate(Date date) {
        Calendar neDate = Calendar.getInstance();
        neDate.setTime(date);

        neDate.add(Calendar.YEAR, 2);
        neDate.add(Calendar.MONTH, 2);
        neDate.add(Calendar.DATE, 2);

        Date changedDate = neDate.getTime();

        System.out.println(dateFormat.format(changedDate));
    }
}

