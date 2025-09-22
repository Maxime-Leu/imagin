package model;

import model.Salarie;
import model.Projet;
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

    @Test
    public void testGetDtEmbauche() {
        String result = salarie.getDtEmbauche();
        assertEquals("2020-01-01", result);      
    }

    @Test
    public void testSetDtEmbauche() {
        salarie.setDtEmbauche("2021-05-10");
        assertEquals("2021-05-10", salarie.getDtEmbauche());
    }

    @Test
    public void testGetEchelon() {
        assertEquals(2, salarie.getEchelon());
    }

    @Test
    public void testSetEchelon() {
        salarie.setEchelon(5);
        assertEquals(5, salarie.getEchelon());
    }

    @Test
    public void testCalculCoutProjet() {
        int nbJours = 100;
        double expResult = 50000.0;
        double result = salarie.calculCoutProjet(nbJours);
        assertEquals(expResult, result, 0);      
    } 

    
    @Test
    public void testNbProjetsSuperieurs() {
    Projet p1 = new Projet(1, "Projet A", 5000);
    Projet p2 = new Projet(2, "Projet B", 20000);
    Projet p3 = new Projet(3, "Projet C", 15000);

    salarie.addProjetResponsable(p1);
    salarie.addProjetResponsable(p2);
    salarie.addProjetResponsable(p3);

    int result = salarie.nbProjetsSuperieurs(10000);
    System.out.println("Résultat du test nbProjetsSuperieurs(10000) = " + result);

    assertEquals(2, result);
    }

}

