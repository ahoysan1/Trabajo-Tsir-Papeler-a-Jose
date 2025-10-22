/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.event.ActionEvent;

/**
 *
 * @author ahoysan1
 */
@Named(value = "navigationController")
@RequestScoped
public class NavigationController {
    
 private String id;

    public NavigationController() {
    }
    public void listener(ActionEvent event) {
        String clientId = event.getComponent().getClientId();
        int index = clientId.indexOf(":", 0);
        id = clientId.substring(index + 1);
    }

    public String action() {
        String nextPage;
        nextPage = "error";
        switch (id) {
            case "login":
                nextPage = "login";
                break;
            case "home":
                nextPage = "index";
                break;
            case "productos":
                nextPage = "productos";
                break;
        }
        return nextPage;
    }

}
