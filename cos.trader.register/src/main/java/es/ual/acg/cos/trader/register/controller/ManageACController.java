package es.ual.acg.cos.trader.register.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ual.acg.cos.trader.definitions.AbstractComponentInfo;
import es.ual.acg.cos.trader.register.service.ManageAbstractComponents;

@RestController
@RequestMapping("/abstractcomponents")
public class ManageACController {

  @Autowired
  ManageAbstractComponents manageAC;
  
  private static final Logger LOGGER = Logger.getLogger(ManageACController.class);

  private String path = "http://localhost:8802/abstractcomponents/";

  @GetMapping
  public String getAbstractComponents() {

    String bodyContent = "";
    int numberAC = 0;

    List<String> listAC = manageAC.getListAC();
    numberAC = listAC.size();
    for (String acID : listAC) {
      String hipertext = "<a href='" + path + acID + "'>" + acID + "</a>";

      String element = "<span>" + hipertext + "</span> <br>";
      bodyContent += element;

    }

    String html = "<html> <head> </head> <body> <div> <span style='font-size: 24; font-weight: bold;'> Abstract "
        + "Component Specificactions: </span> <br> <span> Number of specifications: " + numberAC
        + " </span> </div> <br> " + bodyContent + "</body> </html>";

    LOGGER.info("[ManageACRepository - getAbstractComponents] executed correctly");

    return html;
  }

  @GetMapping("/{acID}")
  public AbstractComponentInfo getAbstractComponent(@PathVariable String acID) {

    AbstractComponentInfo acInfo = manageAC.getACInfoFromID(acID);

    return acInfo;
  }


}
