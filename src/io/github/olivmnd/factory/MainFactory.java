package io.github.olivmnd.factory;

public class MainFactory {

    private static Action action;

    public static void main(String[] args) {

    	//add an argument on run configurations
        configure(args[0]);
        if(action != null){
            runAction();
        }

    }

    private static void runAction() {
        action.startAction();
    }

    private static void configure(String type) {
        switch(type){
            case "saimon":
                action = new DogAction();
                break;
            case "steve":
                action = new DogAction();
                break;
            case "pitiz":
                action = new DogAction();
                break;
            case "koda":
                action = new GuineaPigAction();
                break;
            case "kenai":
                action = new GuineaPigAction();
                break;
            case "wanessinha":
                action = new CatAction();
            default:
                System.out.println("Animal not found");
        }
    }
}
