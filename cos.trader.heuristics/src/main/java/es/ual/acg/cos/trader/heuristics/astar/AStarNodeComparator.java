package es.ual.acg.cos.trader.heuristics.astar;

import java.util.Comparator;

public class AStarNodeComparator implements Comparator<AStarNode> {
  //private static final Logger LOGGER = Logger
  //    .getLogger(AStarNodeComparator.class);

  public int compare(AStarNode first, AStarNode second) {

    //LOGGER.info("first f(x) --> " + first.getF());
    //LOGGER.info("second f(x) --> " + second.getF());

    if (first.getF() < second.getF()) {
      return -1;
    } else if (first.getF() > second.getF()) {
      return 1;
    } else {
      return 0;
    }
  }
}