/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.arrays;

/**
 *
 * @author rock and roll
 */
public class TriangularArray {

    public static void main(String[] args) {
        //two dimensional array
        int[][] tri = new int[4][];
        //making a irregular shaped multidimensional array
        tri[0] = new int[1];
        // add one 1-dimensional array in first row
        //tri[0] refers to first row
        tri[1] = new int[2];
        tri[2] = new int[3];
        tri[3] = new int[4];

        //assign values to array elements
        for (int i = 0; i < tri.length; i++) {
            //tri.length return no. of rows
            for (int j = 0; j < tri[i].length; j++) {
                //return no. of cols in each row(tri[i])
                tri[i][j] = i * j;

            }
        }
        for (int i = 0; i < tri.length; i++) {
            //tri.length return no.of rows
            for (int j = 0; j < tri[i].length; j++) {
                System.out.print(tri[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
