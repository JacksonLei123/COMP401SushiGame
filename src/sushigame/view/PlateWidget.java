package sushigame.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import comp401sushi.*;
import sushigame.model.Belt;

public class PlateWidget extends JPanel {
	private Belt belt;
	private Plate plate;
	private int index;
	
	public PlateWidget(Plate p, Belt belt, int index) {
		this.belt = belt;
		this.plate = p;
		this.index = index;
		setLayout(new BorderLayout());
		JLabel name = new JLabel();
		
		name.setMinimumSize(new Dimension(300, 10));
		name.setPreferredSize(new Dimension(300, 10));
		name.setOpaque(true);
		name.setBackground(Color.GRAY);
		
		if (p == null) {
			name.setText("");
			name.setBackground(Color.GRAY);
		} else {
			if(isDatThangaRoll(p)) {
				String[] a = gimmeIngredients(p);
				String b = stringThemAllTogethah(a);
				name.setText(p.getContents().getName() + " "+ b +" " +p.getChef().getName() + " "+ "Age:" +" "+belt.getAgeOfPlateAtPosition(index));
			} else {
			name.setText(p.getContents().getName() +" "+p.getChef().getName() + "Age:" +" "+belt.getAgeOfPlateAtPosition(index));
			}
			switch (p.getColor()) {
			case RED:
				name.setBackground(Color.RED); break;
			case GREEN:
				name.setBackground(Color.GREEN); break;
			case BLUE:
				name.setBackground(Color.BLUE); break;
			case GOLD:
				name.setBackground(Color.YELLOW); break;
			}
		}
		
		add(name, BorderLayout.CENTER);
		
//		JLabel fake = new JLabel();
//		fake.setBackground(Color.CYAN);
//		fake.setOpaque(true);
//		fake.setText("hey jackson");
//		add(fake, BorderLayout.EAST);
	}
	
	private boolean isDatThangaRoll(Plate plate) {
		boolean yeOrNah = false;
		String name = plate.getContents().getName();
		if(name.endsWith("l") && name.endsWith("l")) {
			yeOrNah = true;
		}
	//	System.out.println(yeOrNah);
		return yeOrNah;
		}
	
	private String[] gimmeIngredients(Plate plate) {
		String[] ingredientsListString = new String[plate.getContents().getIngredients().length];
		IngredientPortion[] ingredientsList = plate.getContents().getIngredients();
		for(int i = 0; i<ingredientsList.length; i++) {
			ingredientsListString[i] = ingredientsList[i].getName();
			//System.out.println(ingredientsListString[i]);
		}
		return ingredientsListString;
	}
	private String stringThemAllTogethah(String[] StringArray) {
		String bigDogString = "";
		for(int i=0; i<StringArray.length; i++) {
			bigDogString = bigDogString + StringArray[i]+" ";
		}
		return bigDogString;
	}
		
	}
	

