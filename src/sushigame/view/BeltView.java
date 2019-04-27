package sushigame.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import comp401sushi.Plate;
import sushigame.model.Belt;
import sushigame.model.BeltEvent;
import sushigame.model.BeltObserver;

public class BeltView extends JPanel implements BeltObserver, ActionListener {
	private JButton[] buttons;
	private Belt belt;
//	private PlateWidget[] plates;

	public BeltView(Belt b) {
		this.belt = b;
		belt.registerBeltObserver(this);
		setLayout(new GridLayout(belt.getSize(), 1));
		
//		plates = new PlateWidget[belt.getSize()];
		buttons = new JButton[belt.getSize()];
		for (int i = 0; i < belt.getSize(); i++) {
			PlateWidget plate = new PlateWidget(null, belt, i);
			
			add(plate);
//			plates[i] = plate;
		}
		refresh();
	}

	@Override
	public void handleBeltEvent(BeltEvent e) {	
		refresh();
	}

	private void refresh() {
		for (int i=0; i<belt.getSize(); i++) {
			Plate p = belt.getPlateAtPosition(i);
//			JLabel plabel = belt_labels[i];
//			plates[i] = new PlateWidget(p);

			remove(i);
			add(new PlateWidget(p, belt, i), i);
			revalidate();
			repaint();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}
