/*
 * Copyright (c) 2018, Gluon and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.javafx.scenebuilder.kit.editor.panel.content.driver;

import com.oracle.javafx.scenebuilder.kit.editor.panel.content.ContentPanelController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.driver.curve.AbstractCurveEditor;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.driver.curve.CubicCurveEditor;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.driver.handles.AbstractHandles;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.driver.handles.CubicCurveHandles;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;
import javafx.scene.shape.CubicCurve;

/**
 *
 */
public class CubicCurveDriver extends AbstractNodeDriver {

    public CubicCurveDriver(ContentPanelController contentPanelController) {
        super(contentPanelController);
    }

    /*
     * AbstractDriver
     */
    
    @Override
    public AbstractHandles<?> makeHandles(FXOMObject fxomObject) {
        assert fxomObject.getSceneGraphObject() instanceof CubicCurve;
        assert fxomObject instanceof FXOMInstance;
        return new CubicCurveHandles(contentPanelController, (FXOMInstance)fxomObject);
    }

    @Override
    public AbstractCurveEditor<?> makeCurveEditor(FXOMObject fxomObject) {
        assert fxomObject.getSceneGraphObject() instanceof CubicCurve;
        assert fxomObject instanceof FXOMInstance;

        final CubicCurve cubicCurve = (CubicCurve) fxomObject.getSceneGraphObject();
        return new CubicCurveEditor(cubicCurve);
    }
    
}
