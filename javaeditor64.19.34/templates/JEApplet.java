import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/**
  *
  * description
  *
  * @version 1.0 from %DATE%
  * @author %AUTHOR%
  */

public class %NAME% extends Applet {
  %ATTRIBUTES%

  public void init () {
    Panel cp = new Panel(null);
    cp.setBounds(0, 0, 300, 300);
    add(cp);
    %COMPONENTS%
  }
  
  %METHODS%
}
