package com.facebooktrumps.client.endgame;

import com.facebooktrumps.client.widgets.EventCapableComposite;
import com.facebooktrumps.client.widgets.HeaderPaneView;
import com.facebooktrumps.client.widgets.View;
import com.google.gwt.user.client.ui.HTML;

public class EndGameView extends EventCapableComposite implements View {
	
	public EndGameView() {
		initWidget(new HTML("Finished"));
	}
	
	public void doInit() {
		setMain(this);
		setHeader(new HeaderPaneView());
	}

}
