import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends JFrame {
	
	public HelloSwing() {
		super("Minha Janela");
		
		setSize(300,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jLabel = new JLabel("Hello Java Visual World!");		
		
		JButton botaoNorte = new JButton("Norte");		
		JButton botaoSul = new JButton("Sul");
		JButton botaoLeste = new JButton("Leste");
		JButton botaoOeste = new JButton("Oeste");
		JButton botaoCentro = new JButton("Centro");
		
		add(botaoNorte, BorderLayout.NORTH);
		add(botaoSul, BorderLayout.SOUTH);
		add(botaoLeste, BorderLayout.EAST);
		add(botaoOeste, BorderLayout.WEST);
		add(botaoCentro, BorderLayout.CENTER);
		
		botaoNorte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Norte!");
				
			}
		});
		
		
		
		botaoSul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Sul!");
				
			}
		});
		
		
		
		botaoLeste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Leste!");
				
			}
		});
		
		
		
		botaoOeste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Oeste!");
				
			}
		});
		
		
		
		botaoCentro.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Centro!");				
			}
		});
		
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new HelloSwing();
		
	}

}
