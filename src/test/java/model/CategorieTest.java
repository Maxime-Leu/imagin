package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CategorieTest {
    private Categorie categorie;
    private Prestataire p1;
    private Salarie s1;
    private Salarie s2;
    
    public CategorieTest() {
    }
    
    @Before
    public void setUp() {
        
        categorie = new Categorie(1, "DEV WEB");
    
        
        p1 = new Prestataire(false, 500.0, 150, "Jack", "Uzi");
        s1 = new Salarie("2025-05-05", 254, 2, "Amar", "Oussama");
        s2 = new Salarie("2025-06-10", 255, 3, "Khalid", "Mansouri");
        
        
        categorie.addUnIntervenant(p1);
        categorie.addUnIntervenant(s1);
    }
    
    @After
    public void tearDown() {
        
    }

    // Test de la méthode getNom
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "DEV WEB"; 
        String result = categorie.getNom(); 
        assertEquals(expResult, result); 
    }

    // Test de la méthode setId
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2; 
        categorie.setId(id); 
        assertEquals(id, categorie.getId()); 
    }

    // Test de la méthode getId
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1; 
        int result = categorie.getId(); 
        assertEquals(expResult, result); 
    }

    // Test de la méthode setNom
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "DEV WEB"; 
        categorie.setNom(nom); 
        assertEquals(nom, categorie.getNom()); 
    }

    // Test de la méthode getLesIntervenants
    @Test
    public void testGetLesIntervenants() {
        System.out.println("getLesIntervenants");
        ArrayList<Intervenant> expResult = new ArrayList<>();
        expResult.add(p1); 
        expResult.add(s1);
        ArrayList<Intervenant> result = categorie.getLesIntervenants(); 
        assertEquals(expResult, result); 
    }

    // Test de la méthode setLesIntervenants
    @Test
    public void testSetLesIntervenants() {
        System.out.println("setLesIntervenants");
        ArrayList<Intervenant> newIntervenants = new ArrayList<>();
        newIntervenants.add(s2); 
        categorie.setLesIntervenants(newIntervenants); 
        assertEquals(newIntervenants, categorie.getLesIntervenants()); 
    }

    // Test de la méthode addUnIntervenant
    @Test
    public void testAddUnIntervenant() {
        System.out.println("addUnIntervenant");
        Intervenant newIntervenant = new Prestataire(true, 600.0, 100, "John", "Doe"); 
        categorie.addUnIntervenant(newIntervenant); 
        assertTrue(categorie.getLesIntervenants().contains(newIntervenant)); 
    }

    // Test de la méthode getNombreIntervenants
    @Test
    public void testGetNombreIntervenants() {
        System.out.println("getNombreIntervenants");
        int expResult = 2; 
        int result = categorie.getNombreIntervenants(); 
        assertEquals(expResult, result); 
    }
}
