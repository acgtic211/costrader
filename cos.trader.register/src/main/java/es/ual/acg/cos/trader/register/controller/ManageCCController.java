
package es.ual.acg.cos.trader.register.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;
import es.ual.acg.cos.trader.register.service.ManageConcreteComponents;

@RestController
@RequestMapping("/concretecomponents")
public class ManageCCController{
  
  @Autowired
  ManageConcreteComponents manageCC;

  private static final Logger LOGGER = Logger.getLogger(ManageCCController.class);
  
  private String path = "http://localhost:8802/concretecomponents/";
  private String subpath = "info?ccID=";

  @GetMapping
  public String getConcreteComponents(@RequestParam int page) {

    String bodyContent = "";
    String divSize = "";
    String divPagination = "";
    int numberCC = 0;

    if (page != 0) {
      page--;
    }

    numberCC = manageCC.getCCTotalNumber();
    divSize = "<span> Number of specifications: " + numberCC + " </span> </div> <br> ";

    int numberPages = numberCC / 100;
    LOGGER.info("numberPages: " + numberPages);
    if ((numberCC % 100) != 0) {
      numberPages++;
    }

    for (int i = 1; i <= numberPages; i++) {
      if ((page + 1 != i)) {
        String hipertext = "<a href='" + path + "?page=" + i + "'>"
            + i + "</a>";
        divPagination += "<span>" + hipertext + "</span>";
      } else {
        divPagination += "<span>" + i + "</span>";
      }
      divPagination += "&nbsp;";
    }
    divPagination += "<br><br>";

    List<String> listCC = manageCC.getListCC(page);

    for (String ccID : listCC) {
      // String ccIDalt = ccID.substring(33);
      String hipertext = "<a href='" + path + subpath + ccID + "'>"
          + ccID + "</a>";

      String element = "<span>" + hipertext + "</span> <br>";
      bodyContent += element;

    }

    String html = "<html> <head> </head> <body> <div> <span style='font-size: 24; font-weight: bold;'> Concrete "
        + "Component Specificactions: </span> <br> " + divSize + divPagination + bodyContent + "</body> </html>";

    return html;
  }
  

  @GetMapping("/info") 
  public ConcreteComponentInfo getConcreteComponent(@RequestParam String ccID) {

    ConcreteComponentInfo ccInfo = manageCC.getCCInfoFromID(ccID);

    return ccInfo;
  }


  /*@GetMapping("/{ccID : .+}")
  public ConcreteComponentInfo getConcreteComponent(@PathVariable String ccID) {

    ConcreteComponentInfo ccInfo = manageCC.getCCInfoFromID(ccID);

    return ccInfo;
  }

  @GetMapping("/{ccID : .+}/functional/{subpart}")
  public ConcreteComponentInfo getConcreteComponent(@PathVariable String ccID,
      @PathVariable String subpart) {

    ConcreteComponentInfo ccInfo = manageCC.getCCInfoFromID(ccID);

    if ("provided".equalsIgnoreCase(subpart)) {
      ccInfo.setRequiredInterfaces(null);
    } else {
      if ("required".equalsIgnoreCase(subpart)) {
        ccInfo.setProvidedInterfaces(null);
      }
    }

    return ccInfo;
  }*/


}
