
package es.ual.acg.cos.trader.register.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;
import es.ual.acg.cos.trader.register.singleton.ManageConcreteComponentsSingleton;

//@Path("/previousrelativepath")
public class ManageCCRepositoryRESTImpl implements ManageCCRepository {

  private static final Logger LOGGER = Logger.getLogger(ManageCCRepositoryRESTImpl.class);
  
  private String path = "http://localhost:8080/services/";

  @GET
  @Produces(MediaType.TEXT_HTML)
  public String getConcreteComponents(@QueryParam("page") int page) {

    String bodyContent = "";
    String divSize = "";
    String divPagination = "";
    int numberCC = 0;

    if (page != 0) {
      page--;
    }

    ManageConcreteComponentsSingleton manageCC = ManageConcreteComponentsSingleton.getInstance();

    numberCC = manageCC.getCCTotalNumber();
    divSize = "<span> Number of specifications: " + numberCC + " </span> </div> <br> ";

    int numberPages = numberCC / 100;
    LOGGER.info("numberPages: " + numberPages);
    if ((numberCC % 100) != 0) {
      numberPages++;
    }

    for (int i = 1; i <= numberPages; i++) {
      if ((page + 1 != i)) {
        String hipertext = "<a href='" + path + "concretecomponents?page=" + i + "'>"
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
      String hipertext = "<a href='" + path + "concretecomponents/" + ccID + "'>"
          + ccID + "</a>";

      String element = "<span>" + hipertext + "</span> <br>";
      bodyContent += element;

    }

    String html = "<html> <head> </head> <body> <div> <span style='font-size: 24; font-weight: bold;'> Concrete "
        + "Component Specificactions: </span> <br> " + divSize + divPagination + bodyContent + "</body> </html>";

    return html;
  }

  @GET
  // @Path("{ccID}")
  @Path("{ccID : .+}")
  // @Consumes(MediaType.APPLICATION_XML)
  @Produces(MediaType.APPLICATION_XML)
  public ConcreteComponentInfo getConcreteComponent(@PathParam("ccID") String ccID) {

    ConcreteComponentInfo ccInfo = null;

    ManageConcreteComponentsSingleton manageCC = ManageConcreteComponentsSingleton.getInstance();

    ccInfo = manageCC.getCCInfoFromID(ccID);

    return ccInfo;
  }

  @GET
  // @Path("{ccID}/{part}/{subpart}")
  @Path("{ccID : .+}/functional/{subpart}")
  @Produces(MediaType.TEXT_XML)
  public ConcreteComponentInfo getConcreteComponent(@PathParam("ccID") String ccID,
      @PathParam("subpart") String subpart) {

    ConcreteComponentInfo ccInfo = null;

    ManageConcreteComponentsSingleton manageCC = ManageConcreteComponentsSingleton.getInstance();

    ccInfo = manageCC.getCCInfoFromID(ccID);

    if ("provided".equalsIgnoreCase(subpart)) {
      ccInfo.setRequiredInterfaces(null);
    } else {
      if ("required".equalsIgnoreCase(subpart)) {
        ccInfo.setProvidedInterfaces(null);
      }
    }

    return ccInfo;
  }

  /*
   * @Path("model/{ccID}")
   * 
   * @GET
   * 
   * @Produces(MediaType.TEXT_XML) public String getCCS(@PathParam("ccID") String
   * ccID) {
   * 
   * String result = "RESULT: "; EObject eObject = null;
   * 
   * String ns = "http://acg.ual.es/wookie/widgets/"; ccID = ns + ccID;
   * 
   * String messageQuery = "SELECT ccs FROM ConcreteComponentSpecification ccs " +
   * "WHERE ccs.componentID = '" + ccID + "'";
   * 
   * LOGGER.info("[ManageCCRepositoryREST - getCCS]");
   * 
   * es.ual.acg.cos.trader.Lookup lookup = null; try { Context initialContext =
   * new InitialContext(); lookup = (es.ual.acg.cos.trader.Lookup) initialContext
   * .lookup("java:app/COS-trader/Lookup"); List<ConcreteComponentSpecification>
   * list = lookup.query(messageQuery); Iterator<ConcreteComponentSpecification>
   * it = list.iterator();
   * LOGGER.info("[ManageCCRepositoryREST - getCCS] query executed!!"); if
   * (it.hasNext()) { eObject = it.next(); } } catch (NamingException e) {
   * LOGGER.error(e); }
   * 
   * XMLResourceImpl resource = new XMLResourceImpl(); XMLProcessor processor =
   * new XMLProcessor(); resource.setEncoding("UTF-8");
   * resource.getContents().add(eObject);
   * 
   * try { result = processor.saveToString(resource, null);
   * //LOGGER.info("[ManageCCRepositoryREST - getCCS] Result: " + result);
   * //result = "CHANGED!!"; } catch (IOException e) { LOGGER.error(e); }
   * 
   * 
   * 
   * return result;
   * 
   * }
   */

}
