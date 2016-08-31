package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-08-29.
 */
public class StaticPanel implements Shape {
    private PanelPoint start;
    private PanelPoint end;
    public List<Point> pointList = new ArrayList<>();

    public StaticPanel(PanelPoint start, PanelPoint end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<Point> draw() {
        for (int i = start.x; i <= end.x; i++) {
            PanelPoint newPoint1 = new PanelPoint(start.y, start.x);
            PanelPoint newPoint2 = new PanelPoint(start.y, start.x);
            newPoint1.y = start.y;
            newPoint1.x = i;
            newPoint2.y = end.y;
            newPoint2.x = i;

            pointList.add(newPoint1);
            pointList.add(newPoint2);
        }

        for (int i = start.y; i <= end.y; i++) {
            PanelPoint newPoint1 = new PanelPoint(start.y, start.x);
            PanelPoint newPoint2 = new PanelPoint(start.y, start.x);
            newPoint1.x = start.x;
            newPoint1.y = i;
            newPoint2.x = end.x;
            newPoint2.y = i;

            pointList.add(newPoint1);
            pointList.add(newPoint2);
        }


        return pointList;
    }
}
