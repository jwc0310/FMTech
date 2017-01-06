package com.fmtech.softinput;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

/**
 * ==================================================================
 * Copyright (C) 2016 MTel Limited All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @create_date 16/9/4 12:28
 * @description Disable paste functions.
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 16/9/4 12:28  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public class MtelEditText extends EditText{

    public MtelEditText(Context context) {
        super(context);
    }

    public MtelEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLongClickable(false);
        setTextIsSelectable(false);

        setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {

            }
        });

    }

    public MtelEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    boolean canPaste() {
        return false;
    }

    boolean canCut() {
        return false;
    }

    boolean canCopy() {
        return false;
    }

    boolean canSelectAllText() {
        return false;
    }

    boolean canSelectText() {
        return false;
    }

    boolean textCanBeSelected() {
        return false;
    }

    @Override
    public boolean onTextContextMenuItem(int id) {
        return true;
    }

}
