import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Odyssey {
	
	JFrame window;
	
	JPanel titlePanel, startButtonPanel, firstGamePanel, firstButtonOption1Panel, secondButtonOption2Panel, 
	firstOptionSecondGamePanel, SecondGamePanel1, SecondGamePanel2, secondOptionSecondGamePanelFirst,
	secondOptionSecondGamePanelSecond, authorPanel;
	
	JLabel titleLabel, authorLabel;
	
	Font titleFont = new Font("Comic Sans MS", Font.PLAIN, 36);
	Font normalFont = new Font("Comic Sans MS", Font.PLAIN, 18);
	
	JButton startButton, firstButtonOption1, secondButtonOption2, firstOptionSecond,
	firstOptionSecondContinue, firstOptionSecondSecond;
	
	JTextArea firstText, secondTextOption1, secondTextFirstOption, SecondTextOption2;
	
	startButtonHandler sbHandler = new startButtonHandler();
	FirstButtonOption1Handler fbO1Handler = new FirstButtonOption1Handler();
	firstButtonOption2Handler fbO2Handler = new firstButtonOption2Handler();
	secondPanelContinueButton sPcB = new secondPanelContinueButton();
	tryAndPaddleContinueButton tPcB = new tryAndPaddleContinueButton();
	fourthPanelKeepPaddling fPo1 = new fourthPanelKeepPaddling();
	timmyExploreIslandOption fPo2 = new timmyExploreIslandOption();
	timmyExploreContinue fPcB = new timmyExploreContinue();
	afterNoIslandContinue aNoIC = new afterNoIslandContinue();
	shooBirdAwayOption shooBA = new shooBirdAwayOption();
	timmyAloneSeaContinue tAsC = new timmyAloneSeaContinue(); 
	timmyGoWithAngelChoiceYes tSeaAngelGoWith = new timmyGoWithAngelChoiceYes();
	timmyGoWithAngelChoiceNo tSeaAngelNoGo = new timmyGoWithAngelChoiceNo();
	timmyGoWithAngelStarGardenContinue tSeaAngelGoSGcon = new timmyGoWithAngelStarGardenContinue();
	timmyGoWithAngelGoldChoice goldChoice = new timmyGoWithAngelGoldChoice();
	timmyBronzeChoice bronzeChoice = new timmyBronzeChoice();
	timmyGoWithAngelGoldChoiceContinueButton goldContinue = new timmyGoWithAngelGoldChoiceContinueButton();
	timmyMeetsMermanContinue mermanCon = new timmyMeetsMermanContinue();
	timmyMermanMercastleContinue mercastleCon = new timmyMermanMercastleContinue();
	timmyBirdHandsWaterGunContinue waterGunCon = new timmyBirdHandsWaterGunContinue();
	timmyFightsPiratesContinue fightPiCon = new timmyFightsPiratesContinue();
	timmyBirdBeckonsToTreasureContinue treasureSeeCon = new timmyBirdBeckonsToTreasureContinue();
	timmySeesTreasureAndChoosesGem gemTake = new timmySeesTreasureAndChoosesGem();
	timmyChoosesNoGem gemNoTake = new timmyChoosesNoGem();
	timmyGrabsGemContinue gemTakeCon = new timmyGrabsGemContinue();
	timmyChoosesNoGemPanelContinue GemNoTakePanelCon = new timmyChoosesNoGemPanelContinue();
	timmyChoosesPiracy pirateChoice = new timmyChoosesPiracy();
	timmyChoosesNoPiracy noPirateChoice = new timmyChoosesNoPiracy();
	timmyStormAtSeaContinue stormContinue = new timmyStormAtSeaContinue();
	timmyThrownOffRaftContinue thrownRaftCon = new timmyThrownOffRaftContinue();
	timmyMermanChoiceGoHome goHomeChoice = new timmyMermanChoiceGoHome();
	timmyMermanChoiceBecomeMerman beMermanChoice = new timmyMermanChoiceBecomeMerman();
	timmyYesShooBird yesShooSeaBird = new timmyYesShooBird();
	timmyGoingBackToSleepContinue tSleepCon = new timmyGoingBackToSleepContinue();
	timmyGoWithNoPanelContinue noAngelPanelCon = new timmyGoWithNoPanelContinue();
	timmyNoShooBirdContinue noShooSeaBirdCon = new timmyNoShooBirdContinue();
	timmyBirdTalksContinue seaBirdTalkCon = new timmyBirdTalksContinue();
	timmyBirdLeadingtoIslandContinue seaBirdLeadingCon = new timmyBirdLeadingtoIslandContinue();
	timmyEntersGoHomeDoorContinue homeChoiceCon = new timmyEntersGoHomeDoorContinue();
	timmyMermanMermanContinue mermanChoiceCon = new timmyMermanMermanContinue();
	ending2Restart end2Res = new ending2Restart();
	endGame end = new endGame();
	timmyNoShooBird seaBirdNoShoo = new timmyNoShooBird();
	timmyWithBirdExploreIslandContinue islandTimmyWBirdExplore = new timmyWithBirdExploreIslandContinue();
	timmyBirdonIslandContinue timmyBirdCon = new timmyBirdonIslandContinue();
	distantLoonyNeptunyPiratesContinue distantLooney = new distantLoonyNeptunyPiratesContinue();
	piratesLandContinue pirateLandCon = new piratesLandContinue();
	timmyChoosesNoGem choiceNoGem = new timmyChoosesNoGem();
	birdTalkContinueButton birdTalkCon = new birdTalkContinueButton();
	talk2BirdOption birdTalkChoice = new talk2BirdOption();
	afterShooContinue afterShooCon = new afterShooContinue();
	shooBirdAwayOption choiceShoo = new shooBirdAwayOption();
	distantLoonyNeptunyPiratesWithoutBirdContinue distantPWBirdCon = new distantLoonyNeptunyPiratesWithoutBirdContinue();
	loonyNeptunyPiratesLandWithoutBirdContinue pirateLandWBirdCon = new loonyNeptunyPiratesLandWithoutBirdContinue();
	timmyFightsPiratesWithSticksCon fightPirateStick = new timmyFightsPiratesWithSticksCon();
	
	Color darkBlue = new Color(4, 28, 133);
	
	//All the images for the background. Drawn by my sister Hannah
	JLabel titleBackground= new JLabel(new ImageIcon("src/OneBetter.jpg"));
	JLabel firstScreenBackground= new JLabel(new ImageIcon("src/two.jpg"));
	JLabel sitAndThink = new JLabel(new ImageIcon("src/sitandthink.jpg"));
	JLabel closeup = new JLabel(new ImageIcon("src/closeup.jpg"));
	JLabel three = new JLabel(new ImageIcon("src/three.png"));
	JLabel seesIsland = new JLabel(new ImageIcon("src/seesIsland.jpg"));
	JLabel exploreIsland = new JLabel(new ImageIcon("src/explore.jpg"));
	JLabel birdOnTimmy = new JLabel(new ImageIcon("src/birdtimmy.jpg"));
	JLabel seaBurd = new JLabel(new ImageIcon("src/seaBird.png"));
	JLabel timmSeaSeeAngel = new JLabel(new ImageIcon("src/timmySeeAngel.jpg"));
	JLabel angelStarGarden = new JLabel(new ImageIcon("src/starGarden.jpg"));
	JLabel goldStar = new JLabel(new ImageIcon("src/goldStar.jpg"));
	JLabel ending1 = new JLabel(new ImageIcon("src/spaghetti.jpg"));
	JLabel merman = new JLabel(new ImageIcon("src/timmyMeetMerman.jpg"));
	JLabel mercastle = new JLabel(new ImageIcon("src/mercastle.jpg"));
	JLabel endingTimmyDog = new JLabel(new ImageIcon("src/timmyDog.jpg"));
	JLabel waterGun = new JLabel(new ImageIcon("src/waterGun.jpg"));
	JLabel fightingPirates = new JLabel(new ImageIcon("src/fightPirate.jpg"));
	JLabel seeTreasure = new JLabel(new ImageIcon("src/treasureSee.jpg"));
	JLabel treasureChoice = new JLabel(new ImageIcon("src/timmyTreasureChoice.jpg"));
	JLabel endingTimmyBed = new JLabel(new ImageIcon("src/timmyBed.jpg"));
	JLabel pirateSurround = new JLabel(new ImageIcon("src/surround.jpg"));
	JLabel endingTimmyPirate = new JLabel(new ImageIcon("src/timmpyPirate.jpg"));
	JLabel storm = new JLabel(new ImageIcon("src/storm.jpg"));
	JLabel raftThrown = new JLabel(new ImageIcon("src/raftThrow.jpg"));
	JLabel doorChoice = new JLabel(new ImageIcon("src/mermanDoors.jpg"));
	JLabel endingTimmyMerman = new JLabel(new ImageIcon("src/timmyMerman.jpg"));
	JLabel timmyTryToSleep = new JLabel(new ImageIcon("src/timmySleep.jpg"));
	JLabel pirateCaptain = new JLabel(new ImageIcon("src/pirateCaptian.jpg"));
	JLabel birdLeading = new JLabel(new ImageIcon("src/birdPoint.jpg"));
	JLabel timmyLookDoor = new JLabel(new ImageIcon("src/timmyLookDoor.jpg"));
	JLabel pirateSeen = new JLabel(new ImageIcon("src/looneyPirates.jpg"));
	JLabel pirateLand = new JLabel(new ImageIcon("src/pirateLand.jpg"));
	JLabel fightingPiratesSticks = new JLabel(new ImageIcon("src/timmyFightSticks.jpg"));
	JLabel bronzeChoiceSad = new JLabel(new ImageIcon("src/sadAngel.jpg"));




	
public static void main(String[] args) {
		new Odyssey();
	}

	public Odyssey() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(titleBackground);
		window.setLayout(null);
		
		titlePanel = new JPanel();
		titlePanel.setBounds(150,100,500,250);
		titlePanel.setBackground(darkBlue);
		titlePanel.setOpaque(false);
		
		authorPanel = new JPanel();
		authorPanel.setBounds(100,500,600,250);
		authorPanel.setBackground(darkBlue);
		authorPanel.setOpaque(false);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(350,300,100,50);
		startButtonPanel.setBackground(new java.awt.Color(15, 43, 166));
		startButton = new JButton("Start");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setOpaque(false);
		startButton.setFont((new Font("Comic Sans MS", Font.PLAIN, 18)));
		startButton.addActionListener(sbHandler);
		startButtonPanel.add(startButton);
		
		titleLabel = new JLabel();
		titleLabel.setText("Timmy's Odyssey");
		titleLabel.setForeground(Color.white);
		titleLabel.setOpaque(false);
		titleLabel.setFont(titleFont);
		titlePanel.add(titleLabel);
		
		authorLabel = new JLabel();
		authorLabel.setText("A Game by Andrew Scofield     Artwork by Hannah Scofield");
		authorLabel.setForeground(Color.white);
		authorLabel.setOpaque(false);
		authorLabel.setFont(normalFont);
		authorPanel.add(authorLabel);
		
		window.add(titlePanel);
		window.add(startButtonPanel);
		window.add(authorPanel);
		window.setVisible(true);	
	}
	public class startButtonHandler implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstScreenPanel();
				
			}	
			}
	public void firstScreenPanel() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(firstScreenBackground);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,250);
		firstGamePanel.setBackground(darkBlue);
		
		firstText = new JTextArea("Timmy eyes open up to see a sail fluttering in a small breeze. "
				+ "Little does Timmy know, he is on a raft on the Neptunian    Sea. But Timmy, knowing he in a place he shouldn't be, "
				+ "looks around in a fright. Everything is blue. The sky is blue, the    sea is blue, and "
				+ "Timmy thinks that perhaps he is blue. He      looks down at his arm and discovers he is not. "
				+ "                      After staring at his surroundings for an uncomfortable        amount of time, he wonders what he should do."
				+ "                    What should he do?");
		firstText.setBounds(150,50,515,250);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Sit and Think a While Longer");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(fbO1Handler);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Try and Paddle");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(fbO2Handler);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);	
	}
	public class FirstButtonOption1Handler implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondScreenPanelSitandThink();
				
			}	
			}
	public void secondScreenPanelSitandThink() {
		
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(closeup);
		
		SecondGamePanel1 = new JPanel();
		SecondGamePanel1.setBounds(150,100,500,100);
		SecondGamePanel1.setBackground(darkBlue);
		//SecondGamePanel1.setOpaque(true);
		
		secondTextOption1 = new JTextArea("Timmy sits and thinks. What could have gotten him"
				+ " into     this predicatment? He tries to remember yesterday ... "
				+ "    But his mind is filled with the smell of Neptunian salt.");
		secondTextOption1.setBounds(150,50,500,100);
		secondTextOption1.setBackground(darkBlue);
		secondTextOption1.setForeground(Color.white);
		secondTextOption1.setFont(normalFont);
		secondTextOption1.setLineWrap(true);
		//secondTextOption1.setOpaque(false);
		SecondGamePanel1.add(secondTextOption1);
		
		firstOptionSecondGamePanel = new JPanel();
		firstOptionSecondGamePanel.setBounds(285,300,200,50);
		firstOptionSecondGamePanel.setBackground(darkBlue);
		firstOptionSecondGamePanel.setOpaque(false);
		firstOptionSecond = new JButton("Continue");
		firstOptionSecond.setBackground(Color.black);
		firstOptionSecond.setForeground(Color.white);
		firstOptionSecond.setFont(normalFont);
		firstOptionSecond.addActionListener(sPcB);
		firstOptionSecondGamePanel.add(firstOptionSecond);
		
		window.add(firstOptionSecondGamePanel);
		window.add(SecondGamePanel1);
		
	}
	public class secondPanelContinueButton implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstOptionSecondGamePanel.setVisible(false);
				SecondGamePanel1.setVisible(false);
				firstScreenPanel();	
			}	
			}
	public class firstButtonOption2Handler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			secondScreenPanelTryandPaddle();
		}	
		}
	
	public void secondScreenPanelTryandPaddle() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(sitAndThink);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,150);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy look around his small raft. There is not a paddle to be seen."
				+ " He looks down at his hand. He cups it. 'Spoon' he says to himself as resolve spreads across his face."
				+ " He       crawls on his knees to the edge of the raft. Slowly but       surely, the raft begins to move as "
				+ "Timmy paddles furiously.");
		SecondTextOption2.setBounds(150,50,500,150);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(tPcB);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class tryAndPaddleContinueButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			fourthScreenPanelSeesIsland();
			
		}	
		}

	public void fourthScreenPanelSeesIsland() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(seesIsland);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,500,125);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy nearly faints from exhaustion after paddling for     thirty seconds."
				+ " But he catches a current and he sees an     island in the distance. "
				+ "                                                          Should he go onto the Island?");
		firstText.setBounds(150,50,500,125);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Keep Paddling");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(fPo1);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Go on Island");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(fPo2);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
	
	public class fourthPanelKeepPaddling implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			fifthScreenPanelNoIsland();
			
		}	
		}
	public void fifthScreenPanelNoIsland() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(seesIsland);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,75);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea(" Timmy decides not to go onto the island. After all, there "
				+ "      might be snakes."
				+ "  He continues to paddle with his arm.");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(aNoIC);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	
	public class afterNoIslandContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyAloneAtSea();
			
		}	
		}
	
	public void timmyAloneAtSea() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(timmyTryToSleep);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,175);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy paddles. And then he paddles some more. The sun      begins to set."
				+ " Timmy still paddles. No island in sight. Then,    from pure exhaustion, Timmy gives up paddling and lies on his back"
				+ ". He has just used up all his energy."
				+ " He looks around.    There is no other island in sight. Timmy wonders if he should have explored"
				+ " the other island after all.");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(tAsC);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	
	public class timmyAloneSeaContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyAnotherBirdOption();
			
		}	
	}
	
	public void timmyAnotherBirdOption() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(seaBurd);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,200);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy, frustated and hungry, decides to take a nap for the night."
				+ " He stares up at the stars at thinks about how much he wishes he were home."
				+ " He slowly drifts to sleep."
				+ " But, in the middle of his deep sleep, Timmy is awakened by a small peck on his cheek."
				+ " He looks down at his chest to see a white bird standing regally there."
				+ "                                                             Should he shoo it away?");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Yes");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(yesShooSeaBird);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("No");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(seaBirdNoShoo);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
		
	public class timmyYesShooBird implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyGoingBacktoSleep();
			
		}	
	}
	public void timmyGoingBacktoSleep() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(timmyTryToSleep);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,100);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy, quite annoyed that the bird dared to disrupt his "
				+ "      sleep, tries to sleep again. After counting the stars, he "
				+ "       dozes off.");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(tSleepCon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		
	}
	public class timmyGoingBackToSleepContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmySeesAngel();
		}
		}
	public void timmySeesAngel() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(timmSeaSeeAngel);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,500,135);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy wakes up to orchestral choral music. "
				+ "He feels a       sense of calm. In front of him a blue angel hovers. "
				+ "He does not feel frightened."
				+ " The angel beckons Timmy to follow "
				+ "   her. \"Come on,\" the blue angel says, \"follow me!\""
				+ "                  Should he follow the angel?"
);
		firstText.setBounds(150,50,500,135);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Go with the Angel");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(tSeaAngelGoWith);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Refuse");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(tSeaAngelNoGo);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
		
	public class timmyGoWithAngelChoiceYes implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyAngelStarGarden();
		}
		}
	public void timmyAngelStarGarden() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(angelStarGarden);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,70);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("She takes his hand, and she takes him to a garden "
				+ "between Neptune and the rest of outer space. ");
		firstText.setBounds(150,50,515,70);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(tSeaAngelGoSGcon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		
	}
	public class timmyGoWithAngelStarGardenContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyAngelStarGardenStarChoice();
		}
		}
	public void timmyAngelStarGardenStarChoice() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(angelStarGarden);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,125);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea(" \"This is my garden of stars. Pick any star from my garden,   and it "
				+ "will take you to any room in my palace under the "
				+ "        Neptunian Sea. But choose carefully. You do not know where the stars will take you.\"" );
		firstText.setBounds(150,50,515,125);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Choose the Gold Star");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(goldChoice);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(240,400,300,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Choose the Bronze Star");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(bronzeChoice);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
	
	public class timmyGoWithAngelGoldChoice implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyGoldChoiceContinue();
		}
		}
	public void timmyGoldChoiceContinue(){
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(goldStar);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,35,500,215);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("The gold star shines so bright it catches his eye. "
				+ "It looks  like his home off Neptune where the sun shines yellow and the "
				+ "hedges around his house need to be cut. \"I choose this star,\" says Timmy. "
				+ "\"If you're sure. That house is a bit      simple, but if you're sure.\" Says the blue angel."
				+ "Timmy nods  his head. So, she sings a lullaby and suddenly, he is under the water. He can breathe, "
				+ "with her singing. He enters      the star");
		SecondTextOption2.setBounds(150,35,500,215);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(goldContinue);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyGoWithAngelGoldChoiceContinueButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ending1TimmyatHome();
		}
		}
	public void ending1TimmyatHome() { 
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(ending1);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,90);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("He can smell his mom's spaghetti right in front of him."
				+ "       He's off neptune. He's home. \r\n"
				+ "\"Bye Timmy,\" the angel's voice whispers as he awakes.");
		SecondTextOption2.setBounds(150,50,500,90);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("The End");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	public class timmyBronzeChoice implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyBronzeChoiceContinue();
		}
		}
	public void timmyBronzeChoiceContinue() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(bronzeChoiceSad);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,140);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("There is something calming and pleasant about the "
				+ "bronze star. Timmy chooses that one. Sorrow passes over the       angel's face."
				+ " \"That one is the 'resetting' star. You will        have to start the game over.\" "
				+ " She pauses. \"Find me when  you come back\"");
		SecondTextOption2.setBounds(150,50,500,140);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Restart");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end2Res);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class ending2Restart implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			firstScreenPanel();
		}
		}
	
	public class timmyGoWithAngelChoiceNo implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyGoWithAngelNoPanel();
		}
		}
	public void timmyGoWithAngelNoPanel() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(timmyTryToSleep);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,100);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy, quite annoyed that the angel dared to disrupt his "
				+ "    sleep, "
				+ "tries to sleep again. After counting the stars, he "
				+ "       dozes off.");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(noAngelPanelCon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	
	public class timmyGoWithNoPanelContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyStormAtSea();
		}
		}
	public void timmyStormAtSea() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(storm);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy is suddenly startled by a loud thunderclap."
				+ " The wind picks up. The waves swell. Timmy is in the middle of a "
				+ "       thunderstorm. "
				+ "Timmy clutches to the side of the raft. ");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(stormContinue);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyStormAtSeaContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyThrownOffRaft();
		}
		}
	public void timmyThrownOffRaft() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(raftThrown);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("The waves only get bigger and wider. The wind continues to "
				+ "swirl. Suddenly, the raft is crushed by a giant wave and "
				+ "    Timmy is thrown off.");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(thrownRaftCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyThrownOffRaftContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyMeetsMerman();
		}
		}
	public void timmyMeetsMerman() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(merman);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,25,500,190);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy, thrown off his raft, plunges into the sea. "
				+ "But the   water under the raging waters is calm. In front of Timmy, "
				+ " only a few feet away, is a merman. The merman stares at "
				+ "  him quizzically. "
				+ " Bubbles begin to escape Timmy's mouth \nbecause he cannot breathe."
				+ " The merman creates a large    bubble and puts it over Timmy's head."
				+ " He then leads         Timmy further underwater.");
		SecondTextOption2.setBounds(150,25,500,190);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(mermanCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyMeetsMermanContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyMermanMercastle();
		}
		}
	public void timmyMermanMercastle() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(mercastle);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,75);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("The merman leads Timmy to a gold castle."
				+ " The castle sits   on a large mound of fine sand. ");
		SecondTextOption2.setBounds(150,50,500,75);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(mercastleCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyMermanMercastleContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyMermanChoice();
		}
		}
	public void timmyMermanChoice() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(doorChoice);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,150);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("The merman shows Timmy two doors."
				+ " \"You must choose        between these two doors. The one on the left will lead you   home."
				+ " The one on the right will make you a merman like me.  You can rule with me in my castle.\""
				+ " \nWhich one should Timmy enter?" );
		firstText.setBounds(150,50,515,150);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Go Home");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(goHomeChoice);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Become a Merman");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(beMermanChoice);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
	
	public class timmyMermanChoiceGoHome implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyEntersGoHomeDoor();
		}
		}
	public void timmyEntersGoHomeDoor() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(timmyLookDoor);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy knows that he must be gettin home by now. "
				+ "His       family are probably wondering where he is. Timmy steps "
				+ "   through the door.");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(homeChoiceCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyEntersGoHomeDoorContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ending5TimmySeesDog();
		}
		}
	public void ending5TimmySeesDog() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(endingTimmyDog);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,125);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("At first Timmy smells his mom's spaghetti and then"
				+ " he     hears sniffing and panting. \"Where am I?\" thinks Timmy. "
				+ "  Then he feels a wet lick on his face and sees his best          friend, Duchess,"
				+ " in front of him. Timmy gives her a hug.");
		SecondTextOption2.setBounds(150,50,500,125);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("The End");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyMermanChoiceBecomeMerman implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyMermanMermanPanel();
		}
		}
	public void timmyMermanMermanPanel() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(timmyLookDoor);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,75);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy, on an impulse, decides that being a merman is "
				+ "        something that he has wanted to be his entire life. ");
		SecondTextOption2.setBounds(150,50,500,75);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(mermanChoiceCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyMermanMermanContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ending6TimmyBecomesMerman();
		}
		}
	public void ending6TimmyBecomesMerman() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(endingTimmyMerman);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,150);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("At first, Timmy doesn't feel any different. "
				+ "But then, he   feels like he's getting taller, longer and smoother. "
				+ "And he has fins. He looks down and sees that his legs look like a     fish."
				+ " Timmy swims along the Neptunian sea. He feels so      free. He is now a merman. ");
		SecondTextOption2.setBounds(150,50,500,150);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("The End");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	public class timmyNoShooBird implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyNoShooBirdPanel();
		}
		}
	public void timmyNoShooBirdPanel() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(seaBurd);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy decides that he shouldn't shoo the poor bird away."
				+ " After all, it is probably as tired as he is."
				+ " Timmy asks the    bird, \"are you all right?\"");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(noShooSeaBirdCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyNoShooBirdContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyBirdTalks();
		}
		}
	public void timmyBirdTalks() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(seaBurd);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,150);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("\"Well, yes, for the most part\", the bird says."
				+ " \"I can't say   there's too much to complain about. I am actually in search of "
				+ "a companion for a treasure adventure. I think you will   do nicely."
				+ " I have insider information that there is a "
				+ "          treasure on an island just over there,\""
				+ " the bird points.");
		SecondTextOption2.setBounds(150,50,500,150);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(seaBirdTalkCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyBirdTalksContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyBirdLeadingtoIsland();
		}
		}
	public void timmyBirdLeadingtoIsland() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(birdLeading);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("And without giving Timmy any choice in the matter, "
				+ "the     bird jumps up onto the sail and points with his wing, \"the "
				+ "    island is this way! Paddle on!\"");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(seaBirdLeadingCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyBirdLeadingtoIslandContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyWithBirdExploreIsland();
		}
		}
	public void timmyWithBirdExploreIsland() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(exploreIsland);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,100);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("As soon as they land on the Island, Timmy jumps out."
				+ " He is    slightly dissapointed because the Island is so bland. "
				+ "He was hoping for a jungle.");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(islandTimmyWBirdExplore);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	public class timmyWithBirdExploreIslandContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyBirdOnIsland();
		}
	}
	
	public void timmyBirdOnIsland() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(birdOnTimmy);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,125);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("The bird jumps on his shoulder. \"Well it should be around  here somewhere!\" the bird says. "
				+ "\"I overheard pirates "
				+ "       talking about THIS island. I'm sure of it!\" "
				+ "Timmy pauses.   \"Pirates?\"");
		SecondTextOption2.setBounds(150,50,500,125);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(timmyBirdCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyBirdonIslandContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			distantLoonyNeptunyPirates();
		}
		}
	public class timmyExploreIslandOption implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyExploreIsland();
			
		}	
	}
	
	public void timmyExploreIsland() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(exploreIsland);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,100);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy decides to go onto the Island. The island is very small. "
				+ "Timmy is dissapointed that it is not much bigger than his    raft.");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(fPcB);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	
	public class timmyExploreContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			islandBirdChoice();
			
		}	
		}
	public void islandBirdChoice() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(birdOnTimmy);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,125);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy looks over the Island, but cannot find anything of use."
				+ " He thinks maybe that he should get back onto his raft."
				+ " But before he leaves, a white bird lands on his shoulder."
				+ "             Should he shoo the bird away?");
		firstText.setBounds(150,50,515,125);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,100);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Talk to Bird");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(birdTalkChoice);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Shoo the Bird away");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(choiceShoo);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
	
	public class shooBirdAwayOption implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			afterBirdShooContinue();
			
		}	
		}
	
	public void afterBirdShooContinue() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(exploreIsland);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,150);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy shoos the annoying bird off his shoulder. "
				+ "He suddenly wishes he didn't because he feels lonely. "
				+ "The area around    him does not seem to have any supplies and "
				+ "Timmy thinks     that maybe he should go back to his raft. "
				+ "\"I just hope there aren't pirates out there,\" He says to himself.");
		firstText.setBounds(150,50,515,150);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(afterShooCon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	
	public class afterShooContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			distantLooneyNeptunyPiratesWithoutBird();
			
		}	
		}
	public void distantLooneyNeptunyPiratesWithoutBird() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateSeen);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,125);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("And sure enough, as soon as Timmy mentioned the word, a "
				+ "    distant space pirate song echoes through the air. "
				+ "Up ahead a group of looney-Neptuney pirates "
				+ "prepare to land onto the   island. ");
		firstText.setBounds(150,50,515,125);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(distantPWBirdCon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	public class distantLoonyNeptunyPiratesWithoutBirdContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			looneyNeptunyPiratesLandWithoutBird();
		}
		}
	public void looneyNeptunyPiratesLandWithoutBird() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateLand);
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,125);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy watches in terror as the pirates land. They are "
				+ "still   singing a pirate song. As soon as they land they see Timmy "
				+ "   they begin to point at him "
				+ "among themselves. Timmy thinks   about what to do. ");
		firstText.setBounds(150,50,515,125);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(pirateLandWBirdCon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	public class loonyNeptunyPiratesLandWithoutBirdContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyFightPiratesWithoutBird();
		}
		}
	public void timmyFightPiratesWithoutBird() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(fightingPiratesSticks);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,150);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy looks down. There is a small stick at his feet."
				+ "Timmy knows what he must do. He picks up the stick and releases his war cry."
				+ " He rushes toward the pirates and attacks      them with his stick. "
				+ "The suprise attack is most effective. The pirates do not know how to proceed.");
		SecondTextOption2.setBounds(150,50,500,150);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(fightPirateStick);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyFightsPiratesWithSticksCon implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyIsBeaten();
		}
		}
	public void timmyIsBeaten() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateSurround);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("But the stick is no match for the cutlass' of the pirates. "
				+ "   A pirate cuts Timmy's stick in half. The pirates surround Timmy.");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(GemNoTakePanelCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public void distantLoonyNeptunyPirates() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateSeen);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,125);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("And sure enough, as soon as Timmy mentioned the word, a "
				+ "    distant space pirate song echoes through the air. "
				+ "Up ahead a group of looney-Neptuney pirates "
				+ "prepare to land onto the   island. ");
		firstText.setBounds(150,50,515,150);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,125);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(distantLooney);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
	}
	
	public class distantLoonyNeptunyPiratesContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			loonyNeptunyPiratesLand();
		}
		}
	public void loonyNeptunyPiratesLand() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateLand);
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,100);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy and the bird watch in terror as the pirates land. "
				+ "As   soon as they land they see Timmy and they begin to point at him "
				+ "among themselves. The bird screams. ");
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Continue");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(pirateLandCon);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);	
	}
	
	public class piratesLandContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyBirdHandsWaterGun();
		}
		}
	
	public void timmyBirdHandsWaterGun() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(waterGun);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,125);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy stands in his place terrified."
				+ " He's never fought      pirates before. But the bird rumages through his feathers in panic. "
				+ "After a few seconds of rumaging, the bird says,    \"Ah-ha!\" and produces a water gun.");
		SecondTextOption2.setBounds(150,50,500,125);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(waterGunCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	public class timmyBirdHandsWaterGunContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyFightsPirates();
		}
		}
	public void timmyFightsPirates() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(fightingPirates);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy and the bird nod at each other. "
				+ "Timmy releases his war cry and begins to shoot the pirates with water."
				+ " It is  most effective. The pirates do not know how to proceed.");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(fightPiCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	public class timmyFightsPiratesContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyBirdBeckonsToTreasure();
		}
		}
	public void timmyBirdBeckonsToTreasure() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(seeTreasure);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,125);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy has the pirates on the run. The pirates are              retreating. "
				+ "Timmy hears the bird call his name. He looks    over to see the bird pointing to an "
				+ "obscured treasure         chest behind a palm tree. Timmy goes over to it.");
		SecondTextOption2.setBounds(150,50,500,125);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(treasureSeeCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	public class timmyBirdBeckonsToTreasureContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmySeesTreasureAndGemChoice();
		}
		}
	public void timmySeesTreasureAndGemChoice() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(treasureChoice);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,150);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("Timmy opens up the treasure chest and sees gold, silver, and diamonds. "
				+ "Timmy wonders how many snickers bars could be  bought with all that money. "
				+ "But a large gem sitting on the     top of the gold catches his attention."
				+ " He has an intense       desire to take it."
				+ " Should he?" );
		firstText.setBounds(150,50,515,150);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Take Gem");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(gemTake);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Do not take Gem");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(choiceNoGem);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
	public class timmySeesTreasureAndChoosesGem implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyGrabsGem();
		}
		}
	public void timmyGrabsGem() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(treasureChoice);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,75);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy must touch it. He reaches out with both hands."
				+ "       Timmy grabs it. Nothing happens. But then like a flash---!");
		SecondTextOption2.setBounds(150,50,500,75);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(gemTakeCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyGrabsGemContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ending3TimmyatHome();
		}
		}
	
	public void ending3TimmyatHome() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(endingTimmyBed);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,25,500,90);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy wakes up in his own bed. Timmy stares at his sheets "
				+ "for a few seconds. He then laughs. It must have all been a dream.");
		SecondTextOption2.setBounds(150,25,500,90);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("The End");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyChoosesNoGem implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			timmyChoosesNoGemPanel();
		}
		}
	
	public void timmyChoosesNoGemPanel() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateSurround);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,75);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy stares at the gem. He musn't take it. "
				+ "That would be stealing. He stands back up. The pirates surround Timmy.");
		SecondTextOption2.setBounds(150,50,500,75);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(GemNoTakePanelCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	
	public class timmyChoosesNoGemPanelContinue implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pirateOffer();
		}
		}
	public void pirateOffer() {
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateCaptain);
		
		
		firstGamePanel = new JPanel();
		firstGamePanel.setBounds(150,50,515,100);
		firstGamePanel.setBackground(darkBlue);
		//firstGamePanel.setOpaque(false);
		
		firstText = new JTextArea("The pirate captain approaches Timmy. Timmy trembles. "
				+ "The captain looks Timmy up and down. He then smiles. He offers Timmy "
				+ "an eyepatch."
				+ " Should Timmy become a pirate?" );
		firstText.setBounds(150,50,515,100);
		firstText.setBackground(darkBlue);
		firstText.setForeground(Color.white);
		firstText.setFont(normalFont);
		firstText.setLineWrap(true);
		firstText.setOpaque(false);
		
		firstButtonOption1Panel = new JPanel();
		firstButtonOption1Panel.setBounds(240,325,300,50);
		firstButtonOption1Panel.setOpaque(false);
		firstButtonOption1Panel.setBackground(darkBlue);
		firstButtonOption1 = new JButton("Become Pirate");
		firstButtonOption1.setBackground(Color.black);
		firstButtonOption1.setForeground(Color.white);
		firstButtonOption1.setFont(normalFont);
		firstButtonOption1.addActionListener(pirateChoice);
		firstButtonOption1Panel.add(firstButtonOption1);
		
		secondButtonOption2Panel = new JPanel();
		secondButtonOption2Panel.setBounds(290,400,200,50);
		secondButtonOption2Panel.setOpaque(false);
		secondButtonOption2Panel.setBackground(darkBlue);
		secondButtonOption2 = new JButton("Do not Become Pirate");
		secondButtonOption2.setBackground(Color.black);
		secondButtonOption2.setForeground(Color.white);
		secondButtonOption2.setFont(normalFont);
		secondButtonOption2.addActionListener(noPirateChoice);
		secondButtonOption2Panel.add(secondButtonOption2);
		
		firstGamePanel.add(firstText);
		
		window.add(firstGamePanel);	
		window.add(firstButtonOption1Panel);
		window.add(secondButtonOption2Panel);
	}
	
	public class timmyChoosesPiracy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			endingTimmyPirate();
		}
		}
	public void endingTimmyPirate() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(endingTimmyPirate);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,125);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy feels the Neptunian sea breeze on his face. He smiles as "
				+ "his boyhood dreams are fufilled. He joins the pirates in a rum song. "
				+ "He has never felt so much pride as he now   does wearing an eye patch. ");
		SecondTextOption2.setBounds(150,50,500,125);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("The End");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
		
	}
	public class timmyChoosesNoPiracy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ending4Incomplete();
		}
		}
	public void ending4Incomplete() {
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(pirateCaptain);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,50,500,100);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("Timmy knows that he must not become a pirate. "
				+ "It would   be very dishonest of him. He stands defiantly in front of    the "
				+ "pirate.");
		SecondTextOption2.setBounds(150,50,500,100);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Perhaps Sequel?");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(end);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	
	public class talk2BirdOption implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			birdTalkContinue();
			
		}	
		}
	public void birdTalkContinue(){
		firstGamePanel.setVisible(false);
		firstButtonOption1Panel.setVisible(false);
		secondButtonOption2Panel.setVisible(false);
		window.getContentPane().removeAll();
		window.setContentPane(birdOnTimmy);
		
		SecondGamePanel2 = new JPanel();
		SecondGamePanel2.setBounds(150,25,500,200);
		SecondGamePanel2.setBackground(darkBlue);
		
		SecondTextOption2 = new JTextArea("\"Hello! My name is Timmy,\" Timmy says."
				+ " \"Well, hello young   Timmy\", the bird says. \"You are actually the first person "
				+ "  I've seen since I got away from those dreadful singing        pirates. "
				+ "But other than that, I can't say there's too much to complain about. I am actually in search of "
				+ "a companion   for a treasure adventure. I think you will do nicely.\""
				+ "          Timmy's smiling stops. \"Pirates?\"");
		SecondTextOption2.setBounds(150,25,500,200);
		SecondTextOption2.setBackground(darkBlue);
		SecondTextOption2.setForeground(Color.white);
		SecondTextOption2.setFont(normalFont);
		SecondTextOption2.setLineWrap(true);
		SecondGamePanel2.add(SecondTextOption2);
		
		secondOptionSecondGamePanelFirst = new JPanel();
		secondOptionSecondGamePanelFirst.setBounds(285,300,200,50);
		secondOptionSecondGamePanelFirst.setBackground(darkBlue);
		secondOptionSecondGamePanelFirst.setOpaque(false);
		firstOptionSecondContinue = new JButton("Continue");
		firstOptionSecondContinue.setBackground(Color.black);
		firstOptionSecondContinue.setForeground(Color.white);
		firstOptionSecondContinue.setFont(normalFont);
		firstOptionSecondContinue.addActionListener(birdTalkCon);
		secondOptionSecondGamePanelFirst.add(firstOptionSecondContinue);
		
		window.add(SecondGamePanel2);
		window.add(secondOptionSecondGamePanelFirst);
	}
	
	public class birdTalkContinueButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			distantLoonyNeptunyPirates();
			
		}	
		}
	public class endGame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
			
		}	
	}	

}