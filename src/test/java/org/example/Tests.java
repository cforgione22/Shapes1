package src.test.java.org.example;

import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;
import src.main.java.org.example.Box;
import src.main.java.org.example.Line;
import src.main.java.org.example.Oval;


public class Tests {
    public Tests() {
    }

    @Test
    public void testLine() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(9, 9);
        Color color = new Color(255, 0, 0);
        Line line = new Line(p1, p2, color);
        Assert.assertEquals(255, line.getColor().getRed());
        Assert.assertEquals(0, line.getColor().getGreen());
        Assert.assertEquals(0, line.getColor().getBlue());
        Assert.assertEquals(5, line.getP1().x);
        Assert.assertEquals(5, line.getP1().y);
        Assert.assertEquals(9, line.getP2().x);
        Assert.assertEquals(9, line.getP2().y);
    }

    @Test
    public void testBox() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(9, 9);
        Color color = new Color(255, 0, 0);
        Box box = new Box(p1, p2, color);
        Assert.assertEquals(255, box.getColor().getRed());
        Assert.assertEquals(0, box.getColor().getGreen());
        Assert.assertEquals(0, box.getColor().getBlue());
        Assert.assertEquals(5, box.getP1().x);
        Assert.assertEquals(5, box.getP1().y);
        Assert.assertEquals(9, box.getP2().x);
        Assert.assertEquals(9, box.getP2().y);
    }

    @Test
    public void testOval() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(9, 9);
        Color color = new Color(255, 0, 0);
        Oval oval = new Oval(p1, p2, color);
        Assert.assertEquals(255, oval.getColor().getRed());
        Assert.assertEquals(0, oval.getColor().getGreen());
        Assert.assertEquals(0, oval.getColor().getBlue());
        Assert.assertEquals(5, oval.getP1().x);
        Assert.assertEquals(5, oval.getP1().y);
        Assert.assertEquals(9, oval.getP2().x);
        Assert.assertEquals(9, oval.getP2().y);
    }
}
