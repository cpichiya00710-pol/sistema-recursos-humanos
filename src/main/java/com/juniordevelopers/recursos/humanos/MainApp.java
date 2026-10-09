package main.java.com.juniordevelopers.recursos.humanos;

public class MainApp {

    
    public static void main(String[] args) {
        //atributo
    private Stage stage;
    
    @Override 
    public void start(Stage stage ) throws Exception{
       this.stage  = stage;
       SceneManager sceneManager = new SceneManager(stage);
       sceneManager.showLoginView();
       stage.show();
    }
   
    public static void main(String[] args) {
     launch();
    }
    
}
