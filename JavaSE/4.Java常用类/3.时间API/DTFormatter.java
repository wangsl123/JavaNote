import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @ClassName:DTFormatter
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-23 19:31
 * @Version:V1.0
 */
public class DTFormatter {

    @Test
    public void test(){
        //方式一：预定义的标准格式
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        String format = isoLocalDateTime.format(now);
        System.out.println(format);

        //解析：字符串--》日期
        TemporalAccessor parse = isoLocalDateTime.parse("2019-11-23T19:35:52.1048558");
        System.out.println(parse);

        //方式二：本地相关的格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        //格式化
        //String format1 = dateTimeFormatter.format(LocalDateTime.now());
        //System.out.println(format1);

        //方式三：自定义格式(重点）
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format2 = dateTimeFormatter1.format(LocalDateTime.now());
        System.out.println(format2);

        //解析
        TemporalAccessor parse1 = dateTimeFormatter1.parse("2019-11-23 07:54:29");
        System.out.println(parse1);


    }
}
