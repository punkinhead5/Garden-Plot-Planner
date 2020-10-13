package SBCG3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.collections.ObservableList;
//import javafx.collections.observableArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import java.util.ArrayList;
//import javafx.collections.FXCollections;
//import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;


public class SBCG3 extends Application{
       //Create an int for the running total of the remaining square feet left
       int remainingSqFt = 72;
    
    
    
        public static void main(String[] args){
        //Launch the application
        launch(args);
    }
           
    @Override
    public void start(Stage primaryStage)
    {       
        
        //Create a Button to get the selection
        Button getButton = new Button("Get selections");
               
        //Create a label to display the selection
        Label label1 = new Label("What would you like to grow in your garden?");
        Label label15 = new Label(" This planting calculator can help you make a plan for the number of flowers, herbs, salad-makings" +
                " and vegetables to grow.");  
        Label label2 = new Label("The number indicates how many of that type of plant can grow in 1 sq. ft. of your garden. ");
        Label label25 = new Label("CTRL/click on up to 5 plants you choose, then pick how many to grow in the chart below.");
        
        //Create a ListView for plants
        ListView<String> listView1st = new ListView<>();
        listView1st.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView1st.getItems().addAll(
                " 4- Flower: black-eyed Susan ", " 4- Flower: coneflower ", " 4- Flower: daisy ",
                " 4- Flower: marigold ", " 4- Flower: petunia ", " 1- Flower: sunflower ",
                " 4- Herb: basil ", " 16- Herb: chive ", " 1- Herb: cilantro ", " 1- Herb: mint ",
                " 1- Herb: oregano ", " 4- Herb: parsley ", " 1- Herb: rosemary ", " 4- Herb: sage ",
                " 2- Herb: thyme ", " 4- Salad: arugula ", " 16- Salad: carrot ", " 2- Salad: cucumber ",
                " 1- Salad: kale ", " 4- Salad: lettuce ", " 1- Salad: pepper ", " 16- Salad: radish ",
                " 9- Salad: spinach ", " 4- Salad: Swiss chard ", " 1- Salad: tomato ", " 9- Vegetables: bean ",
                " 9- Vegetables: beet ", " 1- Vegetables: broccoli ", " 1- Vegetables: cabbage ", 
                " 1- Vegetables: cauliflower ", " 4- Vegetables: eggplant ", " 1- Vegetables: jalapeno ",
                " 9- Vegetables: onion ", " 9- Vegetables: pea ", " 2- Vegetables: zucchini ");
        listView1st.setPrefSize(250, 600);

        //Create a ListView for plants that the user has selected
        ListView<String> listView2nd = new ListView<>();
        listView2nd.setPrefSize(250, 600);
        
        //Register an event handler for list selecting
        //Create Labels for the array of user-selected plants to populate        
        Label plant0 = new Label();
        Label plant1 = new Label();
        Label plant2 = new Label();
        Label plant3 = new Label();
        Label plant4 = new Label();
 //       Label plant5 = new Label();
 //       Label plant6 = new Label();
 //       Label plant7 = new Label();
 //       Label plant8 = new Label();
 //       Label plant9 = new Label();
 //       Label plant10 = new Label();
 //       Label plant11 = new Label();
 //       Label plant12 = new Label();
 //       Label plant13 = new Label();
//        Label plant14 = new Label();

        //Create ListViews for user to input numbers
        ListView<Integer> n0LV = new ListView<>();
        n0LV.setPrefSize(100,20);
        ListView<Integer> n1LV = new ListView<>();
        n1LV.setPrefSize(100,20);
        ListView<Integer> n2LV = new ListView<>();
        n2LV.setPrefSize(100,20);
        ListView<Integer> n3LV = new ListView<>();
        n3LV.setPrefSize(100,20);        
        ListView<Integer> n4LV = new ListView<>();
        n4LV.setPrefSize(100,20);
  //      ListView<Integer> n5LV = new ListView<>();
  //      n5LV.setPrefSize(100,20);
  //      ListView<Integer> n6LV = new ListView<>();
  //      n6LV.setPrefSize(100,20);
  //      ListView<Integer> n7LV = new ListView<>();
  //      n7LV.setPrefSize(100,20);
  //      ListView<Integer> n8LV = new ListView<>();
  //      n8LV.setPrefSize(100,20);
  //      ListView<Integer> n9LV = new ListView<>();
 //       n9LV.setPrefSize(100,20);
  //      ListView<Integer> n10LV = new ListView<>();
  //      n10LV.setPrefSize(100,20);
  //      ListView<Integer> n11LV = new ListView<>();
  //      n11LV.setPrefSize(100,20);
  //      ListView<Integer> n12LV = new ListView<>();
  //      n12LV.setPrefSize(100,20);
  //      ListView<Integer> n13LV = new ListView<>();
  //      n13LV.setPrefSize(100,20);
  //      ListView<Integer> n14LV = new ListView<>();       
   //     n14LV.setPrefSize(100,20);     
        
        //Create Labels for number of sq ft per line
        Label ft0 = new Label();
        Label ft1 = new Label();
        Label ft2 = new Label();
        Label ft3 = new Label();
        Label ft4 = new Label();
 //       Label ft5 = new Label();
 //       Label ft6 = new Label();
 //       Label ft7 = new Label();
//        Label ft8 = new Label();
 //       Label ft9 = new Label();
 //       Label ft10 = new Label();
 //       Label ft11 = new Label();
  //      Label ft12 = new Label();
  //      Label ft13 = new Label();
 //       Label ft14 = new Label();
        
        //Create Labels to display remaining sq ft available
        Label rem0 = new Label();
        Label rem1 = new Label();
        Label rem2 = new Label();
        Label rem3 = new Label();
        Label rem4 = new Label();
   //     Label rem5 = new Label();
   //     Label rem6 = new Label();
  //      Label rem7 = new Label();
  //      Label rem8 = new Label();
 //       Label rem9 = new Label();
 //       Label rem10 = new Label();
 //       Label rem11 = new Label();
 //       Label rem12 = new Label();
 //       Label rem13 = new Label();
 //       Label rem14 = new Label();     

        GridPane gridPane = new GridPane();
        Label numberLabel = new Label(" Number of Plants");
        Label plantLabel = new Label(" Plants ");
//        int sqft0, sqft1, sqft2, sqft3, sqft4, sqft5, sqft6, sqft7, sqft8= 0;
//        int sqft9, sqft10, sqft11, sqft12, sqft13, sqft14 = 0;
        Label sqftLabel = new Label(" Use this much room");
     //   int totsqft = 0;
        Label remsqftLabel = new Label(" Room left ");
        Label labelLast = new Label();
        
        //Add the items to the GridPane
       gridPane.add(numberLabel, 0, 0);
       gridPane.add(plantLabel, 1, 0);
       gridPane.add(sqftLabel, 2,0);
       gridPane.add(remsqftLabel, 3, 0);
       
       gridPane.add(n0LV,0,1);
       gridPane.add(n1LV,0,2);
       gridPane.add(n2LV,0,3);
       gridPane.add(n3LV,0,4);
       gridPane.add(n4LV,0,5);
   //    gridPane.add(n5LV,0,6);       
  //     gridPane.add(n6LV,0,7);
  //     gridPane.add(n7LV,0,8);              
  //     gridPane.add(n8LV,0,9);
  //     gridPane.add(n9LV,0,10);               
  //     gridPane.add(n10LV,0,11);
 //      gridPane.add(n11LV,0,12);                      
 //      gridPane.add(n12LV,0,13);
 //      gridPane.add(n13LV,0,14);              
 //      gridPane.add(n14LV,0,15);
       
       gridPane.add(plant0, 1, 1);
       gridPane.add(plant1, 1, 2);
       gridPane.add(plant2, 1, 3);
       gridPane.add(plant3, 1, 4);
       gridPane.add(plant4, 1, 5);
  //     gridPane.add(plant5, 1, 6);
//       gridPane.add(plant6, 1, 7);          
//       gridPane.add(plant7, 1, 8);
//       gridPane.add(plant8, 1, 9);
//       gridPane.add(plant9, 1, 10);                                       
//       gridPane.add(plant10, 1, 11);
 //      gridPane.add(plant11, 1, 12);
 //      gridPane.add(plant12, 1, 13);
 //      gridPane.add(plant13, 1, 14);
 //      gridPane.add(plant14, 1, 15);
       
       gridPane.add(ft0, 2, 1);
       gridPane.add(ft1, 2, 2);
       gridPane.add(ft2, 2, 3);
       gridPane.add(ft3, 2, 4);
       gridPane.add(ft4, 2, 5);
 //      gridPane.add(ft5, 2, 6);
//       gridPane.add(ft6, 2, 7);
 //      gridPane.add(ft7, 2, 8);
 //      gridPane.add(ft8, 2, 9);       
 //      gridPane.add(ft9, 2, 10);
 //      gridPane.add(ft10, 2, 11);
 //      gridPane.add(ft11, 2, 12);       
 //      gridPane.add(ft12, 2, 13);
//       gridPane.add(ft13, 2, 14);
 //      gridPane.add(ft14, 2, 15);       
       
       gridPane.add(rem0, 3, 1);
       gridPane.add(rem1, 3, 2);
       gridPane.add(rem2, 3, 3);
       gridPane.add(rem3, 3, 4);
       gridPane.add(rem4, 3, 5);
 //      gridPane.add(rem5, 3, 6);
 //      gridPane.add(rem6, 3, 7);
//       gridPane.add(rem7, 3, 8);
 //      gridPane.add(rem8, 3, 9);       
//       gridPane.add(rem9, 3, 10);
//       gridPane.add(rem10, 3, 11);
 //      gridPane.add(rem11, 3, 12);       
//       gridPane.add(rem12, 3, 13);
//       gridPane.add(rem13, 3, 14);
//       gridPane.add(rem14, 3, 15); 

       gridPane.setHgap(30);
       gridPane.setVgap(20);
       gridPane.setPadding(new Insets(20));



        //Create an event handler for the ListView control
        getButton.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
                //Get the plants selected into an array
                
                //Get the ObservableList of selected items
                   ObservableList<String> selections=
                           listView1st.getSelectionModel().getSelectedItems();
             
                   //Add the selection to the 2nd ListView
                   for (String str : selections)
                       listView2nd.getItems().addAll(str);
                  int number;      
                //add the selected plants into each plant label
                    for (int index = 0; index < selections.size(); index++)               
                    {
                        System.out.println(selections.get(index)); 
                        if (index == 0)
                        {
                            plant0.setText(selections.get(index));
                            {

                            char c = selections.get(index).charAt(1);
                            char d = selections.get(index).charAt(2);

                            switch (c)
                             {
                                 case '2':
                                    number = 2;
                                    System.out.println("2");
                                    n0LV.getItems().addAll(0,2,4,6,8,10,12,14,16,18,20,22, 
                                            24,26,28,30,32,34,36,38,40);
                                    break;
                                 case '4':
                                     number = 4;
                                     System.out.println("4");
                                     n0LV.getItems().addAll(0,4,8,12,16,20,24,28,32,36,40, 
                                            44,48,52,56,60,64,68,72,76,80);
                                     break;
                                 case '9':
                                     number = 9;
                                     System.out.println("9");
                                     n0LV.getItems().addAll(0,9,18,27,36,45,54,63,72,81,90,99, 
                                            108,117,126,135,144,153,162,171,180);
                                     break;
                                 case '1':
                                         System.out.println("Is it 1 or 16?");
                                            if (d == '6')
                                           {
                                         System.out.println("It's 16.");
                                         number = 16;
                                         n0LV.getItems().addAll(0,16,32,48,64,80,96,112,128,144,160, 
                                            176,192,208,224,240,256,272,288,304,320);
                                         break;
                                           }
                                 default:
                                         System.out.println("It's 1.");
                                         number = 1;
                                         n0LV.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
                             }
                        }
                        }
                            else if (index == 1)
                        {
                            plant1.setText(selections.get(index));
                            char c = selections.get(index).charAt(1);
                            char d = selections.get(index).charAt(2);

                            switch (c)
                             {
                                 case '2':
                                    number = 2;
                                    System.out.println("2");
                                    n1LV.getItems().addAll(0,2,4,6,8,10,12,14,16,18,20,22, 
                                            24,26,28,30,32,34,36,38,40);
                                    break;
                                 case '4':
                                     number = 4;
                                     System.out.println("4");
                                     n1LV.getItems().addAll(0,4,8,12,16,20,24,28,32,36,40, 
                                            44,48,52,56,60,64,68,72,76,80);
                                     break;
                                 case '9':
                                     number = 9;
                                     System.out.println("9");
                                     n1LV.getItems().addAll(0,9,18,27,36,45,54,63,72,81,90,99, 
                                            108,117,126,135,144,153,162,171,180);
                                     break;
                                 case '1':
                                         System.out.println("Is it 1 or 16?");
                                            if (d == '6')
                                           {
                                         System.out.println("It's 16.");
                                         number = 16;
                                         n1LV.getItems().addAll(0,16,32,48,64,80,96,112,128,144,160, 
                                            176,192,208,224,240,256,272,288,304,320);
                                         break;
                                           }
                                 default:
                                         System.out.println("It's 1.");
                                         number = 1;
                                         n1LV.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
                             }                                    
                        }
                       else if (index == 2)
                        {
                            plant2.setText(selections.get(index));
                            {

                            char c = selections.get(index).charAt(1);
                            char d = selections.get(index).charAt(2);

                            switch (c)
                             {
                                 case '2':
                                    number = 2;
                                    System.out.println("2");
                                    n2LV.getItems().addAll(0,2,4,6,8,10,12,14,16,18,20,22, 
                                            24,26,28,30,32,34,36,38,40);
                                    break;
                                 case '4':
                                     number = 4;
                                     System.out.println("4");
                                     n2LV.getItems().addAll(0,4,8,12,16,20,24,28,32,36,40, 
                                            44,48,52,56,60,64,68,72,76,80);
                                     break;
                                 case '9':
                                     number = 9;
                                     System.out.println("9");
                                     n2LV.getItems().addAll(0,9,18,27,36,45,54,63,72,81,90,99, 
                                            108,117,126,135,144,153,162,171,180);
                                     break;
                                 case '1':
                                         System.out.println("Is it 1 or 16?");
                                            if (d == '6')
                                           {
                                         System.out.println("It's 16.");
                                         number = 16;
                                         n2LV.getItems().addAll(0,16,32,48,64,80,96,112,128,144,160, 
                                            176,192,208,224,240,256,272,288,304,320);
                                         break;
                                           }
                                 default:
                                         System.out.println("It's 1.");
                                         number = 1;
                                         n2LV.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
                             }
                        }
                        }
                            else if (index == 3)
                        {
                            plant3.setText(selections.get(index));
                            char c = selections.get(index).charAt(1);
                            char d = selections.get(index).charAt(2);

                            switch (c)
                             {
                                 case '2':
                                    number = 2;
                                    System.out.println("2");
                                    n3LV.getItems().addAll(0,2,4,6,8,10,12,14,16,18,20,22, 
                                            24,26,28,30,32,34,36,38,40);
                                    break;
                                 case '4':
                                     number = 4;
                                     System.out.println("4");
                                     n3LV.getItems().addAll(0,4,8,12,16,20,24,28,32,36,40, 
                                            44,48,52,56,60,64,68,72,76,80);
                                     break;
                                 case '9':
                                     number = 9;
                                     System.out.println("9");
                                     n3LV.getItems().addAll(0,9,18,27,36,45,54,63,72,81,90,99, 
                                            108,117,126,135,144,153,162,171,180);
                                     break;
                                 case '1':
                                         System.out.println("Is it 1 or 16?");
                                            if (d == '6')
                                           {
                                         System.out.println("It's 16.");
                                         number = 16;
                                         n3LV.getItems().addAll(0,16,32,48,64,80,96,112,128,144,160, 
                                            176,192,208,224,240,256,272,288,304,320);
                                         break;
                                           }
                                 default:
                                         System.out.println("It's 1.");
                                         number = 1;
                                         n3LV.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
                            }
                        }
                            else if (index == 4)
                        {
                            plant4.setText(selections.get(index));
                            char c = selections.get(index).charAt(1);
                            char d = selections.get(index).charAt(2);

                            switch (c)
                             {
                                 case '2':
                                    number = 2;
                                    System.out.println("2");
                                    n4LV.getItems().addAll(0,2,4,6,8,10,12,14,16,18,20,22, 
                                            24,26,28,30,32,34,36,38,40);
                                    break;
                                 case '4':
                                     number = 4;
                                     System.out.println("4");
                                     n4LV.getItems().addAll(0,4,8,12,16,20,24,28,32,36,40, 
                                            44,48,52,56,60,64,68,72,76,80);
                                     break;
                                 case '9':
                                     number = 9;
                                     System.out.println("9");
                                     n4LV.getItems().addAll(0,9,18,27,36,45,54,63,72,81,90,99, 
                                            108,117,126,135,144,153,162,171,180);
                                     break;
                                 case '1':
                                         System.out.println("Is it 1 or 16?");
                                            if (d == '6')
                                           {
                                         System.out.println("It's 16.");
                                         number = 16;
                                         n4LV.getItems().addAll(0,16,32,48,64,80,96,112,128,144,160, 
                                            176,192,208,224,240,256,272,288,304,320);
                                         break;
                                           }
                                 default:
                                         System.out.println("It's 1.");
                                         number = 1;
                                         n4LV.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
                            }
                        }

                //        else if (index == 5)
                //        {
               //             plant5.setText(selections.get(index));
               //         }
               //         else if (index == 6)
                //        {
              //              plant6.setText(selections.get(index));
               //         }
              //          else if (index == 7)
              //          {
              //              plant7.setText(selections.get(index));
              //          }
             //           else if (index == 8)
            //            {
             //               plant8.setText(selections.get(index));
             //           }
             //           else if (index == 9)
             //           {
             //               plant9.setText(selections.get(index));
             //           }
            //            else if (index == 10)
             //           {
            //                plant10.setText(selections.get(index));
            //            }
           //             else if (index == 11)
           //             {
            //                plant11.setText(selections.get(index));
            //            }
            //            else if (index == 12)
            //            {
             //               plant12.setText(selections.get(index));
            //            }
            //            else if (index == 13)
            //            {
            //                plant13.setText(selections.get(index));
             //           }
             ///           else if (index == 14)
            //            {
             //               plant14.setText(selections.get(index));
             //           }
                    }
        }
               
                
        });
        
        //Create an event handler for the ListView n0LV
        n0LV.getSelectionModel().selectedIndexProperty().addListener(event->
        {
            //Get the selected index
            int index0 = n0LV.getSelectionModel().getSelectedIndex();
            
            //Display the selected index on the label
            ft0.setText("  " + String.valueOf(index0) + " sq ft");
            int remSqFt = 72- index0;
            rem0.setText("  " + String.valueOf(remSqFt) + " sq ft");
            remainingSqFt = remSqFt;
        }
        
        );
        
        //Create an event handler for the ListView n1LV
        n1LV.getSelectionModel().selectedIndexProperty().addListener(event->
        {
            //Get the selected index
            int index1 = n1LV.getSelectionModel().getSelectedIndex();
            
            //Display the selected index on the label
            ft1.setText("  " + String.valueOf(index1) + " sq ft");
        // int remSqFt = remainingSqFt- index1;
         remainingSqFt = remainingSqFt - index1;
           rem1.setText("  " + String.valueOf(remainingSqFt) + " sq ft");
        }
        
        );
        
                //Create an event handler for the ListView n2LV
        n2LV.getSelectionModel().selectedIndexProperty().addListener(event->
        {
            //Get the selected index
            int index2 = n2LV.getSelectionModel().getSelectedIndex();
            
            //Display the selected index on the label
            ft2.setText("  " + String.valueOf(index2) + " sq ft");
        // int remSqFt = remainingSqFt- index1;
         remainingSqFt = remainingSqFt - index2;
           rem2.setText("  " + String.valueOf(remainingSqFt) + " sq ft");
        }
        
        );
        
                //Create an event handler for the ListView n3LV
        n3LV.getSelectionModel().selectedIndexProperty().addListener(event->
        {
            //Get the selected index
            int index3 = n3LV.getSelectionModel().getSelectedIndex();
            
            //Display the selected index on the label
            ft3.setText("  " + String.valueOf(index3) + " sq ft");
        // int remSqFt = remainingSqFt- index1;
         remainingSqFt = remainingSqFt - index3;
           rem3.setText("  " + String.valueOf(remainingSqFt) + " sq ft");
        }
        
        );
        
                //Create an event handler for the ListView n4LV
        n4LV.getSelectionModel().selectedIndexProperty().addListener(event->
        {
            //Get the selected index
            int index4 = n4LV.getSelectionModel().getSelectedIndex();
            
            //Display the selected index on the label
            ft4.setText("  " + String.valueOf(index4) + " sq ft");
        // int remSqFt = remainingSqFt- index1;
         remainingSqFt = remainingSqFt - index4;
           rem4.setText("  " + String.valueOf(remainingSqFt) + " sq ft");
           labelLast.setText(" HAPPY GARDENING! ");
        }
        
        );


///////////////////////////////////////////////////////////////////////////////////////////////////////////////

                    // Set up the space on the page
  
                   HBox hbox = new HBox(listView1st, getButton, listView2nd);
                   hbox.setAlignment(Pos.CENTER);
                   gridPane.setAlignment(Pos.CENTER);
                   VBox vbox = new VBox(10, label1, label15, label2, label25, hbox, gridPane, labelLast);
                  
                   //Put padding around the VBox
                   vbox.setPadding(new Insets(30));
                   hbox.setPadding(new Insets(30));
                   
                   vbox.setAlignment(Pos.CENTER);
                   
                   Scene scene = new Scene(vbox, 950, 675);
                   scene.getStylesheets().add("SBCG3Styles.css");
                   
                   //Add the Scene to the Stage
                   primaryStage.setScene(scene);
                   
                   //Set the stage title
                   primaryStage.setTitle("Plants for your 72 sq. ft. garden");
                   
                   //Show the window
                   primaryStage.show();
               }
           }


