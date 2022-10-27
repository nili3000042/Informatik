import java.awt.*;
import java.awt.event.*;

/**
  *
  * description
  *
  * @version 1.0 from %DATE%
  * @author %AUTHOR%
  */

public class %NAME% extends Frame {
  %ATTRIBUTES%

  public %NAME%(String title) {
    super (title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Panel cp = new Panel(null);
    add(cp);
    %COMPONENTS%
    setResizable(false);
    setVisible(true);
  }

  %METHODS%

  public static void main(String[] args) {
    new %NAME%("%NAME%");
  }
}
