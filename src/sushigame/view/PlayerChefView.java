package sushigame.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSlider;

import comp401sushi.AvocadoPortion;
import comp401sushi.CrabPortion;
import comp401sushi.EelPortion;
import comp401sushi.IngredientPortion;
import comp401sushi.Nigiri;
import comp401sushi.Plate;
import comp401sushi.RedPlate;
import comp401sushi.RicePortion;
import comp401sushi.Roll;
import comp401sushi.Sashimi;
import comp401sushi.SeaweedPortion;
import comp401sushi.ShrimpPortion;
import comp401sushi.Sushi;
import comp401sushi.TunaPortion;
import comp401sushi.Yellowtail;
import comp401sushi.YellowtailPortion;

public class PlayerChefView extends JPanel implements ActionListener {

	private List<ChefViewListener> listeners;
	//rolls
	private Sushi kmp_roll;
	
	//sashimis
	private Sushi crab_sashimi;
	private Sushi eel_sashimi;
	private Sushi shrimp_sashimi;
	private Sushi yellowtail_sashimi;
	private Sushi tuna_sashimi;
	
	//nigiris
	private Sushi eel_nigiri;
	private Sushi crab_nigiri;
	private Sushi shrimp_nigiri;
	private Sushi yellowtail_nigiri;
	private Sushi tuna_nigiri;
	private Sushi sushi;
	//sushi buttons
	private JButton sashimibutton;
	private JButton nigiributton;
	private JButton rollbutton;
	
	//plate buttons
/*	private JButton redplatebutton;
	private JButton blueplatebutton;
	private JButton greenplatebutton;
	private JButton goldplatebutton; */
	
	//ingredient buttons
/*	private JButton avocadobutton;
	private JButton crabbutton;
	private JButton eelbutton;
	private JButton ricebutton;
	private JButton seaweedbutton;
	private JButton shrimpbutton;
	private JButton tunabutton;
	private JButton yellowtailbutton; */
	
	//ingredientPortion sliders for rolls
	private JSlider avocadoPortions;
	private JSlider crabPortions;
	private JSlider eelPortions;
	private JSlider ricePortions;
	private JSlider seaweedPortions;
	private JSlider shrimpPortions;
	private JSlider tunaPortions;
	private JSlider yellowtailPortions;
	
	//ingredient Comboboxes
	private JComboBox meats;
	private JComboBox colors;
	private JComboBox goldPlatePrices;
	

	private int belt_size;
	
