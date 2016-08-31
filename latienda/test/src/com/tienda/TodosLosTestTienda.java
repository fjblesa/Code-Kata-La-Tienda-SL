package src.com.tienda;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IValidarTest.class, LaTiendaTest.class, MontarListaProductosTiendaTest.class, NoCambiaTest.class,
		NormalTest.class, TartaTest.class, VinoTest.class, VipTest.class })
public class TodosLosTestTienda {

}
