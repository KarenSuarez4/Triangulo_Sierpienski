package presenter;

import view.View;

public class Presenter {
    private View view;
    
    public Presenter(){
        view = new View();
    }

    public static void main(String[] args) {
		new Presenter();
	}
}
