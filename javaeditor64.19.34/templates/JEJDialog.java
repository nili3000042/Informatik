import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * description
  *
  * @version 1.0 from %DATE%
  * @author %AUTHOR%
  */

public class %NAME% extends JDialog {
  %ATTRIBUTES%

  public %NAME%(JFrame owner, String title, boolean modal) {
    super(owner, title, modal);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Container cp = getContentPane();
    cp.setLayout(null);
    %COMPONENTS%
    setResizable(false);
    setVisible(true);
  }

  %METHODS%
}
