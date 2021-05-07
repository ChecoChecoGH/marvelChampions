package sample;

import javafx.fxml.FXML;

import java.util.ArrayList;

public class Controller {
    ArrayList<CartaBuenos> listaMazoBuenos = new ArrayList<>();
    ArrayList<CartaMalos> listaMazoMalos = new ArrayList<>();

    @FXML
    public  void  initialize(){


        for(int i = 0; i < 15; i++){
            CartaBuenos cartaBuenos = new CartaBuenos();
            cartaBuenos.cartaDeHeroe = true;
            listaMazoBuenos.add(cartaBuenos);
        }
















        //
    }







}
