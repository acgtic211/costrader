package es.ual.acg.cos.trader.configs.repository;

import java.util.Properties;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.cfg.Environment;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import ccmm.CcmmPackage;
import acmm.AcmmPackage;
import architectural_metamodel.Architectural_metamodelPackage;

@Repository
public final class ManageDB {

  private HbDataStore dataStore;
  private HbDataStore dataStoreAC;
  private HbDataStore dataStoreCC;
  private boolean dataStoreOn = true;
  private boolean dataStoreACOn = true;
  private boolean dataStoreCCOn = true;

  private static final Logger LOGGER = Logger.getLogger(ManageDB.class);

  private ManageDB() {
    LOGGER.info("[ManageDB] Initializating DataStores...");
    if (dataStoreOn && dataStore == null)
      this.initializeDataStore();
    if (dataStoreCCOn && dataStoreCC == null)
      this.initializeDataStoreCC();
    if (dataStoreACOn && dataStoreAC == null)
      this.initializeDataStoreAC();
  }

  /*
   * @PostConstruct private void initializateDataStores() {
   * LOGGER.info("[ManageDB] Initializating DataStores..."); if (dataStoreOn)
   * this.initializeDataStore(); if (dataStoreCCOn) this.initializeDataStoreCC();
   * if (dataStoreACOn && dataStoreAC == null) this.initializeDataStoreAC(); }
   */

  private void initializeDataStore() {
    LOGGER.info("[ManageDB] Creating DataStore...");

    Properties hibernateProperties = new Properties();

    String dbName = "traderam";

    // hibernateProperties.setProperty(Environment.DRIVER,
    // "org.postgresql.Driver");
    // hibernateProperties.setProperty(Environment.USER, "postgres");
    // hibernateProperties.setProperty(Environment.URL, jdbcHost + dbName);
    // hibernateProperties.setProperty(Environment.PASS, pass);
    // hibernateProperties.setProperty(Environment.DIALECT,
    // org.hibernate.dialect.PostgreSQL81Dialect.class.getName());

    hibernateProperties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    hibernateProperties.setProperty(Environment.USER, "root");
    hibernateProperties.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" + dbName
        + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
    hibernateProperties.setProperty(Environment.PASS, "root");
    hibernateProperties.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

    /*
     * <property name="hibernate.c3p0.timeout">300</property> <property
     * name="hibernate.c3p0.max_statements">50</property> <property
     * name="hibernate.c3p0.idle_test_period">3000</property>
     */

    // hibernateProperties.setProperty("hibernate.c3p0.idle_test_period", "3000"
    // );
    hibernateProperties.setProperty("hibernate.c3p0.idle_test_period", "1800");

    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
    // "REFRESH,PERSIST,MERGE");
    hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
    // hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING,
    // InheritanceType.SINGLE_TABLE.name());
    // hibernateProperties.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT,"true");

    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_CONTAINMENT,
    // "ALL");
    hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
        "MERGE,PERSIST,REFRESH,REMOVE");
    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
    // "ALL");

