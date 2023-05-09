public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        System.out.println("----------CHECKING BUDGET----------");
        System.out.println("Available budget: " + budget);
        
        if (budget > boracay.airFare){
            System.out.println("Arrived at Caticlan Airport");
            System.out.println("----------WELCOME TO BORACAY----------");
            System.out.println("Getting my hair braid here in Boracay.....");
            budget= budget-boracay.airFare;
            System.out.println("Current budget: " + budget);
            System.out.println();
        } else
            System.out.println("Sorry. You do not have enough balance to go to Boracay");

    }
    public void visit(Bohol bohol) {
        
        System.out.println("----------CHECKING BUDGET----------");
        System.out.println("Available budget: " + budget);

        if (budget > bohol.airFare){
            System.out.println("Arrived at Bohol International Airport");
            System.out.println("----------WELCOME TO BOHOL----------");
            System.out.println("Visiting my pamile.....");
            budget= budget-bohol.airFare;
            System.out.println("Current budget: " + budget);
            System.out.println();
        } else
            System.out.println("Sorry. You do not have enough balance to go to Bohol");
        

    }
    public void visit(Cebu cebu){

        System.out.println("----------CHECKING BUDGET----------");
        System.out.println("Available budget: " + budget);

        if (budget > cebu.airFare){
            System.out.println("Arrived at Mactan International Airport");
            System.out.println("----------WELCOME TO CEBU----------");
            System.out.println("Swimming with Whale in Oslob.....");
            budget= budget-cebu.airFare;
            System.out.println("Current budget: " + budget);
            System.out.println();
        } else
            System.out.println("Sorry. You do not have enough balance to go to Cebu");

    
    }
    public void visit(Batanes batanes) {

        System.out.println("----------CHECKING BUDGET----------");
        System.out.println("Available budget: " + budget);

        if (budget > batanes.airFare){
            System.out.println("Arrived at Basco Airpor");
            System.out.println("----------WELCOME TO BATANES----------");
            System.out.println("Visiting their famous honesty store.....");
            budget= budget-batanes.airFare;
            System.out.println("Current budget: " + budget);
            System.out.println();
        } else
            System.out.println("Sorry. You do not have enough balance to go to Batanes");


    }
    public void visit(Siargao siargao) {

        System.out.println("----------CHECKING BUDGET----------");
        System.out.println("Available budget: " + budget);

        if (budget > siargao.airFare){
            System.out.println("Arrived at Sayak Airport");
            System.out.println("----------WELCOME TO SIARGAO----------");
            System.out.println("Meeting new friends and learning how to surf.....");
            budget= budget-siargao.airFare;
            System.out.println("Current budget: " + budget);
            System.out.println();
            
        } else
            System.out.println("Sorry. You do not have enough balance to go to Siargao");


    }
    public void visit(Siquijor siquijor) {

        System.out.println("----------CHECKING BUDGET----------");
        System.out.println("Available budget: " + budget);

        if (budget > siquijor.airFare){
            System.out.println("Arrived at Siquojor Port");
            System.out.println("----------WELCOME TO SIQUIJOR----------");
            System.out.println("Trying cliff jumping.....");
            budget= budget-siquijor.airFare;
            System.out.println("Current budget: " + budget);
            System.out.println();
        } else
            System.out.println("Sorry. You do not have enough balance to go to Siquijor");

    }
 
    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}