package application;

import java.awt.event.KeyEvent;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class testcl extends Application {

    Stage window;
    BorderPane layout;
    public static Button btnMasht;
    public static Button btnKomunale;
    public Text txt;
    //public static Text txt0;
   // static Text txt1;
    //public Text txtK0;
    //public Text txtK1;
    static BorderPane layoutt;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setVgap(20);
		
        Menu fileMenu = new Menu("File");
        Menu LngMenu = new Menu("Gjuha");
        Menu PaneletMenu = new Menu("Panelet");
        Menu helpMenu = new Menu("Ndihma");

        MenuItem infoitem = new MenuItem("Info     CTRL+H");
        helpMenu.getItems().addAll(infoitem);
        MenuItem apItem = new MenuItem(" Aplikimi ");
        PaneletMenu.getItems().addAll(apItem);
        apItem.setOnAction(e->{
        	//mainStage.hide();
			Aplikimi.createMainStage();
        });

        MenuItem ExitItem = new MenuItem("Dil     CTRL+V");
        fileMenu.getItems().add(ExitItem);
        
        MenuItem EItem = new MenuItem("Anglisht    CTRL+E");
        MenuItem AItem = new MenuItem("Shqip       CTRL+E");
        LngMenu.getItems().addAll(EItem,AItem);
        EItem.setOnAction(e->{
        	
        	btnMasht.setText("MASHT");
        	btnKomunale.setText("Communal");
        	txt.setText("Scholarships");
        	fileMenu.setText("File");
        	LngMenu.setText("Language");
        	helpMenu.setText("Help");
        	PaneletMenu.setText("Pannels");
        	ExitItem.setText("Exit      CTRL+V");
        	EItem.setText("English      CTRL+E");
        	AItem.setText("Albanian     CTRL+A");
        	infoitem.setText("Info     CTRL+H");
        	apItem.setText("Application");
        	

        });
        AItem.setOnAction(e->{
        	
        	btnMasht.setText("Bursa MASHT");
        	btnKomunale.setText("Bursa Komunale");
        	txt.setText("Bursat");
        	fileMenu.setText("File");
        	LngMenu.setText("Gjuha");
        	PaneletMenu.setText("Panelet");
        	helpMenu.setText("Ndihma");
        	ExitItem.setText("Dil     CTRL+V");
        	EItem.setText("Anglisht    CTRL+E");
        	AItem.setText("Shqip       CTRL+E");
        	infoitem.setText("Info     CTRL+H");
        	apItem.setText(" Aplikimi ");


        });
        ExitItem.setOnAction(e->{
        	System.exit(0);
        	
        });
        infoitem.setOnAction(e->{
        	help.createMainStage();	
        });
    
        MenuBar menuBar = new MenuBar();
        
        menuBar.getMenus().addAll(fileMenu,LngMenu,PaneletMenu,helpMenu);

		
		 Image imageB = new Image ("file:///C:/Users/HP/git/knkProjekt/Knk_Project/142547.jpg");
	     pane.setBackground(new Background(new BackgroundImage(imageB,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));                              
		
		Image image = new Image("file:///C:/Users/HP/git/knkProjekt/Knk_Project/01-512.png");
		Image image2 = new Image("file:///C:/Users/HP/git/knkProjekt/Knk_Project/icon-ministry-circle.png");
		ImageView img = new ImageView(image);
		ImageView img2 = new ImageView(image2);
		img.setFitHeight(250);
		img.setFitWidth(250);
		img2.setFitHeight(170);
		img2.setFitWidth(170);
		
		HBox hbox = new HBox();
		txt = new Text("Bursat");
		txt.setFill(Color.GRAY);
		txt.setFont(Font.font("Sanserif",FontWeight.EXTRA_LIGHT,FontPosture.ITALIC,40));
		hbox.getChildren().addAll(txt);
		
		btnMasht = new Button("Bursa Masht");
		pane.setHalignment(btnMasht,HPos.CENTER);
		btnKomunale = new Button("Bursa Komunale");

		btnMasht.setMinSize(50, 30);
		btnMasht.setTextFill(Color.WHITE);
		btnMasht.setStyle("-fx-background-color: #000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);");
		btnMasht.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
		
		btnKomunale.setMinSize(50, 30);
		btnKomunale.setTextFill(Color.WHITE);
		btnKomunale.setStyle("-fx-background-color: #000000,linear-gradient(#7ebcea, #2f4b8f),linear-gradient(#426ab7, #263e75),linear-gradient(#395cab, #223768);");
		btnKomunale.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));

		
		btnMasht.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
			BorderPane layout = new BorderPane();
			Image image3 = new Image("file:///C:/Users/HP/git/knkProjekt/Knk_Project/info-help-data-blue-round-2-512.png");
			ImageView img3 = new ImageView(image3);
			img3.setFitHeight(70);
			img3.setFitWidth(70);
			Text txt0 = new Text("Bursat MASHT\n");
			Text txt1 = new Text("Bursat MASHT ndahen nga Ministria e arsimit\r\n" + 
					"shkences dhe teknologjise.\r\n" + 
					"Bursat vlejne per nivelin Bachelor dhe\r\n" + 
					"vlera e tyre eshte 1000 euro per nje vit\r\n" + 
					"akademik aplikimi per kete burse mund te behet\r\n" + 
					"ne formen perkatese te aplikimit.K�rkes�s\r\n" + 
					"p�r burse kandidati duhet q� t�i bashk�ngjes\r\n" + 
					"Let�r reference nga profesor�t,�ertifikat�n e \r\n" + 
					"notave, kopje t� indeksit/document identifikimi.");
		    txt0.setStroke(Color.DARKBLUE);
			txt0.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20)); 
			txt1.setFont(Font.font("verdana", FontWeight.MEDIUM, FontPosture.REGULAR, 13)); 
			
			Menu LngMenu = new Menu("Gjuha");		        
	        MenuItem EItem = new MenuItem("Anglisht");
	        MenuItem AItem = new MenuItem("Shqip");
	        LngMenu.getItems().addAll(EItem,AItem);
	        EItem.setOnAction(e->{
	        	
	        	txt0.setText("MASHT Scholarship\n");
	        	txt1.setText("MASHT Scholarship are made possible by Ministry \r\n" + 
	        			"of science and technology.These Scholarships \r\n" + 
	        			"include Bachelor level.They're worth 1000E.\r\n" + 
	        			"The application for this scholarship can be done\r\n" + 
	        			"in the application form.The candidate should prepare\r\n" + 
	        			"a reference letter from professors,grades certificate,\r\n" + 
	        			"and a copy of identification document.");
	        	LngMenu.setText("Language");
	        	EItem.setText("English");
	        	AItem.setText("Albanian");
	        });
	        AItem.setOnAction(e->{
	        	
	        	txt0.setText("Bursat MASHT\n");
	        	txt1.setText("Bursat MASHT ndahen nga Ministria e arsimit\r\n" + 
						"shkences dhe teknologjise.\r\n" + 
						"Bursat vlejne per nivelin Bachelor dhe\r\n" + 
						"vlera e tyre eshte 1000 euro per nje vit\r\n" + 
						"akademik aplikimi per kete burse mund te behet\r\n" + 
						"ne formen perkatese te aplikimit.K�rkes�s\r\n" + 
						"p�r burse kandidati duhet q� t�i bashk�ngjes\r\n" + 
						"Let�r reference nga profesor�t,�ertifikat�n e \r\n" + 
						"notave, kopje t� indeksit/document identifikimi.");
	        	LngMenu.setText("Gjuha");
	        	EItem.setText("Anglisht");
	        	AItem.setText("Shqip");
	        });
	        MenuBar menuBar = new MenuBar();
	        
	        menuBar.getMenus().addAll(LngMenu);

			VBox secondaryLayout = new VBox();
			secondaryLayout.setAlignment(Pos.CENTER);
			secondaryLayout.getChildren().addAll(img3,txt0,txt1);
			
			layout.setTop(menuBar);
			layout.setCenter(secondaryLayout);
			Scene secondScene = new Scene(layout, 500,450);
			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Info Bursa");
			newWindow.setScene(secondScene);
	       // Set position of second window, related to primary window
			newWindow.setX(primaryStage.getX() + 200);
			newWindow.setY(primaryStage.getY() + 100);
			newWindow.show();}
	});
		
		
		btnKomunale.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			BorderPane layout = new BorderPane();

			Image image3 = new Image("file:///C:/Users/HP/git/knkProjekt/Knk_Project/info-help-data-blue-round-2-512.png");
			ImageView img3 = new ImageView(image3);
			img3.setFitHeight(70);
			img3.setFitWidth(70);
			Text txtK0 = new Text("Bursat Komunale\n");
			Text txtK1 = new Text("Bursat komunale ndahen nga Komuna e Prishtines\r\n" + 
					"per studentet e Universitetit te Prishtines.\r\n" + 
					"Bursat vlejne per nivelin Bachelor dhe\r\n" + 
					"vlera e tyre eshte 500 euro per nje vit\r\n" + 
					"akademik, aplikimi per kete burse mund te behet\r\n" + 
					"ne formen perkatese te aplikimit.K�rkes�s\r\n" + 
					"p�r burse kandidati duhet q� t�i bashk�ngjes\r\n" + 
					"Let�r reference nga profesor�t,�ertifikat�n e \r\n" + 
					"notave, kopje t� indeksit/document identifikimi.\r\n" + 
					"");
		    txtK0.setStroke(Color.DARKBLUE);
			txtK0.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20)); 
			txtK1.setFont(Font.font("verdana", FontWeight.MEDIUM, FontPosture.REGULAR, 13)); 
			
			
			
			Menu LngMenu = new Menu("Gjuha");		        
	        MenuItem EItem = new MenuItem("Anglisht");
	        MenuItem AItem = new MenuItem("Shqip");
	        LngMenu.getItems().addAll(EItem,AItem);
	        EItem.setOnAction(e->{
	        	
	        	txtK0.setText("Communal Scholarships");
	        	txtK1.setText("\r\n" + 
	        			"Communal Scholarship are made possible the Municipal\r\n" + 
	        			"of Prishtina for Students of the University\r\n" + 
	        			"of Prishtina.These Scholarships \r\n" + 
	        			"include Bachelor level.They're worth 1000E.\r\n" + 
	        			"The application for this scholarship can be done\r\n" + 
	        			"in the application form.The candidate should prepare\r\n" + 
	        			"a reference letter from professors,grades certificate,\r\n" + 
	        			"and a copy of identification document.");
	        	LngMenu.setText("Language");
	        	EItem.setText("English");
	        	AItem.setText("Albanian");
	        });
	        AItem.setOnAction(e->{
	        	
	        	txtK0.setText("Bursat Komunale\n");
	        	txtK1.setText("Bursat komunale ndahen nga Komuna e Prishtines\r\n" + 
						"per studentet e Universitetit te Prishtines.\r\n" + 
						"Bursat vlejne per nivelin Bachelor dhe\r\n" + 
						"vlera e tyre eshte 500 euro per nje vit\r\n" + 
						"akademik, aplikimi per kete burse mund te behet\r\n" + 
						"ne formen perkatese te aplikimit.K�rkes�s\r\n" + 
						"p�r burse kandidati duhet q� t�i bashk�ngjes\r\n" + 
						"Let�r reference nga profesor�t,�ertifikat�n e \r\n" + 
						"notave, kopje t� indeksit/document identifikimi.\r\n" + 
						"");
	        	LngMenu.setText("Gjuha");
	        	EItem.setText("Anglisht");
	        	AItem.setText("Shqip");
	        });
	        MenuBar menuBar = new MenuBar();
	        
	        menuBar.getMenus().addAll(LngMenu);

			VBox secondaryLayout = new VBox();
			secondaryLayout.setAlignment(Pos.CENTER);
			secondaryLayout.getChildren().addAll(img3,txtK0,txtK1);
			layout.setTop(menuBar);
			layout.setCenter(secondaryLayout);
			Scene secondScene = new Scene(layout, 500,450);
			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Info-bursa");
			newWindow.setScene(secondScene);
	       // Set position of second window, related to primary window
			newWindow.setX(primaryStage.getX() + 200);
			newWindow.setY(primaryStage.getY() + 100);
			newWindow.show();}
	});
		
		//VBox vbox = new VBox();
		layoutt = new BorderPane();
		layoutt.setTop(menuBar);
		//pane.add(layoutt,0,0);
		pane.add(hbox,2,0);
		pane.add(img, 0,1);
		pane.add(img2, 4,1);
		pane.add(btnMasht,0,2);
		pane.add(btnKomunale,4,2);
		layoutt.setCenter(pane);
		//vbox.getChildren().addAll(layoutt,pane);		
		Scene scene = new Scene(layoutt, 950, 600);
		
		primaryStage.setTitle("Main program!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		pane.setOnKeyPressed(e -> {
			if(e.isControlDown() && e.getCode() == KeyCode.V) {
				System.exit(0);			}
			if(e.isControlDown() && e.getCode() == KeyCode.A) {
				btnMasht.setText("Bursa MASHT");
	        	btnKomunale.setText("Bursa Komunale");
	        	txt.setText("Bursat");
	        	fileMenu.setText("File");
	        	LngMenu.setText("Gjuha");
	        	PaneletMenu.setText("Panelet");
	        	ExitItem.setText("Dil");
	        	EItem.setText("Anglisht");
	        	AItem.setText("Shqip");
	        	}
			if(e.isControlDown() && e.getCode() == KeyCode.E) {
				btnMasht.setText("MASHT");
	        	btnKomunale.setText("Communal");
	        	txt.setText("Scholarships");
	        	fileMenu.setText("File");
	        	LngMenu.setText("Language");
	        	PaneletMenu.setText("Pannels");
	        	ExitItem.setText("Exit");
	        	EItem.setText("English");
	        	AItem.setText("Albanian");	
	        	}
			if(e.isControlDown() && e.getCode() == KeyCode.H) {
				 help.createMainStage();
	        	}
		});
	
		
    }
    
   
}