import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
   private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      boolean go = true;
      List<String> notes = new ArrayList<String>();
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      while (go) {
      
         if (console.hasNext()) {
            String next = console.next();
            System.out.println(next);
            if (next.equals("e")) {
               go = false;
            } else {
               notes.add(next + " at time " + sdf.format(new Timestamp(System.currentTimeMillis())) + ". ");
            }
            System.out.println(go);
         } else {
            System.out.println("nada");
         }
      }
      
      System.out.println(notes);
   }
}
               
               