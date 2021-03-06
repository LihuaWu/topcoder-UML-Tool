/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.umltool.deploy.actions;

import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import com.topcoder.umltool.deploy.DiagramType;
import com.topcoder.umltool.deploy.MainFrame;

/**
 * <p>
 * Action to create sequence diagram.
 * </p>
 * @author ly, FireIce, ylouis
 * @version 1.0
 */
public class CreateSequenceDiagramAction extends AbstractAction {
    /**
     * <p>
     * The version id.
     * <p>
     */
    private static final long serialVersionUID = -2873752707169317598L;

    /**
     * <p>
     * Action name.
     * <p>
     */
    private static final String ACTION_NAME = "Sequence Diagram";

    /**
     * <p>
     * Action description.
     * <p>
     */
    private static final String SHORT_DESCRIPTION = "Create a Sequence Diagram.";

    /**
     * <p>
     * Icon file name for menu.
     * <p>
     */
    private static final String ICON_FILE_NAME = "/images/NewSequenceDiagram_16.png";

    /**
     * <p>
     * Acceleration key.
     * <p>
     */
    private static final KeyStroke DEFAULT_ACCELERATOR_KEY = KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit()
            .getMenuShortcutKeyMask()
            | Event.ALT_MASK);

    /**
     * <p>
     * Icon file for tool bar.
     * <p>
     */
    private static final String TOOLBAR_ICON_FILE_NAME = "/images/NewSequenceDiagram.png";

    /**
     * <p>
     * Reference to main frame.
     * <p>
     */
    private final MainFrame mainFrame;

    /**
     * <p>
     * Constructs an instance of create sequence diagram action.
     * <p>
     * @param mainFrame
     *            main frame of uml tool
     */
    public CreateSequenceDiagramAction(MainFrame mainFrame) {
        super(ACTION_NAME, new ImageIcon(CreateSequenceDiagramAction.class.getResource(ICON_FILE_NAME)));
        this.putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION);
        this.putValue(Action.ACCELERATOR_KEY, DEFAULT_ACCELERATOR_KEY);

        this.putValue(MainFrame.TOOL_BAR_ICON_KEY_NAME, new ImageIcon(CreateSequenceDiagramAction.class
                .getResource(TOOLBAR_ICON_FILE_NAME)));

        this.mainFrame = mainFrame;
    }

    /**
     * <p>
     * Performing the action.
     * <p>
     * @param actionEvent
     *            the action event
     */
    public void actionPerformed(ActionEvent actionEvent) {
        mainFrame.createDiagram(DiagramType.SEQUENCE);
    }
}
