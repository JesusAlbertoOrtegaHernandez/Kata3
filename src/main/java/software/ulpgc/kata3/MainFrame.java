package software.ulpgc.kata3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private HistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Histogram 2023");
        this.setSize(1150, 900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistohramDisplay());
    }

    private Component createHistohramDisplay() {
        JFreeChartHistogramDisplay display = new JFreeChartHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }

    public HistogramDisplay HistogramDisplay() {
        return histogramDisplay;
    }
}