    hibernateProperties.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "false");

    // To resolve the error "deleted object would be re-saved by cascade"
    hibernateProperties.setProperty("teneo.mapping.fetch_containment_eagerly", "true");
    // hibernateProperties.setProperty("teneo.mapping.fetch_one_to_many_extra_lazy",
    // "true");
    // hibernateProperties.setProperty("teneo.runtime.handle_unset_as_null",
    // "true");

    hibernateProperties.setProperty("hibernate.cache.region.factory_class",
        "org.hibernate.cache.ehcache.EhCacheRegionFactory");
    hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "true");
    hibernateProperties.setProperty("teneo.mapping.default_cache_strategy", "READ_ONLY");

    // Without e_version in the tables
    hibernateProperties.setProperty("teneo.mapping.always_version", "false");

    // Without e_container in the tables
    hibernateProperties.setProperty("teneo.mapping.disable_econtainer", "true");

    // To solve the conflict between data schemas
    hibernateProperties.setProperty("teneo.naming.sql_table_name_prefix", dbName + "_");

    final String dataStoreName = "traderam";
    dataStore = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
    dataStore.setDataStoreProperties(hibernateProperties);

    dataStore.setEPackages(new EPackage[] { Architectural_metamodelPackage.eINSTANCE });

    try {
      dataStore.initialize();
      // this.setDataStoreState("INITIALIZED");
      // log.info("Initializating datastore...");
    } finally {
      // print the hibernate mapping
      // System.err.println(dataStore.getMappingXML());
      // log.info("Datastore created");
    }

    LOGGER.info("[ManageDB] DataStore has been created");
  }

  private void initializeDataStoreAC() {
    LOGGER.info("[ManageDB - initializeDataStoreAC] Creating DataStoreAC...");

    Properties hibernateProperties = new Properties();

    String dbName = "traderac";

    // hibernateProperties.setProperty(Environment.DRIVER,
    // "org.postgresql.Driver");
    // hibernateProperties.setProperty(Environment.USER, "postgres");
    // hibernateProperties.setProperty(Environment.URL, jdbcHost + dbName);
    // hibernateProperties.setProperty(Environment.PASS, pass);
    // hibernateProperties.setProperty(Environment.DIALECT,
    // org.hibernate.dialect.PostgreSQL81Dialect.class.getName());

    /*
     * hibernateProperties.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
     * hibernateProperties.setProperty(Environment.USER, "root");
     * hibernateProperties.setProperty(Environment.URL,
     * "jdbc:mysql://127.0.0.1:3306/" + dbName);
     * hibernateProperties.setProperty(Environment.PASS, "root");
     * hibernateProperties.setProperty(Environment.DIALECT,
     * org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
     */
    // jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    hibernateProperties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    hibernateProperties.setProperty(Environment.USER, "root");
    hibernateProperties.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" + dbName
        + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
    hibernateProperties.setProperty(Environment.PASS, "root");
    hibernateProperties.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

    // hibernateProperties.setProperty("hibernate.c3p0.idle_test_period", "3000"
    // );
    hibernateProperties.setProperty("hibernate.c3p0.idle_test_period", "1800");

    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
    // "REFRESH,PERSIST,MERGE");
    hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
    // hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING,
    // InheritanceType.SINGLE_TABLE.name());
    // hibernateProperties.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT,"true");

    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_CONTAINMENT,
    // "ALL");
    hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
        "MERGE,PERSIST,REFRESH,REMOVE");
    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
    // "ALL");

    hibernateProperties.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "false");

    // To resolve the error "deleted object would be re-saved by cascade"
    hibernateProperties.setProperty("teneo.mapping.fetch_containment_eagerly", "true");
    // hibernateProperties.setProperty("teneo.mapping.fetch_one_to_many_extra_lazy",
    // "true");
    // hibernateProperties.setProperty("teneo.runtime.handle_unset_as_null",
    // "true");

    hibernateProperties.setProperty("hibernate.cache.region.factory_class",
        "org.hibernate.cache.ehcache.EhCacheRegionFactory");
    hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "true");
    hibernateProperties.setProperty("teneo.mapping.default_cache_strategy", "READ_ONLY");

    // Without e_version in the tables
    hibernateProperties.setProperty("teneo.mapping.always_version", "false");

    // Without e_container in the tables
    hibernateProperties.setProperty("teneo.mapping.disable_econtainer", "true");
    
 // To solve the conflict between data schemas
    hibernateProperties.setProperty("teneo.naming.sql_table_name_prefix", dbName + "_");

    final String dataStoreName = "traderac";
    dataStoreAC = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
    dataStoreAC.setDataStoreProperties(hibernateProperties);

    dataStoreAC.setEPackages(new EPackage[] { AcmmPackage.eINSTANCE });

    try {
      dataStoreAC.initialize();
      // this.setDataStoreState("INITIALIZED");
      // log.info("Initializating datastore...");
    } finally {
      // print the hibernate mapping
      // System.err.println(dataStore.getMappingXML());
      // log.info("Datastore created");
    }

    LOGGER.info("[ManageDB] DataStoreAC has been created");
  }

  private void initializeDataStoreCC() {
    LOGGER.info("[ManageDB - initializeDataStoreCC] Creating DataStoreCC...");

    Properties hibernateProperties = new Properties();

    // String dbName = "traderccbig";
    String dbName = "tradercc";

    // hibernateProperties.setProperty(Environment.DRIVER,
    // "org.postgresql.Driver");
    // hibernateProperties.setProperty(Environment.USER, "postgres");
    // hibernateProperties.setProperty(Environment.URL, jdbcHost + dbName);
    // hibernateProperties.setProperty(Environment.PASS, pass);
    // hibernateProperties.setProperty(Environment.DIALECT,
    // org.hibernate.dialect.PostgreSQL81Dialect.class.getName());

    // jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    hibernateProperties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    hibernateProperties.setProperty(Environment.USER, "root");
    hibernateProperties.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" + dbName
        + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
    hibernateProperties.setProperty(Environment.PASS, "root");
    hibernateProperties.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

    // hibernateProperties.setProperty("hibernate.c3p0.idle_test_period", "3000"
    // );
    hibernateProperties.setProperty("hibernate.c3p0.idle_test_period", "1800");

    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
    // "REFRESH,PERSIST,MERGE");
    hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
    // hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING,
    // InheritanceType.SINGLE_TABLE.name());
    // hibernateProperties.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT,"true");

    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_CONTAINMENT,
    // "ALL");
    hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
        "MERGE,PERSIST,REFRESH,REMOVE");
    // hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
    // "ALL");

    hibernateProperties.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "false");

    // To resolve the error "deleted object would be re-saved by cascade"

    hibernateProperties.setProperty("teneo.mapping.fetch_containment_eagerly", "true");
    // hibernateProperties.setProperty("teneo.runtime.elist_efficient_size_operation",
    // "true");

    hibernateProperties.setProperty("hibernate.cache.region.factory_class",
        "org.hibernate.cache.ehcache.EhCacheRegionFactory");
    hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "true");
    hibernateProperties.setProperty("teneo.mapping.default_cache_strategy", "READ_ONLY");

    // hibernateProperties.setProperty("show_sql", "true");
    // hibernateProperties.setProperty("format_sql", "true");
    // hibernateProperties.setProperty("use_sql_comments", "true");

    // hibernateProperties.setProperty("teneo.mapping.fetch_one_to_many_extra_lazy",
    // "true");
    // hibernateProperties.setProperty("teneo.runtime.handle_unset_as_null",
    // "true");

    // Without e_version in the tables
    hibernateProperties.setProperty("teneo.mapping.always_version", "false");

    // Without e_container in the tables
    hibernateProperties.setProperty("teneo.mapping.disable_econtainer", "true");
    
    // To solve the conflict between data schemas
    hibernateProperties.setProperty("teneo.naming.sql_table_name_prefix", dbName + "_");

    final String dataStoreName = "tradercc";
    dataStoreCC = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
    dataStoreCC.setDataStoreProperties(hibernateProperties);

    dataStoreCC.setEPackages(new EPackage[] { CcmmPackage.eINSTANCE });

    try {
      dataStoreCC.initialize();
      // this.setDataStoreState("INITIALIZED");
      // LOGGER.info("Initializating datastore...");
    } finally {
      // print the hibernate mapping
      //LOGGER.info(dataStoreCC.getMappingXML());
      //LOGGER.info("DatastoreCC created");
    }

    LOGGER.info("[ManageDB] DataStoreCC has been created");
  }

  // @Lock(LockType.READ)
  public HbDataStore getDataStore() {
    return dataStore;
  }

  public void setDataStore(HbDataStore dataStore) {
    this.dataStore = dataStore;
  }

  // @Lock(LockType.READ)
  public HbDataStore getDataStoreAC() {
    return dataStoreAC;
  }

  public void setDataStoreAC(HbDataStore dataStoreAC) {
    this.dataStoreAC = dataStoreAC;
  }

  // @Lock(LockType.READ)
  public HbDataStore getDataStoreCC() {
    return dataStoreCC;
  }

  public void setDataStoreCC(HbDataStore dataStoreCC) {
    this.dataStoreCC = dataStoreCC;
  }

}
