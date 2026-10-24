import config.AppConfig;
import config.DaoAliasConfig;
import config.DynamicDaoConfig;
import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // ===== MÉTHODE 1 : Avec AppConfig et @Primary =====

        /*
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        IMetier metier = context.getBean("metierImpl", IMetier.class);

        double resultat = metier.calcul();

        System.out.println("Résultat final : " + resultat);

        context.close();
        */


        // ===== MÉTHODE 2 : Avec DaoAliasConfig et @Bean =====

        /*
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class,
                        DaoAliasConfig.class
                );

        IMetier metier = context.getBean("metierImpl", IMetier.class);

        double resultat = metier.calcul();

        System.out.println("Résultat final : " + resultat);

        context.close();
        */


        // ===== MÉTHODE 3 : Avec DynamicDaoConfig =====

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class,
                        DynamicDaoConfig.class
                );

        IMetier metier = context.getBean("metierImpl", IMetier.class);

        double resultat = metier.calcul();

        System.out.println("Résultat final : " + resultat);

        context.close();
    }
}