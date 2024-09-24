package com.shri.Memento;

import java.util.List;

public class Memento {
	private final List<String> state;

    public Memento(List<String> state) {
        
        this.state = List.copyOf(state);
    }

    public List<String> getState() {
        return state;
    }

}
