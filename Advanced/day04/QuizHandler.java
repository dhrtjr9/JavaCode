import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class QuizHandler implements ActionListener {
	Quiz quiz;
	QuizHandler(Quiz quiz){
		this.quiz = quiz;
	}
	public void actionPerformed(ActionEvent e){
		quiz.b.setText("?");
	}
}
