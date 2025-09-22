import model.Salarie;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalarieTest {
    
    private Salarie salarie ;
    
    public SalarieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        salarie = new Salarie("1", 3);
        salarie.setNom("Dupont");
        salarie.setDtEmbauche("2020-01-01");
        salarie.setEchelon(2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDtEmbauche method, of class Salarie.
     */
    @Test
    public void testGetDtEmbauche() {
        System.out.println("getDtEmbauche");        
        String result = salarie.getDtEmbauche();
        assertEquals("2020-01-01", result);      
    }

    /**
     * Test of setDtEmbauche method, of class Salarie.
     */
    @Test
    public void testSetDtEmbauche() {
        salarie.setDtEmbauche("2021-05-10");
        assertEquals("2021-05-10", salarie.getDtEmbauche());
    }

    /**
     * Test of getEchelon method, of class Salarie.
     */
    @Test
    public void testGetEchelon() {
        assertEquals(2, salarie.getEchelon());
    }

    /**
     * Test of setEchelon method, of class Salarie.
     */
    @Test
    public void testSetEchelon() {
        salarie.setEchelon(5);
        assertEquals(5, salarie.getEchelon());
    }

    /**
     * Test of calculCoutProjet method, of class Salarie.
     */
    @Test
    public void testCalculCoutProjet() {
        System.out.println("calculCoutProjet");
        int nbJours = 100;
       
        double expResult = 50000.0;
        double result = salarie.calculCoutProjet(nbJours);
        assertEquals(expResult, result, 0);      
    } 
}