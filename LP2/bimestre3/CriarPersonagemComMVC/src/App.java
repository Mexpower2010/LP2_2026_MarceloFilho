package CriarPersonagemComMVC.src;
import CriarPersonagemComMVC.src.controller.PersonagemController;
import CriarPersonagemComMVC.src.view.Interface;

public class App {
    public static void main(String[] args) {
        Interface view = new Interface();
        new PersonagemController(view);
        view.setVisible(true);
    }
}