	public PlayerChefView(int belt_size) {
		this.belt_size = belt_size;
		listeners = new ArrayList<ChefViewListener>();

		setLayout(new GridLayout(20,20));
		
		// buttons for sushi types 
	//	JPanel sushiTypeButtonPanel = new JPanel();
		
		sashimibutton = new JButton("Sashimi");
		sashimibutton.addActionListener(this);
		sashimibutton.setActionCommand("sashimi");
		add(sashimibutton);
		
		nigiributton = new JButton("Nigiri");
		nigiributton.addActionListener(this);
		nigiributton.setActionCommand("nigiri");
		add(nigiributton);
		
		rollbutton = new JButton("Roll");
		rollbutton.addActionListener(this);
		rollbutton.setActionCommand("roll");
		add(rollbutton);
		
	//	add(sushiTypeButtonPanel);
		
		//buttons for plate colors
		
		
	/*	redplatebutton = new JButton("redplate");
		redplatebutton.addActionListener(this);
		redplatebutton.setActionCommand("redplate button");
		add(redplatebutton);
		
		blueplatebutton = new JButton("blueplate");
		blueplatebutton.addActionListener(this);
		blueplatebutton.setActionCommand("blueplate button");
		add(blueplatebutton);
		
		greenplatebutton = new JButton("greenplate");
		greenplatebutton.addActionListener(this);
		greenplatebutton.setActionCommand("greenplate button");
		add(greenplatebutton);
		
		goldplatebutton = new JButton("goldplate");
		goldplatebutton.addActionListener(this);
		goldplatebutton.setActionCommand("goldplate button");
		add(goldplatebutton); */
		
		//add(plateButtonPanel, BoxLayout.X_AXIS);
		
		//buttons or sliders for ingredients rolls
		JPanel ingredientButtonsPanel = new JPanel();
		Hashtable JSliderLabels = new Hashtable();
		JSliderLabels.put(new Integer(0), new JLabel("0.0"));
		JSliderLabels.put(new Integer(25), new JLabel("0.25"));
		JSliderLabels.put(new Integer(50), new JLabel("0.50"));
		JSliderLabels.put(new Integer(100), new JLabel("1.00"));
		JSliderLabels.put(new Integer(125), new JLabel("1.25"));
		JSliderLabels.put(new Integer(150), new JLabel("1.50"));
		
		
		
		
	/*	avocadobutton = new JButton("avocadobutton");
		avocadobutton.addActionListener(this);
		avocadobutton.setActionCommand("avocado");
		ingredientButtonsPanel.add(avocadobutton); */
		
		avocadoPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		avocadoPortions.setPaintTicks(true);
		avocadoPortions.setMajorTickSpacing(10);
		avocadoPortions.setLabelTable(JSliderLabels);
		avocadoPortions.setPaintLabels(true);
		add(new JLabel("Avocado Portions"));
		add(avocadoPortions);
		
	/*	crabbutton = new JButton("crabbutton");
		crabbutton.setActionCommand("crab");
		crabbutton.addActionListener(this);
		ingredientButtonsPanel.add(crabbutton); */
		
		crabPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		crabPortions.setPaintTicks(true);
		crabPortions.setMajorTickSpacing(10);
		crabPortions.setLabelTable(JSliderLabels);
		crabPortions.setPaintLabels(true);
		add(new JLabel("Crab Portions"));
		add(crabPortions);
		
/*		eelbutton = new JButton("eelbutton");
		eelbutton.addActionListener(this);
		eelbutton.setActionCommand("eel");
		ingredientButtonsPanel.add(eelbutton); */
		
		eelPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		eelPortions.setPaintTicks(true);
		eelPortions.setMajorTickSpacing(10);
		eelPortions.setLabelTable(JSliderLabels);
		eelPortions.setPaintLabels(true);
		add(new JLabel("Eel Portions"));
		add(eelPortions);
		
	/*	ricebutton = new JButton("ricebutton");
		ricebutton.addActionListener(this);
		ricebutton.setActionCommand("rice");
		ingredientButtonsPanel.add(ricebutton); */
		
		ricePortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		ricePortions.setPaintTicks(true);
		ricePortions.setMajorTickSpacing(10);
		ricePortions.setLabelTable(JSliderLabels);
		ricePortions.setPaintLabels(true);
		add(new JLabel("Rice Portions"));
		add(ricePortions);
		
	/*	seaweedbutton = new JButton("seaweedbutton");
		seaweedbutton.addActionListener(this);
		seaweedbutton.setActionCommand("seaweed");
		ingredientButtonsPanel.add(seaweedbutton); */
		
		seaweedPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		seaweedPortions.setPaintTicks(true);
		seaweedPortions.setMajorTickSpacing(10);
		seaweedPortions.setLabelTable(JSliderLabels);
		seaweedPortions.setPaintLabels(true);
		add(new JLabel("Seaweed Portions"));
		add(seaweedPortions);
		
	/*	shrimpbutton = new JButton("shrimpbutton");
		shrimpbutton.addActionListener(this);
		shrimpbutton.setActionCommand("shrimp");
		ingredientButtonsPanel.add(shrimpbutton); */
		
		shrimpPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		shrimpPortions.setPaintTicks(true);
		shrimpPortions.setMajorTickSpacing(10);
		shrimpPortions.setLabelTable(JSliderLabels);
		shrimpPortions.setPaintLabels(true);
		add(new JLabel("Shrimp Portions"));
		add(shrimpPortions);
		
	/*	tunabutton = new JButton("tunabutton");
		tunabutton.addActionListener(this);
		tunabutton.setActionCommand("tuna");
		ingredientButtonsPanel.add(tunabutton); */
		
		tunaPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		tunaPortions.setPaintTicks(true);
		tunaPortions.setMajorTickSpacing(10);
		tunaPortions.setLabelTable(JSliderLabels);
		tunaPortions.setPaintLabels(true);
		add(new JLabel("Tuna Portions"));
		add(tunaPortions);
		
	/*	yellowtailbutton = new JButton("yellowtailbutton");
		yellowtailbutton.addActionListener(this);
		yellowtailbutton.setActionCommand("yellowtail");
		ingredientButtonsPanel.add(yellowtailbutton); */
		
		yellowtailPortions = new JSlider(JSlider.HORIZONTAL, 0, 150, 0);
		yellowtailPortions.setPaintTicks(true);
		yellowtailPortions.setMajorTickSpacing(10);
		yellowtailPortions.setLabelTable(JSliderLabels);
		yellowtailPortions.setPaintLabels(true);
		add(new JLabel("Yellowtail Portions"));
		add(yellowtailPortions);
		
	//	add(ingredientButtonsPanel, BoxLayout.X_AXIS);
		
	
		//J Combo box for sashimi and nigiri types
		add(new JLabel("Meats"));
		meats = new JComboBox();
		meats.addItem("");
		meats.addItem("eel");
		meats.addItem("yellowtail");
		meats.addItem("tuna");
		meats.addItem("shrimp");
		meats.addItem("crab");
		add(meats);
		
		//J Combo box for plate colors
		add(new JLabel("plate colors"));
		colors = new JComboBox();
		colors.addItem("");
		colors.addItem("red");
		colors.addItem("blue");
		colors.addItem("green");
		colors.addItem("gold");
		add(colors);
		
		//J Combo box for goldplate prices
		add(new JLabel("goldplate prices"));
		goldPlatePrices = new JComboBox();
		goldPlatePrices.addItem("");
		goldPlatePrices.addItem("$5");
		goldPlatePrices.addItem("$6");
		goldPlatePrices.addItem("$7");
		goldPlatePrices.addItem("$8");
		goldPlatePrices.addItem("$9");
		goldPlatePrices.addItem("$10");
		add(goldPlatePrices);
		
	
	/*	JButton sashimi_button = new JButton("Make red plate of crab sashimi at position 3");
		sashimi_button.setActionCommand("red_crab_sashimi_at_3");
		sashimi_button.addActionListener(this);
		add(sashimi_button);

		JButton nigiri_button = new JButton("Make blue plate of eel nigiri at position 8");
		nigiri_button.setActionCommand("blue_eel_nigiri_at_8");
		nigiri_button.addActionListener(this);
		add(nigiri_button);

		JButton roll_button = new JButton("Make gold plate of KMP roll at position 5");
		roll_button.setActionCommand("gold_kmp_roll_at_5");
		roll_button.addActionListener(this);
		add(roll_button);

		kmp_roll = new Roll("KMP Roll", new IngredientPortion[] {new EelPortion(1.0), new AvocadoPortion(0.5), new SeaweedPortion(0.2)});
		*/
		
	/*	crab_sashimi = new Sashimi(Sashimi.SashimiType.CRAB);
		eel_sashimi = new Sashimi(Sashimi.SashimiType.EEL);
		shrimp_sashimi = new Sashimi(Sashimi.SashimiType.SHRIMP);
		tuna_sashimi = new Sashimi(Sashimi.SashimiType.TUNA);
		yellowtail_sashimi = new Sashimi(Sashimi.SashimiType.YELLOWTAIL);
		
		eel_nigiri = new Nigiri(Nigiri.NigiriType.EEL);
		crab_nigiri = new Nigiri(Nigiri.NigiriType.CRAB);
		shrimp_nigiri = new Nigiri(Nigiri.NigiriType.SHRIMP);
		tuna_nigiri = new Nigiri(Nigiri.NigiriType.TUNA);
		yellowtail_nigiri = new Nigiri(Nigiri.NigiriType.YELLOWTAIL); */
		
	
		
		
	}

