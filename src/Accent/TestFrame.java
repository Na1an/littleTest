package Accent;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame{
	
	public static final int WIDTH = 400, HEIGHT = 600;
	
	public int score;
	public MusicEngine qt1;
	
	private ArrayList<String> sds;
	
	private JPanel panelMain;
	private JButton playQuestion;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	
	public TestFrame() {
		// TODO Auto-generèated constructor stub
		super("OralTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setResizable(false);
	    this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	    
	    sds = new ArrayList<String>();
	    sds.add("./audio/bc.wav");
	    
	    qt1 = new MusicEngine(sds.get(0));
	    
	    //播放问题按钮
	    playQuestion = new JButton("Play the sentence");
	    playQuestion.setBounds(90, 100, 220, 30);
	    playQuestion.addActionListener((ActionEvent e) ->{
	    	qt1.start(false);
	    });
	    
	    //选择按钮
	    
	    button0 = new JButton("0");
	    button0.setBounds(70,150,50,28);
	    
	    
	    panelMain = new JPanel();
	    panelMain.setLayout(null);
	    panelMain.setBounds(0, 0, WIDTH,HEIGHT);
	    
	    panelMain.add(playQuestion);
	    panelMain.add(button0);
	    this.add(panelMain);
	    
	    pack();
	    setLocationRelativeTo(null);
	    setVisible(true);
	    
	}
	
	
	public static void main(String[] args) {
		new TestFrame();
	}
}
