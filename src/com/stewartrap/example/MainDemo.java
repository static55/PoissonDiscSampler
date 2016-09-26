package com.stewartrap.example;

import com.stewartrap.poissondiscsampler.PoissonDiscSampler;
import com.varunpant.quadtree.Point;
import com.varunpant.quadtree.QuadTree;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainDemo {

    private static final int QUADTREE_WIDTH = 200;
    private static final int QUADTREE_HEIGHT = 200;

    public static void main( String[] args ) {

        QuadTree quadTree = new QuadTree( QUADTREE_WIDTH, QUADTREE_HEIGHT );

        PoissonDiscSampler sampler = new PoissonDiscSampler( quadTree );

        sampler.addNumPoints( 500 );

        Point points[] = sampler.toArray();

        System.out.println( "List of points: ");
        for ( int i = 0; i < points.length; i++ ) {
            System.out.println( "Point " + i + ": " + points[i] );
        }

        drawToPng( "out.png", points );
    }

    public static void drawToPng( String pngName, Point[] points ) {

        BufferedImage image = new BufferedImage(    QUADTREE_WIDTH,
                                                    QUADTREE_HEIGHT,
                                                    BufferedImage.TYPE_INT_RGB );

        for ( int i = 0; i < points.length; i++ ) {

            image.setRGB( (int) points[i].getX(), (int) points[i].getY(), 0xffffff );
        }

        try { ImageIO.write( image, "png", new File( pngName ) ); }
        catch (IOException e) { e.printStackTrace(); }
    }
}