	public void registerChefListener(ChefViewListener cl) {
		listeners.add(cl);
	}

	private void makeRedPlateRequest(Sushi plate_sushi, int plate_position) {
		for (ChefViewListener l : listeners) {
			l.handleRedPlateRequest(plate_sushi, plate_position);
		}
	}

	private void makeGreenPlateRequest(Sushi plate_sushi, int plate_position) {
		for (ChefViewListener l : listeners) {
			l.handleGreenPlateRequest(plate_sushi, plate_position);
		}
	}

	private void makeBluePlateRequest(Sushi plate_sushi, int plate_position) {
		for (ChefViewListener l : listeners) {
			l.handleBluePlateRequest(plate_sushi, plate_position);
		}
	}
	
	private void makeGoldPlateRequest(Sushi plate_sushi, int plate_position, double price) {
		for (ChefViewListener l : listeners) {
			l.handleGoldPlateRequest(plate_sushi, plate_position, price);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "sashimi":
			switch(meats.getSelectedIndex()) {
			case 1:
				this.sushi = new Sashimi(Sashimi.SashimiType.EEL);
				getThisSushiAPlate();
				break;
			case 2:
				this.sushi = new Sashimi(Sashimi.SashimiType.YELLOWTAIL);
				getThisSushiAPlate();
				break;
			case 3:
				this.sushi = new Sashimi(Sashimi.SashimiType.TUNA);
				getThisSushiAPlate();
				break;
			case 4:
				this.sushi = new Sashimi(Sashimi.SashimiType.SHRIMP);
				getThisSushiAPlate();
				break;
			case 5:
				this.sushi = new Sashimi(Sashimi.SashimiType.CRAB);
				getThisSushiAPlate();
				break;
			}
			break;
		case "nigiri":
			switch(meats.getSelectedIndex()) {
			case 1:
				this.sushi = new Nigiri(Nigiri.NigiriType.EEL);
				getThisSushiAPlate();
				break;
			case 2:
				this.sushi = new Nigiri(Nigiri.NigiriType.YELLOWTAIL);
				getThisSushiAPlate();
				break;
			case 3:
				this.sushi = new Nigiri(Nigiri.NigiriType.TUNA);
				getThisSushiAPlate();
				break;
			case 4:
				this.sushi = new Nigiri(Nigiri.NigiriType.SHRIMP);
				getThisSushiAPlate();
				break;
			case 5:
				this.sushi = new Nigiri(Nigiri.NigiriType.CRAB);
				getThisSushiAPlate();
				break;
			}
			break;
		case "roll":
			System.out.println(yellowtailPortions.getValue()/100.0);
			System.out.println(avocadoPortions.getValue()/100.0);
			System.out.println(tunaPortions.getValue()/100.0);
			System.out.println(ricePortions.getValue()/100.0);
			System.out.println(shrimpPortions.getValue()/100.0);
			System.out.println(seaweedPortions.getValue()/100.0);
			System.out.println(crabPortions.getValue()/100.0);
			System.out.println(eelPortions.getValue()/100.0);
			this.sushi = new Roll("Custom Roll", rollMaker());
			getThisSushiAPlate();
			break;
			
		}
		
		
	}

/*	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "red_crab_sashimi_at_3":
			makeRedPlateRequest(crab_sashimi, 3);
			break;
		case "blue_eel_nigiri_at_8":
			makeBluePlateRequest(eel_nigiri, 8);
			break;
		case "gold_kmp_roll_at_5":
			makeGoldPlateRequest(kmp_roll, 5, 5.00);
		}
	} */
	

	
/*	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "sashimi":
			System.out.println("wtf bro");
			switch(e.getActionCommand()) {
			case "redplate":
				System.out.println("wtf bro");
				switch(e.getActionCommand()) {
				case "crab":
					makeRedPlateRequest(crab_sashimi, 3);
					break;
				case "eel":
					makeRedPlateRequest(eel_sashimi, 0);
					break;
				case "shrimp":
					makeRedPlateRequest(shrimp_sashimi, 0);
				case "tuna":
					makeRedPlateRequest(tuna_sashimi, 0);
					break;
				case "yellowtail":
					makeRedPlateRequest(yellowtail_sashimi, 0);
					break;
				}
			}
		}
	}  */
	
