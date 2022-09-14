package logging;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuffer buf = new StringBuffer();
        buf.append("<tr>\n"+
                "<td>"+record.getMessage()+"</td>\n"+
                "<td>"+record.getInstant()+"</td>\n");

        return buf.toString();

    }

    @Override
    public String getHead(Handler handler){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <title>Application Logs</title>\n" +
                "</head>\n" +
                "<body>\n"+
                "<table>";
    }

    @Override
    public String getTail(Handler handler){
        return "</table>" +
                "</body>" +
                "</html>";
    }
}
