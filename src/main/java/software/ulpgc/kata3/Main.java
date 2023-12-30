package software.ulpgc.kata3;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.HistogramDisplay().show(histogram());
    }

    private static Histogram histogram(){
        return new Histogram() {
            @Override
            public int bins() {
                return 8;
            }

            @Override
            public double[] values() {
                return new double[]{23, 54, 32, 14, 3, 2, 1, 8, 9, 10, 23, 99};
            }
        };
    }
}
