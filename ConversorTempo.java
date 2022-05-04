import java.util.concurrent.TimeUnit;

public class ConversorTempo {

    private long sec;

    public ConversorTempo(long sec) {
        this.sec = sec;
    }

    public long getMinutos(){
        long resto = TimeUnit.SECONDS.toMinutes(this.sec) - TimeUnit.HOURS.toMinutes(this.getHoras());
        return resto;
    }

    public long getHoras(){
        return TimeUnit.SECONDS.toHours(this.sec);
    }

    public long getSegundos(){
        return this.sec % 60;
    }

}
