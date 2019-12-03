/**
 * @ClassName:SeasonTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-23 21:55
 * @Version:V1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

    }
}

class Season{
    private final String seasonName;
    private final String seasonDec;

    private Season(String seasonName,String seasonDec){
        this.seasonName = seasonName;
        this.seasonDec = seasonDec;
    }

    public static final  Season SPRING = new Season("春天","春暖花开");
    public static final  Season SUMMER = new Season("夏天","夏日炎炎");
    public static final  Season AUTUMN = new Season("秋天","秋高气爽");
    public static final  Season WINTER = new Season("冬天","冬雪皑皑");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDec() {
        return seasonDec;
    }

    public static Season getSPRING() {
        return SPRING;
    }

    public static Season getSUMMER() {
        return SUMMER;
    }

    public static Season getAUTUMN() {
        return AUTUMN;
    }

    public static Season getWINTER() {
        return WINTER;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDec='" + seasonDec + '\'' +
                '}';
    }
}
