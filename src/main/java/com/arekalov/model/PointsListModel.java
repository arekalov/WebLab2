package com.arekalov.model;

import java.awt.*;
import java.util.ArrayList;

public class PointsListModel {
    public static ArrayList<Point> points = new ArrayList<>();

    public void setPoint(Point point) {
        points.add(point);
    }
}