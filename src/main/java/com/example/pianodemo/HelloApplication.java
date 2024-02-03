package com.example.pianodemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage)
    {

        Group root = new Group();
        root=makePianoKeys();


        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("PIANO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Group makePianoKeys(){
        Group root = new Group();
        HBox hBox=new HBox();

        Rectangle C = new Rectangle(300,60,60,200);
        C.setFill(Color.WHITE);
        C.setStroke(Color.BLACK);
        Rectangle ra = new Rectangle(340,60,50,130);
        ra.setFill(Color.BLACK);

        Rectangle D = new Rectangle(340,60,60,200);
        D.setFill(Color.WHITE);
        D.setStroke(Color.BLACK);
        Rectangle r1a = new Rectangle(400,60,50,130);
        r1a.setFill(Color.BLACK);
        Rectangle E = new Rectangle(421,60,60,200);
        E.setFill(Color.WHITE);
        E.setStroke(Color.BLACK);
        Rectangle r2a = new Rectangle(461,60,50,130);
        r2a.setFill(Color.BLACK);
        Rectangle F = new Rectangle(483,60,60,200);
        F.setFill(Color.WHITE);
        F.setStroke(Color.BLACK);
        Rectangle r3a = new Rectangle(524,60,50,130);
        r3a.setFill(Color.BLACK);
        Rectangle G = new Rectangle(545,60,60,200);
        G.setFill(Color.WHITE);
        G.setStroke(Color.BLACK);
        Rectangle r4a = new Rectangle(584,60,50,130);
        r4a.setFill(Color.BLACK);

        final AudioClip note1 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\a1.wav").toURI().toString());
        final AudioClip note2 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\b1.wav").toURI().toString());
        final AudioClip note3 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\c1.wav").toURI().toString());

        final AudioClip note4 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\d1.wav").toURI().toString());


        final AudioClip note5 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\e1.wav").toURI().toString());


        final AudioClip note6 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\f1.wav").toURI().toString());

        final AudioClip note7 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\g1.wav").toURI().toString());

        final AudioClip note8 =
                new AudioClip(new File("C:\\Users\\asus\\IdeaProjects\\pianoDemo\\src\\main\\resources\\wav-piano-sound-master\\wav\\g1s.wav").toURI().toString());
        C.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note1.play();

            }
        });
        D.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note2.play();

            }
        });
        E.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note3.play();

            }
        });
        F.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note4.play();

            }
        });
        G.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note5.play();

            }
        });
        ra.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note6.play();

            }
        });

        r1a.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note7.play();

            }
        });
        r2a.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note1.play();

            }
        });
        r3a.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note2.play();

            }
        });
        r4a.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {

                note8.play();

            }
        });
        hBox.getChildren().addAll(C,ra,D,r1a,E,r2a,F,r3a,G);
        hBox.setSpacing(0);
        root.getChildren().addAll(hBox);
        return root;
    }
    public static void main(String[] args) {
        launch(args);
    }
}