	private void getThisSushiAPlate() {
		switch(colors.getSelectedIndex()) {
		case 1:
			makeRedPlateRequest(sushi, 0);
			break;
		case 2:
			makeBluePlateRequest(sushi, 0);
			break;
		case 3:
			makeGreenPlateRequest(sushi, 0);
			break;
		case 4:
			makeGoldPlateRequest(sushi, 0, goldPlatePrices.getSelectedIndex());
			break;
		}
		
	}
		
	private IngredientPortion[] rollMaker() {
		JSlider[] ingredientPortionSliders = new JSlider[8];
		ingredientPortionSliders[0] = yellowtailPortions;
		ingredientPortionSliders[1] = avocadoPortions;
		ingredientPortionSliders[2] = eelPortions;
		ingredientPortionSliders[3] = crabPortions;
		ingredientPortionSliders[4] = tunaPortions;
		ingredientPortionSliders[5] = ricePortions;
		ingredientPortionSliders[6] = shrimpPortions;
		ingredientPortionSliders[7] = seaweedPortions;
		
		
		
		IngredientPortion[] ingredientPortions = new IngredientPortion[8];
		ingredientPortions[0] = new YellowtailPortion(yellowtailPortions.getValue()/100.0);
		ingredientPortions[1] = new AvocadoPortion(avocadoPortions.getValue()/100.0);
		ingredientPortions[2] = new EelPortion(eelPortions.getValue()/100.0);
		ingredientPortions[3] = new CrabPortion(crabPortions.getValue()/100.0);
		ingredientPortions[4] = new TunaPortion(tunaPortions.getValue()/100.0);
		ingredientPortions[5] = new RicePortion(ricePortions.getValue()/100.0);
		ingredientPortions[6] = new ShrimpPortion(shrimpPortions.getValue()/100.0);
		ingredientPortions[7] = new SeaweedPortion(seaweedPortions.getValue()/100.0);
		
	/*	int nonZeroCount = 0;
		for(int i = 0; i< ingredientPortions.length; i++) {
			if(ingredientPortions[i].getAmount() != 0.0) {
				nonZeroCount = nonZeroCount + 1;
			}
		}
		IngredientPortion[] filteredIngredients = new IngredientPortion[nonZeroCount];
		int j = 0;
		for(int i = 0; i<ingredientPortions.length; i++) {
			if(ingredientPortions[i].getAmount() != 0.0) {
				filteredIngredients[j] = ingredientPortions[i];
				j++;
			}  
		} 
		
		System.out.println(filteredIngredients[0].getAmount());
		System.out.println("you even here"); */
		
	/*	ArrayList<IngredientPortion> ingPortions = new ArrayList<IngredientPortion>();
		for(int i = 0; i<ingredientPortions.length; i++) {
			if(ingredientPortionSliders[i].getValue()/100.0 != 0.0) {
				ingPortions.add(ingredientPortions[i]);
			}
		}
		IngredientPortion[] filteredIngredients = new IngredientPortion[ingPortions.size()];
		for(int i = 0; i<ingPortions.size(); i++) {
			filteredIngredients[i] = ingPortions.get(i);
		
	}
		return filteredIngredients;	*/
		
		ArrayList<IngredientPortion> ingPortions = new ArrayList<IngredientPortion>();
		if(yellowtailPortions.getValue() != 0.0) {
			ingPortions.add(new YellowtailPortion(yellowtailPortions.getValue()));
		}
		if(avocadoPortions.getValue() != 0.0) {
			ingPortions.add(new AvocadoPortion(avocadoPortions.getValue()));
		}
		if(eelPortions.getValue() != 0.0) {
			ingPortions.add(new EelPortion(eelPortions.getValue()));
		}
		if(crabPortions.getValue() != 0.0) {
			ingPortions.add(new CrabPortion(crabPortions.getValue()));
		}
		if(tunaPortions.getValue() != 0.0) {
			ingPortions.add(new TunaPortion(tunaPortions.getValue()));
		}
		if(ricePortions.getValue() != 0.0) {
			ingPortions.add(new RicePortion(ricePortions.getValue()));
		}
		if(shrimpPortions.getValue() != 0.0) {
			ingPortions.add(new ShrimpPortion(shrimpPortions.getValue()));
		}
		if(seaweedPortions.getValue() != 0.0) {
			ingPortions.add(new SeaweedPortion(seaweedPortions.getValue()));
		}
		
		IngredientPortion[] filteredIngredients = new IngredientPortion[ingPortions.size()];
		for(int i = 0; i<ingPortions.size(); i++) {
			filteredIngredients[i] = ingPortions.get(i);
		}
		
		return filteredIngredients;
	}
	
	
	
	
	
} 
			
	
		

