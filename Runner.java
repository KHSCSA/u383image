
public class Runner{
    public static void main(String[] args){
        // --------- exploration
        Picture myPic = new Picture("download.jpg");
        System.out.println(myPic.pixels[0][0]);
        System.out.println(myPic.pixels[0][0].getValue());
        System.out.println(myPic.pixels[0][0].getRed() + " " + myPic.pixels[0][0].getGreen() + " " + myPic.pixels[0][0].getBlue());


        // --------- examples
        // each of these receive two parameters:
        // the Picture object and the output filename
        // MyFunctions.speckle(new Picture("pic.jpg"), "outputSpeckle2.jpg");
        // MyFunctions.grayscale(new Picture("pic.jpg"), "outputGS.jpg");
        // MyFunctions.blackBox(new Picture("pic.jpg"), "outputBB.jpg");
        // MyFunctions.flipAcrossVertical(new Picture("pic.jpg"), "outputFlipV.jpg");
        // MyFunctions.rot180(new Picture("pic.jpg"), "outputRot180.jpg");


        // assignment
 
        
    } // close main()
}