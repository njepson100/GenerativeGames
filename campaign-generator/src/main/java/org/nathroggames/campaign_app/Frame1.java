package org.nathroggames.campaign_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

import org.nathroggames.campaign_generator.CampaignGenerator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
public class Frame1 {

	
	private JFrame frame;
	private CampaignGenerator cg = new CampaignGenerator();
	private String storyString = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(181, 46, 209, 136);
		textArea.setText(storyString);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("GenerateRandomStory");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<String> campaignPoints = new ArrayList<String>();
				storyString = cg.generateCampaign("Undead Outlaw", "In a lonely town", campaignPoints);
				textArea.setText(storyString);;
			}
		});
		
		btnNewButton.setBounds(10, 47, 161, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
