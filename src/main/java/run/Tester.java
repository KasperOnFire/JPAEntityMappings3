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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_JPAEntityMappings3_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        /* 
        
        JPA_Mapping_Excercise-3
        1. implemented here in this project.
        2 & 3. Added to classes.
        4. When you run the project without the @Inheritance annotation, you get a single table (default) for all discountTypes.
            This table then contains all columns from all classes and sub classes. 
        */

    }

}
