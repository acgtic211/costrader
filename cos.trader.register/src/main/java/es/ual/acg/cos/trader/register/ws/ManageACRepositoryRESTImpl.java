package es.ual.acg.cos.trader.register.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import es.ual.acg.cos.trader.definitions.AbstractComponentInfo;
import es.ual.acg.cos.trader.register.singleton.ManageAbstractComponentsSingleton;

//@Path("/previousrelativepath")
public class ManageACRepositoryRESTImpl implements ManageACRepository {

  private static final Logger LOGGER = Logger.getLogger(ManageACRepositoryRESTImpl.class);

  private String path = "http://localhost:8080/services/";

  @GET
  @Produces(MediaType.TEXT_HTML)
  public String getAbstractComponents() {

    String bodyContent = "";
    int numberAC = 0;

    ManageAbstractComponentsSingleton manageAC = ManageAbstractComponentsSingleton.getInstance();

    List<String> listAC = manageAC.getListAC();
    numberAC = listAC.size();
    for (String acID : listAC) {
      String hipertext = "<a href='" + path + "abstractcomponents/" + acID + "'>" + acID + "</a>";

      String element = "<span>" + hipertext + "</span> <br>";
      bodyContent += element;

    }

    String html = "<html> <head> </head> <body> <div> <span style='font-size: 24; font-weight: bold;'> Abstract "
        + "Component Specificactions: </span> <br> <span> Number of specifications: " + numberAC
        + " </span> </div> <br> " + bodyContent + "</body> </html>";

    LOGGER.info("[ManageACRepository - getAbstractComponents] executed correctly");

    return html;
  }

  @Path("{acID}")
  @GET
  @Produces(MediaType.APPLICATION_XML)
  public AbstractComponentInfo getAbstractComponent(@PathParam("acID") String acID) {

    ManageAbstractComponentsSingleton manageAC = ManageAbstractComponentsSingleton.getInstance();
    AbstractComponentInfo acInfo = manageAC.getACInfoFromID(acID);

    return acInfo;
  }


}
