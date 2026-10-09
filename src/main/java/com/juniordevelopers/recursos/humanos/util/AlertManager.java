//berificar que todo este correcto.
package main.java.com.juniordevelopers.recursos.humanos.util;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import main.java.com.ingsf.abarroteria.controller.DashboardController;
import main.java.com.ingsf.abarroteria.controller.LoginController;
import main.java.com.ingsf.abarroteria.controller.RegisterController;
import main.java.com.ingsf.abarroteria.repository.AuthRepository;
import main.java.com.ingsf.abarroteria.repository.ProductoRepository;
import main.java.com.ingsf.abarroteria.service.AuthService;
import main.java.com.ingsf.abarroteria.service.DashboardService;

public class SceneManager {
    private final Stage stage;
    private final String FXML_PATH = "/main/resource/view/";

    public SceneManager(Stage stage) {
        this.stage = stage;
    }

    public void showLoginView() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/main/resource/view/login-view.fxml"
                )
        );

        loader.setControllerFactory(clazz -> {
            if (clazz == LoginController.class) {
                AuthRepository authRepository =
                        new AuthRepository();
                AuthService authService =
                        new AuthService(authRepository);
                return new LoginController(authService, this);
            }
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(
                        "Error al crear el constructor: "
                        + e.getMessage()
                );
            }
        });
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        stage.setResizable(false);
    }

    // Método para mostrar Dashboard
    public void showDashboardView() throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        FXML_PATH + "dashboard-view.fxml"
                )
        );

        loader.setControllerFactory(clazz -> {
            if (clazz == DashboardController.class) {
                ProductoRepository productoRepository =
                        new ProductoRepository();
                DashboardService dashboardService =
                        new DashboardService(productoRepository);
                return new DashboardController(
                        dashboardService,
                        this
                );
            }

            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(
                        "Error al cargar el constructor: "
                        + e.getMessage()
                );
            }
        });

        Parent root = loader.load();
        Scene scene = new Scene(root, 900, 900);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        stage.setResizable(false);
    }

   
    public void showAlertlnfo(
            String head,
            String title,
            String content,
            AlertType type) {

        Alert alert = new Alert(type);

        alert.initOwner(this.stage);

        alert.setHeaderText(head);
        alert.setTitle(title);
        alert.setContentText(content);

        alert.showAndWait();
    }
    public void showRegisterView() throws IOException {
    FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                    FXML_PATH + "register-view.fxml"
            )
    );
    loader.setControllerFactory(clazz -> {
        if (clazz == RegisterController.class) {
            AuthRepository authRepository = new AuthRepository();
            AuthService authService = new AuthService(authRepository);
            return new RegisterController(authService, this);
        }
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(
                    "Error al crear el constructor: " + e.getMessage()
            );
        }
    });
    Parent root = loader.load();
    Scene scene = new Scene(root, 600, 600);
    stage.setScene(scene);
    stage.centerOnScreen();
    stage.show();
    stage.setResizable(false);
}
