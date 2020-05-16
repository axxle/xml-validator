package axxle.devtools;

import axxle.devtools.xml.XmlValidator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XmlValidatorApp extends JFrame {
	JTextField pathToXsd;
	JTextArea inputXml;
	JTextArea checkResult;
	JButton startCheckButton;
	public XmlValidatorApp() {
		//Создать GUI:
		//	1) textField для указания пути до папки/файла с xsd
		//	2) textArea для проверяемой xml-ки
		//	3) кнопка, по нажатию на которую будет производиться проверка на соответствие xsd-схеме
		//	4) textArea, куда будут выводиться результат обработки (Success или ошибки валидации)
		super("Simple XML Validator for Dev");
		setBounds(200, 100, 600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Завершение работы по стандартной кнопке закрытия [Х]
		pathToXsd = new JTextField("pathToXsd",50);
		pathToXsd.setToolTipText("Путь до xsd");
		JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
		contents.add(pathToXsd);
		inputXml = new JTextArea("inputXml", 30, 50);
		contents.add(new JScrollPane(inputXml));
		startCheckButton = new JButton("startCheckXml");
		startCheckButton.addActionListener(new ListenerAction());
		contents.add(startCheckButton);
		checkResult = new JTextArea("checkResult", 6, 50);
		contents.add(new JScrollPane(checkResult));
		setContentPane(contents);
	}
  public static void main(String[] args) {
	  XmlValidatorApp app = new XmlValidatorApp();
	  app.setVisible(true);
  }

	class ListenerAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//поменять Start на Stop название кнопки 		startStopButton
			//считать путь до xsd из 						pathToXsdTextField
			//считать xml из								inputXmlTextArea
			//проверить xml по xsd
			//поменять Stop на Start название кнопки		startStopButton
			//вывести результат обработки 					в checkResultTextArea
			System.out.println("Нажатие кнопки! От - "+
					e.getActionCommand() + "\n");
			/*
			XmlValidator xmlValidator = new XmlValidator();
	  		Thread thread = new Thread(xmlValidator);
	  		thread.start();
			*/
		}
	}
}