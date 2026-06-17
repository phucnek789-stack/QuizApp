module com.pnhp.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pnhp.quizapp to javafx.fxml;
    exports com.pnhp.quizapp;
}
