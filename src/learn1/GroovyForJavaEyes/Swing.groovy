package learn1.GroovyForJavaEyes

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JOptionPane
import java.awt.FlowLayout
import java.awt.event.ActionListener
import java.awt.event.FocusListener
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

frame = new JFrame(size: [300, 300],
layout: new FlowLayout(),
defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE)

button = new JButton("click")

positionLable = new JLabel("")
msgLable = new JLabel("")

frame.contentPane.add(button)
frame.contentPane.add(positionLable)
frame.contentPane.add(msgLable)


button.addActionListener(
        {
            JOptionPane.showMessageDialog(frame,"you clicked")
        } as ActionListener
)

displayMouseLocation = {
    positionLable.setText("$it.x, $it.y")
}

frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

handleFocus = [
        focusGained : { msgLable.setText("good to see you")},
        focusLost:{msgLable.setText("come back soon")}
]

button.addFocusListener(
        handleFocus as FocusListener
)

events = ['WindowListener', 'ComponentListener']

hander = {msgLable.setText("$it")}

for(event in events){
    handlerImpl  = hander.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}"(handlerImpl)
}

frame.show()