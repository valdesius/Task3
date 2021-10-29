package valdes.inc.com.company;

class MainTest {

    public boolean testMain(Picture picture) {
        if (picture.getColor(-9, -9) != SimpleColor.YELLOW) {
            System.out.println("The test was not passed");
            return false;
        } else if (picture.getColor(0, 0) != SimpleColor.WHITE) {
            System.out.println("The test was not passed");
            return false;
        } else if (picture.getColor(0, -3) != SimpleColor.WHITE) {
            System.out.println("The test was not passed");
            return false;
        } else if (picture.getColor(-1, 4) != SimpleColor.BLUE) {
            System.out.println("The test was not passed");
            return false;
        } else if (picture.getColor(-8, -1) != SimpleColor.BLUE) {
            System.out.println("The test was not passed");
            return false;
        } else if (picture.getColor(-5, -9) != SimpleColor.YELLOW) {
            System.out.println("The test was not passed");
            return false;
        } else {
            return true;
        }
    }
}
