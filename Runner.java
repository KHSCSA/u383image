// sources
// https://stackoverflow.com/questions/17174906/convert-a-bufferedimage-into-a-2d-array
// https://dyclassroom.com/image-processing-project/how-to-get-and-set-pixel-value-in-java
// https://dyclassroom.com/image-processing-project/how-to-convert-a-color-image-into-grayscale-image-in-java


public class Runner{
    public static void main(String[] args){

        //---------- examples
        // each of these receive two parameters:
        // the Picture object and the output filename
        // MyFunctions.speckle(new Picture("download.jpg"), "outputSpeckle2.jpg");
        // MyFunctions.grayscale(new Picture("download.jpg"), "outputGS.jpg");
        // MyFunctions.blackBox(new Picture("download.jpg"), "outputBB.jpg");
        // MyFunctions.flipAcrossVertical(new Picture("download.jpg"), "outputFlipV.jpg");
        // MyFunctions.rot180(new Picture("download.jpg"), "outputRot180.jpg");


        // assignment
        MyFunctions.recolor(new Picture("download.jpg"), "outputRecolor.jpg");
        // MyFunctions.negate(new Picture("download.jpg"), "outputNegate.jpg"); 
        // MyFunctions.flipAcrossHorizontal(new Picture("download.jpg"), "outputFAH.jpg");
        // MyFunctions.mirror(new Picture("download.jpg"), "outputMirror.jpg");
        MyFunctions.popArt(new Picture("download.jpg"), "outputPopArt.jpg");
        // MyFunctions.reduceRed(new Picture("download.jpg"), "outputReduceRed.jpg");

    }
}