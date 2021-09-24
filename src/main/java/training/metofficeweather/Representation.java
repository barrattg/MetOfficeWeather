package training.metofficeweather;

import java.util.ArrayList;

public class Representation {
    ArrayList<DailyData> dailyData;

    @Override
    public String toString() {
        return "Representation{" +
                "dailyData=" + dailyData +
                '}';
    }

    public ArrayList<DailyData> getDailyData() {
        return dailyData;
    }

    public void setDailyData(ArrayList<DailyData> dailyData) {
        this.dailyData = dailyData;
    }
}
