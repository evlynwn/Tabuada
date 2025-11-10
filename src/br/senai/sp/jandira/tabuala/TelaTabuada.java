package br.senai.sp.jandira.tabuala;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        //Definir o tamanho da tela
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");

        //Criar o root - componente de leitura principal
        VBox root = new VBox();
        root.setStyle("-fx-background-color:rgba(177,124,234,0.8) ;");

        //Criamos a cena e colocamos o root nela
        Scene scene = new Scene(root);

        //Criar o header da tela;
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: rgba(137,74,199,0.46)");

        //Colocar o conteúdo do header
        Label labeltitulo = new Label("Tabuada");
        labeltitulo.setStyle("-fx-text-fill: white;-fx-font-size: ");
        Label labelSubtitulo = new Label("Cria a tabuada que sua imaginação mandar");

        //Colocar o conteúdo no header
        header.getChildren().addAll(labeltitulo,labelSubtitulo);


        //Colocamos a cena no palco
        stage.setScene(scene);

        //criar o grid do formulario
        GridPane gridFormulario = new GridPane();
        gridFormulario.setPrefHeight(100);
        gridFormulario.setStyle("-fx-background-color: #bab65e");

        //Criar o conteúdo do gri
        Label labelMultiplicando = new Label("Multiplicando");
        TextField textFieldMultiplicando = new TextField();
        Label labelMenorMultiplicando = new Label("Menor Multiplicando");
        TextField textFieldMenorMultiplicando = new TextField();
        Label labelMaiorMultiplicando = new Label("Maior Multiplicando");
        TextField textFieldMaiorMultiplicando = new TextField();

        //Colocar os componentes no grind
        gridFormulario.add(labelMultiplicando, 0, 0);
        gridFormulario.add(textFieldMultiplicando, 1, 0);
        gridFormulario.add(labelMenorMultiplicando, 0, 1);
        gridFormulario.add(textFieldMenorMultiplicando, 1, 1);
        gridFormulario.add(labelMaiorMultiplicando, 0, 2);
        gridFormulario.add(textFieldMaiorMultiplicando, 1, 2);



        //Criar a caixa dos botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: #aa5555");

        //Criar os botões
        Button buttonCalcular = new Button("Calcular");
        Button buttonLimpar = new Button("Limpar");
        Button buttonSair = new Button("Sair");

        //Adicionar as buttons na boxResultado
        boxBotoes.getChildren().addAll(buttonCalcular,buttonLimpar,buttonSair);

        //Criar a caixa de resultado
        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: #b55496");

        //Criar componentes de resultados
        Label labelResultados = new Label("Resultados");
        ListView listaTabuada = new ListView();


        //Adicionar componetes ao root
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultados);


        stage.show();
    }
}
