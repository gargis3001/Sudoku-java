package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sudoku.buildlogic.SudokuBuildLogic;
import sudoku.userinterface.UserInterfaceImpl;
import sudoku.userinterface.IUserInterfaceContract;

import java.io.IOException;

public class SudokuApplication extends Application {
   private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e )
        {
        e.printStackTrace();
        throw e;
        }
    }
    public static void main(String[] args){
        launch(args);
    }
}