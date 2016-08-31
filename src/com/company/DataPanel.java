package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-08-31.
 */
public class DataPanel implements Shape {
    private DataPoint start;
    private DataPoint end;
    public List<Point> pointList = new ArrayList<>();

    public DataPanel(DataPoint start, DataPoint end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<Point> draw() {
        for (int i = start.x; i <= end.x; i++) {
            DataPoint newPoint1 = new DataPoint(start.y, start.x);
            DataPoint newPoint2 = new DataPoint(start.y, start.x);
            newPoint1.y = start.y;
            newPoint1.x = i;
            newPoint2.y = end.y;
            newPoint2.x = i;

            pointList.add(newPoint1);
            pointList.add(newPoint2);
        } return pointList;
    }
}
