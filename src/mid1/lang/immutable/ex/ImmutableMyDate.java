package mid1.lang.immutable.ex;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //보통 객체를 같이 반환할 경우 with라는 표현을 씀
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, this.month, this.day);
    }
    public ImmutableMyDate setMonth(int month) {
        return new ImmutableMyDate(this.year, month, this.day);
    }
    public ImmutableMyDate setDay(int day) {
        return new ImmutableMyDate(this.year, this.month, day);
    }
    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
}
