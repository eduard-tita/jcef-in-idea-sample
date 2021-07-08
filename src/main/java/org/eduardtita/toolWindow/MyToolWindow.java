package org.eduardtita.toolWindow;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.jcef.JBCefBrowser;

import javax.swing.*;

import java.awt.*;
import java.util.Calendar;

public class MyToolWindow {

  private JButton hideToolWindowButton;
  private JPanel myToolWindowContent;
  private JPanel myBrowserPanel;

  public MyToolWindow(ToolWindow toolWindow) {
    hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));

    JBCefBrowser browser = new JBCefBrowser();
    myBrowserPanel.add(browser.getComponent(), BorderLayout.CENTER);
    browser.loadURL("https://en.wikipedia.org/wiki/Main_Page");
  }

  public JPanel getContent() {
    return myToolWindowContent;
  }
}
