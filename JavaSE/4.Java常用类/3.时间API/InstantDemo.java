import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @ClassName:InstantDemo
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-23 19:21
 * @Version:V1.0
 */
public class InstantDemo {

    @Test
    public void test(){
        //本初子午线时间
        Instant now = Instant.now();
        System.out.println(now);   //2019-11-23T11:22:31.859503800Z

        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);  //2019-11-23T19:24:52.542784700+08:00

        //获取自1970-1-1（UTC）的毫秒数
        long l = now.toEpochMilli();
        System.out.println(l);

        //根据指定的毫秒数获取时间
        Instant instant = Instant.ofEpochMilli(123123123123123L);
        System.out.println(instant);

    }
}
