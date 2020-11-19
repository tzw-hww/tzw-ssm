package com.mark.DesignPatterns.observer.v1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Button button = new Button();
        button.add(new ActionListner1());
        button.add(new ActionListner2());
        button.press();
    }



}

//事件源（被观察者）
class Button{

    List<ActionListener> list = new ArrayList<>();

    public void add(ActionListener actionListener){
        this.list.add(actionListener);
    }

    public void press(){
        PressEvent pressEvent = new PressEvent(new Button(),"1232");
        for (ActionListener actionListener : list) {
            actionListener.actionPerformed(pressEvent);
        }
    }
}


//观察者
 class ActionListner1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("111111111111");
    }
}
 class ActionListner2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("22222222222222222");
    }
}



 class PressEvent extends ActionEvent {
    private String time;
    private Button source;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public PressEvent(Button source,String time) {
        super(source,1,"");
        this.source=source;
        this.time=time;

    }


    public String getTime() {
        return time;
    }

    public Button getSource() {
        return source;
    }
}
