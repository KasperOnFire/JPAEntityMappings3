package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kasper
 */
public class Tester {

    public static void main(String[] args) {
        EntityManagerFactory emf = 
Persistence.createEntityManagerFactory("com.mycompany_JPAEntityMappings3_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        System.out.println("Done!");

        /* 
        
        JPA_Mapping_Excercise-3
        1. implemented here in this project.
        2 & 3. Added to classes.
        4. When you run the project without the @Inheritance annotation, you get a single table (default) for all 
discountTypes.
            This table then contains all columns from all classes and sub classes. 
            The DTYPE Columns is especially interesting, since this is the one that helps determine what subclass 
a database entry
            belongs to. This also means that there will be columns with null in them, since both subclasses of 
discount do not have
            quantity.
        5. When we run the program with the joined inheritance type, the program makes a database structure that 
more resembles the 
            layout of the UML model. The DTYPE column still exists, and serves the same purpose, but now you will 
not end up with null columns,
            since everything is in its own place.
        
         */
    }

}

