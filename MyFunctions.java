public class MyFunctions{

    // example 1
    // this shows how we can access any pixel
    public static void speckle(Picture myPic, String filename){
        for(int i = 0; i < 10000; i++){
            int row = (int)(Math.random()*myPic.pixels.length);
            int col = (int)(Math.random()*myPic.pixels[0].length);
            int r = (int)(Math.random()*255);
            int g = (int)(Math.random()*255);
            int b = (int)(Math.random()*255);
            myPic.pixels[row][col].setRGB(r,g,b);

        }
        myPic.output(filename);
    }  // close speckle()


    // example 2
    // this shows how we can access all pixels
    // and their individual red, green, and blue values
    // then set the pixel to a specific RGB
    public static void grayscale(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length; row++){
            for(int col = 0; col < myPic.pixels[0].length; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                int avg = (int)((r+g+b)/3);
                myPic.pixels[row][col].setRGB(avg,avg,avg);
            }
        }
        myPic.output(filename);
    } // close greyscale()


    // example 3
    // this shows how we can access a portion of the image
    // and set the pixels to a specific RGB
    public static void blackBox(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length/2; row++){
            for(int col = 0; col<myPic.pixels[0].length/2; col++){
                myPic.pixels[row][col].setRGB(0,0,0);
            }
        }
        myPic.output(filename);

    } // close blackBox()



    // example 4
    // this shows how we can access all of the pixels
    // and get the ARGB value
    // and swap with a different location
    public static void flipAcrossVertical(Picture myPic, String filename){
        for(int row = 0; row < myPic.pixels.length; row++){
            for(int col = 0; col < myPic.pixels[0].length/2; col++){
                int leftVal = myPic.pixels[row][col].getValue();
                int rightVal = myPic.pixels[row][myPic.pixels[0].length-1-col].getValue();
                int temp = leftVal;
                myPic.pixels[row][col].setARGB(rightVal);
                myPic.pixels[row][myPic.pixels[0].length-1-col].setARGB(temp);
            }
        }
        myPic.output(filename);
    } // close flipAcrossVertical()


    // example 5
    public static void rot180(Picture myPic, String filename){
        for(int row = 0; row < myPic.pixels.length/2; row++){
            for(int col = 0; col < myPic.pixels[0].length; col++){
                int leftVal = myPic.pixels[row][col].getValue();
                int rightVal = myPic.pixels[myPic.pixels.length-1-row][myPic.pixels[0].length-1-col].getValue();
                int temp = leftVal;
                myPic.pixels[row][col].setARGB(rightVal);
                myPic.pixels[myPic.pixels.length-1-row][myPic.pixels[0].length-1-col].setARGB(temp);
            }
        }
        myPic.output(filename);
    } // close rot180()




    // assignment #4
    public static void mirror(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length; row++){
            for(int col = 0; col<myPic.pixels[0].length/2; col++){
                int val = myPic.pixels[row][col].getValue();
                myPic.pixels[row][myPic.pixels[0].length-col-1].setARGB(val);
            }
        }
        myPic.output(filename);
    }  




    // assignment #3
    public static void flipAcrossHorizontal(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length/2; row++){
            for(int col = 0; col<myPic.pixels[0].length; col++){
                int topVal = myPic.pixels[row][col].getValue();
                int bottomVal = myPic.pixels[myPic.pixels.length-1-row][col].getValue();
                int tempVal = topVal;
                myPic.pixels[row][col].setARGB(bottomVal);
                myPic.pixels[myPic.pixels.length-1-row][col].setARGB(tempVal);
            }
        }
        myPic.output(filename);
    }  


    // assignment #2
    public static void negate(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length; row++){
            for(int col = 0; col<myPic.pixels[0].length; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                int newR = 255-r;
                int newG = 255-g;
                int newB = 255-b;
                myPic.pixels[row][col].setRGB(newR,newG,newB);     
            }
        }
        myPic.output(filename);
    }


    // assignment #1
    public static void recolor(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length; row++){
            for(int col = 0; col<myPic.pixels[0].length; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                myPic.pixels[row][col].setRGB(g, b, r);     
            }
        }
        myPic.output(filename);
    }




    // assignment #5
    public static void popArt(Picture myPic, String filename){
        // top left, don't touch
        // top right, enhance red
        for(int row = 0; row<myPic.pixels.length/2; row++){
            for(int col = myPic.pixels[0].length/2; col<myPic.pixels[0].length; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                int newR = (r+50)%255;
                myPic.pixels[row][col].setRGB(newR,g,b);
            }
        }
        // bottom left, enhance green
        for(int row = myPic.pixels.length/2; row<myPic.pixels.length; row++){
            for(int col = 0; col<myPic.pixels[0].length/2; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                int newG = (g+50)%255;
                myPic.pixels[row][col].setRGB(r,newG,b);
            }
        }
        // bottom right, enhance blue
        for(int row = myPic.pixels.length/2; row<myPic.pixels.length; row++){
            for(int col = myPic.pixels[0].length/2; col<myPic.pixels[0].length; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                int newB = (b+50)%255;
                myPic.pixels[row][col].setRGB(r,g,newB);
            }
        }
        myPic.output(filename);
    } 


    // unused
    public static void reduceRed(Picture myPic, String filename){
        for(int row = 0; row<myPic.pixels.length; row++){
            for(int col = 0; col<myPic.pixels[0].length; col++){
                int r = myPic.pixels[row][col].getRed();
                int g = myPic.pixels[row][col].getGreen();
                int b = myPic.pixels[row][col].getBlue();
                int newR = r-50;
                if (newR<0) newR=0;
                myPic.pixels[row][col].setRGB(newR,g,b);     
            }
        }
        myPic.output(filename);
    }


} // close class